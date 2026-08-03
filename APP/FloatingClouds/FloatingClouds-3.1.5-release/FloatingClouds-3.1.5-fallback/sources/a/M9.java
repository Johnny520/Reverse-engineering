package a;

/* JADX INFO: loaded from: classes.dex */
public final class M9 extends java.io.Writer implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f174a;
    public final java.lang.StringBuilder b;

    public M9() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.b = r0
            java.lang.String r0 = "FragmentManager"
            r2.f174a = r0
            return
    }

    public final void a() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.b
            int r1 = r0.length()
            if (r1 <= 0) goto L19
            java.lang.String r1 = r3.f174a
            java.lang.String r2 = r0.toString()
            android.util.Log.d(r1, r2)
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L19:
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            r0.a()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r0 = this;
            r0.a()
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L17
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto Lf
            r3.a()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.b
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
