package p000;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658w6 extends C2701x6 {

    /* JADX INFO: renamed from: e */
    public final int f9199e;

    /* JADX INFO: renamed from: f */
    public final int f9200f;

    public C2658w6(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC2744y6.m5327b(i, i + i2, bArr.length);
        this.f9199e = i;
        this.f9200f = i2;
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    /* JADX INFO: renamed from: a */
    public final byte mo5220a(int i) {
        int i2 = this.f9200f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f9275d[this.f9199e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2374ph.m4812i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    /* JADX INFO: renamed from: e */
    public final void mo5221e(int i, byte[] bArr) {
        System.arraycopy(this.f9275d, this.f9199e, bArr, 0, i);
    }

    @Override // p000.C2701x6
    /* JADX INFO: renamed from: h */
    public final int mo5222h() {
        return this.f9199e;
    }

    @Override // p000.C2701x6
    /* JADX INFO: renamed from: j */
    public final byte mo5223j(int i) {
        return this.f9275d[this.f9199e + i];
    }

    @Override // p000.C2701x6, p000.AbstractC2744y6
    public final int size() {
        return this.f9200f;
    }
}
