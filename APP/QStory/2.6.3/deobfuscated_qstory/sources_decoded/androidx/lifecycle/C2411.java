package androidx.lifecycle;

import androidx.collection.C0236;
import java.util.ArrayDeque;
import p114.InterfaceC7333;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2411 implements InterfaceC7333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f7048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f7049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f7051;

    public C2411(int i) {
        switch (i) {
            case 1:
                this.f7051 = true;
                this.f7048 = new C0236();
                break;
            default:
                this.f7051 = true;
                this.f7048 = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4514() {
        /*
            r14 = this;
            java.lang.Object r14 = r14.f7048
            androidx.collection.飘花落叶言子世兰楪苏哲 r14 = (androidx.collection.C0236) r14
            java.lang.Object[] r0 = r14.f879
            long[] r1 = r14.f881
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        Lf:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L29:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r11 = r10 instanceof androidx.collection.C0244
            if (r11 == 0) goto L4b
            androidx.collection.飘花落叶言子世哲苏楪兰 r10 = (androidx.collection.C0244) r10
            java.lang.Object[] r11 = r10.f1005
            int r10 = r10.f1004
            r12 = r3
        L44:
            if (r12 >= r10) goto L4b
            r13 = r11[r12]
            int r12 = r12 + 1
            goto L44
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L29
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto Lf
        L56:
            r14.m754()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2411.m4514():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4515() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7048;
        if (this.f7050) {
            return;
        }
        try {
            this.f7050 = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.f7049 || !this.f7051)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f7050 = false;
        }
    }
}
