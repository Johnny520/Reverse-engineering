package p047I0;

import p095T.AbstractC1391v;
import p117X2.C1663h;

/* JADX INFO: renamed from: I0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0748m1 implements InterfaceC0664C0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1391v f2332a;

    public C0748m1(AbstractC1391v abstractC1391v) {
        this.f2332a = abstractC1391v;
    }

    /* JADX INFO: renamed from: a */
    public final C1663h m1265a() {
        return new C1663h(1, this.f2332a, AbstractC1391v.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0664C0) && (obj instanceof C0748m1)) {
            return m1265a().equals(((C0748m1) obj).m1265a());
        }
        return false;
    }

    public final int hashCode() {
        return m1265a().hashCode();
    }
}
