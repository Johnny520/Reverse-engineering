package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class AbstractC2773 extends Yue.AbstractC4666 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f9063 = "FragmentPagerAdapter";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean f9064 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f9065 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f9066 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f9067;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f9068;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 f9069;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment f9070;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f9071;

    @java.lang.Deprecated
    public AbstractC2773(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractC2773(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9069 = r0
            r1.f9070 = r0
            r1.f9067 = r2
            r1.f9068 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.String m12133(int r2, long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "android:switcher:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo12134(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2, @Yue.InterfaceC4410 java.lang.Object r3) {
            r0 = this;
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r0.f9069
            if (r1 != 0) goto Le
            androidx.fragment.app.FragmentManager r1 = r0.f9067
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r1.m29100()
            r0.f9069 = r1
        Le:
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r0.f9069
            r1.mo29272(r3)
            androidx.fragment.app.Fragment r1 = r0.f9070
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1e
            r1 = 0
            r0.f9070 = r1
        L1e:
            return
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo12135(@Yue.InterfaceC4410 android.view.ViewGroup r3) {
            r2 = this;
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f9069
            if (r3 == 0) goto L19
            boolean r0 = r2.f9071
            if (r0 != 0) goto L16
            r0 = 1
            r1 = 0
            r2.f9071 = r0     // Catch: java.lang.Throwable -> L12
            r3.mo29271()     // Catch: java.lang.Throwable -> L12
            r2.f9071 = r1
            goto L16
        L12:
            r3 = move-exception
            r2.f9071 = r1
            throw r3
        L16:
            r3 = 0
            r2.f9069 = r3
        L19:
            return
    }

    @Override // Yue.AbstractC4666
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.Object mo12136(@Yue.InterfaceC4410 android.view.ViewGroup r5, int r6) {
            r4 = this;
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r4.f9069
            if (r0 != 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r4.f9067
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r0.m29100()
            r4.f9069 = r0
        Lc:
            long r0 = r4.m12143(r6)
            int r2 = r5.getId()
            java.lang.String r2 = m12133(r2, r0)
            androidx.fragment.app.FragmentManager r3 = r4.f9067
            androidx.fragment.app.Fragment r2 = r3.m29147(r2)
            if (r2 == 0) goto L26
            androidx.fragment.app.ۥ۟۟۠۟ r5 = r4.f9069
            r5.m29442(r2)
            goto L3b
        L26:
            androidx.fragment.app.Fragment r2 = r4.m12142(r6)
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r4.f9069
            int r3 = r5.getId()
            int r5 = r5.getId()
            java.lang.String r5 = m12133(r5, r0)
            r6.m29433(r3, r2, r5)
        L3b:
            androidx.fragment.app.Fragment r5 = r4.f9070
            if (r2 == r5) goto L53
            r5 = 0
            r2.setMenuVisibility(r5)
            int r6 = r4.f9068
            r0 = 1
            if (r6 != r0) goto L50
            androidx.fragment.app.ۥ۟۟۠۟ r5 = r4.f9069
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.mo29277(r2, r6)
            goto L53
        L50:
            r2.setUserVisibleHint(r5)
        L53:
            return r2
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean mo12137(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.Object r2) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.View r2 = r2.getView()
            if (r2 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo12138(@Yue.InterfaceC4544 android.os.Parcelable r1, @Yue.InterfaceC4544 java.lang.ClassLoader r2) {
            r0 = this;
            return
    }

    @Override // Yue.AbstractC4666
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public android.os.Parcelable mo12139() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo12140(@Yue.InterfaceC4410 android.view.ViewGroup r3, int r4, @Yue.InterfaceC4410 java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.Fragment r3 = r2.f9070
            if (r5 == r3) goto L4c
            r4 = 1
            if (r3 == 0) goto L2c
            r0 = 0
            r3.setMenuVisibility(r0)
            int r3 = r2.f9068
            if (r3 != r4) goto L27
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f9069
            if (r3 != 0) goto L1d
            androidx.fragment.app.FragmentManager r3 = r2.f9067
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r3.m29100()
            r2.f9069 = r3
        L1d:
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f9069
            androidx.fragment.app.Fragment r0 = r2.f9070
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r3.mo29277(r0, r1)
            goto L2c
        L27:
            androidx.fragment.app.Fragment r3 = r2.f9070
            r3.setUserVisibleHint(r0)
        L2c:
            r5.setMenuVisibility(r4)
            int r3 = r2.f9068
            if (r3 != r4) goto L47
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f9069
            if (r3 != 0) goto L3f
            androidx.fragment.app.FragmentManager r3 = r2.f9067
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r3.m29100()
            r2.f9069 = r3
        L3f:
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f9069
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
            r3.mo29277(r5, r4)
            goto L4a
        L47:
            r5.setUserVisibleHint(r4)
        L4a:
            r2.f9070 = r5
        L4c:
            return
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo12141(@Yue.InterfaceC4410 android.view.ViewGroup r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = -1
            if (r3 == r0) goto L8
            return
        L8:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ViewPager with adapter "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " requires a view id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract androidx.fragment.app.Fragment m12142(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long m12143(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }
}
