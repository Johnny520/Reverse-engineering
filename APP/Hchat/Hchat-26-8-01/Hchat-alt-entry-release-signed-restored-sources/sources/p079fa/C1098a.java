package p079fa;

import android.os.Handler;
import java.util.HashSet;
import p010aa.C0039g;
import p011ab.C0041a;
import p011ab.C0042b;
import p064ea.C0851c;
import p068eh.AbstractC0921a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: fa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1098a extends AbstractC3736a {

    /* JADX INFO: renamed from: f */
    public static final HashSet f3537f = new HashSet();

    /* JADX INFO: renamed from: e */
    public C0851c f3538e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "skip_global_mini_program_splash_ads";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("skip_global_mini_program_splash_ads", "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f3538e = new C0851c(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1098a.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 12), false);
        Handler handler = C3740e.f12138a;
        C3740e.m7758e(-100, new C0041a(this, 20), "skip_global_mini_program_splash_ads", "跳过全局小程序开屏广告", EnumC3738c.BRIDGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "跳过全局小程序开屏广告";
    }
}
