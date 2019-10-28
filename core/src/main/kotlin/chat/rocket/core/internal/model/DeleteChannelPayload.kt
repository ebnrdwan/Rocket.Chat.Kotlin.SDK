package chat.rocket.core.internal.model

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DeleteChannelPayload(
        @Json(name = "roomName") val channelName: String? = null,
        @Json(name = "roomId") val channelId: String? = null
)