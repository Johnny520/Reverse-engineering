package p185mb;

import android.content.Context;
import java.util.HashSet;
import p108ha.C1651k0;
import p219oh.AbstractC3165h;
import p258r8.AbstractC3736a;
import p258r8.C3742g;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2822a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public static final HashSet f9113e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final HashSet f9114f = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "wechat_tablet";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("wechat_tablet", "平板模式", "伪装平板登录微信", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        Context context = c3742g.f12143a;
        if (AbstractC3165h.m6754F(context)) {
            AbstractC3165h.m6752D(c3742g.f12146d, c3742g.f12145c, context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "平板模式";
    }
}
