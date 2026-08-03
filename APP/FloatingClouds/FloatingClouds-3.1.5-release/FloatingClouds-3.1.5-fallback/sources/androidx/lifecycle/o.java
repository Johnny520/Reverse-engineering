package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.lifecycle.q.d implements androidx.lifecycle.q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Application f941a;
    public final androidx.lifecycle.q.a b;
    public final android.os.Bundle c;
    public final androidx.lifecycle.e d;
    public final androidx.savedstate.a e;

    @android.annotation.SuppressLint({"LambdaLast"})
    public o(android.app.Application r2, androidx.activity.ComponentActivity r3, android.os.Bundle r4) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.a r0 = r3.getSavedStateRegistry()
            r1.e = r0
            androidx.lifecycle.e r3 = r3.getLifecycle()
            r1.d = r3
            r1.c = r4
            r1.f941a = r2
            if (r2 == 0) goto L26
            androidx.lifecycle.q$a r3 = androidx.lifecycle.q.a.c
            if (r3 != 0) goto L20
            androidx.lifecycle.q$a r3 = new androidx.lifecycle.q$a
            r3.<init>(r2)
            androidx.lifecycle.q.a.c = r3
        L20:
            androidx.lifecycle.q$a r2 = androidx.lifecycle.q.a.c
            a.C0193i9.b(r2)
            goto L2c
        L26:
            androidx.lifecycle.q$a r2 = new androidx.lifecycle.q$a
            r3 = 0
            r2.<init>(r3)
        L2c:
            r1.b = r2
            return
    }

    @Override // androidx.lifecycle.q.b
    public final <T extends a.Dg> T a(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto Lb
            a.Dg r2 = r1.d(r2, r0)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.q.b
    public final a.Dg b(java.lang.Class r4, a.Ab r5) {
            r3 = this;
            androidx.lifecycle.r r0 = androidx.lifecycle.r.f945a
            java.util.LinkedHashMap r1 = r5.f9a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L73
            androidx.lifecycle.n$b r2 = androidx.lifecycle.n.f940a
            java.lang.Object r2 = r1.get(r2)
            if (r2 == 0) goto L62
            androidx.lifecycle.n$c r2 = androidx.lifecycle.n.b
            java.lang.Object r2 = r1.get(r2)
            if (r2 == 0) goto L62
            androidx.lifecycle.p r0 = androidx.lifecycle.p.f942a
            java.lang.Object r0 = r1.get(r0)
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Class<a.r0> r1 = a.C0344r0.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L35
            if (r0 == 0) goto L35
            java.util.List<java.lang.Class<?>> r2 = a.Md.f176a
            java.lang.reflect.Constructor r2 = a.Md.a(r4, r2)
            goto L3b
        L35:
            java.util.List<java.lang.Class<?>> r2 = a.Md.b
            java.lang.reflect.Constructor r2 = a.Md.a(r4, r2)
        L3b:
            if (r2 != 0) goto L44
            androidx.lifecycle.q$a r0 = r3.b
            a.Dg r4 = r0.b(r4, r5)
            return r4
        L44:
            if (r1 == 0) goto L55
            if (r0 == 0) goto L55
            androidx.lifecycle.m r5 = androidx.lifecycle.n.a(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            a.Dg r4 = a.Md.b(r4, r2, r5)
            return r4
        L55:
            androidx.lifecycle.m r5 = androidx.lifecycle.n.a(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.Dg r4 = a.Md.b(r4, r2, r5)
            return r4
        L62:
            androidx.lifecycle.e r5 = r3.d
            if (r5 == 0) goto L6b
            a.Dg r4 = r3.d(r4, r0)
            return r4
        L6b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."
            r4.<init>(r5)
            throw r4
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.lifecycle.q.d
    public final void c(a.Dg r3) {
            r2 = this;
            androidx.lifecycle.e r0 = r2.d
            if (r0 == 0) goto Lc
            androidx.savedstate.a r1 = r2.e
            a.C0193i9.b(r1)
            androidx.lifecycle.d.a(r3, r1, r0)
        Lc:
            return
    }

    public final a.Dg d(java.lang.Class r8, java.lang.String r9) {
            r7 = this;
            androidx.lifecycle.e r0 = r7.d
            if (r0 == 0) goto Lb0
            java.lang.Class<a.r0> r1 = a.C0344r0.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L17
            android.app.Application r2 = r7.f941a
            if (r2 == 0) goto L17
            java.util.List<java.lang.Class<?>> r2 = a.Md.f176a
            java.lang.reflect.Constructor r2 = a.Md.a(r8, r2)
            goto L1d
        L17:
            java.util.List<java.lang.Class<?>> r2 = a.Md.b
            java.lang.reflect.Constructor r2 = a.Md.a(r8, r2)
        L1d:
            if (r2 != 0) goto L3f
            android.app.Application r9 = r7.f941a
            if (r9 == 0) goto L2a
            androidx.lifecycle.q$a r9 = r7.b
            a.Dg r8 = r9.a(r8)
            return r8
        L2a:
            androidx.lifecycle.q$c r9 = androidx.lifecycle.q.c.f944a
            if (r9 != 0) goto L35
            androidx.lifecycle.q$c r9 = new androidx.lifecycle.q$c
            r9.<init>()
            androidx.lifecycle.q.c.f944a = r9
        L35:
            androidx.lifecycle.q$c r9 = androidx.lifecycle.q.c.f944a
            a.C0193i9.b(r9)
            a.Dg r8 = r9.a(r8)
            return r8
        L3f:
            androidx.savedstate.a r3 = r7.e
            a.C0193i9.b(r3)
            android.os.Bundle r4 = r7.c
            android.os.Bundle r5 = r3.a(r9)
            java.lang.Class<? extends java.lang.Object>[] r6 = androidx.lifecycle.m.f
            androidx.lifecycle.m r4 = androidx.lifecycle.m.a.a(r5, r4)
            androidx.lifecycle.SavedStateHandleController r5 = new androidx.lifecycle.SavedStateHandleController
            r5.<init>(r9, r4)
            r5.c(r0, r3)
            androidx.lifecycle.e$b r9 = r0.b()
            androidx.lifecycle.e$b r6 = androidx.lifecycle.e.b.b
            if (r9 == r6) goto L72
            androidx.lifecycle.e$b r6 = androidx.lifecycle.e.b.d
            int r9 = r9.compareTo(r6)
            if (r9 < 0) goto L69
            goto L72
        L69:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r9 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r9.<init>(r0, r3)
            r0.a(r9)
            goto L75
        L72:
            r3.d()
        L75:
            if (r1 == 0) goto L84
            android.app.Application r9 = r7.f941a
            if (r9 == 0) goto L84
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r4}
            a.Dg r8 = a.Md.b(r8, r2, r9)
            goto L8c
        L84:
            java.lang.Object[] r9 = new java.lang.Object[]{r4}
            a.Dg r8 = a.Md.b(r8, r2, r9)
        L8c:
            java.lang.String r9 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r0 = r8.f62a
            monitor-enter(r0)
            java.util.HashMap r1 = r8.f62a     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto La1
            java.util.HashMap r2 = r8.f62a     // Catch: java.lang.Throwable -> L9f
            r2.put(r9, r5)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lae
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto La5
            goto La6
        La5:
            r5 = r1
        La6:
            boolean r9 = r8.c
            if (r9 == 0) goto Lad
            a.Dg.a(r5)
        Lad:
            return r8
        Lae:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb0:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r8.<init>(r9)
            throw r8
    }
}
