package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0418I extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f1270b = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final String f1269a = "FragmentManager";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m808a() {
        StringBuilder sb = this.f1270b;
        if (sb.length() > 0) {
            Log.d(this.f1269a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m808a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m808a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m808a();
            } else {
                this.f1270b.append(c2);
            }
        }
    }
}
