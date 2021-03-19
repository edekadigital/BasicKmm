package edeka.digital.app.data.offers

class OfferRepository(val client: HttpClient = HttpClient(CIO)) : OfferDataSource {

    override suspend fun getOffers(gln: String, size: Int, page: Int): MobileOffersDto {

    }

    /**
     * Returns the offer matching the given id
     * @param offerId of the offer
     */
    override suspend fun getOfferById(offerId: Int): OfferMobileDto {

    }


}