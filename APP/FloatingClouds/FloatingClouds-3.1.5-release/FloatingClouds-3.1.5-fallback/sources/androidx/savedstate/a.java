package androidx.savedstate;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"RestrictedApi"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Gd<java.lang.String, androidx.savedstate.a.b> f1019a;
    public boolean b;
    public android.os.Bundle c;
    public boolean d;
    public androidx.savedstate.Recreator.a e;
    public boolean f;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0024a {
        void a(a.Ld r1);
    }

    public interface b {
        android.os.Bundle a();
    }

    public a() {
            r1 = this;
            r1.<init>()
            a.Gd r0 = new a.Gd
            r0.<init>()
            r1.f1019a = r0
            r0 = 1
            r1.f = r0
            return
    }

    public final android.os.Bundle a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L23
            android.os.Bundle r0 = r3.c
            r1 = 0
            if (r0 == 0) goto L22
            android.os.Bundle r0 = r0.getBundle(r4)
            android.os.Bundle r2 = r3.c
            if (r2 == 0) goto L14
            r2.remove(r4)
        L14:
            android.os.Bundle r4 = r3.c
            if (r4 == 0) goto L1f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L1f
            return r0
        L1f:
            r3.c = r1
            return r0
        L22:
            return r1
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            r4.<init>(r0)
            throw r4
    }

    public final androidx.savedstate.a.b b() {
            r4 = this;
            a.Gd<java.lang.String, androidx.savedstate.a$b> r0 = r4.f1019a
            java.util.Iterator r0 = r0.iterator()
        L6:
            r1 = r0
            a.Gd$e r1 = (a.Gd.e) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "components"
            a.C0193i9.d(r1, r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.a$b r1 = (androidx.savedstate.a.b) r1
            java.lang.String r3 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto L6
            return r1
        L2f:
            r0 = 0
            return r0
    }

    public final void c(java.lang.String r3, androidx.savedstate.a.b r4) {
            r2 = this;
            java.lang.String r0 = "provider"
            a.C0193i9.e(r4, r0)
            a.Gd<java.lang.String, androidx.savedstate.a$b> r0 = r2.f1019a
            a.Gd$c r1 = r0.a(r3)
            if (r1 == 0) goto L10
            V r3 = r1.b
            goto L2b
        L10:
            a.Gd$c r1 = new a.Gd$c
            r1.<init>(r3, r4)
            int r3 = r0.d
            int r3 = r3 + 1
            r0.d = r3
            a.Gd$c<K, V> r3 = r0.b
            if (r3 != 0) goto L24
            r0.f101a = r1
            r0.b = r1
            goto L2a
        L24:
            r3.c = r1
            r1.d = r3
            r0.b = r1
        L2a:
            r3 = 0
        L2b:
            androidx.savedstate.a$b r3 = (androidx.savedstate.a.b) r3
            if (r3 != 0) goto L30
            return
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "SavedStateProvider with the given key is already registered"
            r3.<init>(r4)
            throw r3
    }

    public final void d() {
            r5 = this;
            java.lang.Class<androidx.lifecycle.d$a> r0 = androidx.lifecycle.d.a.class
            boolean r1 = r5.f
            if (r1 == 0) goto L41
            androidx.savedstate.Recreator$a r1 = r5.e
            if (r1 != 0) goto Lf
            androidx.savedstate.Recreator$a r1 = new androidx.savedstate.Recreator$a
            r1.<init>(r5)
        Lf:
            r5.e = r1
            r1 = 0
            r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L23
            androidx.savedstate.Recreator$a r1 = r5.e
            if (r1 == 0) goto L22
            java.lang.String r0 = r0.getName()
            java.util.LinkedHashSet r1 = r1.f1018a
            r1.add(r0)
        L22:
            return
        L23:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Class "
            r3.<init>(r4)
            java.lang.String r0 = r0.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r1)
            throw r2
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }
}
