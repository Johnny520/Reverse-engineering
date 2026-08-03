package p357y1;

import gg.C1414j;
import gg.InterfaceC1412h;
import p117i0.AbstractC1863o;

/* JADX INFO: renamed from: y1.y2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5957y2 implements InterfaceC5948w1, InterfaceC1412h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1863o f24194a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5957y2(AbstractC1863o abstractC1863o) {
        this.f24194a = abstractC1863o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1412h
    /* JADX INFO: renamed from: a */
    public final C1414j mo3822a() {
        return new C1414j(1, this.f24194a, AbstractC1863o.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC5948w1) && (obj instanceof InterfaceC1412h)) {
            return mo3822a().equals(((InterfaceC1412h) obj).mo3822a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return mo3822a().hashCode();
    }
}
