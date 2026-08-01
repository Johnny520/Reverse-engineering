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
import kotlin.AbstractC5187;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f3321;

    static {
        AbstractC5187.m10214(new C0011(15));
        f3321 = new C1334(new C0011(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2023(C1192 c1192, C1219 c1219, C1166 c1166, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        C1192 c11922;
        C1242 c12422;
        C1166 c11662;
        C1219 c12192;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-449719819);
        int i2 = (c1324.m2360(c1192) ? 4 : 2) | i | 144;
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            c1324.m2341();
            if ((i & 1) == 0 || c1324.m2353()) {
                c1219 = (C1219) c1324.m2383(AbstractC1202.f3454);
                c1166 = (C1166) c1324.m2383(AbstractC1162.f3322);
            } else {
                c1324.m2339();
            }
            int i3 = i2 & (-1009);
            C1219 c12193 = c1219;
            C1166 c11663 = c1166;
            c1324.m2374();
            c11922 = c1192;
            m2024(c11922, (C1147) c1324.m2383(f3321), c12193, c11663, c1242, c1324, (i3 & 14) | 24576);
            c12422 = c1242;
            c12192 = c12193;
            c11662 = c11663;
        } else {
            c11922 = c1192;
            c12422 = c1242;
            c1324.m2339();
            c11662 = c1166;
            c12192 = c1219;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0829(c11922, c12192, c11662, c12422, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2024(C1192 c1192, C1147 c1147, C1219 c1219, C1166 c1166, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(904511636);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(c1192) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(c1147) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2360(c1219) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2360(c1166) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2378(c1242) ? 16384 : 8192;
        }
        if (c1324.m2343(i2 & 1, (i2 & 9363) != 9362)) {
            c1324.m2341();
            if ((i & 1) != 0 && !c1324.m2353()) {
                c1324.m2339();
            }
            c1324.m2374();
            C1138 c1138M2018 = AbstractC1142.m2018(0.0f, 7);
            long j = c1192.f3429;
            boolean zM2361 = c1324.m2361(j);
            Object objM2345 = c1324.m2345();
            if (zM2361 || objM2345 == C1369.f3974) {
                objM2345 = new C0930(j, C1599.m2950(0.4f, j));
                c1324.m2386(objM2345);
            }
            AbstractC1367.m2486(new C0194[]{AbstractC1197.f3452.mo2428(c1192), f3321.mo2428(c1147), AbstractC1092.f3221.mo2428(c1138M2018), AbstractC1202.f3454.mo2428(c1219), AbstractC0929.f2638.mo2428((C0930) objM2345), AbstractC1162.f3322.mo2428(c1166)}, AbstractC1254.m2189(-1750539308, new C1150(c1166, c1242), c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0591(c1192, c1147, c1219, c1166, c1242, i, 1);
        }
    }
}
