package androidx.savedstate;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/g;", "a", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Ld f1017a;

    public static final class a implements androidx.savedstate.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.LinkedHashSet f1018a;

        public a(androidx.savedstate.a r2) {
                r1 = this;
                java.lang.String r0 = "registry"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.f1018a = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.c(r0, r1)
                return
        }

        @Override // androidx.savedstate.a.b
        public final android.os.Bundle a() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.LinkedHashSet r2 = r3.f1018a
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    public Recreator(a.Ld r1) {
            r0 = this;
            r0.<init>()
            r0.f1017a = r1
            return
    }

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r5, androidx.lifecycle.e.a r6) {
            r4 = this;
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_CREATE
            if (r6 != r0) goto La2
            androidx.lifecycle.e r5 = r5.getLifecycle()
            r5.c(r4)
            a.Ld r5 = r4.f1017a
            androidx.savedstate.a r6 = r5.getSavedStateRegistry()
            java.lang.String r0 = "androidx.savedstate.Restarter"
            android.os.Bundle r6 = r6.a(r0)
            if (r6 != 0) goto L1b
            goto L99
        L1b:
            java.lang.String r0 = "classes_to_restore"
            java.util.ArrayList r6 = r6.getStringArrayList(r0)
            if (r6 == 0) goto L9a
            java.util.Iterator r6 = r6.iterator()
        L27:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "Class "
            java.lang.Class<androidx.savedstate.Recreator> r2 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L8c
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L8c
            java.lang.Class<androidx.savedstate.a$a> r3 = androidx.savedstate.a.InterfaceC0024a.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.ClassNotFoundException -> L8c
            java.lang.String r3 = "{\n                Class.…class.java)\n            }"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L8c
            r3 = 0
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L70
            r2 = 1
            r1.setAccessible(r2)
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = "{\n                constr…wInstance()\n            }"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Exception -> L63
            androidx.savedstate.a$a r1 = (androidx.savedstate.a.InterfaceC0024a) r1     // Catch: java.lang.Exception -> L63
            r1.a(r5)
            goto L27
        L63:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to instantiate "
            java.lang.String r0 = a.C0487z.k(r1, r0)
            r6.<init>(r0, r5)
            throw r6
        L70:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = r2.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " must have default constructor in order to be automatically recreated"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0, r5)
            throw r6
        L8c:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r2 = " wasn't found"
            java.lang.String r0 = a.C0487z.g(r1, r0, r2)
            r6.<init>(r0, r5)
            throw r6
        L99:
            return
        L9a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r5.<init>(r6)
            throw r5
        La2:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "Next event must be ON_CREATE"
            r5.<init>(r6)
            throw r5
    }
}
