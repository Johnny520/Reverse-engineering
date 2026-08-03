package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0511k extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f1446a = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final void m1243a() {
        StringBuilder sb = this.f1446a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
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
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == '\n') {
                m1243a();
            } else {
                this.f1446a.append(c);
            }
        }
    }
}
