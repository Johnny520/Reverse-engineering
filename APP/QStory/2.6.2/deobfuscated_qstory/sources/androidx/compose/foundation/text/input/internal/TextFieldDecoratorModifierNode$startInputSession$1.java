package androidx.compose.foundation.text.input.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.platform.AbstractC1853;
import androidx.compose.ui.platform.InterfaceC1875;
import androidx.compose.ui.text.input.C2028;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p185.AbstractC7768;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {817}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC7768 $receiveContentConfiguration;
    int label;
    final /* synthetic */ AbstractC0856 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {818}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ AbstractC7768 $receiveContentConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC0856 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class C08421 extends AdaptedFunctionReference implements InterfaceC6557 {
            public C08421(Object obj) {
                super(1, obj, AbstractC0856.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
            }

            @Override // p052.InterfaceC6557
            public /* synthetic */ Object invoke(Object obj) {
                m1647invokeKlQnJC8(((C2028) obj).f5977);
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1647invokeKlQnJC8(int i) {
                throw AbstractC0053.m158(this.receiver);
            }
        }

        public AnonymousClass1(AbstractC0856 abstractC0856, AbstractC7768 abstractC7768, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
        }

        private static final C5175 invokeSuspend$lambda$0(AbstractC0856 abstractC0856) {
            throw null;
        }

        private static final C5175 invokeSuspend$lambda$1(AbstractC0856 abstractC0856, boolean z) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC1875 interfaceC1875, InterfaceC4356<?> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC1875, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            throw new KotlinNothingValueException();
        }
    }

    public TextFieldDecoratorModifierNode$startInputSession$1(AbstractC0856 abstractC0856, AbstractC7768 abstractC7768, InterfaceC4356<? super TextFieldDecoratorModifierNode$startInputSession$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(null, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null, null);
            this.label = 1;
            if (AbstractC1853.m3472(null, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4210.m8612();
        return null;
    }
}
