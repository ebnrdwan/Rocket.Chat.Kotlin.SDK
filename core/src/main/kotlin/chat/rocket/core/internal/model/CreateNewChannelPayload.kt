package chat.rocket.core.internal.model

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class CreateNewChannelPayload(
    @Json(name = "name") val channelName: String?=null,
    @Json(name = "members") val membersToInvite: List<String>?=null,
    val readOnly: Boolean?=null
)