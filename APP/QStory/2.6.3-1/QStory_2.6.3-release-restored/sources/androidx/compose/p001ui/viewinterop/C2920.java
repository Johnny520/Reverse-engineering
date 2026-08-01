package androidx.compose.p001ui.viewinterop;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.relocation.AbstractC2760;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2920 extends AbstractC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f6532;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f6533 = new InterfaceC7387() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", m556f = "AndroidViewHolder.android.kt", m557l = {764}, m558m = "invokeSuspend", m559v = 1)
        public static final class C02221 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C8157 $rect;
            int label;
            final /* synthetic */ C2920 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02221(C2920 c2920, C8157 c8157, InterfaceC5189<? super C02221> interfaceC5189) {
                super(2, interfaceC5189);
                this.this$0 = c2920;
                this.$rect = c8157;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new C02221(this.this$0, this.$rect, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((C02221) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    C2920 c2920 = this.this$0;
                    final C8157 c8157 = this.$rect;
                    InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // p068.InterfaceC7372
                        public final C8157 invoke() {
                            return c8157;
                        }
                    };
                    this.label = 1;
                    if (AbstractC2760.m4195(c2920, interfaceC7372, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                return C6008.f15084;
            }
        }

        {
            super(1);
        }

        public final void invoke(C8157 c8157) {
            C2920 c2920 = this.this$0;
            if (c2920.f6624) {
                AbstractC6231.m11036(c2920.m4427(), null, null, new C02221(this.this$0, c8157, null), 3);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C8157) obj);
            return C6008.f15084;
        }
    };

    public C2920(InterfaceC7387 interfaceC7387) {
        this.f6532 = interfaceC7387;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f6532.invoke(null);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        this.f6532.invoke(this.f6533);
    }
}
