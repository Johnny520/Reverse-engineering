package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class AbstractC7630 extends Yue.AbstractC4666 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f29358 = "FragmentStatePagerAdapt";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean f29359 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f29360 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f29361 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f29362;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f29363;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 f29364;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.Fragment.C7570> f29365;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.Fragment> f29366;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment f29367;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f29368;

    @java.lang.Deprecated
    public AbstractC7630(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AbstractC7630(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f29364 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f29365 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f29366 = r1
            r2.f29367 = r0
            r2.f29362 = r3
            r2.f29363 = r4
            return
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo12134(@Yue.InterfaceC4410 android.view.ViewGroup r3, int r4, @Yue.InterfaceC4410 java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            if (r3 != 0) goto Le
            androidx.fragment.app.FragmentManager r3 = r2.f29362
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r3.m29100()
            r2.f29364 = r3
        Le:
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r3 = r2.f29365
            int r3 = r3.size()
            r0 = 0
            if (r3 > r4) goto L1d
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r3 = r2.f29365
            r3.add(r0)
            goto Le
        L1d:
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r3 = r2.f29365
            boolean r1 = r5.isAdded()
            if (r1 == 0) goto L2c
            androidx.fragment.app.FragmentManager r1 = r2.f29362
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r1 = r1.m29222(r5)
            goto L2d
        L2c:
            r1 = r0
        L2d:
            r3.set(r4, r1)
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r2.f29366
            r3.set(r4, r0)
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            r3.mo29276(r5)
            androidx.fragment.app.Fragment r3 = r2.f29367
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L44
            r2.f29367 = r0
        L44:
            return
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo12135(@Yue.InterfaceC4410 android.view.ViewGroup r3) {
            r2 = this;
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            if (r3 == 0) goto L19
            boolean r0 = r2.f29368
            if (r0 != 0) goto L16
            r0 = 1
            r1 = 0
            r2.f29368 = r0     // Catch: java.lang.Throwable -> L12
            r3.mo29271()     // Catch: java.lang.Throwable -> L12
            r2.f29368 = r1
            goto L16
        L12:
            r3 = move-exception
            r2.f29368 = r1
            throw r3
        L16:
            r3 = 0
            r2.f29364 = r3
        L19:
            return
    }

    @Override // Yue.AbstractC4666
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.Object mo12136(@Yue.InterfaceC4410 android.view.ViewGroup r4, int r5) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29366
            int r0 = r0.size()
            if (r0 <= r5) goto L13
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.f29366
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r3.f29364
            if (r0 != 0) goto L1f
            androidx.fragment.app.FragmentManager r0 = r3.f29362
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r0.m29100()
            r3.f29364 = r0
        L1f:
            androidx.fragment.app.Fragment r0 = r3.m29402(r5)
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r1 = r3.f29365
            int r1 = r1.size()
            if (r1 <= r5) goto L38
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r1 = r3.f29365
            java.lang.Object r1 = r1.get(r5)
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r1 = (androidx.fragment.app.Fragment.C7570) r1
            if (r1 == 0) goto L38
            r0.setInitialSavedState(r1)
        L38:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29366
            int r1 = r1.size()
            if (r1 > r5) goto L47
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29366
            r2 = 0
            r1.add(r2)
            goto L38
        L47:
            r1 = 0
            r0.setMenuVisibility(r1)
            int r2 = r3.f29363
            if (r2 != 0) goto L52
            r0.setUserVisibleHint(r1)
        L52:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.f29366
            r1.set(r5, r0)
            androidx.fragment.app.ۥ۟۟۠۟ r5 = r3.f29364
            int r4 = r4.getId()
            r5.m29432(r4, r0)
            int r4 = r3.f29363
            r5 = 1
            if (r4 != r5) goto L6c
            androidx.fragment.app.ۥ۟۟۠۟ r4 = r3.f29364
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.STARTED
            r4.mo29277(r0, r5)
        L6c:
            return r0
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
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
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo12138(@Yue.InterfaceC4544 android.os.Parcelable r6, @Yue.InterfaceC4544 java.lang.ClassLoader r7) {
            r5 = this;
            if (r6 == 0) goto L86
            android.os.Bundle r6 = (android.os.Bundle) r6
            r6.setClassLoader(r7)
            java.lang.String r7 = "states"
            android.os.Parcelable[] r7 = r6.getParcelableArray(r7)
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r0 = r5.f29365
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r5.f29366
            r0.clear()
            r0 = 0
            if (r7 == 0) goto L2a
            r1 = r0
        L1b:
            int r2 = r7.length
            if (r1 >= r2) goto L2a
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r5.f29365
            r3 = r7[r1]
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r3 = (androidx.fragment.app.Fragment.C7570) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto L1b
        L2a:
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L32:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "f"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L32
            r2 = 1
            java.lang.String r2 = r1.substring(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            androidx.fragment.app.FragmentManager r3 = r5.f29362
            androidx.fragment.app.Fragment r3 = r3.m29158(r6, r1)
            if (r3 == 0) goto L6f
        L57:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.f29366
            int r1 = r1.size()
            if (r1 > r2) goto L66
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.f29366
            r4 = 0
            r1.add(r4)
            goto L57
        L66:
            r3.setMenuVisibility(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.f29366
            r1.set(r2, r3)
            goto L32
        L6f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad fragment at key "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "FragmentStatePagerAdapt"
            android.util.Log.w(r2, r1)
            goto L32
        L86:
            return
    }

    @Override // Yue.AbstractC4666
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public android.os.Parcelable mo12139() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r0 = r5.f29365
            int r0 = r0.size()
            if (r0 <= 0) goto L20
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r1 = r5.f29365
            int r1 = r1.size()
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ[] r1 = new androidx.fragment.app.Fragment.C7570[r1]
            java.util.ArrayList<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r5.f29365
            r2.toArray(r1)
            java.lang.String r2 = "states"
            r0.putParcelableArray(r2, r1)
            goto L21
        L20:
            r0 = 0
        L21:
            r1 = 0
        L22:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.f29366
            int r2 = r2.size()
            if (r1 >= r2) goto L5a
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.f29366
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L57
            boolean r3 = r2.isAdded()
            if (r3 == 0) goto L57
            if (r0 != 0) goto L41
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "f"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            androidx.fragment.app.FragmentManager r4 = r5.f29362
            r4.m29204(r0, r3, r2)
        L57:
            int r1 = r1 + 1
            goto L22
        L5a:
            return r0
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo12140(@Yue.InterfaceC4410 android.view.ViewGroup r3, int r4, @Yue.InterfaceC4410 java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.Fragment r3 = r2.f29367
            if (r5 == r3) goto L4c
            r4 = 1
            if (r3 == 0) goto L2c
            r0 = 0
            r3.setMenuVisibility(r0)
            int r3 = r2.f29363
            if (r3 != r4) goto L27
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            if (r3 != 0) goto L1d
            androidx.fragment.app.FragmentManager r3 = r2.f29362
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r3.m29100()
            r2.f29364 = r3
        L1d:
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            androidx.fragment.app.Fragment r0 = r2.f29367
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r3.mo29277(r0, r1)
            goto L2c
        L27:
            androidx.fragment.app.Fragment r3 = r2.f29367
            r3.setUserVisibleHint(r0)
        L2c:
            r5.setMenuVisibility(r4)
            int r3 = r2.f29363
            if (r3 != r4) goto L47
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            if (r3 != 0) goto L3f
            androidx.fragment.app.FragmentManager r3 = r2.f29362
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r3.m29100()
            r2.f29364 = r3
        L3f:
            androidx.fragment.app.ۥ۟۟۠۟ r3 = r2.f29364
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
            r3.mo29277(r5, r4)
            goto L4a
        L47:
            r5.setUserVisibleHint(r4)
        L4a:
            r2.f29367 = r5
        L4c:
            return
    }

    @Override // Yue.AbstractC4666
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
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
    public abstract androidx.fragment.app.Fragment m29402(int r1);
}
