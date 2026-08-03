package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7139 extends Yue.AbstractC6951 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final android.view.ViewGroup f24681;

    public C7139(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r3, @Yue.InterfaceC4418 android.view.ViewGroup r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "container"
            Yue.C3329.m13906(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to add fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " to container "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " which is not a FragmentContainerView"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.f24681 = r4
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.view.ViewGroup m27471() {
            r1 = this;
            android.view.ViewGroup r0 = r1.f24681
            return r0
    }
}
