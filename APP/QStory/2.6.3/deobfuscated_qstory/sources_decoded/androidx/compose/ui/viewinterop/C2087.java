package androidx.compose.ui.viewinterop;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.relocation.AbstractC1925;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2087 extends AbstractC2128 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f6187;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f6188 = new InterfaceC6558() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C7328 $rect;
            int label;
            final /* synthetic */ C2087 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2087 c2087, C7328 c7328, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
                super(2, interfaceC4357);
                this.this$0 = c2087;
                this.$rect = c7328;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass1(this.this$0, this.$rect, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    C2087 c2087 = this.this$0;
                    final C7328 c7328 = this.$rect;
                    InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // p052.InterfaceC6543
                        public final C7328 invoke() {
                            return c7328;
                        }
                    };
                    this.label = 1;
                    if (AbstractC1925.m3635(c2087, interfaceC6543, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5185.m10210(obj);
                }
                return C5176.f14739;
            }
        }

        {
            super(1);
        }

        public final void invoke(C7328 c7328) {
            C2087 c2087 = this.this$0;
            if (c2087.f6279) {
                AbstractC5399.m10477(c2087.m3867(), null, null, new AnonymousClass1(this.this$0, c7328, null), 3);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C7328) obj);
            return C5176.f14739;
        }
    };

    public C2087(InterfaceC6558 interfaceC6558) {
        this.f6187 = interfaceC6558;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        this.f6187.invoke(null);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        this.f6187.invoke(this.f6188);
    }
}
