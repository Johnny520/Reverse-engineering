package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e70 extends p000.m92 {

    /* JADX INFO: renamed from: θ */
    public static final p000.d70 f3428 = null;

    /* JADX INFO: renamed from: β */
    public final java.util.HashMap f3429;

    /* JADX INFO: renamed from: γ */
    public final java.util.HashMap f3430;

    /* JADX INFO: renamed from: δ */
    public final java.util.HashMap f3431;

    /* JADX INFO: renamed from: ε */
    public final boolean f3432;

    /* JADX INFO: renamed from: ζ */
    public boolean f3433;

    /* JADX INFO: renamed from: η */
    public boolean f3434;

    static {
            d70 r0 = new d70
            r1 = 0
            r0.<init>(r1)
            p000.e70.f3428 = r0
            return
    }

    public e70(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3429 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3430 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3431 = r0
            r0 = 0
            r1.f3433 = r0
            r1.f3434 = r0
            r1.f3432 = r2
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
            java.lang.Class<e70> r2 = p000.e70.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            e70 r5 = (p000.e70) r5
            java.util.HashMap r2 = r4.f3429
            java.util.HashMap r3 = r5.f3429
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r2 = r4.f3430
            java.util.HashMap r3 = r5.f3430
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap r4 = r4.f3431
            java.util.HashMap r5 = r5.f3431
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L31
            return r0
        L31:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.util.HashMap r0 = r2.f3429
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap r1 = r2.f3430
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.HashMap r2 = r2.f3431
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
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
            java.util.HashMap r1 = r4.f3429
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
            java.util.HashMap r1 = r4.f3430
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
            java.util.HashMap r4 = r4.f3431
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            r0.append(r3)
            goto L71
        L8a:
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // p000.m92
    /* JADX INFO: renamed from: β */
    public final void mo1853() {
            r2 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
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
            r2.f3433 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1854(p000.n60 r3) {
            r2 = this;
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing non-config state for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            java.lang.String r3 = r3.f7426
            r2.m1855(r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1855(java.lang.String r3) {
            r2 = this;
            java.util.HashMap r0 = r2.f3430
            java.lang.Object r1 = r0.get(r3)
            e70 r1 = (p000.e70) r1
            if (r1 == 0) goto L10
            r1.mo1853()
            r0.remove(r3)
        L10:
            java.util.HashMap r2 = r2.f3431
            java.lang.Object r0 = r2.get(r3)
            q92 r0 = (p000.q92) r0
            if (r0 == 0) goto L20
            r0.m4818()
            r2.remove(r3)
        L20:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1856(p000.n60 r4) {
            r3 = this;
            boolean r0 = r3.f3434
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r3 = p000.b70.m751(r2)
            if (r3 == 0) goto L34
            java.lang.String r3 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r3)
            return
        L13:
            java.util.HashMap r3 = r3.f3429
            java.lang.String r0 = r4.f7426
            java.lang.Object r3 = r3.remove(r0)
            if (r3 == 0) goto L34
            boolean r3 = p000.b70.m751(r2)
            if (r3 == 0) goto L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Updating retained Fragments: Removed "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L34:
            return
    }
}
