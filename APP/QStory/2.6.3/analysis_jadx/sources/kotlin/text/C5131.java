package kotlin.text;

import androidx.window.area.AbstractC2567;
import bsh.C2633;
import java.util.Iterator;
import p048.C6519;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5131 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f14677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6519 f14678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C5130 f14679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14682 = -1;

    public C5131(C5130 c5130) {
        this.f14679 = c5130;
        int iM5090 = AbstractC2567.m5090(0, 0, c5130.f14676.length());
        this.f14680 = iM5090;
        this.f14681 = iM5090;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14682 == -1) {
            m10125();
        }
        return this.f14682 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14682 == -1) {
            m10125();
        }
        if (this.f14682 == 0) {
            C2633.m5336();
            return null;
        }
        C6519 c6519 = this.f14678;
        c6519.getClass();
        this.f14678 = null;
        this.f14682 = -1;
        return c6519;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10125() {
        /*
            r8 = this;
            kotlin.text.飘花落叶言子楪世兰苏哲 r0 = r8.f14679
            java.lang.CharSequence r1 = r0.f14676
            int r2 = r8.f14681
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f14682 = r3
            r0 = 0
            r8.f14678 = r0
            return
        Lf:
            int r4 = r0.f14675
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.f14677
            int r7 = r7 + r6
            r8.f14677 = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰 r0 = new 飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰
            int r2 = r8.f14680
            int r1 = kotlin.text.AbstractC5144.m10158(r1)
            r0.<init>(r2, r1, r6)
            r8.f14678 = r0
            r8.f14681 = r5
            goto L77
        L32:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r0 = r0.f14674
            int r2 = r8.f14681
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L52
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰 r0 = new 飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰
            int r2 = r8.f14680
            int r1 = kotlin.text.AbstractC5144.m10158(r1)
            r0.<init>(r2, r1, r6)
            r8.f14678 = r0
            r8.f14681 = r5
            goto L77
        L52:
            java.lang.Object r1 = r0.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.f14680
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰 r2 = androidx.window.area.AbstractC2567.m5067(r2, r1)
            r8.f14678 = r2
            int r1 = r1 + r0
            r8.f14680 = r1
            if (r0 != 0) goto L74
            r3 = r6
        L74:
            int r1 = r1 + r3
            r8.f14681 = r1
        L77:
            r8.f14682 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C5131.m10125():void");
    }
}
