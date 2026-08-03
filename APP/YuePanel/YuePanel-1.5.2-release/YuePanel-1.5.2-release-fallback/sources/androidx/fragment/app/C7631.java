package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7631 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f29369 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.ArrayList<androidx.fragment.app.Fragment> f29370;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, androidx.fragment.app.C7627> f29371;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, android.os.Bundle> f29372;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.fragment.app.C7623 f29373;

    public C7631() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29370 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f29371 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f29372 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m29403(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L18
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29370     // Catch: java.lang.Throwable -> L15
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r4.mAdded = r0
            return
        L15:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment already added: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m29404() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r2.f29371
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m29405(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r1.f29371
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29406(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r2.f29371
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto La
            r1.m29399(r3)
            goto La
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29407(@Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4544 java.io.FileDescriptor r5, @Yue.InterfaceC4410 java.io.PrintWriter r6, @Yue.InterfaceC4544 java.lang.String[] r7) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4d
            r6.print(r4)
            java.lang.String r1 = "Active Fragments:"
            r6.println(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            r6.print(r4)
            if (r2 == 0) goto L47
            androidx.fragment.app.Fragment r2 = r2.m29390()
            r6.println(r2)
            r2.dump(r0, r5, r6, r7)
            goto L2b
        L47:
            java.lang.String r2 = "null"
            r6.println(r2)
            goto L2b
        L4d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r5 = r3.f29370
            int r5 = r5.size()
            if (r5 <= 0) goto L82
            r6.print(r4)
            java.lang.String r7 = "Added Fragments:"
            r6.println(r7)
            r7 = 0
        L5e:
            if (r7 >= r5) goto L82
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            java.lang.Object r0 = r0.get(r7)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r6.print(r4)
            java.lang.String r1 = "  #"
            r6.print(r1)
            r6.print(r7)
            java.lang.String r1 = ": "
            r6.print(r1)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            int r7 = r7 + 1
            goto L5e
        L82:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29408(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r1.f29371
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            if (r2 == 0) goto Lf
            androidx.fragment.app.Fragment r2 = r2.m29390()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29409(@Yue.InterfaceC3214 int r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29370
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r3.f29371
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto L26
            androidx.fragment.app.Fragment r1 = r1.m29390()
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L26
            return r1
        L3d:
            r4 = 0
            return r4
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29410(@Yue.InterfaceC4544 java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29370
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r4 == 0) goto L49
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r3.f29371
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto L2e
            androidx.fragment.app.Fragment r1 = r1.m29390()
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2e
            return r1
        L49:
            r4 = 0
            return r4
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29411(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r2.f29371
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto La
            androidx.fragment.app.Fragment r1 = r1.m29390()
            androidx.fragment.app.Fragment r1 = r1.findFragmentByWho(r3)
            if (r1 == 0) goto La
            return r1
        L23:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m29412(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r6) {
            r5 = this;
            android.view.ViewGroup r0 = r6.mContainer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.f29370
            int r6 = r2.indexOf(r6)
            int r2 = r6 + (-1)
        Le:
            if (r2 < 0) goto L2a
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.f29370
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 != r0) goto L27
            android.view.View r3 = r3.mView
            if (r3 == 0) goto L27
            int r6 = r0.indexOfChild(r3)
            int r6 = r6 + 1
            return r6
        L27:
            int r2 = r2 + (-1)
            goto Le
        L2a:
            int r6 = r6 + 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.f29370
            int r2 = r2.size()
            if (r6 >= r2) goto L4a
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.f29370
            java.lang.Object r2 = r2.get(r6)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 != r0) goto L49
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L49
            int r6 = r0.indexOfChild(r2)
            return r6
        L49:
            goto L2a
        L4a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m29413() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r1.f29371
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.C7627> m29414() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            if (r2 == 0) goto Lf
            r0.add(r2)
            goto Lf
        L21:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.Fragment> m29415() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            if (r2 == 0) goto L25
            androidx.fragment.app.Fragment r2 = r2.m29390()
            r0.add(r2)
            goto Lf
        L25:
            r2 = 0
            r0.add(r2)
            goto Lf
        L2a:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.util.HashMap<java.lang.String, android.os.Bundle> m29416() {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.f29372
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public androidx.fragment.app.C7627 m29417(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r1.f29371
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.util.List<androidx.fragment.app.Fragment> m29418() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29370
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r3.f29370     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public androidx.fragment.app.C7623 m29419() {
            r1 = this;
            androidx.fragment.app.ۥ۟۟۟ۥ r0 = r1.f29373
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public android.os.Bundle m29420(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.f29372
            java.lang.Object r2 = r0.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29421(@Yue.InterfaceC4410 androidx.fragment.app.C7627 r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r4.m29390()
            java.lang.String r1 = r0.mWho
            boolean r1 = r3.m29405(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            java.lang.String r2 = r0.mWho
            r1.put(r2, r4)
            boolean r4 = r0.mRetainInstanceChangedWhileDetached
            if (r4 == 0) goto L2a
            boolean r4 = r0.mRetainInstance
            if (r4 == 0) goto L22
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = r3.f29373
            r4.m29363(r0)
            goto L27
        L22:
            androidx.fragment.app.ۥ۟۟۟ۥ r4 = r3.f29373
            r4.m29373(r0)
        L27:
            r4 = 0
            r0.mRetainInstanceChangedWhileDetached = r4
        L2a:
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)
            if (r4 == 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Added fragment to active set "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L47:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29422(@Yue.InterfaceC4410 androidx.fragment.app.C7627 r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r4.m29390()
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Ld
            androidx.fragment.app.ۥ۟۟۟ۥ r1 = r3.f29373
            r1.m29373(r0)
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r3.f29371
            java.lang.String r2 = r0.mWho
            java.lang.Object r1 = r1.get(r2)
            if (r1 == r4) goto L18
            return
        L18:
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r4 = r3.f29371
            java.lang.String r1 = r0.mWho
            r2 = 0
            java.lang.Object r4 = r4.put(r1, r2)
            androidx.fragment.app.ۥ۟۟۟ۧ r4 = (androidx.fragment.app.C7627) r4
            if (r4 != 0) goto L26
            return
        L26:
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)
            if (r4 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Removed fragment from active set "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L43:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m29423() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r5.f29370
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r2 = r5.f29371
            java.lang.String r1 = r1.mWho
            java.lang.Object r1 = r2.get(r1)
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto L6
            r1.m29392()
            goto L6
        L22:
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r5.f29371
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r1 = (androidx.fragment.app.C7627) r1
            if (r1 == 0) goto L2c
            r1.m29392()
            androidx.fragment.app.Fragment r2 = r1.m29390()
            boolean r3 = r2.mRemoving
            if (r3 == 0) goto L2c
            boolean r3 = r2.isInBackStack()
            if (r3 != 0) goto L2c
            boolean r3 = r2.mBeingSaved
            if (r3 == 0) goto L62
            java.util.HashMap<java.lang.String, android.os.Bundle> r3 = r5.f29372
            java.lang.String r4 = r2.mWho
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L62
            java.lang.String r2 = r2.mWho
            android.os.Bundle r3 = r1.m29397()
            r5.m29431(r2, r3)
        L62:
            r5.m29422(r1)
            goto L2c
        L66:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m29424(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r2.f29370
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r2.f29370     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3.mAdded = r0
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m29425() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r0 = r1.f29371
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m29426(@Yue.InterfaceC4544 java.util.List<java.lang.String> r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.f29370
            r0.clear()
            if (r5 == 0) goto L62
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.fragment.app.Fragment r1 = r4.m29408(r0)
            if (r1 == 0) goto L46
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r2 == 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "restoreSaveState: added ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "): "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L42:
            r4.m29403(r1)
            goto Lb
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No instantiated fragment for ("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L62:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29427(@Yue.InterfaceC4410 java.util.HashMap<java.lang.String, android.os.Bundle> r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.f29372
            r0.clear()
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.f29372
            r0.putAll(r2)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> m29428() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r5.f29371
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.ۥ۟۟۟ۧ> r1 = r5.f29371
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥ۟۟۟ۧ r2 = (androidx.fragment.app.C7627) r2
            if (r2 == 0) goto L15
            androidx.fragment.app.Fragment r3 = r2.m29390()
            java.lang.String r4 = r3.mWho
            android.os.Bundle r2 = r2.m29397()
            r5.m29431(r4, r2)
            java.lang.String r2 = r3.mWho
            r0.add(r2)
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.m29090(r2)
            if (r2 == 0) goto L15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Saved state of "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = ": "
            r2.append(r4)
            android.os.Bundle r3 = r3.mSavedFragmentState
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
            goto L15
        L5d:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> m29429() {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r7.f29370
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r7.f29370     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r0 = 0
            return r0
        Le:
            r1 = move-exception
            goto L5c
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.f29370     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.f29370     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Le
        L21:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r3.mWho     // Catch: java.lang.Throwable -> Le
            r1.add(r4)     // Catch: java.lang.Throwable -> Le
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.m29090(r4)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L21
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r5.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r6 = "saveAllState: adding fragment ("
            r5.append(r6)     // Catch: java.lang.Throwable -> Le
            java.lang.String r6 = r3.mWho     // Catch: java.lang.Throwable -> Le
            r5.append(r6)     // Catch: java.lang.Throwable -> Le
            java.lang.String r6 = "): "
            r5.append(r6)     // Catch: java.lang.Throwable -> Le
            r5.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Le
            android.util.Log.v(r4, r3)     // Catch: java.lang.Throwable -> Le
            goto L21
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m29430(@Yue.InterfaceC4410 androidx.fragment.app.C7623 r1) {
            r0 = this;
            r0.f29373 = r1
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public android.os.Bundle m29431(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.f29372
            java.lang.Object r2 = r0.put(r2, r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
        Lb:
            java.util.HashMap<java.lang.String, android.os.Bundle> r3 = r1.f29372
            java.lang.Object r2 = r3.remove(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            return r2
    }
}
