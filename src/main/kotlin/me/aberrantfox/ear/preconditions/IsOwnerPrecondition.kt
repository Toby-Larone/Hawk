package me.aberrantfox.ear.preconditions

import me.aberrantfox.ear.configuration.BotConfiguration
import me.aberrantfox.kjdautils.api.dsl.Precondition
import me.aberrantfox.kjdautils.api.dsl.precondition
import me.aberrantfox.kjdautils.internal.command.Fail
import me.aberrantfox.kjdautils.internal.command.Pass

@Precondition
fun isOwner(configuration: BotConfiguration) = precondition { event ->
    if(event.author.id != configuration.owner) Fail("") else Pass
}