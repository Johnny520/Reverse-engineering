package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7619 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.C7619.C7620> f29307;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.fragment.app.FragmentManager f29308;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥۣ۟۟۟$ۥ, reason: contains not printable characters */
    public static final class C7620 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final androidx.fragment.app.FragmentManager.AbstractC7586 f29309;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f29310;

        public C7620(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.AbstractC7586 r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f29309 = r1
                r0.f29310 = r2
                return
        }
    }

    public C7619(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f29307 = r0
            r1.f29308 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m29344(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4544 android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29344(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29247(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m29345(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5, boolean r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.f29308
            Yue.ۥ۠ۢۨ r0 = r0.m29163()
            android.content.Context r0 = r0.m12114()
            androidx.fragment.app.FragmentManager r1 = r4.f29308
            androidx.fragment.app.Fragment r1 = r1.m29166()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r1.m29165()
            r2 = 1
            r1.m29345(r5, r2)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r1 = r4.f29307
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r2 = (androidx.fragment.app.C7619.C7620) r2
            if (r6 == 0) goto L36
            boolean r3 = r2.f29310
            if (r3 == 0) goto L24
        L36:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r2 = r2.f29309
            androidx.fragment.app.FragmentManager r3 = r4.f29308
            r2.m29248(r3, r5, r0)
            goto L24
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29346(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4544 android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29346(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29249(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29347(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29347(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29250(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29348(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29348(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29251(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29349(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29349(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29252(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29350(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r5, boolean r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.f29308
            Yue.ۥ۠ۢۨ r0 = r0.m29163()
            android.content.Context r0 = r0.m12114()
            androidx.fragment.app.FragmentManager r1 = r4.f29308
            androidx.fragment.app.Fragment r1 = r1.m29166()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r1 = r1.m29165()
            r2 = 1
            r1.m29350(r5, r2)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r1 = r4.f29307
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r2 = (androidx.fragment.app.C7619.C7620) r2
            if (r6 == 0) goto L36
            boolean r3 = r2.f29310
            if (r3 == 0) goto L24
        L36:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r2 = r2.f29309
            androidx.fragment.app.FragmentManager r3 = r4.f29308
            r2.m29253(r3, r5, r0)
            goto L24
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29351(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4544 android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29351(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29254(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29352(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29352(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29255(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29353(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4410 android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29353(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29256(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29354(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29354(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29257(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29355(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29355(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29258(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29356(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4410 android.view.View r5, @Yue.InterfaceC4544 android.os.Bundle r6, boolean r7) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29356(r4, r5, r6, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r7 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.mo29259(r2, r4, r5, r6)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29357(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29308
            androidx.fragment.app.Fragment r0 = r0.m29166()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.ۥۣ۟۟۟ r0 = r0.m29165()
            r1 = 1
            r0.m29357(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r3.f29307
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = (androidx.fragment.app.C7619.C7620) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.f29310
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r1 = r1.f29309
            androidx.fragment.app.FragmentManager r2 = r3.f29308
            r1.m29260(r2, r4)
            goto L1a
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29358(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.AbstractC7586 r3, boolean r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r2.f29307
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r1 = new androidx.fragment.app.ۥۣ۟۟۟$ۥ
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29359(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager.AbstractC7586 r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r0 = r4.f29307
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r1 = r4.f29307     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            r2 = 0
        La:
            if (r2 >= r1) goto L23
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r3 = r4.f29307     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1e
            androidx.fragment.app.ۥۣ۟۟۟$ۥ r3 = (androidx.fragment.app.C7619.C7620) r3     // Catch: java.lang.Throwable -> L1e
            androidx.fragment.app.FragmentManager$ۥ۟۟۟ۧ r3 = r3.f29309     // Catch: java.lang.Throwable -> L1e
            if (r3 != r5) goto L20
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.ۥۣ۟۟۟$ۥ> r5 = r4.f29307     // Catch: java.lang.Throwable -> L1e
            r5.remove(r2)     // Catch: java.lang.Throwable -> L1e
            goto L23
        L1e:
            r5 = move-exception
            goto L25
        L20:
            int r2 = r2 + 1
            goto La
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r5
    }
}
