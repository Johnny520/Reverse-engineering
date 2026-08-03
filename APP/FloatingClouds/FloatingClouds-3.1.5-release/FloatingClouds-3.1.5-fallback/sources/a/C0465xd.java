package a;

/* JADX INFO: renamed from: a.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0465xd {
    public static final a.C0447wd.a a(java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            a.C0193i9.e(r1, r0)
            a.wd$a r0 = new a.wd$a
            r0.<init>(r1)
            return r0
    }

    public static final void b(java.lang.Object r1) {
            boolean r0 = r1 instanceof a.C0447wd.a
            if (r0 != 0) goto L5
            return
        L5:
            a.wd$a r1 = (a.C0447wd.a) r1
            java.lang.Throwable r1 = r1.f753a
            throw r1
    }
}
