package kotlin.text;

import bsh.C2632;
import java.util.Iterator;
import p000.AbstractC6087;
import p048.C6518;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5130 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f14677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6518 f14678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C5129 f14679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14682 = -1;

    public C5130(C5129 c5129) {
        this.f14679 = c5129;
        int iM11420 = AbstractC6087.m11420(0, 0, c5129.f14676.length());
        this.f14680 = iM11420;
        this.f14681 = iM11420;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14682 == -1) {
            m10121();
        }
        return this.f14682 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14682 == -1) {
            m10121();
        }
        if (this.f14682 == 0) {
            C2632.m5291();
            return null;
        }
        C6518 c6518 = this.f14678;
        c6518.getClass();
        this.f14678 = null;
        this.f14682 = -1;
        return c6518;
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
    public final void m10121() {
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
            int r1 = kotlin.text.AbstractC5143.m10154(r1)
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
            int r1 = kotlin.text.AbstractC5143.m10154(r1)
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
            飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰 r2 = p000.AbstractC6087.m11422(r2, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C5130.m10121():void");
    }
}
