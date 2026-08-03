package p108ha;

import android.os.Handler;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: ha.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1652l extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1653m f5438e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_auto_refresh";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_auto_refresh", "朋友圈自动刷新", "按设定间隔获取新的朋友圈内容", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f5438e = new C1653m(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1652l.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 18));
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0041a(this, 25), "moments_auto_refresh:runtime", "朋友圈自动刷新", EnumC3738c.WARMUP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈自动刷新";
    }
}
