package edeka.digital.app.data.offers

data class MobileOffersDto(
    val offers: List<OfferMobileDto?>? = null,
    val offset: Int? = null,
    val limit: Int? = null,
    val national: Boolean? = null,
    val totalCount: Int? = null,
    val disclaimer: String? = null
)

data class OfferMobileDto(
    val badges: List<BadgeMobileDto>? = null,
    val image: OfferImage? = null,
    val validTill: String? = null,
    val price: PriceDto? = null,
    val criteria: List<OfferCriteria>? = null,
    val ingredients: List<Ingredient>? = null,
    val national: Boolean? = null,
    val id: Int? = null,
    val validFrom: String? = null,
    val title: String? = null,
    val descriptions: List<String>? = null,
    val disclaimer: String? = null,
    val discount: String? = null,
    val category: Category? = null,
    val genussplus: String? = null,
    val pointsDeutschlandcard: Int? = null
)

data class BadgeMobileDto(val image: OfferMobileDto? = null, val type: String? = null)

data class OfferImage(

    /**
     * If true -> the imageurl can be used with Akamai Parameters
     */
    val imageParameter: Boolean? = null,

    val imageUrl: String? = null
)

data class PriceDto(
    val currency: String? = null,
    val format: String? = null,
    val value: String? = null
)

data class OfferCriteria(
    val id: Int = 0,
    val name: String? = null
)

data class Ingredient(val name: String? = null)

data class Category(
    val id: Int = -1,
    val name: String = ""
)