package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6951 extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final androidx.fragment.app.Fragment f24205;

    public AbstractC6951(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4543 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "fragment"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r3)
            r1.f24205 = r2
            return
    }

    public /* synthetic */ AbstractC6951(androidx.fragment.app.Fragment r1, java.lang.String r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.fragment.app.Fragment m26868() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.f24205
            return r0
    }
}
