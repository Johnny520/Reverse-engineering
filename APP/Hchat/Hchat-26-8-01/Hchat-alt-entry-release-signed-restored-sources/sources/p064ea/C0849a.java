package p064ea;

import android.os.Handler;
import p003a2.C0014a;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0849a extends AbstractC3736a {

    /* JADX INFO: renamed from: f */
    public static final C0014a f2597f = new C0014a(8);

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2598g;

    /* JADX INFO: renamed from: e */
    public C0851c f2599e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "fake_mini_program_base_lib";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("fake_mini_program_base_lib", "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f2599e = new C0851c(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0849a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 10));
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0041a(this, 14), "fake_mini_program_base_lib", "兼容低版本小程序", EnumC3738c.BRIDGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "兼容低版本小程序";
    }
}
