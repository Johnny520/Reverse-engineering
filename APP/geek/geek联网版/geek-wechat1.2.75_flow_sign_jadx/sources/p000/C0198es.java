package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes.dex */
public final class C0198es extends Writer {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f1631b = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final String f1630a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m1018a() {
        StringBuilder sb = this.f1631b;
        if (sb.length() > 0) {
            Log.d(this.f1630a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1018a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1018a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1018a();
            } else {
                this.f1631b.append(c);
            }
        }
    }
}
