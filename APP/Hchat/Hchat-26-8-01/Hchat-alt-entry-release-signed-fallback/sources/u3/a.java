package u3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.lifecycle.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f13364h;

    public a(u3.c r2) {
            r1 = this;
            r0 = 0
            r1.f13363g = r0
            r2.getClass()
            r1.<init>()
            r1.f13364h = r2
            return
    }

    public a(androidx.lifecycle.h[] r2) {
            r1 = this;
            r0 = 1
            r1.f13363g = r0
            r1.<init>()
            r1.f13364h = r2
            return
    }

    @Override // androidx.lifecycle.o
    public final void b(androidx.lifecycle.q r4, androidx.lifecycle.k r5) {
            r3 = this;
            int r0 = r3.f13363g
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Object r4 = r3.f13364h
            androidx.lifecycle.h[] r4 = (androidx.lifecycle.h[]) r4
            int r5 = r4.length
            r0 = 0
            r1 = 0
            if (r5 > 0) goto L1a
            int r5 = r4.length
            if (r5 > 0) goto L17
            return
        L17:
            r4 = r4[r1]
            throw r0
        L1a:
            r4 = r4[r1]
            throw r0
        L1d:
            androidx.lifecycle.k r0 = androidx.lifecycle.k.ON_CREATE
            if (r5 != r0) goto Lb7
            androidx.lifecycle.s r4 = r4.f()
            r4.f(r3)
            java.lang.Object r4 = r3.f13364h
            u3.c r4 = (u3.c) r4
            m.a r4 = r4.b()
            java.lang.String r5 = "androidx.savedstate.Restarter"
            android.os.Bundle r4 = r4.l(r5)
            if (r4 != 0) goto L3a
            goto Lbc
        L3a:
            java.lang.String r5 = "classes_to_restore"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 == 0) goto Lb1
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L4d
            goto Lbc
        L4d:
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "Class "
            java.lang.Class<u3.a> r0 = u3.a.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> La6
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r4, r1, r0)     // Catch: java.lang.ClassNotFoundException -> La6
            java.lang.Class<u3.b> r1 = u3.b.class
            java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> La6
            r0.getClass()     // Catch: java.lang.ClassNotFoundException -> La6
            r1 = 0
            java.lang.reflect.Constructor r5 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L8a
            r0 = 1
            r5.setAccessible(r0)
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Exception -> L7f
            r5.getClass()     // Catch: java.lang.Exception -> L7f
            java.lang.ClassCastException r5 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L7f
            r5.<init>()     // Catch: java.lang.Exception -> L7f
            throw r5     // Catch: java.lang.Exception -> L7f
        L7f:
            r5 = move-exception
            java.lang.String r0 = "Failed to instantiate "
            java.lang.String r4 = wb.en.g(r0, r4)
            ah.a.p(r4, r5)
            goto Lbc
        L8a:
            r4 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r0)
            java.lang.String r5 = " must have default constructor in order to be automatically recreated"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r4)
            throw r1
        La6:
            r0 = move-exception
            java.lang.String r1 = " wasn't found"
            java.lang.String r4 = eh.a.n(r5, r4, r1)
            ah.a.p(r4, r0)
            goto Lbc
        Lb1:
            java.lang.String r4 = "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            j8.o.A(r4)
            goto Lbc
        Lb7:
            java.lang.String r4 = "Next event must be ON_CREATE"
            j8.o.f(r4)
        Lbc:
            return
    }
}
