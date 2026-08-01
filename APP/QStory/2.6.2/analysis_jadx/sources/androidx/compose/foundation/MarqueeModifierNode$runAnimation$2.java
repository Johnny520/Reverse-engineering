package androidx.compose.foundation;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5283;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {413}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ AbstractC1090 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "contentWithSpacingWidth", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {427, 429, 433, 433}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC1090 this$0;

        public AnonymousClass2(AbstractC1090 abstractC1090, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, interfaceC4356);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(Float f, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(f, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                if (((Float) this.L$0) == null) {
                    return c5175;
                }
                throw null;
            }
            if (i == 1) {
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i == 2) {
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i == 3) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            if (i != 4) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC5184.m10206(obj);
            throw th;
        }
    }

    public MarqueeModifierNode$runAnimation$2(AbstractC1090 abstractC1090, InterfaceC4356<? super MarqueeModifierNode$runAnimation$2> interfaceC4356) {
        super(2, interfaceC4356);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float invokeSuspend$lambda$0(AbstractC1090 abstractC1090) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MarqueeModifierNode$runAnimation$2(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MarqueeModifierNode$runAnimation$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C5283 c5283M2461 = AbstractC1367.m2461(new C1074(0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, null);
            this.label = 1;
            if (AbstractC5321.m10331(c5283M2461, anonymousClass2, this) == coroutineSingletons) {
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
