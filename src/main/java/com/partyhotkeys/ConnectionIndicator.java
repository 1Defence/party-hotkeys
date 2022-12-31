package com.partyhotkeys;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxPriority;

class ConnectionIndicator extends InfoBox
{
    ConnectionIndicator(BufferedImage image, PartyHotkeysPlugin plugin, String tooltip)
    {
        super(image, plugin);
        setTooltip(tooltip);
        setPriority(InfoBoxPriority.HIGH);
    }

    @Override
    public String getText()
    {
        return null;
    }

    @Override
    public Color getTextColor()
    {
        return null;
    }
}