package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7623 extends androidx.lifecycle.ViewModel {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f29319 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final androidx.lifecycle.ViewModelProvider.Factory f29320 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> f29321;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.C7623> f29322;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> f29323;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f29324;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f29325;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f29326;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f29327;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۥ$ۥ, reason: contains not printable characters */
    public class C7624 implements androidx.lifecycle.ViewModelProvider.Factory {
        public C7624() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @Yue.InterfaceC4410
        public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4410 java.lang.Class<T> r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟ۥ r2 = new androidx.fragment.app.ۥ۟۟۟ۥ
                r0 = 1
                r2.<init>(r0)
                return r2
        }
    }

    static {
            androidx.fragment.app.ۥ۟۟۟ۥ$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟ۥ$ۥ
            r0.<init>()
            androidx.fragment.app.C7623.f29320 = r0
            return
    }

    public C7623(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f29321 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f29322 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f29323 = r0
            r0 = 0
            r1.f29325 = r0
            r1.f29326 = r0
            r1.f29327 = r0
            r1.f29324 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static androidx.fragment.app.C7623 m29362(androidx.lifecycle.ViewModelStore r2) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelProvider$Factory r1 = androidx.fragment.app.C7623.f29320
            r0.<init>(r2, r1)
            java.lang.Class<androidx.fragment.app.ۥ۟۟۟ۥ> r2 = androidx.fragment.app.C7623.class
            androidx.lifecycle.ViewModel r2 = r0.get(r2)
            androidx.fragment.app.ۥ۟۟۟ۥ r2 = (androidx.fragment.app.C7623) r2
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<androidx.fragment.app.ۥ۟۟۟ۥ> r3 = androidx.fragment.app.C7623.class
            if (r3 == r2) goto L10
            goto L33
        L10:
            androidx.fragment.app.ۥ۟۟۟ۥ r5 = (androidx.fragment.app.C7623) r5
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r4.f29321
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r5.f29321
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r2 = r4.f29322
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r3 = r5.f29322
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r4.f29323
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r5 = r5.f29323
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r2.f29321
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r1 = r2.f29322
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r2.f29323
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCleared called for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            r0 = 1
            r2.f29325 = r0
            return
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r4.f29321
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
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r1 = r4.f29322
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
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r4.f29323
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

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m29363(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5) {
            r4 = this;
            boolean r0 = r4.f29327
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r5 == 0) goto L12
            java.lang.String r5 = "Ignoring addRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r5)
        L12:
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.f29321
            java.lang.String r3 = r5.mWho
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L1e
            return
        L1e:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.f29321
            java.lang.String r3 = r5.mWho
            r0.put(r3, r5)
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Updating retained Fragments: Added "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r1, r5)
        L3f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m29364(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing non-config state for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            java.lang.String r3 = r3.mWho
            r2.m29366(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29365(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing non-config state for saved state of Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            r2.m29366(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29366(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r0 = r1.f29322
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = (androidx.fragment.app.C7623) r0
            if (r0 == 0) goto L12
            r0.onCleared()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r0 = r1.f29322
            r0.remove(r2)
        L12:
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.f29323
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 == 0) goto L24
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.f29323
            r0.remove(r2)
        L24:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29367(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r1.f29321
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public androidx.fragment.app.C7623 m29368(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r0 = r2.f29322
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = (androidx.fragment.app.C7623) r0
            if (r0 != 0) goto L1a
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = new androidx.fragment.app.ۥ۟۟۟ۥ
            boolean r1 = r2.f29324
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r1 = r2.f29322
            java.lang.String r3 = r3.mWho
            r1.put(r3, r0)
        L1a:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.Collection<androidx.fragment.app.Fragment> m29369() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r2.f29321
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.C2771 m29370() {
            r5 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r5.f29321
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r0 = r5.f29322
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r5.f29323
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r2 = r5.f29322
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = (androidx.fragment.app.C7623) r4
            Yue.ۥ۠ۢۨۥ r4 = r4.m29370()
            if (r4 == 0) goto L29
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r3, r4)
            goto L29
        L4b:
            r2 = 1
            r5.f29326 = r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r5.f29321
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L65
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L65
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r5.f29323
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L65
            return r1
        L65:
            Yue.ۥ۠ۢۨۥ r1 = new Yue.ۥ۠ۢۨۥ
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r5.f29321
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            java.util.HashMap r3 = new java.util.HashMap
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r4 = r5.f29323
            r3.<init>(r4)
            r1.<init>(r2, r0, r3)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public androidx.lifecycle.ViewModelStore m29371(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r2.f29323
            java.lang.String r1 = r3.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 != 0) goto L18
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r2.f29323
            java.lang.String r3 = r3.mWho
            r1.put(r3, r0)
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m29372() {
            r1 = this;
            boolean r0 = r1.f29325
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29373(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5) {
            r4 = this;
            boolean r0 = r4.f29327
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r5 == 0) goto L12
            java.lang.String r5 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r5)
        L12:
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.f29321
            java.lang.String r3 = r5.mWho
            java.lang.Object r0 = r0.remove(r3)
            if (r0 == 0) goto L37
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Updating retained Fragments: Removed "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r1, r5)
        L37:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29374(@Yue.InterfaceC4544 Yue.C2771 r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.f29321
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r0 = r4.f29322
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r4.f29323
            r0.clear()
            if (r5 == 0) goto L72
            java.util.Collection r0 = r5.m12129()
            if (r0 == 0) goto L31
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1b
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r4.f29321
            java.lang.String r3 = r1.mWho
            r2.put(r3, r1)
            goto L1b
        L31:
            java.util.Map r0 = r5.m12128()
            if (r0 == 0) goto L67
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            androidx.fragment.app.ۥ۟۟۟ۥ r2 = new androidx.fragment.app.ۥ۟۟۟ۥ
            boolean r3 = r4.f29324
            r2.<init>(r3)
            java.lang.Object r3 = r1.getValue()
            Yue.ۥ۠ۢۨۥ r3 = (Yue.C2771) r3
            r2.m29374(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۥ> r3 = r4.f29322
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.put(r1, r2)
            goto L3f
        L67:
            java.util.Map r5 = r5.m12130()
            if (r5 == 0) goto L72
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r4.f29323
            r0.putAll(r5)
        L72:
            r5 = 0
            r4.f29326 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29375(boolean r1) {
            r0 = this;
            r0.f29327 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m29376(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r1.f29321
            java.lang.String r2 = r2.mWho
            boolean r2 = r0.containsKey(r2)
            r0 = 1
            if (r2 != 0) goto Lc
            return r0
        Lc:
            boolean r2 = r1.f29324
            if (r2 == 0) goto L13
            boolean r2 = r1.f29325
            return r2
        L13:
            boolean r2 = r1.f29326
            r2 = r2 ^ r0
            return r2
    }
}
