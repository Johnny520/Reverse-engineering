package p107h9;

import android.os.Handler;
import ke.C2399h;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: h9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1626a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1627b f5326e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "fake_location";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("fake_location", "虚拟定位", "将微信获取到的位置固定为预设经纬度", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f5326e = new C1627b(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1626a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 14));
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0041a(this, 24), "fake_location", "虚拟定位", EnumC3738c.BRIDGE);
        m7752i(C1085e.class, new C2399h(this, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "虚拟定位";
    }
}
