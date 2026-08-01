package androidx.lifecycle;

import kotlin.C5176;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.sync.C5380;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2430 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C5444 f7080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C5380 f7082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6554 f7083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f7084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f7085;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7086;

    public C2430(Lifecycle$Event lifecycle$Event, Ref$ObjectRef ref$ObjectRef, InterfaceC5401 interfaceC5401, Lifecycle$Event lifecycle$Event2, C5444 c5444, C5380 c5380, InterfaceC6554 interfaceC6554) {
        this.f7086 = lifecycle$Event;
        this.f7084 = ref$ObjectRef;
        this.f7085 = interfaceC5401;
        this.f7081 = lifecycle$Event2;
        this.f7080 = c5444;
        this.f7082 = c5380;
        this.f7083 = interfaceC6554;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = this.f7086;
        Ref$ObjectRef ref$ObjectRef = this.f7084;
        if (lifecycle$Event == lifecycle$Event2) {
            ref$ObjectRef.element = AbstractC5399.m10477(this.f7085, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f7082, this.f7083, null), 3);
            return;
        }
        if (lifecycle$Event == this.f7081) {
            InterfaceC5452 interfaceC5452 = (InterfaceC5452) ref$ObjectRef.element;
            if (interfaceC5452 != null) {
                interfaceC5452.mo10256(null);
            }
            ref$ObjectRef.element = null;
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7080.resumeWith(Result.m8745constructorimpl(C5176.f14739));
        }
    }
}
