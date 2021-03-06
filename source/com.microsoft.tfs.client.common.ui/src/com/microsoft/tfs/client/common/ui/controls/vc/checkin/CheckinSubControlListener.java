// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.controls.vc.checkin;

import java.util.EventListener;

public interface CheckinSubControlListener extends EventListener {
    public void onSubControlVisible(CheckinSubControlEvent event);

    public void onSubControlHidden(CheckinSubControlEvent event);
}
