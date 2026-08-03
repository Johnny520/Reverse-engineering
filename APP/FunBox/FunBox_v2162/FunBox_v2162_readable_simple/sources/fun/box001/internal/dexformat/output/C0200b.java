package fun.box001.internal.dexformat.output;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0200b {

    /* JADX INFO: renamed from: a */
    private final byte[] f789a;

    /* JADX INFO: renamed from: b */
    private final int f790b;

    public C0200b(byte[] r3) {
        int r0 = r3.length;
        if (r0 < 0) goto L11;
        if (r0 > r3.length) goto L9;
        this.f789a = r3;
        this.f790b = r0 + 0;
        return;
    L9:
        throw new IllegalArgumentException("end > bytes.length");
    L11:
        throw new IllegalArgumentException("end < start");
    }

    /* JADX INFO: renamed from: a */
    public final void m477a(byte[] r4, int r5) {
        int r0 = r4.length - r5;
        int r1 = this.f790b;
        if (r0 < r1) goto L7;
        System.arraycopy(this.f789a, 0, r4, r5, r1);
        return;
    L7:
        throw new IndexOutOfBoundsException("(out.length - offset) < size()");
    }

    /* JADX INFO: renamed from: b */
    public final int m478b() {
        return this.f790b;
    }
}
