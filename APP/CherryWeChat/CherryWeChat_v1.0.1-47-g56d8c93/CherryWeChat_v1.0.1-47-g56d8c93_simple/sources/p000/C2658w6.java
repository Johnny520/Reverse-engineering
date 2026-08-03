package p000;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658w6 extends C2701x6 {

    /* JADX INFO: renamed from: e */
    public final int f9199e;

    /* JADX INFO: renamed from: f */
    public final int f9200f;

    public C2658w6(byte[] r2, int r3, int r4) {
        super(r2);
        AbstractC2744y6.m5327b(r3, r3 + r4, r2.length);
        this.f9199e = r3;
        this.f9200f = r4;
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    /* JADX INFO: renamed from: a */
    public final byte mo5220a(int r5) {
        int r1 = this.f9200f;
        if (((r1 - (r5 + 1)) | r5) >= 0) goto L10;
        if (r5 >= 0) goto L8;
        throw new ArrayIndexOutOfBoundsException(AbstractC2374ph.m4812i(r5, "Index < 0: "));
    L8:
        throw new ArrayIndexOutOfBoundsException("Index > length: " + r5 + ", " + r1);
    L10:
        return this.f9275d[this.f9199e + r5];
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    /* JADX INFO: renamed from: e */
    public final void mo5221e(int r4, byte[] r5) {
        System.arraycopy(this.f9275d, this.f9199e, r5, 0, r4);
    }

    @Override // p000.C2701x6
    /* JADX INFO: renamed from: h */
    public final int mo5222h() {
        return this.f9199e;
    }

    @Override // p000.C2701x6
    /* JADX INFO: renamed from: j */
    public final byte mo5223j(int r2) {
        int r0 = this.f9199e + r2;
        return this.f9275d[r0];
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    public final int size() {
        return this.f9200f;
    }
}
