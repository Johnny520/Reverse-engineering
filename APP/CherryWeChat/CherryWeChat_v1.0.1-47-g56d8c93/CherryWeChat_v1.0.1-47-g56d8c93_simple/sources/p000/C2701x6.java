package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: loaded from: classes.dex */
public class C2701x6 extends AbstractC2744y6 {

    /* JADX INFO: renamed from: d */
    public final byte[] f9275d;

    public C2701x6(byte[] r2) {
        this.f9371a = 0;
        r2.getClass();
        this.f9275d = r2;
    }

    @Override // p000.AbstractC2744y6
    /* JADX INFO: renamed from: a */
    public byte mo5220a(int r2) {
        return this.f9275d[r2];
    }

    @Override // p000.AbstractC2744y6
    /* JADX INFO: renamed from: e */
    public void mo5221e(int r3, byte[] r4) {
        System.arraycopy(this.f9275d, 0, r4, 0, r3);
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof AbstractC2744y6) == true) goto L8;
        return false;
    L8:
        if (size() == ((AbstractC2744y6) r6).size()) goto L11;
        return false;
    L11:
        if (size() != 0) goto L14;
        return true;
    L14:
        if ((r6 instanceof C2701x6) == false) goto L38;
        C2701x6 r62 = (C2701x6) r6;
        int r0 = this.f9371a;
        int r1 = r62.f9371a;
        if (r0 == 0) goto L20;
        if (r1 == 0) goto L20;
        if (r0 == r1) goto L20;
        return false;
    L20:
        int r02 = size();
        if (r02 > r62.size()) goto L36;
        if (r02 > r62.size()) goto L33;
        byte[] r12 = r62.f9275d;
        int r2 = mo5222h() + r02;
        int r03 = mo5222h();
        int r63 = r62.mo5222h();
    L25:
        if (r03 >= r2) goto L45;
        if (this.f9275d[r03] != r12[r63]) goto L43;
        r03 = r03 + 1;
        r63 = r63 + 1;
        goto L25
    L43:
        return false;
    L45:
        return true;
    L33:
        StringBuilder r04 = AbstractC2374ph.m4816m(r02, "Ran off end of other: 0, ", ", ");
        r04.append(r62.size());
        throw new IllegalArgumentException(r04.toString());
    L36:
        throw new IllegalArgumentException("Length too large: " + r02 + size());
    L38:
        return r6.equals(this);
    }

    /* JADX INFO: renamed from: h */
    public int mo5222h() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2615v6(this);
    }

    /* JADX INFO: renamed from: j */
    public byte mo5223j(int r2) {
        return this.f9275d[r2];
    }

    @Override // p000.AbstractC2744y6
    public int size() {
        return this.f9275d.length;
    }
}
