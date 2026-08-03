package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/d$a;", "Landroidx/savedstate/a$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.savedstate.a.InterfaceC0024a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.a.InterfaceC0024a
        public final void a(a.Ld r6) {
                r5 = this;
                boolean r0 = r6 instanceof a.Gg
                if (r0 == 0) goto L56
                r0 = r6
                a.Gg r0 = (a.Gg) r0
                a.Fg r0 = r0.getViewModelStore()
                androidx.savedstate.a r1 = r6.getSavedStateRegistry()
                r0.getClass()
                java.util.HashSet r2 = new java.util.HashSet
                java.util.LinkedHashMap r0 = r0.f92a
                java.util.Set r3 = r0.keySet()
                r2.<init>(r3)
                java.util.Iterator r2 = r2.iterator()
            L21:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L43
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = "key"
                a.C0193i9.e(r3, r4)
                java.lang.Object r3 = r0.get(r3)
                a.Dg r3 = (a.Dg) r3
                a.C0193i9.b(r3)
                androidx.lifecycle.e r4 = r6.getLifecycle()
                androidx.lifecycle.d.a(r3, r1, r4)
                goto L21
            L43:
                java.util.HashSet r6 = new java.util.HashSet
                java.util.Set r0 = r0.keySet()
                r6.<init>(r0)
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L55
                r1.d()
            L55:
                return
            L56:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                r6.<init>(r0)
                throw r6
        }
    }

    public static final void a(a.Dg r2, androidx.savedstate.a r3, androidx.lifecycle.e r4) {
            java.lang.String r0 = "registry"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "lifecycle"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r1 = r2.f62a
            if (r1 != 0) goto L12
            r2 = 0
            goto L1a
        L12:
            monitor-enter(r1)
            java.util.HashMap r2 = r2.f62a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
        L1a:
            androidx.lifecycle.SavedStateHandleController r2 = (androidx.lifecycle.SavedStateHandleController) r2
            if (r2 == 0) goto L42
            boolean r0 = r2.c
            if (r0 != 0) goto L42
            r2.c(r4, r3)
            androidx.lifecycle.e$b r2 = r4.b()
            androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.b
            if (r2 == r0) goto L3f
            androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.d
            int r2 = r2.compareTo(r0)
            if (r2 < 0) goto L36
            goto L3f
        L36:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r2 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r2.<init>(r4, r3)
            r4.a(r2)
            return
        L3f:
            r3.d()
        L42:
            return
        L43:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r2
    }
}
