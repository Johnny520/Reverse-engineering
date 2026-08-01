package androidx.compose.material3;

import androidx.activity.compose.C0011;
import androidx.appcompat.widget.C0194;
import androidx.compose.foundation.AbstractC1092;
import androidx.compose.foundation.layout.C0591;
import androidx.compose.foundation.text.contextmenu.provider.C0829;
import androidx.compose.foundation.text.selection.AbstractC0929;
import androidx.compose.foundation.text.selection.C0930;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.graphics.C1599;
import kotlin.AbstractC5186;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f3320;

    static {
        AbstractC5186.m10210(new C0011(15));
        f3320 = new C1334(new C0011(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2013(C1192 c1192, C1219 c1219, C1166 c1166, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        C1192 c11922;
        C1242 c12422;
        C1166 c11662;
        C1219 c12192;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-449719819);
        int i2 = (c1324.m2350(c1192) ? 4 : 2) | i | 144;
        if (c1324.m2333(i2 & 1, (i2 & 1171) != 1170)) {
            c1324.m2331();
            if ((i & 1) == 0 || c1324.m2343()) {
                c1219 = (C1219) c1324.m2373(AbstractC1202.f3453);
                c1166 = (C1166) c1324.m2373(AbstractC1162.f3321);
            } else {
                c1324.m2329();
            }
            int i3 = i2 & (-1009);
            C1219 c12193 = c1219;
            C1166 c11663 = c1166;
            c1324.m2364();
            c11922 = c1192;
            m2014(c11922, (C1147) c1324.m2373(f3320), c12193, c11663, c1242, c1324, (i3 & 14) | 24576);
            c12422 = c1242;
            c12192 = c12193;
            c11662 = c11663;
        } else {
            c11922 = c1192;
            c12422 = c1242;
            c1324.m2329();
            c11662 = c1166;
            c12192 = c1219;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0829(c11922, c12192, c11662, c12422, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2014(C1192 c1192, C1147 c1147, C1219 c1219, C1166 c1166, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(904511636);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(c1192) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2350(c1147) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2350(c1219) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2350(c1166) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2368(c1242) ? 16384 : 8192;
        }
        if (c1324.m2333(i2 & 1, (i2 & 9363) != 9362)) {
            c1324.m2331();
            if ((i & 1) != 0 && !c1324.m2343()) {
                c1324.m2329();
            }
            c1324.m2364();
            C1138 c1138M2008 = AbstractC1142.m2008(0.0f, 7);
            long j = c1192.f3428;
            boolean zM2351 = c1324.m2351(j);
            Object objM2335 = c1324.m2335();
            if (zM2351 || objM2335 == C1369.f3973) {
                objM2335 = new C0930(j, C1599.m2940(0.4f, j));
                c1324.m2376(objM2335);
            }
            AbstractC1367.m2477(new C0194[]{AbstractC1197.f3451.mo2418(c1192), f3320.mo2418(c1147), AbstractC1092.f3220.mo2418(c1138M2008), AbstractC1202.f3453.mo2418(c1219), AbstractC0929.f2637.mo2418((C0930) objM2335), AbstractC1162.f3321.mo2418(c1166)}, AbstractC1254.m2179(-1750539308, new C1150(c1166, c1242), c1324), c1324, 56);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0591(c1192, c1147, c1219, c1166, c1242, i, 1);
        }
    }
}
