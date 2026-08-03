package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class j implements a.InterfaceC0479y9 {
    public static final androidx.lifecycle.j i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f936a;
    public int b;
    public boolean c;
    public boolean d;
    public android.os.Handler e;
    public final androidx.lifecycle.h f;
    public final a.M2 g;
    public final androidx.lifecycle.j.b h;

    public static final class a {
        public static final void a(android.app.Activity r1, android.app.Application.ActivityLifecycleCallbacks r2) {
                java.lang.String r0 = "activity"
                a.C0193i9.e(r1, r0)
                java.lang.String r0 = "callback"
                a.C0193i9.e(r2, r0)
                r1.registerActivityLifecycleCallbacks(r2)
                return
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.j f937a;

        public b(androidx.lifecycle.j r1) {
                r0 = this;
                r0.<init>()
                r0.f937a = r1
                return
        }
    }

    static {
            androidx.lifecycle.j r0 = new androidx.lifecycle.j
            r0.<init>()
            androidx.lifecycle.j.i = r0
            return
    }

    public j() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.c = r0
            r2.d = r0
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r2)
            r2.f = r0
            a.M2 r0 = new a.M2
            r1 = 13
            r0.<init>(r1, r2)
            r2.g = r0
            androidx.lifecycle.j$b r0 = new androidx.lifecycle.j$b
            r0.<init>(r2)
            r2.h = r0
            return
    }

    public final void a() {
            r2 = this;
            int r0 = r2.b
            r1 = 1
            int r0 = r0 + r1
            r2.b = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.c
            if (r0 == 0) goto L17
            androidx.lifecycle.h r0 = r2.f
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME
            r0.f(r1)
            r0 = 0
            r2.c = r0
            return
        L17:
            android.os.Handler r0 = r2.e
            a.C0193i9.b(r0)
            a.M2 r1 = r2.g
            r0.removeCallbacks(r1)
        L21:
            return
    }

    @Override // a.InterfaceC0479y9
    public final androidx.lifecycle.e getLifecycle() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.f
            return r0
    }
}
