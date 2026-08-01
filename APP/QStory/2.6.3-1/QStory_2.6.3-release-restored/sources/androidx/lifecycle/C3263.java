package androidx.lifecycle;

import kotlin.C6008;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3263 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C6276 f7425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C6212 f7427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f7428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f7429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f7430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Lifecycle$Event f7431;

    public C3263(Lifecycle$Event lifecycle$Event, Ref$ObjectRef ref$ObjectRef, InterfaceC6233 interfaceC6233, Lifecycle$Event lifecycle$Event2, C6276 c6276, C6212 c6212, InterfaceC7383 interfaceC7383) {
        this.f7431 = lifecycle$Event;
        this.f7429 = ref$ObjectRef;
        this.f7430 = interfaceC6233;
        this.f7426 = lifecycle$Event2;
        this.f7425 = c6276;
        this.f7427 = c6212;
        this.f7428 = interfaceC7383;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = this.f7431;
        Ref$ObjectRef ref$ObjectRef = this.f7429;
        if (lifecycle$Event == lifecycle$Event2) {
            ref$ObjectRef.element = AbstractC6231.m11036(this.f7430, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f7427, this.f7428, null), 3);
            return;
        }
        if (lifecycle$Event == this.f7426) {
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) ref$ObjectRef.element;
            if (interfaceC6284 != null) {
                interfaceC6284.mo10815(null);
            }
            ref$ObjectRef.element = null;
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7425.resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
    }
}
