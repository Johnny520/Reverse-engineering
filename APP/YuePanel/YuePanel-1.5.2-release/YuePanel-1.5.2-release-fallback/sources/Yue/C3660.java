package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3660 extends Yue.AbstractC3658 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f11668 = "LoaderManager";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean f11669;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.lifecycle.LifecycleOwner f11670;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C3660.C3663 f11671;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ, reason: contains not printable characters */
    public static class C3661<D> extends androidx.lifecycle.MutableLiveData<D> implements Yue.C3654.InterfaceC3657<D> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f11672;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.os.Bundle f11673;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.C3654<D> f11674;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.lifecycle.LifecycleOwner f11675;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C3660.C3662<D> f11676;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C3654<D> f11677;

        public C3661(int r1, @Yue.InterfaceC4544 android.os.Bundle r2, @Yue.InterfaceC4410 Yue.C3654<D> r3, @Yue.InterfaceC4544 Yue.C3654<D> r4) {
                r0 = this;
                r0.<init>()
                r0.f11672 = r1
                r0.f11673 = r2
                r0.f11674 = r3
                r0.f11677 = r4
                r3.m14789(r1, r0)
                return
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
                r2 = this;
                boolean r0 = Yue.C3660.f11669
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Starting: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1a:
                Yue.ۥۣ۠ۧۥ<D> r0 = r2.f11674
                r0.m14793()
                return
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
                r2 = this;
                boolean r0 = Yue.C3660.f11669
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Stopping: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1a:
                Yue.ۥۣ۠ۧۥ<D> r0 = r2.f11674
                r0.m14794()
                return
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@Yue.InterfaceC4410 androidx.lifecycle.Observer<? super D> r1) {
                r0 = this;
                super.removeObserver(r1)
                r1 = 0
                r0.f11675 = r1
                r0.f11676 = r1
                return
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D r1) {
                r0 = this;
                super.setValue(r1)
                Yue.ۥۣ۠ۧۥ<D> r1 = r0.f11677
                if (r1 == 0) goto Ld
                r1.m14791()
                r1 = 0
                r0.f11677 = r1
            Ld:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 64
                r0.<init>(r1)
                java.lang.String r1 = "LoaderInfo{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " #"
                r0.append(r1)
                int r1 = r2.f11672
                r0.append(r1)
                java.lang.String r1 = " : "
                r0.append(r1)
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11674
                Yue.C1759.m8353(r1, r0)
                java.lang.String r1 = "}}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C3654.InterfaceC3657
        /* JADX INFO: renamed from: ۥ */
        public void mo14799(@Yue.InterfaceC4410 Yue.C3654<D> r3, @Yue.InterfaceC4544 D r4) {
                r2 = this;
                boolean r3 = Yue.C3660.f11669
                java.lang.String r0 = "LoaderManager"
                if (r3 == 0) goto L1a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = "onLoadComplete: "
                r3.append(r1)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r0, r3)
            L1a:
                android.os.Looper r3 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r3 != r1) goto L28
                r2.setValue(r4)
                goto L34
            L28:
                boolean r3 = Yue.C3660.f11669
                if (r3 == 0) goto L31
                java.lang.String r3 = "onLoadComplete was incorrectly called on a background thread"
                android.util.Log.w(r0, r3)
            L31:
                r2.postValue(r4)
            L34:
                return
        }

        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C3654<D> m14813(boolean r3) {
                r2 = this;
                boolean r0 = Yue.C3660.f11669
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Destroying: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L1a:
                Yue.ۥۣ۠ۧۥ<D> r0 = r2.f11674
                r0.m14777()
                Yue.ۥۣ۠ۧۥ<D> r0 = r2.f11674
                r0.m14776()
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r0 = r2.f11676
                if (r0 == 0) goto L30
                r2.removeObserver(r0)
                if (r3 == 0) goto L30
                r0.m14821()
            L30:
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11674
                r1.m14796(r2)
                if (r0 == 0) goto L3d
                boolean r0 = r0.m14820()
                if (r0 == 0) goto L3f
            L3d:
                if (r3 == 0) goto L47
            L3f:
                Yue.ۥۣ۠ۧۥ<D> r3 = r2.f11674
                r3.m14791()
                Yue.ۥۣ۠ۧۥ<D> r3 = r2.f11677
                return r3
            L47:
                Yue.ۥۣ۠ۧۥ<D> r3 = r2.f11674
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14814(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
                r3 = this;
                r6.print(r4)
                java.lang.String r0 = "mId="
                r6.print(r0)
                int r0 = r3.f11672
                r6.print(r0)
                java.lang.String r0 = " mArgs="
                r6.print(r0)
                android.os.Bundle r0 = r3.f11673
                r6.println(r0)
                r6.print(r4)
                java.lang.String r0 = "mLoader="
                r6.print(r0)
                Yue.ۥۣ۠ۧۥ<D> r0 = r3.f11674
                r6.println(r0)
                Yue.ۥۣ۠ۧۥ<D> r0 = r3.f11674
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                java.lang.String r2 = "  "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo4128(r1, r5, r6, r7)
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r5 = r3.f11676
                if (r5 == 0) goto L5f
                r6.print(r4)
                java.lang.String r5 = "mCallbacks="
                r6.print(r5)
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r5 = r3.f11676
                r6.println(r5)
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r5 = r3.f11676
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                r7.append(r2)
                java.lang.String r7 = r7.toString()
                r5.m14819(r7, r6)
            L5f:
                r6.print(r4)
                java.lang.String r5 = "mData="
                r6.print(r5)
                Yue.ۥۣ۠ۧۥ r5 = r3.m14815()
                java.lang.Object r7 = r3.getValue()
                java.lang.String r5 = r5.m14779(r7)
                r6.println(r5)
                r6.print(r4)
                java.lang.String r4 = "mStarted="
                r6.print(r4)
                boolean r4 = r3.hasActiveObservers()
                r6.println(r4)
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C3654<D> m14815() {
                r1 = this;
                Yue.ۥۣ۠ۧۥ<D> r0 = r1.f11674
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m14816() {
                r2 = this;
                boolean r0 = r2.hasActiveObservers()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r0 = r2.f11676
                if (r0 == 0) goto L13
                boolean r0 = r0.m14820()
                if (r0 != 0) goto L13
                r1 = 1
            L13:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m14817() {
                r2 = this;
                androidx.lifecycle.LifecycleOwner r0 = r2.f11675
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r1 = r2.f11676
                if (r0 == 0) goto Le
                if (r1 == 0) goto Le
                super.removeObserver(r1)
                r2.observe(r0, r1)
            Le:
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C3654<D> m14818(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r4) {
                r2 = this;
                Yue.ۥۣ۠ۧۧ$ۥ۟ r0 = new Yue.ۥۣ۠ۧۧ$ۥ۟
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11674
                r0.<init>(r1, r4)
                r2.observe(r3, r0)
                Yue.ۥۣ۠ۧۧ$ۥ۟<D> r4 = r2.f11676
                if (r4 == 0) goto L11
                r2.removeObserver(r4)
            L11:
                r2.f11675 = r3
                r2.f11676 = r0
                Yue.ۥۣ۠ۧۥ<D> r3 = r2.f11674
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟, reason: contains not printable characters */
    public static class C3662<D> implements androidx.lifecycle.Observer<D> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.C3654<D> f11678;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.AbstractC3658.InterfaceC3659<D> f11679;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f11680;

        public C3662(@Yue.InterfaceC4410 Yue.C3654<D> r2, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f11680 = r0
                r1.f11678 = r2
                r1.f11679 = r3
                return
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Yue.InterfaceC4544 D r3) {
                r2 = this;
                boolean r0 = Yue.C3660.f11669
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  onLoadFinished in "
                r0.append(r1)
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11678
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11678
                java.lang.String r1 = r1.m14779(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L2a:
                Yue.ۥۣ۠ۧۦ$ۥ<D> r0 = r2.f11679
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11678
                r0.m14811(r1, r3)
                r3 = 1
                r2.f11680 = r3
                return
        }

        public java.lang.String toString() {
                r1 = this;
                Yue.ۥۣ۠ۧۦ$ۥ<D> r0 = r1.f11679
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m14819(java.lang.String r1, java.io.PrintWriter r2) {
                r0 = this;
                r2.print(r1)
                java.lang.String r1 = "mDeliveredData="
                r2.print(r1)
                boolean r1 = r0.f11680
                r2.println(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m14820() {
                r1 = this;
                boolean r0 = r1.f11680
                return r0
        }

        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14821() {
                r2 = this;
                boolean r0 = r2.f11680
                if (r0 == 0) goto L27
                boolean r0 = Yue.C3660.f11669
                if (r0 == 0) goto L20
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Resetting: "
                r0.append(r1)
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11678
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L20:
                Yue.ۥۣ۠ۧۦ$ۥ<D> r0 = r2.f11679
                Yue.ۥۣ۠ۧۥ<D> r1 = r2.f11678
                r0.m14809(r1)
            L27:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C3663 extends androidx.lifecycle.ViewModel {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final androidx.lifecycle.ViewModelProvider.Factory f11681 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C5868<Yue.C3660.C3661> f11682;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f11683;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۧ$ۥ۟۟$ۥ, reason: contains not printable characters */
        public static class C3664 implements androidx.lifecycle.ViewModelProvider.Factory {
            public C3664() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @Yue.InterfaceC4410
            public <T extends androidx.lifecycle.ViewModel> T create(@Yue.InterfaceC4410 java.lang.Class<T> r1) {
                    r0 = this;
                    Yue.ۥۣ۠ۧۧ$ۥ۟۟ r1 = new Yue.ۥۣ۠ۧۧ$ۥ۟۟
                    r1.<init>()
                    return r1
            }
        }

        static {
                Yue.ۥۣ۠ۧۧ$ۥ۟۟$ۥ r0 = new Yue.ۥۣ۠ۧۧ$ۥ۟۟$ۥ
                r0.<init>()
                Yue.C3660.C3663.f11681 = r0
                return
        }

        public C3663() {
                r1 = this;
                r1.<init>()
                Yue.ۥۢ۟ۦ۠ r0 = new Yue.ۥۢ۟ۦ۠
                r0.<init>()
                r1.f11682 = r0
                r0 = 0
                r1.f11683 = r0
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Yue.C3660.C3663 m14822(androidx.lifecycle.ViewModelStore r2) {
                androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
                androidx.lifecycle.ViewModelProvider$Factory r1 = Yue.C3660.C3663.f11681
                r0.<init>(r2, r1)
                java.lang.Class<Yue.ۥۣ۠ۧۧ$ۥ۟۟> r2 = Yue.C3660.C3663.class
                androidx.lifecycle.ViewModel r2 = r0.get(r2)
                Yue.ۥۣ۠ۧۧ$ۥ۟۟ r2 = (Yue.C3660.C3663) r2
                return r2
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
                r4 = this;
                super.onCleared()
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r4.f11682
                int r0 = r0.m21830()
                r1 = 0
            La:
                if (r1 >= r0) goto L1b
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r2 = r4.f11682
                java.lang.Object r2 = r2.m21831(r1)
                Yue.ۥۣ۠ۧۧ$ۥ r2 = (Yue.C3660.C3661) r2
                r3 = 1
                r2.m14813(r3)
                int r1 = r1 + 1
                goto La
            L1b:
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r4.f11682
                r0.m21808()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m14823(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
                r4 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r4.f11682
                int r0 = r0.m21830()
                if (r0 <= 0) goto L55
                r7.print(r5)
                java.lang.String r0 = "Loaders:"
                r7.println(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                java.lang.String r1 = "    "
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
            L22:
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r2 = r4.f11682
                int r2 = r2.m21830()
                if (r1 >= r2) goto L55
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r2 = r4.f11682
                java.lang.Object r2 = r2.m21831(r1)
                Yue.ۥۣ۠ۧۧ$ۥ r2 = (Yue.C3660.C3661) r2
                r7.print(r5)
                java.lang.String r3 = "  #"
                r7.print(r3)
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r3 = r4.f11682
                int r3 = r3.m21819(r1)
                r7.print(r3)
                java.lang.String r3 = ": "
                r7.print(r3)
                java.lang.String r3 = r2.toString()
                r7.println(r3)
                r2.m14814(r0, r6, r7, r8)
                int r1 = r1 + 1
                goto L22
            L55:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m14824() {
                r1 = this;
                r0 = 0
                r1.f11683 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public <D> Yue.C3660.C3661<D> m14825(int r2) {
                r1 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r1.f11682
                java.lang.Object r2 = r0.m21814(r2)
                Yue.ۥۣ۠ۧۧ$ۥ r2 = (Yue.C3660.C3661) r2
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m14826() {
                r4 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r4.f11682
                int r0 = r0.m21830()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L1d
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r3 = r4.f11682
                java.lang.Object r3 = r3.m21831(r2)
                Yue.ۥۣ۠ۧۧ$ۥ r3 = (Yue.C3660.C3661) r3
                boolean r3 = r3.m14816()
                if (r3 == 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r2 = r2 + 1
                goto L8
            L1d:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m14827() {
                r1 = this;
                boolean r0 = r1.f11683
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m14828() {
                r3 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r3.f11682
                int r0 = r0.m21830()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r2 = r3.f11682
                java.lang.Object r2 = r2.m21831(r1)
                Yue.ۥۣ۠ۧۧ$ۥ r2 = (Yue.C3660.C3661) r2
                r2.m14817()
                int r1 = r1 + 1
                goto L7
            L17:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m14829(int r2, @Yue.InterfaceC4410 Yue.C3660.C3661 r3) {
                r1 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r1.f11682
                r0.m21820(r2, r3)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m14830(int r2) {
                r1 = this;
                Yue.ۥۢ۟ۦ۠<Yue.ۥۣ۠ۧۧ$ۥ> r0 = r1.f11682
                r0.m21823(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m14831() {
                r1 = this;
                r0 = 1
                r1.f11683 = r0
                return
        }
    }

    static {
            return
    }

    public C3660(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r1, @Yue.InterfaceC4410 androidx.lifecycle.ViewModelStore r2) {
            r0 = this;
            r0.<init>()
            r0.f11670 = r1
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r1 = Yue.C3660.C3663.m14822(r2)
            r0.f11671 = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.lifecycle.LifecycleOwner r1 = r2.f11670
            Yue.C1759.m8353(r1, r0)
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC3658
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ */
    public void mo14802(int r3) {
            r2 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671
            boolean r0 = r0.m14827()
            if (r0 != 0) goto L4e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L46
            boolean r0 = Yue.C3660.f11669
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "destroyLoader in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " of "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoaderManager"
            android.util.Log.v(r1, r0)
        L34:
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671
            Yue.ۥۣ۠ۧۧ$ۥ r0 = r0.m14825(r3)
            if (r0 == 0) goto L45
            r1 = 1
            r0.m14813(r1)
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671
            r0.m14830(r3)
        L45:
            return
        L46:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "destroyLoader must be called on the main thread"
            r3.<init>(r0)
            throw r3
        L4e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Called while creating a loader"
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.AbstractC3658
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo14803(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r1.f11671
            r0.m14823(r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC3658
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public <D> Yue.C3654<D> mo14804(int r2) {
            r1 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r1.f11671
            boolean r0 = r0.m14827()
            if (r0 != 0) goto L17
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r1.f11671
            Yue.ۥۣ۠ۧۧ$ۥ r2 = r0.m14825(r2)
            if (r2 == 0) goto L15
            Yue.ۥۣ۠ۧۥ r2 = r2.m14815()
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Called while creating a loader"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC3658
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo14805() {
            r1 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r1.f11671
            boolean r0 = r0.m14826()
            return r0
    }

    @Override // Yue.AbstractC3658
    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public <D> Yue.C3654<D> mo14806(int r5, @Yue.InterfaceC4544 android.os.Bundle r6, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r7) {
            r4 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r4.f11671
            boolean r0 = r0.m14827()
            if (r0 != 0) goto L69
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L61
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r4.f11671
            Yue.ۥۣ۠ۧۧ$ۥ r0 = r0.m14825(r5)
            boolean r1 = Yue.C3660.f11669
            java.lang.String r2 = "LoaderManager"
            if (r1 == 0) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "initLoader in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ": args="
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L3a:
            if (r0 != 0) goto L42
            r0 = 0
            Yue.ۥۣ۠ۧۥ r5 = r4.m14812(r5, r6, r7, r0)
            return r5
        L42:
            boolean r5 = Yue.C3660.f11669
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "  Re-using existing loader "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L5a:
            androidx.lifecycle.LifecycleOwner r5 = r4.f11670
            Yue.ۥۣ۠ۧۥ r5 = r0.m14818(r5, r7)
            return r5
        L61:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "initLoader must be called on the main thread"
            r5.<init>(r6)
            throw r5
        L69:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Called while creating a loader"
            r5.<init>(r6)
            throw r5
    }

    @Override // Yue.AbstractC3658
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo14807() {
            r1 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r1.f11671
            r0.m14828()
            return
    }

    @Override // Yue.AbstractC3658
    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public <D> Yue.C3654<D> mo14808(int r3, @Yue.InterfaceC4544 android.os.Bundle r4, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r5) {
            r2 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671
            boolean r0 = r0.m14827()
            if (r0 != 0) goto L50
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L48
            boolean r0 = Yue.C3660.f11669
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "restartLoader in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ": args="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoaderManager"
            android.util.Log.v(r1, r0)
        L34:
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671
            Yue.ۥۣ۠ۧۧ$ۥ r0 = r0.m14825(r3)
            if (r0 == 0) goto L42
            r1 = 0
            Yue.ۥۣ۠ۧۥ r0 = r0.m14813(r1)
            goto L43
        L42:
            r0 = 0
        L43:
            Yue.ۥۣ۠ۧۥ r3 = r2.m14812(r3, r4, r5, r0)
            return r3
        L48:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "restartLoader must be called on the main thread"
            r3.<init>(r4)
            throw r3
        L50:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Called while creating a loader"
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <D> Yue.C3654<D> m14812(int r3, @Yue.InterfaceC4544 android.os.Bundle r4, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r5, @Yue.InterfaceC4544 Yue.C3654<D> r6) {
            r2 = this;
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r0 = r2.f11671     // Catch: java.lang.Throwable -> L3b
            r0.m14831()     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۣ۠ۧۥ r0 = r5.m14810(r3, r4)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L6d
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isMemberClass()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3d
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L3b
            int r1 = r1.getModifiers()     // Catch: java.lang.Throwable -> L3b
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L24
            goto L3d
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r4.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = "Object returned from onCreateLoader must not be a non-static inner member class: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3b
            r4.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            goto L75
        L3d:
            Yue.ۥۣ۠ۧۧ$ۥ r1 = new Yue.ۥۣ۠ۧۧ$ۥ     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3, r4, r0, r6)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = Yue.C3660.f11669     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L5c
            java.lang.String r4 = "LoaderManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r6.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "  Created new loader "
            r6.append(r0)     // Catch: java.lang.Throwable -> L3b
            r6.append(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3b
            android.util.Log.v(r4, r6)     // Catch: java.lang.Throwable -> L3b
        L5c:
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r4 = r2.f11671     // Catch: java.lang.Throwable -> L3b
            r4.m14829(r3, r1)     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r3 = r2.f11671
            r3.m14824()
            androidx.lifecycle.LifecycleOwner r3 = r2.f11670
            Yue.ۥۣ۠ۧۥ r3 = r1.m14818(r3, r5)
            return r3
        L6d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Object returned from onCreateLoader must not be null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            throw r3     // Catch: java.lang.Throwable -> L3b
        L75:
            Yue.ۥۣ۠ۧۧ$ۥ۟۟ r4 = r2.f11671
            r4.m14824()
            throw r3
    }
}
