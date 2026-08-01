package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2359 extends Writer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final StringBuilder f6987 = new StringBuilder(128);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f6988 = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4476();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m4476();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m4476();
            } else {
                this.f6987.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4476() {
        StringBuilder sb = this.f6987;
        if (sb.length() > 0) {
            Log.d(this.f6988, sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
