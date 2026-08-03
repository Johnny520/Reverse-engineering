package p051db;

import be.AbstractC0283h;
import p010aa.C0039g;
import p011ab.C0042b;
import p037cb.C0545f;
import p068eh.AbstractC0921a;
import p258r8.AbstractC3736a;
import p258r8.C3742g;

/* JADX INFO: renamed from: db.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0764b extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "scheduled_task";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("scheduled_task", "定时任务", "按计划时间发送聊天消息或发布朋友圈", "enhance"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C0545f c0545f = new C0545f(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0764b.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 9));
        AbstractC0283h.f824a = c0545f;
        if (c0545f.f1720c) {
            return;
        }
        c0545f.f1720c = true;
        c0545f.m1554r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "定时任务";
    }
}
