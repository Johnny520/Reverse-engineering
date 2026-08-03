package Yue;

import Yue.InterfaceC7144;
import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Deprecated
public class C5865 extends Writer {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f14539;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public StringBuilder f14540 = new StringBuilder(128);

    public C5865(String str) {
        this.f14539 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2538();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2538();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2538();
            } else {
                this.f14540.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2538() {
        if (this.f14540.length() > 0) {
            Log.d(this.f14539, this.f14540.toString());
            StringBuilder sb = this.f14540;
            sb.delete(0, sb.length());
        }
    }
}
