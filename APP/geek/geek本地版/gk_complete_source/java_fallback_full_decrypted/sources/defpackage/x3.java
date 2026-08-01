package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x3 {
    public final android.widget.TextView a;
    public final defpackage.l0 b;

    public x3(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            l0 r0 = new l0
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.xy.i
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            r5 = 14
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r5 = move-exception
            goto L24
        L1d:
            r4.recycle()
            r3.c(r1)
            return
        L24:
            r4.recycle()
            throw r5
    }

    public final void b(boolean r2) {
            r1 = this;
            l0 r0 = r1.b
            java.lang.Object r0 = r0.b
            a80 r0 = (defpackage.a80) r0
            r0.C(r2)
            return
    }

    public final void c(boolean r2) {
            r1 = this;
            l0 r0 = r1.b
            java.lang.Object r0 = r0.b
            a80 r0 = (defpackage.a80) r0
            r0.D(r2)
            return
    }
}
