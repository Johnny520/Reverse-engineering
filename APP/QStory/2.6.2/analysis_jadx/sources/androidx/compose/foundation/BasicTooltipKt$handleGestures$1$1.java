package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {195}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1071 $state;
    final /* synthetic */ InterfaceC1635 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {199, Opcodes.REM_FLOAT_2ADDR, Opcodes.ADD_INT_LIT16}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5400 $$this$coroutineScope;
        final /* synthetic */ InterfaceC1071 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6861(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {Opcodes.MUL_DOUBLE_2ADDR}, m = "invokeSuspend", v = 1)
        public static final class C04471 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC1071 $state;
            int label;

            public C04471(InterfaceC1071 interfaceC1071, InterfaceC4356<? super C04471> interfaceC4356) {
                super(2, interfaceC4356);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new C04471(null, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((C04471) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC5184.m10206(obj);
                    return C5175.f14739;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5400 interfaceC5400, InterfaceC1071 interfaceC1071, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$$this$coroutineScope = interfaceC5400;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, null, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (r9 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 2
                r3 = 3
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L27
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L15
                kotlin.AbstractC5184.m10206(r9)
                goto L82
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r8)
                return r4
            L1b:
                java.lang.Object r1 = r8.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r2 = r8.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r2 = (androidx.compose.ui.input.pointer.InterfaceC1633) r2
                kotlin.AbstractC5184.m10206(r9)
                goto L63
            L27:
                java.lang.Object r1 = r8.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r6 = r8.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r6 = (androidx.compose.ui.input.pointer.InterfaceC1633) r6
                kotlin.AbstractC5184.m10206(r9)
                goto L4c
            L33:
                kotlin.AbstractC5184.m10206(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r9 = (androidx.compose.ui.input.pointer.InterfaceC1633) r9
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r8.L$0 = r9
                r8.L$1 = r1
                r8.label = r5
                java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1265(r9, r1, r8, r5)
                if (r6 != r0) goto L49
                goto L81
            L49:
                r7 = r6
                r6 = r9
                r9 = r7
            L4c:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.ui.input.pointer.C1643) r9
                int r9 = r9.f4818
                if (r9 != r5) goto L53
                goto L55
            L53:
                if (r9 != r3) goto L99
            L55:
                r8.L$0 = r6
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0503.m1271(r6, r1, r8)
                if (r9 != r0) goto L62
                goto L81
            L62:
                r2 = r6
            L63:
                androidx.compose.foundation.gestures.飘花落叶言子苏世兰哲楪 r9 = (androidx.compose.foundation.gestures.AbstractC0542) r9
                boolean r9 = r9 instanceof androidx.compose.foundation.gestures.C0543
                if (r9 == 0) goto L99
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r9 = r8.$$this$coroutineScope
                androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r5 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                r5.<init>(r4, r4)
                kotlinx.coroutines.AbstractC5398.m10473(r9, r4, r4, r5, r3)
                r8.L$0 = r4
                r8.L$1 = r4
                r8.label = r3
                androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r2 = (androidx.compose.ui.input.pointer.C1621) r2
                java.lang.Object r9 = r2.m2989(r1, r8)
                if (r9 != r0) goto L82
            L81:
                return r0
            L82:
                androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
                java.util.List r8 = r9.f4851
                int r9 = r8.size()
                r0 = 0
            L8b:
                if (r0 >= r9) goto L99
                java.lang.Object r1 = r8.get(r0)
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1
                r1.m3014()
                int r0 = r0 + 1
                goto L8b
            L99:
                kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(InterfaceC1635 interfaceC1635, InterfaceC1071 interfaceC1071, InterfaceC4356<? super BasicTooltipKt$handleGestures$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_pointerInput = interfaceC1635;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.$this_pointerInput, null, interfaceC4356);
        basicTooltipKt$handleGestures$1$1.L$0 = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BasicTooltipKt$handleGestures$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            InterfaceC1635 interfaceC1635 = this.$this_pointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5400, null, null);
            this.label = 1;
            if (AbstractC0521.m1301(interfaceC1635, anonymousClass1, this) == coroutineSingletons) {
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
