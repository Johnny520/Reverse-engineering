package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0511k extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f1446a;

    public C0511k() {
        this.f1446a = new StringBuilder(128);
    }

    /* JADX INFO: renamed from: a */
    public final void m1243a() {
        StringBuilder r02 = this.f1446a;
        if (r02.length() <= 0) goto L6;
        r02.toString();
        r02.delete(0, r02.length());
        return;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1243a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1243a();
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
        int r02 = 0;
    L3:
        if (r02 >= r6) goto L9;
        char r1 = r4[r5 + r02];
        if (r1 != '\n') goto L7;
        m1243a();
    L8:
        r02 = r02 + 1;
        goto L3
    L7:
        this.f1446a.append(r1);
        goto L8
    }
}
