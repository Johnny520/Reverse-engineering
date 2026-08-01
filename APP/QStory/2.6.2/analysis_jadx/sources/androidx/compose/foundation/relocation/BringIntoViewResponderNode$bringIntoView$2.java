package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.relocation.AbstractC1925;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, k = 3, mv = {2, 1, 0})
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $boundsProvider;
    final /* synthetic */ InterfaceC1695 $childCoordinates;
    final /* synthetic */ InterfaceC6542 $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0771 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6542 $boundsProvider;
        final /* synthetic */ InterfaceC1695 $childCoordinates;
        int label;
        final /* synthetic */ C0771 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class C07701 extends FunctionReferenceImpl implements InterfaceC6542 {
            final /* synthetic */ InterfaceC6542 $boundsProvider;
            final /* synthetic */ InterfaceC1695 $childCoordinates;
            final /* synthetic */ C0771 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07701(C0771 c0771, InterfaceC1695 interfaceC1695, InterfaceC6542 interfaceC6542) {
                super(0, AbstractC4381.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = c0771;
                this.$childCoordinates = interfaceC1695;
                this.$boundsProvider = interfaceC6542;
            }

            @Override // p052.InterfaceC6542
            public final C7327 invoke() {
                return C0771.m1564(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0771 c0771, InterfaceC1695 interfaceC1695, InterfaceC6542 interfaceC6542, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c0771;
            this.$childCoordinates = interfaceC1695;
            this.$boundsProvider = interfaceC6542;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws kotlinx.coroutines.DispatchException {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6542 $parentRect;
        int label;
        final /* synthetic */ C0771 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0771 c0771, InterfaceC6542 interfaceC6542, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c0771;
            this.$parentRect = interfaceC6542;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.this$0, this.$parentRect, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0771 c0771 = this.this$0;
                InterfaceC6542 interfaceC6542 = this.$parentRect;
                this.label = 1;
                if (AbstractC1925.m3625(c0771, interfaceC6542, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$2(C0771 c0771, InterfaceC1695 interfaceC1695, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422, InterfaceC4356<? super BringIntoViewResponderNode$bringIntoView$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0771;
        this.$childCoordinates = interfaceC1695;
        this.$boundsProvider = interfaceC6542;
        this.$parentRect = interfaceC65422;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, interfaceC4356);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super InterfaceC5451> interfaceC4356) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3);
    }
}
