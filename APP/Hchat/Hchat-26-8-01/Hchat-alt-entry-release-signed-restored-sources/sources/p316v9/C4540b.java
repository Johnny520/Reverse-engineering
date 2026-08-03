package p316v9;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import p000a.AbstractC0000a;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p274s8.C3944d;
import p304uf.C4330d;

/* JADX INFO: renamed from: v9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4540b extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public static final C4330d f14983e = new C4330d(2);

    /* JADX INFO: renamed from: f */
    public static final List f14984f = AbstractC0000a.m101y0("null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse", "onReceiveUpgradePatch. try to start apply", "verify patch signature failed, tinker.");

    /* JADX INFO: renamed from: g */
    public static final List f14985g = AbstractC0000a.m101y0("before commandNewApkMd5HardCode, response.newApkMd5 = ", ", response.fileMd5 = ");

    /* JADX INFO: renamed from: h */
    public static final HashSet f14986h = new HashSet();

    /* JADX INFO: renamed from: i */
    public static final HashSet f14987i = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "disable_hot_update";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("disable_hot_update", "屏蔽热更新", "阻止微信加载和应用热更新补丁", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        Context context = c3742g.f12143a;
        if (C4330d.m8741C(context)) {
            ClassLoader classLoader = c3742g.f12145c;
            f14983e.m8777z(c3742g.f12146d, classLoader, context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "屏蔽热更新";
    }
}
