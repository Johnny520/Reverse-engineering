package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends defpackage.o3 {
    public boolean c;
    public boolean d;
    public defpackage.d4 e;

    public final defpackage.d4 j(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.d
            if (r0 == 0) goto L7
            d4 r5 = r4.e
            return r5
        L7:
            java.lang.Object r0 = r4.a
            g40 r0 = (defpackage.g40) r0
            ml r1 = r0.c
            int r0 = r0.a
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L15
            r0 = r3
            goto L16
        L15:
            r0 = 0
        L16:
            boolean r2 = r4.c
            d4 r5 = defpackage.ff.A(r5, r1, r0, r2)
            r4.e = r5
            r4.d = r3
            return r5
    }
}
