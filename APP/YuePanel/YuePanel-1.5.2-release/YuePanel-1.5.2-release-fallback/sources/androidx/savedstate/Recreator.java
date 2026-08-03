package androidx.savedstate;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u000f\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "LYue/ۥۡۧۤۢ;", "owner", "<init>", "(LYue/ۥۡۧۤۢ;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "", "className", "ۥ", "(Ljava/lang/String;)V", "ۥۣ۟۟۠", "LYue/ۥۡۧۤۢ;", "ۥ۟۟۠ۤ", "ۥ۟", "savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class Recreator implements androidx.lifecycle.LifecycleEventObserver {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final androidx.savedstate.Recreator.C7814 f30134 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f30135 = "classes_to_restore";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f30136 = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5504 f30137;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$ۥ, reason: contains not printable characters */
    public static final class C7814 {
        public C7814() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7814(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$ۥ۟, reason: contains not printable characters */
    public static final class C7815 implements androidx.savedstate.C7816.InterfaceC7819 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.Set<java.lang.String> f30138;

        public C7815(@Yue.InterfaceC4418 androidx.savedstate.C7816 r2) {
                r1 = this;
                java.lang.String r0 = "registry"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.f30138 = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.m30366(r0, r1)
                return
        }

        @Override // androidx.savedstate.C7816.InterfaceC7819
        @Yue.InterfaceC4418
        public android.os.Bundle saveState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.f30138
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m30356(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "className"
                Yue.C3329.m13906(r2, r0)
                java.util.Set<java.lang.String> r0 = r1.f30138
                r0.add(r2)
                return
        }
    }

    static {
            androidx.savedstate.Recreator$ۥ r0 = new androidx.savedstate.Recreator$ۥ
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.Recreator.f30134 = r0
            return
    }

    public Recreator(@Yue.InterfaceC4418 Yue.InterfaceC5504 r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f30137 = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4418 androidx.lifecycle.LifecycleOwner r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L49
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            Yue.ۥۡۧۤۢ r2 = r1.f30137
            androidx.savedstate.ۥ r2 = r2.getSavedStateRegistry()
            java.lang.String r3 = "androidx.savedstate.Restarter"
            android.os.Bundle r2 = r2.m30359(r3)
            if (r2 != 0) goto L24
            return
        L24:
            java.lang.String r3 = "classes_to_restore"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L41
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.m30355(r3)
            goto L30
        L40:
            return
        L41:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r2.<init>(r3)
            throw r2
        L49:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m30355(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Class "
            java.lang.Class<androidx.savedstate.Recreator> r1 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L69
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L69
            java.lang.Class<androidx.savedstate.ۥ$ۥ> r2 = androidx.savedstate.C7816.InterfaceC7817.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L69
            java.lang.String r2 = "{\n                Class.…class.java)\n            }"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L69
            r2 = 0
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L4a
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "{\n                constr…wInstance()\n            }"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Exception -> L32
            androidx.savedstate.ۥ$ۥ r0 = (androidx.savedstate.C7816.InterfaceC7817) r0     // Catch: java.lang.Exception -> L32
            Yue.ۥۡۧۤۢ r5 = r4.f30137
            r0.onRecreated(r5)
            return
        L32:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L4a:
            r5 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r1.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r5)
            throw r2
        L69:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = " wasn't found"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r1)
            throw r2
    }
}
