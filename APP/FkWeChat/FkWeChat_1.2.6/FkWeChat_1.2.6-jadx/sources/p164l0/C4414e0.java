package p164l0;

import android.view.inputmethod.CursorAnchorInfo;
import p250r1.C6457g;
import p319w2.C9122q3;

/* JADX INFO: renamed from: l0.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4414e0 {

    /* JADX INFO: renamed from: a */
    public static final C4414e0 f12908a = new C4414e0();

    /* JADX INFO: renamed from: a */
    public static final CursorAnchorInfo.Builder m17228a(CursorAnchorInfo.Builder builder, C9122q3 c9122q3, C6457g c6457g) {
        int iM35398r;
        int iM35398r2;
        if (!c6457g.m25590s() && (iM35398r = c9122q3.m35398r(c6457g.m25586o())) <= (iM35398r2 = c9122q3.m35398r(c6457g.m25580i()))) {
            while (true) {
                builder.addVisibleLineBounds(c9122q3.m35399s(iM35398r), c9122q3.m35402v(iM35398r), c9122q3.m35400t(iM35398r), c9122q3.m35394m(iM35398r));
                if (iM35398r == iM35398r2) {
                    break;
                }
                iM35398r++;
            }
        }
        return builder;
    }
}
