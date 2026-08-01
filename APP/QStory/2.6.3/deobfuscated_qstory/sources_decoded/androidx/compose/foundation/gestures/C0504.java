package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1632;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.sequences.C5128;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.C5210;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0504 extends AbstractC0556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5190 f1501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5417 f1502;

    public C0504(C0502 c0502, InterfaceC6554 interfaceC6554, InterfaceC7896 interfaceC7896) {
        super(c0502, interfaceC6554, interfaceC7896);
        this.f1501 = AbstractC5205.m10282(Integer.MAX_VALUE, 6, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C0505 m1282(C5190 c5190) {
        C0505 c0505 = null;
        C5128 c5128M12045 = AbstractC6561.m12045(new NonTouchScrollingLogicKt$untilNull$1(new C0558(c5190, 1), null));
        while (c5128M12045.hasNext()) {
            C0505 c0505M1285 = (C0505) c5128M12045.next();
            if (c0505 != null) {
                c0505M1285 = c0505.m1285(c0505M1285);
            }
            c0505 = c0505M1285;
        }
        return c0505;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (r0.invoke(r3, r4) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1283(androidx.compose.foundation.gestures.C0504 r18, androidx.compose.foundation.gestures.C0502 r19, androidx.compose.foundation.gestures.C0505 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0504.m1283(androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1284(C1652 c1652) {
        boolean z;
        boolean z2;
        boolean z3;
        C5190 c5190;
        C0502 c0502;
        C1643 c1643 = (C1643) AbstractC4344.m8815(c1652.f4852);
        if (c1643 != null) {
            List listM3023 = c1643.m3023();
            int size = listM3023.size();
            int i = 0;
            z3 = false;
            while (true) {
                c5190 = this.f1501;
                c0502 = this.f1605;
                if (i >= size) {
                    break;
                }
                C1632 c1632 = (C1632) listM3023.get(i);
                long j = c1632.f4775 ^ (-9223372034707292160L);
                if (!(c0502.m1270(c0502.m1263(j)) == 0.0f)) {
                    z3 = !(c5190.mo8436(new C0505(j, c1632.f4778, false)) instanceof C5210) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c1643.f4818 ^ (-9223372034707292160L);
            boolean z4 = c1652.f4847 == 12;
            if (!(c0502.m1270(c0502.m1263(j2)) == 0.0f) || z4) {
                if (!(c5190.mo8436(new C0505(j2, c1643.f4808, z4)) instanceof C5210) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f1602) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
