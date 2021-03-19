package edeka.digital.app.data.offers

import io.ktor.client.*

class OfferRepository(val client: HttpClient = HttpClient()) : OfferDataSource {

    override suspend fun getOffers(gln: String, size: Int, page: Int): MobileOffersDto {
        TODO("Not yet implemented")
    }

    /**
     * Returns the offer matching the given id
     * @param offerId of the offer
     */
    override suspend fun getOfferById(offerId: Int): OfferMobileDto {
        TODO("Not yet implemented")
    }


}