package p000a;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: a.M9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0228M9 extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f766b = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final String f765a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m621a() {
        StringBuilder sb = this.f766b;
        if (sb.length() > 0) {
            Log.d(this.f765a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m621a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m621a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m621a();
            } else {
                this.f766b.append(c);
            }
        }
    }
}
