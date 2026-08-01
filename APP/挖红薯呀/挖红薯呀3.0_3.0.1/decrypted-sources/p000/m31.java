package p000;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m31 {

    /* JADX INFO: renamed from: a */
    public static final float f3801a = ViewConfiguration.getScrollFriction();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0478ml m2429a(InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
        boolean zM3098c = c0616pi.m3098c(interfaceC0968ym.mo48b());
        Object objM3080L = c0616pi.m3080L();
        if (zM3098c || objM3080L == C0320ii.f2572a) {
            objM3080L = new C0478ml(new C0910x1(interfaceC0968ym));
            c0616pi.m3107g0(objM3080L);
        }
        return (C0478ml) objM3080L;
    }
}
