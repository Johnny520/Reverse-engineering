package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.lifecycle.n.b f940a = null;
    public static final androidx.lifecycle.n.c b = null;
    public static final androidx.lifecycle.n.a c = null;

    public static final class a {
    }

    public static final class b {
    }

    public static final class c {
    }

    static {
            androidx.lifecycle.n$b r0 = new androidx.lifecycle.n$b
            r0.<init>()
            androidx.lifecycle.n.f940a = r0
            androidx.lifecycle.n$c r0 = new androidx.lifecycle.n$c
            r0.<init>()
            androidx.lifecycle.n.b = r0
            androidx.lifecycle.n$a r0 = new androidx.lifecycle.n$a
            r0.<init>()
            androidx.lifecycle.n.c = r0
            return
    }

    public static final androidx.lifecycle.m a(a.Ab r7) {
            androidx.lifecycle.n$b r0 = androidx.lifecycle.n.f940a
            java.util.LinkedHashMap r7 = r7.f9a
            java.lang.Object r0 = r7.get(r0)
            a.Ld r0 = (a.Ld) r0
            if (r0 == 0) goto L8d
            androidx.lifecycle.n$c r1 = androidx.lifecycle.n.b
            java.lang.Object r1 = r7.get(r1)
            a.Gg r1 = (a.Gg) r1
            if (r1 == 0) goto L85
            androidx.lifecycle.n$a r2 = androidx.lifecycle.n.c
            java.lang.Object r2 = r7.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.r r3 = androidx.lifecycle.r.f945a
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L7d
            androidx.savedstate.a r0 = r0.getSavedStateRegistry()
            androidx.savedstate.a$b r0 = r0.b()
            boolean r3 = r0 instanceof a.Hd
            r4 = 0
            if (r3 == 0) goto L38
            a.Hd r0 = (a.Hd) r0
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L75
            a.Id r1 = c(r1)
            java.util.LinkedHashMap r1 = r1.d
            java.lang.Object r3 = r1.get(r7)
            androidx.lifecycle.m r3 = (androidx.lifecycle.m) r3
            if (r3 != 0) goto L74
            java.lang.Class<? extends java.lang.Object>[] r3 = androidx.lifecycle.m.f
            r0.b()
            android.os.Bundle r3 = r0.c
            if (r3 == 0) goto L57
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L58
        L57:
            r3 = r4
        L58:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L5f
            r5.remove(r7)
        L5f:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L6c
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L6c
            r0.c = r4
        L6c:
            androidx.lifecycle.m r0 = androidx.lifecycle.m.a.a(r3, r2)
            r1.put(r7, r0)
            return r0
        L74:
            return r3
        L75:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L7d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L8d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
    }

    public static final <T extends a.Ld & a.Gg> void b(T r3) {
            androidx.lifecycle.e r0 = r3.getLifecycle()
            androidx.lifecycle.e$b r0 = r0.b()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.b
            if (r0 == r1) goto L19
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.c
            if (r0 != r1) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r3.<init>(r0)
            throw r3
        L19:
            androidx.savedstate.a r0 = r3.getSavedStateRegistry()
            androidx.savedstate.a$b r0 = r0.b()
            if (r0 != 0) goto L44
            a.Hd r0 = new a.Hd
            androidx.savedstate.a r1 = r3.getSavedStateRegistry()
            r2 = r3
            a.Gg r2 = (a.Gg) r2
            r0.<init>(r1, r2)
            androidx.savedstate.a r1 = r3.getSavedStateRegistry()
            java.lang.String r2 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            r1.c(r2, r0)
            androidx.lifecycle.e r3 = r3.getLifecycle()
            androidx.lifecycle.SavedStateHandleAttacher r1 = new androidx.lifecycle.SavedStateHandleAttacher
            r1.<init>(r0)
            r3.a(r1)
        L44:
            return
    }

    public static final a.Id c(a.Gg r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.Uc r1 = a.Tc.f281a
            r1.getClass()
            a.f3 r1 = new a.f3
            java.lang.Class<a.Id> r2 = a.Id.class
            r1.<init>(r2)
            a.Eg r3 = new a.Eg
            java.lang.Class r1 = r1.a()
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            a.C0193i9.c(r1, r4)
            r3.<init>(r1)
            r0.add(r3)
            a.W8 r1 = new a.W8
            r3 = 0
            a.Eg[] r3 = new a.Eg[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            a.Eg[] r0 = (a.Eg[]) r0
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.Eg[] r0 = (a.Eg[]) r0
            r1.<init>(r0)
            androidx.lifecycle.q r0 = new androidx.lifecycle.q
            a.Fg r3 = r5.getViewModelStore()
            boolean r4 = r5 instanceof androidx.lifecycle.c
            if (r4 == 0) goto L48
            androidx.lifecycle.c r5 = (androidx.lifecycle.c) r5
            a.A4 r5 = r5.getDefaultViewModelCreationExtras()
            goto L4a
        L48:
            a.A4$a r5 = a.A4.a.b
        L4a:
            r0.<init>(r3, r1, r5)
            java.lang.String r5 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            a.Dg r5 = r0.a(r2, r5)
            a.Id r5 = (a.Id) r5
            return r5
    }
}
