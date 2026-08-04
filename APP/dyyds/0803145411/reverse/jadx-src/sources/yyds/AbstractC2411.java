package yyds;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲇᛲᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2411 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f11851;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2378 f11852;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ArrayList f11853;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f11854;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f11855;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public long f11856;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4462(AbstractC0185 abstractC0185) {
        int i = abstractC0185.f1091;
        if (!abstractC0185.m780() && (i & 4) == 0) {
            abstractC0185.m778();
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract void mo4463();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public abstract boolean mo4464(AbstractC0185 abstractC0185, AbstractC0185 abstractC01852, C2292 c2292, C2292 c22922);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4465(AbstractC0185 abstractC0185) {
        C2378 c2378 = this.f11852;
        if (c2378 != null) {
            C1213 c1213 = c2378.f11724;
            boolean z = true;
            abstractC0185.m777(true);
            View view = abstractC0185.f1093;
            if (abstractC0185.f1098 != null && abstractC0185.f1089 == null) {
                abstractC0185.f1098 = null;
            }
            abstractC0185.f1089 = null;
            if ((abstractC0185.f1091 & 16) != 0) {
                return;
            }
            C2808 c2808 = c1213.f5529;
            c1213.m2440();
            C2791 c2791 = c1213.f5523;
            C1641 c1641 = (C1641) c2791.f13645;
            C2378 c23782 = (C2378) c2791.f13650;
            int i = c2791.f13648;
            if (i != 1) {
                if (i == 2) {
                    C0188.m800("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    c2791.f13648 = 2;
                    int iIndexOfChild = c23782.f11724.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c2791.m4914(view);
                    } else if (c1641.m3355(iIndexOfChild)) {
                        c1641.m3352(iIndexOfChild);
                        c2791.m4914(view);
                        c23782.m4416(iIndexOfChild);
                    }
                    if (z) {
                        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
                        c2808.m4935(abstractC0185M2412);
                        c2808.m4929(abstractC0185M2412);
                        if (C1213.f5512) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + c1213);
                        }
                    }
                    c1213.m2447(!z);
                    if (z && abstractC0185.m781()) {
                        c1213.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c2791.f13648 = 0;
                }
            }
            if (((View) c2791.f13649) != view) {
                C0188.m800("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
            }
            c1213.m2447(!z);
            if (z) {
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract boolean mo4466();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public abstract void mo4467(AbstractC0185 abstractC0185);
}
