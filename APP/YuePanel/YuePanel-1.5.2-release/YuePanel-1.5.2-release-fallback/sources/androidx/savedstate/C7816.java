package androidx.savedstate;

/* JADX INFO: renamed from: androidx.savedstate.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@android.annotation.SuppressLint({"RestrictedApi"})
public final class C7816 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final androidx.savedstate.C7816.C7818 f30139 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @java.lang.Deprecated
    public static final java.lang.String f30140 = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5471<java.lang.String, androidx.savedstate.C7816.InterfaceC7819> f30141;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f30142;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public android.os.Bundle f30143;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f30144;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public androidx.savedstate.Recreator.C7815 f30145;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f30146;

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC7817 {
        void onRecreated(@Yue.InterfaceC4418 Yue.InterfaceC5504 r1);
    }

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ۟, reason: contains not printable characters */
    public static final class C7818 {
        public C7818() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7818(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.ۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7819 {
        @Yue.InterfaceC4418
        android.os.Bundle saveState();
    }

    static {
            androidx.savedstate.ۥ$ۥ۟ r0 = new androidx.savedstate.ۥ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.C7816.f30139 = r0
            return
    }

    public C7816() {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۧۢۥ r0 = new Yue.ۥۡۧۢۥ
            r0.<init>()
            r1.f30141 = r0
            r0 = 1
            r1.f30146 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30357(androidx.savedstate.C7816 r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            m30358(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m30358(androidx.savedstate.C7816 r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "event"
            Yue.C3329.m13906(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r3 != r2) goto L17
            r2 = 1
            r1.f30146 = r2
            goto L1e
        L17:
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1e
            r2 = 0
            r1.f30146 = r2
        L1e:
            return
    }

    @Yue.InterfaceC3875
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.os.Bundle m30359(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r3.f30144
            if (r0 == 0) goto L2c
            android.os.Bundle r0 = r3.f30143
            r1 = 0
            if (r0 == 0) goto L2b
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L16
        L15:
            r0 = r1
        L16:
            android.os.Bundle r2 = r3.f30143
            if (r2 == 0) goto L1d
            r2.remove(r4)
        L1d:
            android.os.Bundle r4 = r3.f30143
            if (r4 == 0) goto L28
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L28
            goto L2a
        L28:
            r3.f30143 = r1
        L2a:
            return r0
        L2b:
            return r1
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.savedstate.C7816.InterfaceC7819 m30360(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۡۧۢۥ<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r3.f30141
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "components"
            Yue.C3329.m13905(r1, r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.ۥ$ۥ۟۟ r1 = (androidx.savedstate.C7816.InterfaceC7819) r1
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto Lb
            goto L30
        L2f:
            r1 = 0
        L30:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m30361() {
            r1 = this;
            boolean r0 = r1.f30146
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m30362() {
            r1 = this;
            boolean r0 = r1.f30144
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30363(@Yue.InterfaceC4418 androidx.lifecycle.Lifecycle r3) {
            r2 = this;
            java.lang.String r0 = "lifecycle"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r2.f30142
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L16
            Yue.ۥۡۧۤ۠ r0 = new Yue.ۥۡۧۤ۠
            r0.<init>(r2)
            r3.addObserver(r0)
            r2.f30142 = r1
            return
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already attached."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30364(@Yue.InterfaceC4543 android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.f30142
            if (r0 == 0) goto L25
            boolean r0 = r2.f30144
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L19
            if (r3 == 0) goto L13
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r3.getBundle(r0)
            goto L14
        L13:
            r3 = 0
        L14:
            r2.f30143 = r3
            r2.f30144 = r1
            return
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m30365(@Yue.InterfaceC4418 android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            Yue.C3329.m13906(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r4.f30143
            if (r1 == 0) goto L11
            r0.putAll(r1)
        L11:
            Yue.ۥۡۧۢۥ<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r1 = r4.f30141
            Yue.ۥۡۧۢۥ$ۥ۟۟۟ r1 = r1.m20627()
            java.lang.String r2 = "this.components.iteratorWithAdditions()"
            Yue.C3329.m13905(r1, r2)
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.ۥ$ۥ۟۟ r2 = (androidx.savedstate.C7816.InterfaceC7819) r2
            android.os.Bundle r2 = r2.saveState()
            r0.putBundle(r3, r2)
            goto L1c
        L3c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L47
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r1, r0)
        L47:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m30366(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 androidx.savedstate.C7816.InterfaceC7819 r3) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "provider"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۡۧۢۥ<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r1.f30141
            java.lang.Object r2 = r0.mo10711(r2, r3)
            androidx.savedstate.ۥ$ۥ۟۟ r2 = (androidx.savedstate.C7816.InterfaceC7819) r2
            if (r2 != 0) goto L15
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m30367(@Yue.InterfaceC4418 java.lang.Class<? extends androidx.savedstate.C7816.InterfaceC7817> r5) {
            r4 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r4.f30146
            if (r0 == 0) goto L4a
            androidx.savedstate.Recreator$ۥ۟ r0 = r4.f30145
            if (r0 != 0) goto L12
            androidx.savedstate.Recreator$ۥ۟ r0 = new androidx.savedstate.Recreator$ۥ۟
            r0.<init>(r4)
        L12:
            r4.f30145 = r0
            r0 = 0
            r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L29
            androidx.savedstate.Recreator$ۥ۟ r0 = r4.f30145
            if (r0 == 0) goto L28
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "clazz.name"
            Yue.C3329.m13905(r5, r1)
            r0.m30356(r5)
        L28:
            return
        L29:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r5 = " must have default constructor in order to be automatically recreated"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30368(boolean r1) {
            r0 = this;
            r0.f30146 = r1
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m30369(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۧۢۥ<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r1.f30141
            r0.mo10712(r2)
            return
    }
}
