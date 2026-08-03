package a;

/* JADX INFO: renamed from: a.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226k7 extends a.Dg {
    public static final a.C0226k7.a j = null;
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.b> d;
    public final java.util.HashMap<java.lang.String, a.C0226k7> e;
    public final java.util.HashMap<java.lang.String, a.Fg> f;
    public final boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: a.k7$a */
    public class a implements androidx.lifecycle.q.b {
        @Override // androidx.lifecycle.q.b
        public final <T extends a.Dg> T a(java.lang.Class<T> r2) {
                r1 = this;
                a.k7 r2 = new a.k7
                r0 = 1
                r2.<init>(r0)
                return r2
        }
    }

    static {
            a.k7$a r0 = new a.k7$a
            r0.<init>()
            a.C0226k7.j = r0
            return
    }

    public C0226k7(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            r0 = 0
            r1.h = r0
            r1.i = r0
            r1.g = r2
            return
    }

    @Override // a.Dg
    public final void b() {
            r2 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
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
            r2.h = r0
            return
    }

    public final void c(androidx.fragment.app.b r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing non-config state for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            java.lang.String r3 = r3.e
            r2.e(r3, r4)
            return
    }

    public final void d(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing non-config state for saved state of Fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            r2.e(r3, r4)
            return
    }

    public final void e(java.lang.String r5, boolean r6) {
            r4 = this;
            java.util.HashMap<java.lang.String, a.k7> r0 = r4.e
            java.lang.Object r1 = r0.get(r5)
            a.k7 r1 = (a.C0226k7) r1
            if (r1 == 0) goto L35
            if (r6 == 0) goto L2f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap<java.lang.String, a.k7> r2 = r1.e
            java.util.Set r2 = r2.keySet()
            r6.addAll(r2)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            r1.d(r2, r3)
            goto L1e
        L2f:
            r1.b()
            r0.remove(r5)
        L35:
            java.util.HashMap<java.lang.String, a.Fg> r6 = r4.f
            java.lang.Object r0 = r6.get(r5)
            a.Fg r0 = (a.Fg) r0
            if (r0 == 0) goto L45
            r0.a()
            r6.remove(r5)
        L45:
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
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<a.k7> r3 = a.C0226k7.class
            if (r3 == r2) goto L10
            goto L31
        L10:
            a.k7 r5 = (a.C0226k7) r5
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r2 = r4.d
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r3 = r5.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, a.k7> r2 = r4.e
            java.util.HashMap<java.lang.String, a.k7> r3 = r5.e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, a.Fg> r2 = r4.f
            java.util.HashMap<java.lang.String, a.Fg> r5 = r5.f
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final void f(androidx.fragment.app.b r5) {
            r4 = this;
            boolean r0 = r4.i
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r5 = a.AbstractC0119e7.J(r2)
            if (r5 == 0) goto L34
            java.lang.String r5 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r5)
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r0 = r4.d
            java.lang.String r3 = r5.e
            java.lang.Object r0 = r0.remove(r3)
            if (r0 == 0) goto L34
            boolean r0 = a.AbstractC0119e7.J(r2)
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

    public final int hashCode() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r0 = r2.d
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, a.k7> r1 = r2.e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.HashMap<java.lang.String, a.Fg> r0 = r2.f
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
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r1 = r4.d
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
            java.util.HashMap<java.lang.String, a.k7> r1 = r4.e
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
            java.util.HashMap<java.lang.String, a.Fg> r1 = r4.f
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
