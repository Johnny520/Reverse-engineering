package p018b3;

import android.view.inputmethod.CursorAnchorInfo;
import p080f9.AbstractC2368o;
import p250r1.C6457g;
import p319w2.C9122q3;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940c {

    /* JADX INFO: renamed from: a */
    public static final C0940c f2907a = new C0940c();

    /* JADX INFO: renamed from: a */
    public static final CursorAnchorInfo.Builder m3464a(CursorAnchorInfo.Builder builder, C9122q3 c9122q3, C6457g c6457g) {
        int iM8578e;
        int iM8586m;
        int iM8586m2;
        if (!c6457g.m25590s() && (iM8586m = AbstractC2368o.m8586m(c9122q3.m35398r(c6457g.m25586o()), 0, (iM8578e = AbstractC2368o.m8578e(c9122q3.m35395n() - 1, 0)))) <= (iM8586m2 = AbstractC2368o.m8586m(c9122q3.m35398r(c6457g.m25580i()), 0, iM8578e))) {
            while (true) {
                builder.addVisibleLineBounds(c9122q3.m35399s(iM8586m), c9122q3.m35402v(iM8586m), c9122q3.m35400t(iM8586m), c9122q3.m35394m(iM8586m));
                if (iM8586m == iM8586m2) {
                    break;
                }
                iM8586m++;
            }
        }
        return builder;
    }
}
