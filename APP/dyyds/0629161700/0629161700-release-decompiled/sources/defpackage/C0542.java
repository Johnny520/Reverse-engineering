package defpackage;

/* JADX INFO: renamed from: ᛳᲀᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542 implements defpackage.InterfaceC0429 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static volatile defpackage.C0542 f2668;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f2669;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f2670;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2671;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f2672;

    public C0542() {
            r1 = this;
            r0 = 3
            r1.f2671 = r0
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.f2669 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f2672 = r0
            return
    }

    public C0542(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r2.f2671 = r0
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.f2672 = r0
            ᛷᲁᛷᛶ r0 = new ᛷᲁᛷᛶ
            r1 = 10
            r0.<init>(r3, r1)
            ᲈᛵᛷᛱ r3 = new ᲈᛵᛷᛱ
            r3.<init>(r0)
            ᛷᛷᛶᲇ r0 = new ᛷᛷᛶᲇ
            r0.<init>(r2)
            ᛴᛷᛳᲀ r1 = new ᛴᛷᛳᲀ
            r1.<init>(r3, r0)
            r2.f2669 = r1
            return
    }

    public C0542(com.bumptech.glide.ComponentCallbacks2C0007 r1, java.util.ArrayList r2, defpackage.AbstractC0729 r3) {
            r0 = this;
            r3 = 2
            r0.f2671 = r3
            r0.<init>()
            r0.f2669 = r1
            r0.f2672 = r2
            return
    }

    public C0542(java.lang.Object r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.f2671 = r0
            r1.<init>()
            r1.f2670 = r4
            r1.f2669 = r3
            r1.f2672 = r2
            return
    }

    public C0542(defpackage.InterfaceC1386 r2) {
            r1 = this;
            r0 = 4
            r1.f2671 = r0
            r1.<init>()
            r1.f2669 = r2
            ᛶᛲᛱᛸ r2 = new ᛶᛲᛱᛸ
            r2.<init>()
            r1.f2672 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0542 m1328(android.content.Context r2) {
            ᛳᲀᛴᲈ r0 = defpackage.C0542.f2668
            if (r0 != 0) goto L1d
            java.lang.Class<ᛳᲀᛴᲈ> r0 = defpackage.C0542.class
            monitor-enter(r0)
            ᛳᲀᛴᲈ r1 = defpackage.C0542.f2668     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            ᛳᲀᛴᲈ r1 = new ᛳᲀᛴᲈ     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            defpackage.C0542.f2668 = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
        L1d:
            ᛳᲀᛴᲈ r2 = defpackage.C0542.f2668
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0542 m1329(java.lang.String r6) {
            ᛳᲀᛴᲈ r0 = new ᛳᲀᛴᲈ
            r1 = 0
            if (r6 == 0) goto L1d
            int r2 = r6.length()
            r3 = r1
        La:
            if (r3 >= r2) goto L1d
            int r4 = r6.codePointAt(r3)
            boolean r5 = java.lang.Character.isWhitespace(r4)
            if (r5 != 0) goto L17
            goto L26
        L17:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto La
        L1d:
            r2 = -1156540488130094(0xfffbe421ef0961d2, double:NaN)
            java.lang.String r6 = "unknown native error"
        L26:
            r2 = 0
            r0.<init>(r2, r6, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0429
    public java.lang.Object get() {
            r3 = this;
            boolean r0 = r3.f2670
            if (r0 != 0) goto L26
            java.lang.String r0 = "Glide registry"
            defpackage.AbstractC2193.m3597(r0)
            r0 = 1
            r3.f2670 = r0
            r0 = 0
            java.lang.Object r1 = r3.f2669     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.ᛷᲁᛳᛳ r1 = (com.bumptech.glide.ComponentCallbacks2C0007) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r3.f2672     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1f
            ᲈᲈᛲᲇ r1 = defpackage.AbstractC1193.m2336(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r3.f2670 = r0
            android.os.Trace.endSection()
            return r1
        L1f:
            r1 = move-exception
            r3.f2670 = r0
            android.os.Trace.endSection()
            throw r1
        L26:
            java.lang.String r3 = "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!"
            defpackage.C2264.m3676(r3)
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2671
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{numRequests="
            r0.append(r1)
            java.lang.Object r1 = r2.f2669
            java.util.Set r1 = (java.util.Set) r1
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", isPaused="
            r0.append(r1)
            boolean r2 = r2.f2670
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m1330() {
            r4 = this;
            java.lang.Object r0 = r4.f2669
            ᛷᲇᛶᲈ r0 = (defpackage.InterfaceC1386) r0
            androidx.lifecycle.ᛷᲁᛳᛳ r1 = r0.mo0()
            ᛳᲇᲇᛱ r2 = r1.f286
            ᛳᲇᲇᛱ r3 = defpackage.EnumC0578.f2852
            if (r2 != r3) goto L32
            androidx.savedstate.Recreator r2 = new androidx.savedstate.Recreator
            r2.<init>(r0)
            r1.m110(r2)
            java.lang.Object r0 = r4.f2672
            ᛶᛲᛱᛸ r0 = (defpackage.C1020) r0
            boolean r2 = r0.f4550
            if (r2 != 0) goto L2c
            ᛲᛷᲁᛷ r2 = new ᛲᛷᲁᛷ
            r2.<init>(r0)
            r1.m110(r2)
            r1 = 1
            r0.f4550 = r1
            r4.f2670 = r1
            return
        L2c:
            java.lang.String r4 = "SavedStateRegistry was already attached."
            defpackage.C2264.m3676(r4)
            return
        L32:
            java.lang.String r4 = "Restarter must be created only during owner's initialization stage"
            defpackage.C2264.m3676(r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m1331() {
            r5 = this;
            boolean r0 = r5.f2670
            if (r0 != 0) goto L4a
            java.lang.Object r0 = r5.f2672
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L4a
        Lf:
            java.lang.Object r0 = r5.f2669
            ᛴᛷᛳᲀ r0 = (defpackage.C0703) r0
            java.lang.Object r1 = r0.f3354
            ᲈᛵᛷᛱ r1 = (defpackage.C2243) r1
            java.lang.Object r2 = r1.get()
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.Network r2 = r2.getActiveNetwork()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            r2 = r4
            goto L28
        L27:
            r2 = r3
        L28:
            r0.f3355 = r2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.RuntimeException -> L39
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.RuntimeException -> L39
            java.lang.Object r0 = r0.f3353     // Catch: java.lang.RuntimeException -> L39
            ᛷᛴᛱᛸ r0 = (defpackage.C1251) r0     // Catch: java.lang.RuntimeException -> L39
            r1.registerDefaultNetworkCallback(r0)     // Catch: java.lang.RuntimeException -> L39
            r3 = r4
            goto L48
        L39:
            r0 = move-exception
            r1 = 5
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L48
            java.lang.String r1 = "Failed to register callback"
            android.util.Log.w(r2, r1, r0)
        L48:
            r5.f2670 = r3
        L4a:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean m1332(defpackage.InterfaceC2076 r3) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r2.f2669
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.remove(r3)
            java.lang.Object r2 = r2.f2672
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r2 = r2.remove(r3)
            if (r2 != 0) goto L1a
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L1f
            r3.clear()
        L1f:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public void m1333(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.f2670
            if (r0 != 0) goto L7
            r3.m1330()
        L7:
            java.lang.Object r0 = r3.f2669
            ᛷᲇᛶᲈ r0 = (defpackage.InterfaceC1386) r0
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r0.mo0()
            ᛳᲇᲇᛱ r1 = r0.f286
            ᛳᲇᲇᛱ r2 = defpackage.EnumC0578.f2854
            boolean r1 = r1.m1374(r2)
            if (r1 != 0) goto L41
            java.lang.Object r3 = r3.f2672
            ᛶᛲᛱᛸ r3 = (defpackage.C1020) r3
            boolean r0 = r3.f4550
            if (r0 == 0) goto L3b
            boolean r0 = r3.f4549
            if (r0 != 0) goto L35
            if (r4 == 0) goto L2e
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r4 = r4.getBundle(r0)
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r3.f4551 = r4
            r4 = 1
            r3.f4549 = r4
            return
        L35:
            java.lang.String r3 = "SavedStateRegistry was already restored."
            defpackage.C2264.m3676(r3)
            return
        L3b:
            java.lang.String r3 = "You must call performAttach() before calling performRestore(Bundle)."
            defpackage.C2264.m3676(r3)
            return
        L41:
            java.lang.String r3 = "performRestore cannot be called when owner is "
            ᛳᲇᲇᛱ r4 = r0.f286
            defpackage.C0086.m558(r4, r3)
            return
    }
}
