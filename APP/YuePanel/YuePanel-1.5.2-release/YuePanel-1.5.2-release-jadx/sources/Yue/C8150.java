package Yue;

import java.io.EOFException;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8150 {
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m4181(@InterfaceC6399 C3600 c3600) {
        C5499.m17103(c3600, "<this>");
        try {
            C3600 c36002 = new C3600();
            c3600.m9620(c36002, 0L, C7007.m21669(c3600.m9684(), 64L));
            for (int i = 0; i < 16; i++) {
                if (c36002.mo9622()) {
                    return true;
                }
                int iMo9644 = c36002.mo9644();
                if (Character.isISOControl(iMo9644) && !Character.isWhitespace(iMo9644)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
