package Yue;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5864 extends Writer {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f14537;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public StringBuilder f14538 = new StringBuilder(128);

    public C5864(String str) {
        this.f14537 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2537();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2537();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2537();
            } else {
                this.f14538.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2537() {
        if (this.f14538.length() > 0) {
            Log.d(this.f14537, this.f14538.toString());
            StringBuilder sb = this.f14538;
            sb.delete(0, sb.length());
        }
    }
}
