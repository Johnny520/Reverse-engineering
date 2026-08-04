package yyds;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: yyds.ᛱᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final C1127 f1451;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0312 f1452;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0263(C0312 c0312, C1127 c1127) {
        super((LinearLayout) c1127.f5193);
        AbstractC2328.m4341(-234985823568750L);
        this.f1452 = c0312;
        this.f1451 = c1127;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static String m911(int i, String str) {
        String strReplace = str.replace('\n', ' ').replace('\r', ' ');
        return strReplace.length() <= i ? strReplace : AbstractC0473.m1292(i, strReplace).concat("…");
    }
}
