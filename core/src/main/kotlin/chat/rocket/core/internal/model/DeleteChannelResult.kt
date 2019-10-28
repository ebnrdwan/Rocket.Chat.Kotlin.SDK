package chat.rocket.core.internal.model

import se.ansman.kotshi.JsonDefaultValueBoolean
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DeleteChannelResult(
        @JsonDefaultValueBoolean(false)
        val success: Boolean
)