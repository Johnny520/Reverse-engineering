package p108ha;

import android.os.Handler;
import ke.C2399h;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p064ea.C0851c;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: ha.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1639e0 extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0851c f5375e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_upload_tail";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_upload_tail", "朋友圈上传尾巴", "给发布的朋友圈附带 SDK ID 和 SDK 名称", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f5375e = new C0851c(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1639e0.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 22), (byte) 0);
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0041a(this, 27), "moments_upload_tail", "朋友圈上传尾巴", EnumC3738c.WARMUP);
        m7752i(C1085e.class, new C2399h(this, 13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈上传尾巴";
    }
}
