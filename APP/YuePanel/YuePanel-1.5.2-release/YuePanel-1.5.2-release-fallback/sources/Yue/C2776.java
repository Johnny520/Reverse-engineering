package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2776 extends Yue.AbstractC6951 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f9072;

    public C2776(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r3, @Yue.InterfaceC4418 java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "previousFragmentId"
            Yue.C3329.m13906(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to reuse fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " with previous ID "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.f9072 = r4
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m12149() {
            r1 = this;
            java.lang.String r0 = r1.f9072
            return r0
    }
}
