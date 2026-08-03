package a;

/* JADX INFO: loaded from: classes.dex */
public final class H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Mf.a f110a;
    public final android.os.Handler b;

    public H2(a.Mf.a r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f110a = r1
            r0.b = r2
            return
    }

    public final void a(a.R6.a r5) {
            r4 = this;
            int r0 = r5.b
            android.os.Handler r1 = r4.b
            a.Mf$a r2 = r4.f110a
            if (r0 != 0) goto L13
            a.F2 r0 = new a.F2
            android.graphics.Typeface r5 = r5.f243a
            r0.<init>(r2, r5)
            r1.post(r0)
            return
        L13:
            a.G2 r5 = new a.G2
            r3 = 0
            r5.<init>(r2, r0, r3)
            r1.post(r5)
            return
    }
}
