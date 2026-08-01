package androidx.lifecycle;

import kotlin.C5175;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.sync.C5379;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2430 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C5443 f7079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C5379 f7081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6553 f7082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f7083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5400 f7084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7085;

    public C2430(Lifecycle$Event lifecycle$Event, Ref$ObjectRef ref$ObjectRef, InterfaceC5400 interfaceC5400, Lifecycle$Event lifecycle$Event2, C5443 c5443, C5379 c5379, InterfaceC6553 interfaceC6553) {
        this.f7085 = lifecycle$Event;
        this.f7083 = ref$ObjectRef;
        this.f7084 = interfaceC5400;
        this.f7080 = lifecycle$Event2;
        this.f7079 = c5443;
        this.f7081 = c5379;
        this.f7082 = interfaceC6553;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = this.f7085;
        Ref$ObjectRef ref$ObjectRef = this.f7083;
        if (lifecycle$Event == lifecycle$Event2) {
            ref$ObjectRef.element = AbstractC5398.m10473(this.f7084, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f7081, this.f7082, null), 3);
            return;
        }
        if (lifecycle$Event == this.f7080) {
            InterfaceC5451 interfaceC5451 = (InterfaceC5451) ref$ObjectRef.element;
            if (interfaceC5451 != null) {
                interfaceC5451.mo10252(null);
            }
            ref$ObjectRef.element = null;
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7079.resumeWith(Result.m8755constructorimpl(C5175.f14739));
        }
    }
}
