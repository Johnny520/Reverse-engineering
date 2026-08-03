package p184m9;

import android.os.Handler;
import ke.C2399h;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: m9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2816a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C2820e f9086e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "game_emoji_result";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("game_emoji_result", "指定骰子猜拳", "固定骰子点数和猜拳结果，或在发送时选择", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f9086e = new C2820e(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C2816a.class), "logRuntimeError", "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 11));
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C1746e0(this, 7), "game_emoji_result", "指定骰子猜拳", EnumC3738c.WARMUP);
        m7752i(C1085e.class, new C2399h(this, 23));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "指定骰子猜拳";
    }
}
