package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {296}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class LazyLayoutPagerKt$dragDirectionDetector$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC0768 $state;
    final /* synthetic */ InterfaceC1635 $this_pointerInput;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ AbstractC0768 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass1(AbstractC0768 abstractC0768, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        
            if (r12 == r0) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L6c
                if (r1 == r4) goto L64
                r4 = 2
                if (r1 != r4) goto L5e
                java.lang.Object r1 = r11.L$2
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1
                java.lang.Object r5 = r11.L$1
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.ui.input.pointer.C1643) r5
                java.lang.Object r6 = r11.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r6 = (androidx.compose.ui.input.pointer.InterfaceC1633) r6
                kotlin.AbstractC5185.m10210(r12)
            L1d:
                androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r12 = (androidx.compose.ui.input.pointer.C1652) r12
                java.util.List r7 = r12.f4852
                int r8 = r7.size()
                r9 = r3
            L26:
                if (r9 >= r8) goto L38
                java.lang.Object r10 = r7.get(r9)
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r10 = (androidx.compose.ui.input.pointer.C1643) r10
                boolean r10 = androidx.compose.ui.input.pointer.AbstractC1646.m3028(r10)
                if (r10 != 0) goto L35
                goto L41
            L35:
                int r9 = r9 + 1
                goto L26
            L38:
                java.util.List r12 = r12.f4852
                java.lang.Object r12 = r12.get(r3)
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r12 = (androidx.compose.ui.input.pointer.C1643) r12
                r1 = r12
            L41:
                if (r1 != 0) goto L56
                androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r11.L$0 = r6
                r11.L$1 = r5
                r11.L$2 = r1
                r11.label = r4
                androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r6 = (androidx.compose.ui.input.pointer.C1621) r6
                java.lang.Object r12 = r6.m2999(r12, r11)
                if (r12 != r0) goto L1d
                goto L7f
            L56:
                long r11 = r1.f4807
                long r0 = r5.f4807
                p112.C7329.m12526(r11, r0)
                throw r2
            L5e:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r11)
                return r2
            L64:
                java.lang.Object r11 = r11.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r11 = (androidx.compose.ui.input.pointer.InterfaceC1633) r11
                kotlin.AbstractC5185.m10210(r12)
                goto L80
            L6c:
                kotlin.AbstractC5185.m10210(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r12 = (androidx.compose.ui.input.pointer.InterfaceC1633) r12
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r11.L$0 = r12
                r11.label = r4
                java.lang.Object r12 = androidx.compose.foundation.gestures.AbstractC0503.m1276(r12, r3, r1, r11)
                if (r12 != r0) goto L80
            L7f:
                return r0
            L80:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r12 = (androidx.compose.ui.input.pointer.C1643) r12
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1(InterfaceC1635 interfaceC1635, AbstractC0768 abstractC0768, InterfaceC4357<? super LazyLayoutPagerKt$dragDirectionDetector$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_pointerInput = interfaceC1635;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new LazyLayoutPagerKt$dragDirectionDetector$1$1(this.$this_pointerInput, null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC1635 interfaceC1635 = this.$this_pointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null);
            this.label = 1;
            if (AbstractC0521.m1311(interfaceC1635, anonymousClass1, this) == coroutineSingletons) {
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
