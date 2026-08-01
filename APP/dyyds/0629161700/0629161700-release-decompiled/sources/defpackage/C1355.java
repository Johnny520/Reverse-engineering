package defpackage;

/* JADX INFO: renamed from: ᛷᲀᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1355 extends java.io.Writer {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1481 f5939;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.StringBuilder f5940;

    public C1355(java.lang.StringBuilder r2) {
            r1 = this;
            r1.<init>()
            ᛸᛴᲁᲈ r0 = new ᛸᛴᲁᲈ
            r0.<init>()
            r1.f5939 = r0
            r1.f5940 = r2
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f5940
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f5940
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f5940
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f5940
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.StringBuilder r1 = r1.f5940
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto Lb
            java.io.Closeable r1 = (java.io.Closeable) r1
            r1.close()
        Lb:
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r1 = this;
            java.lang.StringBuilder r1 = r1.f5940
            boolean r0 = r1 instanceof java.io.Flushable
            if (r0 == 0) goto Lb
            java.io.Flushable r1 = (java.io.Flushable) r1
            r1.flush()
        Lb:
            return
    }

    @Override // java.io.Writer
    public final void write(int r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.f5940
            char r1 = (char) r1
            r0.append(r1)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r1, int r2, int r3) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.f5940
            int r3 = r3 + r2
            r0.append(r1, r2, r3)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r2, int r3, int r4) {
            r1 = this;
            ᛸᛴᲁᲈ r0 = r1.f5939
            r0.f6567 = r2
            r2 = 0
            r0.f6566 = r2
            java.lang.StringBuilder r1 = r1.f5940
            int r4 = r4 + r3
            r1.append(r0, r3, r4)
            return
    }
}
