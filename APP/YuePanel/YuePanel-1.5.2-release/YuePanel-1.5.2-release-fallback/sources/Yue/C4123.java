package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4123 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Runnable f12678;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC4143> f12679;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.Map<Yue.InterfaceC4143, Yue.C4123.C4124> f12680;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۢ$ۥ, reason: contains not printable characters */
    public static class C4124 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.lifecycle.Lifecycle f12681;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.lifecycle.LifecycleEventObserver f12682;

        public C4124(@Yue.InterfaceC4410 androidx.lifecycle.Lifecycle r1, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleEventObserver r2) {
                r0 = this;
                r0.<init>()
                r0.f12681 = r1
                r0.f12682 = r2
                r1.addObserver(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m16169() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.f12681
                androidx.lifecycle.LifecycleEventObserver r1 = r2.f12682
                r0.removeObserver(r1)
                r0 = 0
                r2.f12682 = r0
                return
        }
    }

    public C4123(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f12679 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f12680 = r0
            r1.f12678 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m16157(Yue.C4123 r0, androidx.lifecycle.Lifecycle.State r1, Yue.InterfaceC4143 r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r0.m16163(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m16158(Yue.C4123 r0, Yue.InterfaceC4143 r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r0.m16162(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m16159(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r1.f12679
            r0.add(r2)
            java.lang.Runnable r2 = r1.f12678
            r2.run()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m16160(@Yue.InterfaceC4410 Yue.InterfaceC4143 r4, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r5) {
            r3 = this;
            r3.m16159(r4)
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            java.util.Map<Yue.ۥۡ۠ۧ, Yue.ۥۡ۠ۦۢ$ۥ> r0 = r3.f12680
            java.lang.Object r0 = r0.remove(r4)
            Yue.ۥۡ۠ۦۢ$ۥ r0 = (Yue.C4123.C4124) r0
            if (r0 == 0) goto L14
            r0.m16169()
        L14:
            Yue.ۥۡ۠ۦۡ r0 = new Yue.ۥۡ۠ۦۡ
            r0.<init>(r3, r4)
            java.util.Map<Yue.ۥۡ۠ۧ, Yue.ۥۡ۠ۦۢ$ۥ> r1 = r3.f12680
            Yue.ۥۡ۠ۦۢ$ۥ r2 = new Yue.ۥۡ۠ۦۢ$ۥ
            r2.<init>(r5, r0)
            r1.put(r4, r2)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m16161(@Yue.InterfaceC4410 Yue.InterfaceC4143 r3, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r4, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r5) {
            r2 = this;
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle()
            java.util.Map<Yue.ۥۡ۠ۧ, Yue.ۥۡ۠ۦۢ$ۥ> r0 = r2.f12680
            java.lang.Object r0 = r0.remove(r3)
            Yue.ۥۡ۠ۦۢ$ۥ r0 = (Yue.C4123.C4124) r0
            if (r0 == 0) goto L11
            r0.m16169()
        L11:
            Yue.ۥۡ۠ۦ۠ r0 = new Yue.ۥۡ۠ۦ۠
            r0.<init>(r2, r5, r3)
            java.util.Map<Yue.ۥۡ۠ۧ, Yue.ۥۡ۠ۦۢ$ۥ> r5 = r2.f12680
            Yue.ۥۡ۠ۦۢ$ۥ r1 = new Yue.ۥۡ۠ۦۢ$ۥ
            r1.<init>(r4, r0)
            r5.put(r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ void m16162(Yue.InterfaceC4143 r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r0 = this;
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r2) goto L7
            r0.m16168(r1)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m16163(androidx.lifecycle.Lifecycle.State r1, Yue.InterfaceC4143 r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r0 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.upTo(r1)
            if (r4 != r3) goto La
            r0.m16159(r2)
            goto L22
        La:
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 != r3) goto L12
            r0.m16168(r2)
            goto L22
        L12:
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.downFrom(r1)
            if (r4 != r1) goto L22
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r1 = r0.f12679
            r1.remove(r2)
            java.lang.Runnable r1 = r0.f12678
            r1.run()
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m16164(@Yue.InterfaceC4410 android.view.Menu r3, @Yue.InterfaceC4410 android.view.MenuInflater r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r2.f12679
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۡ۠ۧ r1 = (Yue.InterfaceC4143) r1
            r1.mo16247(r3, r4)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m16165(@Yue.InterfaceC4410 android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r2.f12679
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۡ۠ۧ r1 = (Yue.InterfaceC4143) r1
            r1.mo16246(r3)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m16166(@Yue.InterfaceC4410 android.view.MenuItem r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r2.f12679
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            Yue.ۥۡ۠ۧ r1 = (Yue.InterfaceC4143) r1
            boolean r1 = r1.mo16245(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m16167(@Yue.InterfaceC4410 android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r2.f12679
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۡ۠ۧ r1 = (Yue.InterfaceC4143) r1
            r1.mo16248(r3)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m16168(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۡ۠ۧ> r0 = r1.f12679
            r0.remove(r2)
            java.util.Map<Yue.ۥۡ۠ۧ, Yue.ۥۡ۠ۦۢ$ۥ> r0 = r1.f12680
            java.lang.Object r2 = r0.remove(r2)
            Yue.ۥۡ۠ۦۢ$ۥ r2 = (Yue.C4123.C4124) r2
            if (r2 == 0) goto L12
            r2.m16169()
        L12:
            java.lang.Runnable r2 = r1.f12678
            r2.run()
            return
    }
}
