package androidx.compose.ui.viewinterop;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.relocation.AbstractC1925;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2087 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f6186;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f6187 = new InterfaceC6557() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6861(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ C7327 $rect;
            int label;
            final /* synthetic */ C2087 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2087 c2087, C7327 c7327, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
                super(2, interfaceC4356);
                this.this$0 = c2087;
                this.$rect = c7327;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new AnonymousClass1(this.this$0, this.$rect, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    C2087 c2087 = this.this$0;
                    final C7327 c7327 = this.$rect;
                    InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // p052.InterfaceC6542
                        public final C7327 invoke() {
                            return c7327;
                        }
                    };
                    this.label = 1;
                    if (AbstractC1925.m3625(c2087, interfaceC6542, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                return C5175.f14739;
            }
        }

        {
            super(1);
        }

        public final void invoke(C7327 c7327) {
            C2087 c2087 = this.this$0;
            if (c2087.f6278) {
                AbstractC5398.m10473(c2087.m3857(), null, null, new AnonymousClass1(this.this$0, c7327, null), 3);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C7327) obj);
            return C5175.f14739;
        }
    };

    public C2087(InterfaceC6557 interfaceC6557) {
        this.f6186 = interfaceC6557;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        this.f6186.invoke(null);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        this.f6186.invoke(this.f6187);
    }
}
