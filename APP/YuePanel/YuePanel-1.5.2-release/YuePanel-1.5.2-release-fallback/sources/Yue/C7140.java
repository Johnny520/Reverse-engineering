package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7140 extends Yue.AbstractC6951 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final androidx.fragment.app.Fragment f24682;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f24683;

    public C7140(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r3, @Yue.InterfaceC4418 androidx.fragment.app.Fragment r4, int r5) {
            r2 = this;
            java.lang.String r0 = "fragment"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "expectedParentFragment"
            Yue.C3329.m13906(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to nest fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " within the view of parent fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " via container with ID "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " without using parent's childFragmentManager"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.f24682 = r4
            r2.f24683 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m27472() {
            r1 = this;
            int r0 = r1.f24683
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment m27473() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f24682
            return r0
    }
}
