package p241q7;

import p227p7.AbstractC5969g;
import p227p7.C5968f;
import p227p7.InterfaceC5963a;
import p227p7.InterfaceC5967e;
import p281t6.C8173z;

/* JADX INFO: renamed from: q7.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6306o0 implements InterfaceC5963a {

    /* JADX INFO: renamed from: a */
    public final C6317u f19782a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5967e f19783b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5969g f19784c;

    /* JADX INFO: renamed from: d */
    public final C5968f f19785d;

    public C6306o0(C6317u c6317u, InterfaceC5967e interfaceC5967e) {
        c6317u.getClass();
        interfaceC5967e.getClass();
        this.f19782a = c6317u;
        this.f19783b = interfaceC5967e;
        this.f19784c = interfaceC5967e.mo7362g();
        this.f19785d = interfaceC5967e.mo12264f();
    }

    @Override // p227p7.InterfaceC5963a
    /* JADX INFO: renamed from: b */
    public void mo12260b(C8173z c8173z) {
        c8173z.getClass();
        this.f19783b.mo12260b(c8173z);
    }

    @Override // p227p7.InterfaceC5963a
    /* JADX INFO: renamed from: c */
    public C8173z mo12261c() {
        return this.f19783b.mo12261c();
    }

    @Override // p227p7.InterfaceC5963a
    /* JADX INFO: renamed from: d */
    public boolean mo12262d() {
        return this.f19783b.mo12262d();
    }

    @Override // p227p7.InterfaceC5963a
    /* JADX INFO: renamed from: g */
    public AbstractC5969g mo7362g() {
        return this.f19784c;
    }

    @Override // p227p7.InterfaceC5963a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6317u mo12263e() {
        return this.f19782a;
    }
}
