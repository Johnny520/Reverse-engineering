package androidx.compose.material3;

import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.vector.AbstractC1547;
import androidx.compose.ui.graphics.vector.C1543;
import p118.AbstractC7358;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2129 f3312 = AbstractC0619.m1369(C2125.f6275, AbstractC7358.f19696);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2011(C1543 c1543, InterfaceC2129 interfaceC2129, long j, InterfaceC1373 interfaceC1373, int i, int i2) {
        int i3;
        long j2;
        InterfaceC2129 interfaceC21292;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-126890956);
        int i4 = (c1324.m2350(c1543) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (c1324.m2350(interfaceC2129) ? 256 : 128);
        }
        int i6 = i3 | (((i2 & 8) == 0 && c1324.m2351(j)) ? 2048 : 1024);
        if (c1324.m2333(i6 & 1, (i6 & 1171) != 1170)) {
            c1324.m2331();
            if ((i & 1) == 0 || c1324.m2343()) {
                if (i5 != 0) {
                    interfaceC2129 = C2125.f6275;
                }
                if ((i2 & 8) != 0) {
                    j = ((C1599) c1324.m2373(AbstractC1195.f3448)).f4699;
                    i6 &= -7169;
                }
                InterfaceC2129 interfaceC21293 = interfaceC2129;
                long j3 = j;
                c1324.m2364();
                m2012(AbstractC1547.m2824(c1543, c1324), interfaceC21293, j3, c1324, (i6 & 896) | 56 | (i6 & 7168));
                interfaceC21292 = interfaceC21293;
                j2 = j3;
            } else {
                c1324.m2329();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                InterfaceC2129 interfaceC212932 = interfaceC2129;
                long j32 = j;
                c1324.m2364();
                m2012(AbstractC1547.m2824(c1543, c1324), interfaceC212932, j32, c1324, (i6 & 896) | 56 | (i6 & 7168));
                interfaceC21292 = interfaceC212932;
                j2 = j32;
            }
        } else {
            c1324.m2329();
            j2 = j;
            interfaceC21292 = interfaceC2129;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1154(c1543, interfaceC21292, j2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2012(androidx.compose.ui.graphics.painter.AbstractC1528 r16, androidx.compose.ui.InterfaceC2129 r17, long r18, androidx.compose.runtime.InterfaceC1373 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AbstractC1153.m2012(androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏兰哲, androidx.compose.ui.飘花落叶言子楪哲苏兰世, long, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }
}
