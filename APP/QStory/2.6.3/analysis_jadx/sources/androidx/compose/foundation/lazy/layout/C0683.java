package androidx.compose.foundation.lazy.layout;

import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import java.util.Map;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p116.AbstractC7348;
import p116.C7339;
import p116.C7344;
import p116.InterfaceC7338;
import p116.InterfaceC7340;
import p116.InterfaceC7345;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683 implements InterfaceC7345, InterfaceC7340 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7339 f1908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0235 f1909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7344 f1910;

    public C0683(InterfaceC7345 interfaceC7345, Map map, C7339 c7339) {
        C0723 c0723 = new C0723(interfaceC7345, 3);
        C1334 c1334 = AbstractC7348.f19574;
        this.f1910 = new C7344(map, c0723);
        this.f1908 = c7339;
        C0235 c0235 = AbstractC0285.f997;
        this.f1909 = new C0235();
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7338 mo1481(String str, InterfaceC6543 interfaceC6543) {
        return this.f1910.mo1481(str, interfaceC6543);
    }

    @Override // p116.InterfaceC7340
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1482(Object obj, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-858296452);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(this) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            this.f1908.mo1482(obj, c1242, c1324, i2 & 126);
            boolean zM2378 = c1324.m2378(this) | c1324.m2378(obj);
            Object objM2345 = c1324.m2345();
            if (zM2378 || objM2345 == C1369.f3974) {
                objM2345 = new C0002(this, 11, obj);
                c1324.m2386(objM2345);
            }
            AbstractC1367.m2484(obj, (InterfaceC6558) objM2345, c1324);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(this, obj, c1242, i, 1);
        }
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo1483(String str) {
        return this.f1910.mo1483(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo1484() {
        /*
            r14 = this;
            androidx.collection.飘花落叶言子世兰楪哲苏 r0 = r14.f1909
            java.lang.Object[] r1 = r0.f1000
            long[] r0 = r0.f1001
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L51
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            飘花落叶言子世哲苏兰楪.飘花落叶言子楪世兰苏哲 r11 = r14.f1908
            androidx.collection.飘花落叶言子世兰楪苏哲 r12 = r11.f19552
            java.lang.Object r12 = r12.m758(r10)
            if (r12 != 0) goto L46
            java.util.Map r11 = r11.f19554
            r11.remove(r10)
        L46:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4a:
            if (r7 != r8) goto L51
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Ld
        L51:
            飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏世兰哲 r14 = r14.f1910
            java.util.Map r14 = r14.mo1484()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0683.mo1484():java.util.Map");
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1485(Object obj) {
        return this.f1910.mo1485(obj);
    }
}
