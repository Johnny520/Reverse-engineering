package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5683 extends Yue.AbstractC6110 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final androidx.fragment.app.Fragment f20881;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f20882;

    public C5683(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r3, @Yue.InterfaceC4418 androidx.fragment.app.Fragment r4, int r5) {
            r2 = this;
            java.lang.String r0 = "fragment"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "targetFragment"
            Yue.C3329.m13906(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to set target fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " with request code "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " for fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.f20881 = r4
            r2.f20882 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m21244() {
            r1 = this;
            int r0 = r1.f20882
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment m21245() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f20881
            return r0
    }
}
