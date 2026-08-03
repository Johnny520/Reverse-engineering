package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface o {
    boolean a(fg.l r1);

    java.lang.Object b(fg.p r1, java.lang.Object r2);

    default y0.o d(y0.o r2) {
            r1 = this;
            y0.l r0 = y0.l.f21818a
            if (r2 != r0) goto L5
            return r1
        L5:
            y0.i r0 = new y0.i
            r0.<init>(r1, r2)
            return r0
    }
}
