package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class am extends defpackage.pa0 {
    public final java.util.HashMap c;
    public final java.util.HashMap d;
    public final java.util.HashMap e;
    public final boolean f;
    public boolean g;
    public boolean h;

    static {
            return
    }

    public am(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            r0 = 0
            r1.g = r0
            r1.h = r0
            r1.f = r2
            return
    }

    @Override // defpackage.pa0
    public final void a() {
            r2 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCleared called for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            r0 = 1
            r2.g = r0
            return
    }

    public final void b(defpackage.ml r5) {
            r4 = this;
            boolean r0 = r4.h
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r5 = defpackage.yl.A(r2)
            if (r5 == 0) goto L34
            java.lang.String r5 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r5)
            return
        L13:
            java.util.HashMap r0 = r4.c
            java.lang.String r3 = r5.e
            java.lang.Object r0 = r0.remove(r3)
            if (r0 == 0) goto L34
            boolean r0 = defpackage.yl.A(r2)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating retained Fragments: Removed "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r1, r5)
        L34:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<am> r2 = defpackage.am.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            am r5 = (defpackage.am) r5
            java.util.HashMap r2 = r4.c
            java.util.HashMap r3 = r5.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r2 = r4.d
            java.util.HashMap r3 = r5.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r2 = r4.e
            java.util.HashMap r5 = r5.e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.util.HashMap r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap r1 = r2.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.HashMap r0 = r2.e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap r1 = r4.c
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            r0.append(r3)
            goto L21
        L3a:
            java.lang.String r1 = ") Child Non Config ("
            r0.append(r1)
            java.util.HashMap r1 = r4.d
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            r0.append(r3)
            goto L49
        L62:
            java.lang.String r1 = ") ViewModelStores ("
            r0.append(r1)
            java.util.HashMap r1 = r4.e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            r0.append(r3)
            goto L71
        L8a:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
