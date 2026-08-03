package a;

/* JADX INFO: loaded from: classes.dex */
public final class Kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Ld f154a;
    public final androidx.savedstate.a b;
    public boolean c;

    public Kd(a.Ld r1) {
            r0 = this;
            r0.<init>()
            r0.f154a = r1
            androidx.savedstate.a r1 = new androidx.savedstate.a
            r1.<init>()
            r0.b = r1
            return
    }

    public final void a() {
            r4 = this;
            a.Ld r0 = r4.f154a
            androidx.lifecycle.e r1 = r0.getLifecycle()
            androidx.lifecycle.e$b r2 = r1.b()
            androidx.lifecycle.e$b r3 = androidx.lifecycle.e.b.b
            if (r2 != r3) goto L35
            androidx.savedstate.Recreator r2 = new androidx.savedstate.Recreator
            r2.<init>(r0)
            r1.a(r2)
            androidx.savedstate.a r0 = r4.b
            r0.getClass()
            boolean r2 = r0.b
            if (r2 != 0) goto L2d
            a.Jd r2 = new a.Jd
            r2.<init>(r0)
            r1.a(r2)
            r1 = 1
            r0.b = r1
            r4.c = r1
            return
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SavedStateRegistry was already attached."
            r0.<init>(r1)
            throw r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            r0.<init>(r1)
            throw r0
    }

    public final void b(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.c
            if (r0 != 0) goto L7
            r3.a()
        L7:
            a.Ld r0 = r3.f154a
            androidx.lifecycle.e r0 = r0.getLifecycle()
            androidx.lifecycle.e$b r1 = r0.b()
            androidx.lifecycle.e$b r2 = androidx.lifecycle.e.b.d
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L43
            androidx.savedstate.a r0 = r3.b
            boolean r1 = r0.b
            if (r1 == 0) goto L3b
            boolean r1 = r0.d
            if (r1 != 0) goto L33
            if (r4 == 0) goto L2c
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r4 = r4.getBundle(r1)
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r0.c = r4
            r4 = 1
            r0.d = r4
            return
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            r4.<init>(r0)
            throw r4
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            r4.<init>(r0)
            throw r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r4.<init>(r1)
            androidx.lifecycle.e$b r0 = r0.b()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void c(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            a.C0193i9.e(r5, r0)
            androidx.savedstate.a r0 = r4.b
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r0.c
            if (r2 == 0) goto L16
            r1.putAll(r2)
        L16:
            a.Gd<java.lang.String, androidx.savedstate.a$b> r0 = r0.f1019a
            r0.getClass()
            a.Gd$d r2 = new a.Gd$d
            r2.<init>(r0)
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r0 = r0.c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.put(r2, r3)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            androidx.savedstate.a$b r0 = (androidx.savedstate.a.b) r0
            android.os.Bundle r0 = r0.a()
            r1.putBundle(r3, r0)
            goto L27
        L47:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L52
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r0, r1)
        L52:
            return
    }
}
