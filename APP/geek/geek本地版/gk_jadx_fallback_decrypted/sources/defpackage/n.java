package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final defpackage.n b = null;
    public static final defpackage.n c = null;
    public final java.lang.Throwable a;

    static {
            boolean r0 = defpackage.t.d
            r1 = 0
            if (r0 == 0) goto La
            defpackage.n.c = r1
            defpackage.n.b = r1
            return
        La:
            n r0 = new n
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n.c = r0
            n r0 = new n
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n.b = r0
            return
    }

    public n(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }
}
