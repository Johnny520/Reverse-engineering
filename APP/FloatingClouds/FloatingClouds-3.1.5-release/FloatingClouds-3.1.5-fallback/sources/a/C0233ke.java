package a;

/* JADX INFO: renamed from: a.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0233ke {

    /* JADX INFO: renamed from: a.ke$a */
    public static class a extends a.C0233ke.c {
        public a(android.view.View r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: a.ke$b */
    public static class b extends a.C0233ke.a {
    }

    /* JADX INFO: renamed from: a.ke$c */
    public static class c {
    }

    public C0233ke(android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            a.ke$b r0 = new a.ke$b
            r0.<init>(r3)
            return
        Lf:
            a.ke$a r0 = new a.ke$a
            r0.<init>(r3)
            return
    }
}
