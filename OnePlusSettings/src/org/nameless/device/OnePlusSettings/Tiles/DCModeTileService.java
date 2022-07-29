/*
 * Copyright (C) 2022 The Nameless-AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.nameless.device.OnePlusSettings.Tiles;

import android.graphics.drawable.Icon;

import org.nameless.device.OnePlusSettings.MainSettings;
import org.nameless.device.OnePlusSettings.ModeSwitch;
import org.nameless.device.OnePlusSettings.R;
import org.nameless.device.OnePlusSettings.Utils.SwitchUtils;

public class DCModeTileService extends ModeSwitchTileService {

    private ModeSwitch mSwitch = SwitchUtils.getDCModeSwitch(this);

    @Override
    protected ModeSwitch getModeSwitch() {
        return mSwitch;
    }

    @Override
    protected String getKey() {
        return MainSettings.KEY_DC_SWITCH;
    }

    @Override
    protected Icon getIcon() {
        return Icon.createWithResource(this,
                enabled ? R.drawable.ic_dimming_on : R.drawable.ic_dimming_off);
    }

    @Override
    protected boolean isSupported() {
        return getModeSwitch().isSupported();
    }
}
