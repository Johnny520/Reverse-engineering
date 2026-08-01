package p042d2;

import android.view.KeyEvent;

/* JADX INFO: renamed from: d2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1859d {
    /* JADX INFO: renamed from: a */
    public static final long m6605a(KeyEvent keyEvent) {
        return AbstractC1864i.m6619a(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: b */
    public static final int m6606b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? AbstractC1858c.f5187a.m6604c() : AbstractC1858c.f5187a.m6603b() : AbstractC1858c.f5187a.m6602a();
    }

    /* JADX INFO: renamed from: c */
    public static final int m6607c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m6608d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m6609e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m6610f(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
