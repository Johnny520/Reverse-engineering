package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2359 extends Writer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final StringBuilder f6988 = new StringBuilder(128);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f6989 = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4486();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m4486();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m4486();
            } else {
                this.f6988.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4486() {
        StringBuilder sb = this.f6988;
        if (sb.length() > 0) {
            Log.d(this.f6989, sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
