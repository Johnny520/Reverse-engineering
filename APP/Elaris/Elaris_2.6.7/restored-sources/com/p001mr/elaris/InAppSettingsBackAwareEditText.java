package com.p001mr.elaris;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
class InAppSettingsBackAwareEditText extends EditText {
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsBackAwareEditText(InAppSettings inAppSettings, Context context) {
        super(context);
        this.settings = inAppSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isVolumeKey(int i) {
        return i == 25 || i == 24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return (keyEvent == null || !isVolumeKey(keyEvent.getKeyCode())) ? super.dispatchKeyEvent(keyEvent) : this.settings.handleVolumeKey(keyEvent, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (isVolumeKey(i)) {
            return this.settings.handleVolumeKey(keyEvent, this);
        }
        if (i != 4) {
            return super.onKeyPreIme(i, keyEvent);
        }
        if (keyEvent == null || keyEvent.getAction() == 1) {
            return this.settings.consumeFocusedInputBackOnly("inputPreIme");
        }
        return true;
    }
}
