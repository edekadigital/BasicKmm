package de.jensklingenberg.basickmm.shared.test

import de.jensklingenberg.basickmm.shared.Testgedöns


class MockUser()

interface TestEnvironment {
    fun launchApp()
    fun mockMovies()
}

interface Asserter{
    fun assertTrue(assert: Boolean)
    fun assertEquals(expected: String, actual: String)
    fun assertNodeDisplayed(text: String)

}



interface Page {

    /**
     * Start app, navigate to concrete page?
     */
    fun launch(deeplink:String?)

    fun navigateToThis()
}

interface ListAction {
    fun scrollTo(position: Int)
    fun tapOnListElement(identifier:String)
    fun clickOnNodeWithText(text: String)

}

interface ShoppingisyView {
    fun tapOnFavorite()
}


interface OverviewPage : ListAction, ShoppingisyView, Page{

    fun pullToReload()

}

interface BemefitsPage:Page {

}

interface MovieDetailPage : Page, ShoppingisyView  {

    fun watchTrailer()


}




enum class Pages{
    MOVIE_DETAIL
}

interface PageFactory{
    fun <T> createPage(pages:Pages) : T
}

class OverviewTest(private val testEnvironment: TestEnvironment,val asserter: Asserter,val page: PageFactory) {


    fun whenScreenOpensShowKickAssTitle() {
        val movieDetailPage = page.createPage<MovieDetailPage>(Pages.MOVIE_DETAIL)

        testEnvironment.launchApp()

        asserter.assertNodeDisplayed("Kick-Ass")
        asserter.assertEquals("1","1")

       // page.launch("edeka://main/CouponDetail")
       // page.tapOnListElement("Kick-Ass")


    }
}

class Detailtest(val page: MovieDetailPage) {


    fun testDetais(){

        Testgedöns.getTestEnvironment()
        val benefits = object : BemefitsPage{
            override fun launch(deeplink: String?) {
                TODO("Not yet implemented")
            }

            override fun navigateToThis() {
                TODO("Not yet implemented")
            }

        }

        page.launch(null)
        benefits.navigateToThis()
        page.navigateToThis()
    }

}
