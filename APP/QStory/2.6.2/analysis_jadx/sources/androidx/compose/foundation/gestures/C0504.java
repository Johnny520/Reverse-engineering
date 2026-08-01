package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1632;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import com.alibaba.fastjson2.AbstractC2904;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.sequences.C5127;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import kotlinx.coroutines.channels.C5209;
import p052.InterfaceC6553;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0504 extends AbstractC0556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5189 f1500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5416 f1501;

    public C0504(C0502 c0502, InterfaceC6553 interfaceC6553, InterfaceC7895 interfaceC7895) {
        super(c0502, interfaceC6553, interfaceC7895);
        this.f1500 = AbstractC5204.m10278(Integer.MAX_VALUE, 6, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C0505 m1272(C5189 c5189) {
        C0505 c0505 = null;
        C5127 c5127M6249 = AbstractC2904.m6249(new NonTouchScrollingLogicKt$untilNull$1(new C0558(c5189, 1), null));
        while (c5127M6249.hasNext()) {
            C0505 c0505M1275 = (C0505) c5127M6249.next();
            if (c0505 != null) {
                c0505M1275 = c0505.m1275(c0505M1275);
            }
            c0505 = c0505M1275;
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
    public static final java.lang.Object m1273(androidx.compose.foundation.gestures.C0504 r18, androidx.compose.foundation.gestures.C0502 r19, androidx.compose.foundation.gestures.C0505 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0504.m1273(androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1274(C1652 c1652) {
        boolean z;
        boolean z2;
        boolean z3;
        C5189 c5189;
        C0502 c0502;
        C1643 c1643 = (C1643) AbstractC4343.m8830(c1652.f4851);
        if (c1643 != null) {
            List listM3013 = c1643.m3013();
            int size = listM3013.size();
            int i = 0;
            z3 = false;
            while (true) {
                c5189 = this.f1500;
                c0502 = this.f1604;
                if (i >= size) {
                    break;
                }
                C1632 c1632 = (C1632) listM3013.get(i);
                long j = c1632.f4774 ^ (-9223372034707292160L);
                if (!(c0502.m1260(c0502.m1253(j)) == 0.0f)) {
                    z3 = !(c5189.mo8445(new C0505(j, c1632.f4777, false)) instanceof C5209) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = c1643.f4817 ^ (-9223372034707292160L);
            boolean z4 = c1652.f4846 == 12;
            if (!(c0502.m1260(c0502.m1253(j2)) == 0.0f) || z4) {
                if (!(c5189.mo8445(new C0505(j2, c1643.f4807, z4)) instanceof C5209) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f1601) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
