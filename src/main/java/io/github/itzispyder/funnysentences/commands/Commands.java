package io.github.itzispyder.funnysentences.commands;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.event.Event;

/**
 * Commands registry
 */
public abstract class Commands {

    /**
     * Registers all the commands from this mod
     */
    public static void registerAll() {
        Event<ClientCommandRegistrationCallback> cmd = ClientCommandRegistrationCallback.EVENT;
        cmd.register(SentenceCommand::register);
        cmd.register(SpamCommand::register);
        cmd.register(HelpCommand::register);
    }
}
