package p000;

import java.io.Writer;

/* JADX INFO: renamed from: ip */
/* JADX INFO: loaded from: classes.dex */
public final class C2068ip extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f7317a;

    public C2068ip() {
        this.f7317a = new StringBuilder(128);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4238d();
    }

    /* JADX INFO: renamed from: d */
    public final void m4238d() {
        StringBuilder r0 = this.f7317a;
        if (r0.length() <= 0) goto L6;
        r0.toString();
        r0.delete(0, r0.length());
        return;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m4238d();
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L9;
        char r1 = r4[r5 + r0];
        if (r1 != '\n') goto L7;
        m4238d();
    L8:
        r0 = r0 + 1;
        goto L3
    L7:
        this.f7317a.append(r1);
        goto L8
    }
}
