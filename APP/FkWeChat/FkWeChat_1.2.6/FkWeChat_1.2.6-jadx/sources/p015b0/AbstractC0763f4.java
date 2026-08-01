package p015b0;

import android.view.KeyEvent;

/* JADX INFO: renamed from: b0.f4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0763f4 {
    /* JADX INFO: renamed from: a */
    public static final boolean m2888a(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
