package p000;

import java.io.Writer;

/* JADX INFO: renamed from: ip */
/* JADX INFO: loaded from: classes.dex */
public final class C2068ip extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f7317a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4238d();
    }

    /* JADX INFO: renamed from: d */
    public final void m4238d() {
        StringBuilder sb = this.f7317a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m4238d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m4238d();
            } else {
                this.f7317a.append(c);
            }
        }
    }
}
