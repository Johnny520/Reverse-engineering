package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛸᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0301 extends java.io.Writer {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.StringBuilder f1149;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0253 f1150;

    public C0301(java.lang.StringBuilder r2) {
            r1 = this;
            r1.<init>()
            xhss.ᛳᛳᛵᛸ r0 = new xhss.ᛳᛳᛵᛸ
            r0.<init>()
            r1.f1150 = r0
            r1.f1149 = r2
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f1149
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f1149
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f1149
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f1149
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.StringBuilder r1 = r1.f1149
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
            java.lang.StringBuilder r1 = r1.f1149
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
            java.lang.StringBuilder r0 = r0.f1149
            char r1 = (char) r1
            r0.append(r1)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r1, int r2, int r3) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.f1149
            int r3 = r3 + r2
            r0.append(r1, r2, r3)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r2, int r3, int r4) {
            r1 = this;
            xhss.ᛳᛳᛵᛸ r0 = r1.f1150
            r0.f941 = r2
            r2 = 0
            r0.f942 = r2
            java.lang.StringBuilder r1 = r1.f1149
            int r4 = r4 + r3
            r1.append(r0, r3, r4)
            return
    }
}
