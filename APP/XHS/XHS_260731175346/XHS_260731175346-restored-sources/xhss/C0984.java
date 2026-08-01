package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲀᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0984 extends java.io.Writer {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.StringBuilder f3193;

    public C0984() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f3193 = r0
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            r0.m1618()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r0 = this;
            r0.m1618()
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L17
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto Lf
            r3.m1618()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.f3193
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1618() {
            r2 = this;
            java.lang.StringBuilder r2 = r2.f3193
            int r0 = r2.length()
            if (r0 <= 0) goto L10
            r0 = 0
            int r1 = r2.length()
            r2.delete(r0, r1)
        L10:
            return
    }
}
