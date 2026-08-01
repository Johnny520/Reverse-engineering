package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jv0 extends java.io.Writer {

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f5590;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.StringBuilder f5591;

    public jv0() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f5591 = r0
            java.lang.String r0 = "FragmentManager"
            r2.f5590 = r0
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            r0.m2989()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r0 = this;
            r0.m2989()
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
            r3.m2989()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.f5591
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m2989() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f5591
            int r1 = r0.length()
            if (r1 <= 0) goto L19
            java.lang.String r2 = r2.f5590
            java.lang.String r1 = r0.toString()
            android.util.Log.d(r2, r1)
            r2 = 0
            int r1 = r0.length()
            r0.delete(r2, r1)
        L19:
            return
    }
}
