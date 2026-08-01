package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class as extends Writer {
    public final String a;
    public final StringBuilder b;

    public as() {
        this.b = new StringBuilder(128);
        this.a = "FragmentManager";
    }

    public final void a() {
        StringBuilder r0 = this.b;
        if (r0.length() <= 0) goto L6;
        Log.d(this.a, r0.toString());
        r0.delete(0, r0.length());
        return;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L9;
        char r1 = r4[r5 + r0];
        if (r1 != '\n') goto L7;
        a();
    L8:
        r0 = r0 + 1;
        goto L3
    L7:
        this.b.append(r1);
        goto L8
    }
}
