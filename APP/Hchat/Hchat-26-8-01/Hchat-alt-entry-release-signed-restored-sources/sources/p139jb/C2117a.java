package p139jb;

import ke.C2399h;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: jb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2117a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C2121e f7070e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "finder_media_download";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: b */
    public final boolean mo4940b(C3742g c3742g) {
        c3742g.getClass();
        return AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_finder_media_download").getBoolean("enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("finder_media_download", "视频号媒体下载", "在视频号分享菜单增加复制链接和下载入口", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f7070e = new C2121e(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C2117a.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 6));
        C3740e.m7759f(12, new C1746e0(this, 4), "finder_media_download", "视频号媒体下载", null);
        m7752i(C1085e.class, new C2399h(this, 21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "视频号媒体下载";
    }
}
