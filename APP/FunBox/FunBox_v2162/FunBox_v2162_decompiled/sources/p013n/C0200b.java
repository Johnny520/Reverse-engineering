package p013n;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0200b {

    /* JADX INFO: renamed from: a */
    private final byte[] f789a;

    /* JADX INFO: renamed from: b */
    private final int f790b;

    public C0200b(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f789a = bArr;
        this.f790b = length + 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m477a(byte[] bArr, int i2) {
        int length = bArr.length - i2;
        int i3 = this.f790b;
        if (length < i3) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f789a, 0, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public final int m478b() {
        return this.f790b;
    }
}
