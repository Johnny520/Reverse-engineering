package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public gm(defpackage.u10 r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            a3 r1 = new a3
            r1.<init>()
            r0.c = r1
            return
    }

    public gm(defpackage.vb r1, defpackage.k80 r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            return
    }

    public void a() {
            r4 = this;
            java.lang.Object r0 = r4.b
            u10 r0 = (defpackage.u10) r0
            androidx.lifecycle.a r1 = r0.e()
            jq r2 = r1.c
            jq r3 = defpackage.jq.b
            if (r2 != r3) goto L37
            androidx.savedstate.Recreator r2 = new androidx.savedstate.Recreator
            r2.<init>(r0)
            r1.a(r2)
            java.lang.Object r0 = r4.c
            a3 r0 = (defpackage.a3) r0
            r0.getClass()
            boolean r2 = r0.c
            if (r2 != 0) goto L2f
            r10 r2 = new r10
            r2.<init>(r0)
            r1.a(r2)
            r1 = 1
            r0.c = r1
            r4.a = r1
            return
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SavedStateRegistry was already attached."
            r0.<init>(r1)
            throw r0
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            r0.<init>(r1)
            throw r0
    }

    public void b(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.a
            if (r0 != 0) goto L7
            r3.a()
        L7:
            java.lang.Object r0 = r3.b
            u10 r0 = (defpackage.u10) r0
            androidx.lifecycle.a r0 = r0.e()
            jq r1 = r0.c
            jq r2 = defpackage.jq.d
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L45
            java.lang.Object r0 = r3.c
            a3 r0 = (defpackage.a3) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L3d
            boolean r1 = r0.d
            if (r1 != 0) goto L35
            if (r4 == 0) goto L2e
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r4 = r4.getBundle(r1)
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r0.a = r4
            r4 = 1
            r0.d = r4
            return
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            r4.<init>(r0)
            throw r4
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            r4.<init>(r0)
            throw r4
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r4.<init>(r1)
            jq r0 = r0.c
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void c(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            defpackage.ip.o(r0, r5)
            java.lang.Object r0 = r4.c
            a3 r0 = (defpackage.a3) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Parcelable r2 = r0.a
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L1a
            r1.putAll(r2)
        L1a:
            java.lang.Object r0 = r0.f
            o10 r0 = (defpackage.o10) r0
            r0.getClass()
            m10 r2 = new m10
            r2.<init>(r0)
            java.util.WeakHashMap r0 = r0.c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.put(r2, r3)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            t10 r0 = (defpackage.t10) r0
            android.os.Bundle r0 = r0.a()
            r1.putBundle(r3, r0)
            goto L2d
        L4d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L58
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r0, r1)
        L58:
            return
    }
}
