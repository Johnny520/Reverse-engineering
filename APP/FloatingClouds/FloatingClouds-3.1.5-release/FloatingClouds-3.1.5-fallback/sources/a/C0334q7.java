package a;

/* JADX INFO: renamed from: a.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334q7 implements androidx.lifecycle.c, a.Ld, a.Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.b f653a;
    public final a.Fg b;
    public final a.M2 c;
    public androidx.lifecycle.h d;
    public a.Kd e;

    public C0334q7(androidx.fragment.app.b r2, a.Fg r3, a.M2 r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.e = r0
            r1.f653a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public final void a(androidx.lifecycle.e.a r2) {
            r1 = this;
            androidx.lifecycle.h r0 = r1.d
            r0.f(r2)
            return
    }

    public final void b() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.d
            if (r0 != 0) goto L1a
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r1)
            r1.d = r0
            a.Kd r0 = new a.Kd
            r0.<init>(r1)
            r1.e = r0
            r0.a()
            a.M2 r0 = r1.c
            r0.run()
        L1a:
            return
    }

    @Override // androidx.lifecycle.c
    public final a.A4 getDefaultViewModelCreationExtras() {
            r5 = this;
            androidx.fragment.app.b r0 = r5.f653a
            android.content.Context r1 = r0.A()
            android.content.Context r1 = r1.getApplicationContext()
        La:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L1c
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L15
            android.app.Application r1 = (android.app.Application) r1
            goto L1d
        L15:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto La
        L1c:
            r1 = 0
        L1d:
            a.Ab r2 = new a.Ab
            r2.<init>()
            java.util.LinkedHashMap r3 = r2.f9a
            if (r1 == 0) goto L2b
            androidx.lifecycle.p r4 = androidx.lifecycle.p.f942a
            r3.put(r4, r1)
        L2b:
            androidx.lifecycle.n$b r1 = androidx.lifecycle.n.f940a
            r3.put(r1, r0)
            androidx.lifecycle.n$c r1 = androidx.lifecycle.n.b
            r3.put(r1, r5)
            android.os.Bundle r0 = r0.f
            if (r0 == 0) goto L3e
            androidx.lifecycle.n$a r1 = androidx.lifecycle.n.c
            r3.put(r1, r0)
        L3e:
            return r2
    }

    @Override // a.InterfaceC0479y9
    public final androidx.lifecycle.e getLifecycle() {
            r1 = this;
            r1.b()
            androidx.lifecycle.h r0 = r1.d
            return r0
    }

    @Override // a.Ld
    public final androidx.savedstate.a getSavedStateRegistry() {
            r1 = this;
            r1.b()
            a.Kd r0 = r1.e
            androidx.savedstate.a r0 = r0.b
            return r0
    }

    @Override // a.Gg
    public final a.Fg getViewModelStore() {
            r1 = this;
            r1.b()
            a.Fg r0 = r1.b
            return r0
    }
}
