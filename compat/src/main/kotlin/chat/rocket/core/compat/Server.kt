package chat.rocket.core.compat

import chat.rocket.common.model.ServerInfo
import chat.rocket.core.RocketChatClient
import chat.rocket.core.compat.internal.callback
import chat.rocket.core.internal.rest.serverInfo
import kotlinx.coroutines.Dispatchers

/**
 * Returns the current logged server information.
 * Must be used with a coroutine context (async, launch, etc)
 */
fun RocketChatClient.serverInfo(future: Callback<ServerInfo>): Call = callback(Dispatchers.IO, future) { serverInfo() }