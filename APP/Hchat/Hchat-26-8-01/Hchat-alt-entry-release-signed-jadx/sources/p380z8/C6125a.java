package p380z8;

import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p274s8.C3944d;
import p307v0.C4361a;
import p365y9.C6006b;

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6125a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C6128d f24688e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "call_media_limit";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("call_media_limit", "移除通话媒体限制", "通话时播放语音和视频，并允许打开拍摄", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f24688e = new C6128d(c3742g, new C6006b(2, this, AbstractC0921a.m2246i(C6125a.class), "logRuntimeError", "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 2));
        C3740e.m7759f(12, new C4361a(this, 11), "call_media_limit", "移除通话媒体限制", null);
        m7752i(C1085e.class, new C3465a(this, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "移除通话媒体限制";
    }
}
