package edeka.digital.app.data.offers

/**
 * DataSource for @[Offer]
 */

interface OfferDataSource {

    /**
     * Returns the offers entries matching the query
     *
     * @param gln the gln/iln of the requested shop
     * @param size how much offers should be requested
     * @param page you want to request
     * @return the offers entries matching the query
     *
     */
    suspend fun getOffers(gln: String, size: Int = 50, page: Int = 0): MobileOffersDto

    /**
     * Returns the offer matching the given id
     * @param offerId of the offer
     */
    suspend fun getOfferById(offerId: Int): OfferMobileDto


}