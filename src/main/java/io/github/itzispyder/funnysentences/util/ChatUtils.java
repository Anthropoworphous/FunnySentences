package io.github.itzispyder.funnysentences.util;

import net.minecraft.text.Text;

import static io.github.itzispyder.funnysentences.FunnySentences.mc;

/**
 * Chat utils so I don't have to
 */
public abstract class ChatUtils {

    /**
     * Sends a chat message as if the player has typed it in chat
     * @param message chat message
     */
    public static void sendChatMessage(String message) {
        if (message == null) return;
        if (message.startsWith("/")) return;
        mc.player.networkHandler.sendChatMessage(message);
    }

    /**
     * Sends a chat message to the player
     * @param message chat message
     */
    public static void sendMessage(String message) {
        mc.player.sendMessage(Text.literal(message));
    }
}
