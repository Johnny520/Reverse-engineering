package a;

/* JADX INFO: loaded from: classes.dex */
public final class J2 extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Typeface f132a;
    public final a.R0 b;
    public boolean c;

    public J2(a.R0 r1, android.graphics.Typeface r2) {
            r0 = this;
            r0.<init>()
            r0.f132a = r2
            r0.b = r1
            return
    }

    @Override // a.AbstractC0040a2
    public final void d(int r2) {
            r1 = this;
            boolean r2 = r1.c
            if (r2 != 0) goto L16
            a.R0 r2 = r1.b
            java.lang.Object r2 = r2.f235a
            a.n3 r2 = (a.C0276n3) r2
            android.graphics.Typeface r0 = r1.f132a
            boolean r0 = r2.j(r0)
            if (r0 == 0) goto L16
            r0 = 0
            r2.h(r0)
        L16:
            return
    }

    @Override // a.AbstractC0040a2
    public final void e(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            boolean r2 = r0.c
            if (r2 != 0) goto L14
            a.R0 r2 = r0.b
            java.lang.Object r2 = r2.f235a
            a.n3 r2 = (a.C0276n3) r2
            boolean r1 = r2.j(r1)
            if (r1 == 0) goto L14
            r1 = 0
            r2.h(r1)
        L14:
            return
    }
}
