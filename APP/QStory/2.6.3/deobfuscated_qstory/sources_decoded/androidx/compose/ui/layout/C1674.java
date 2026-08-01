package androidx.compose.ui.layout;

import java.util.Map;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1674 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1657 f4900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f4901;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1657 f4903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4904;

    public /* synthetic */ C1674(InterfaceC1657 interfaceC1657, C1661 c1661, int i, InterfaceC1657 interfaceC16572, int i2) {
        this.f4904 = i2;
        this.f4902 = c1661;
        this.f4901 = i;
        this.f4900 = interfaceC16572;
        this.f4903 = interfaceC1657;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo1470() {
        switch (this.f4904) {
        }
        return this.f4903.mo1470();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1471() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f4904
            androidx.compose.ui.layout.飘花落叶言子世兰苏哲楪 r2 = r0.f4900
            int r3 = r0.f4901
            androidx.compose.ui.layout.飘花落叶言子世哲楪兰苏 r0 = r0.f4902
            switch(r1) {
                case 0: goto L1e;
                default: goto Ld;
            }
        Ld:
            r0.f4867 = r3
            r2.mo1471()
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r0.f4874
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r1 = r1.f5120
            if (r1 != 0) goto L1d
            int r1 = r0.f4867
            r0.m3068(r1)
        L1d:
            return
        L1e:
            r0.f4866 = r3
            r2.mo1471()
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r1 = r0.f4861
            androidx.collection.飘花落叶言子世兰楪苏哲 r2 = r0.f4862
            long[] r3 = r2.f881
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8e
            r6 = 0
        L2f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L89
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L49:
            if (r11 >= r9) goto L87
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L83
            int r12 = r6 << 3
            int r12 = r12 + r11
            java.lang.Object[] r13 = r2.f880
            r13 = r13[r12]
            java.lang.Object[] r14 = r2.f879
            r14 = r14[r12]
            androidx.compose.ui.layout.飘花落叶言子苏兰楪世哲 r14 = (androidx.compose.ui.layout.InterfaceC1718) r14
            int r15 = r1.m2054(r13)
            if (r15 < 0) goto L6b
            int r5 = r0.f4866
            if (r15 < r5) goto L83
        L6b:
            if (r15 < 0) goto L75
            java.lang.Object[] r5 = r1.f3521
            r16 = r5[r15]
            java.lang.Object r16 = androidx.compose.ui.layout.AbstractC1670.f4893
            r5[r15] = r16
        L75:
            androidx.collection.飘花落叶言子世兰楪苏哲 r5 = r0.f4864
            boolean r5 = r5.m753(r13)
            if (r5 == 0) goto L80
            r14.dispose()
        L80:
            r2.m759(r12)
        L83:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L49
        L87:
            if (r9 != r10) goto L8e
        L89:
            if (r6 == r4) goto L8e
            int r6 = r6 + 1
            goto L2f
        L8e:
            int r1 = r0.f4867
            r0.m3068(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.C1674.mo1471():void");
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1472() {
        switch (this.f4904) {
        }
        return this.f4903.mo1472();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1473() {
        switch (this.f4904) {
        }
        return this.f4903.mo1473();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1474() {
        switch (this.f4904) {
        }
        return this.f4903.mo1474();
    }
}
