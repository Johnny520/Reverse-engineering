package androidx.compose.foundation.text.input.internal;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.platform.AbstractC2688;
import androidx.compose.p001ui.platform.InterfaceC2710;
import androidx.compose.p001ui.text.input.C2862;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p201.AbstractC8598;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m556f = "TextFieldDecoratorModifier.kt", m557l = {817}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC8598 $receiveContentConfiguration;
    int label;
    final /* synthetic */ AbstractC1694 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m556f = "TextFieldDecoratorModifier.kt", m557l = {818}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01051 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ AbstractC8598 $receiveContentConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1694 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
        public static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements InterfaceC7387 {
            public AnonymousClass1(Object obj) {
                super(1, obj, AbstractC1694.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                m2217invokeKlQnJC8(((C2862) obj).f6323);
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m2217invokeKlQnJC8(int i) {
                throw AbstractC0900.m719(this.receiver);
            }
        }

        public C01051(AbstractC1694 abstractC1694, AbstractC8598 abstractC8598, InterfaceC5189<? super C01051> interfaceC5189) {
            super(2, interfaceC5189);
        }

        private static final C6008 invokeSuspend$lambda$0(AbstractC1694 abstractC1694) {
            throw null;
        }

        private static final C6008 invokeSuspend$lambda$1(AbstractC1694 abstractC1694, boolean z) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01051 c01051 = new C01051(null, null, interfaceC5189);
            c01051.L$0 = obj;
            return c01051;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2710 interfaceC2710, InterfaceC5189<?> interfaceC5189) {
            return ((C01051) create(interfaceC2710, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw new KotlinNothingValueException();
        }
    }

    public TextFieldDecoratorModifierNode$startInputSession$1(AbstractC1694 abstractC1694, AbstractC8598 abstractC8598, InterfaceC5189<? super TextFieldDecoratorModifierNode$startInputSession$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(null, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C01051 c01051 = new C01051(null, null, null);
            this.label = 1;
            if (AbstractC2688.m4042(null, c01051, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
