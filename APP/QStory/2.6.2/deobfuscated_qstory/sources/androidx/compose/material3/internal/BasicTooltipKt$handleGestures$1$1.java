package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.material3.InterfaceC1165;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.InterfaceC5296;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {Opcodes.ADD_DOUBLE_2ADDR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1165 $state;
    final /* synthetic */ InterfaceC1635 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(InterfaceC1635 interfaceC1635, InterfaceC1165 interfaceC1165, InterfaceC4356<? super BasicTooltipKt$handleGestures$1$1> interfaceC4356) {
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

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {Opcodes.MUL_INT_LIT16, Opcodes.ADD_INT_LIT8, 238}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5400 $$this$coroutineScope;
        final /* synthetic */ InterfaceC1165 $state;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {Opcodes.RSUB_INT_LIT8}, m = "invokeSuspend")
        public static final class C11141 extends RestrictedSuspendLambda implements InterfaceC6553 {
            final /* synthetic */ PointerEventPass $pass;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11141(PointerEventPass pointerEventPass, InterfaceC4356<? super C11141> interfaceC4356) {
                super(2, interfaceC4356);
                this.$pass = pointerEventPass;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                C11141 c11141 = new C11141(this.$pass, interfaceC4356);
                c11141.L$0 = obj;
                return c11141;
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C1643> interfaceC4356) {
                return ((C11141) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC5184.m10206(obj);
                        return obj;
                    }
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
                PointerEventPass pointerEventPass = this.$pass;
                this.label = 1;
                Object objM1269 = AbstractC0503.m1269(interfaceC1633, pointerEventPass, this);
                return objM1269 == coroutineSingletons ? coroutineSingletons : objM1269;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5400 interfaceC5400, InterfaceC1165 interfaceC1165, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:45:0x00cf, B:47:0x00d3), top: B:59:0x0014 }] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v17, types: [kotlinx.coroutines.flow.飘花落叶言子哲苏兰楪世] */
        /* JADX WARN: Type inference failed for: r13v18 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlinx.coroutines.flow.飘花落叶言子哲苏兰楪世] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {Opcodes.SHL_INT_LIT8, 227, 227}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC5296 $isLongPressedFlow;
            final /* synthetic */ InterfaceC1165 $state;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(InterfaceC5296 interfaceC5296, InterfaceC1165 interfaceC1165, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
                super(2, interfaceC4356);
                this.$isLongPressedFlow = interfaceC5296;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                return new AnonymousClass3(this.$isLongPressedFlow, null, interfaceC4356);
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    ((C5266) this.$isLongPressedFlow).m10309(Boolean.TRUE);
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC5184.m10206(obj);
                    throw null;
                }
                if (i == 2) {
                    AbstractC5184.m10206(obj);
                    return C5175.f14739;
                }
                if (i != 3) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) this.L$0;
                AbstractC5184.m10206(obj);
                throw th;
            }

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLongPressed", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
            @InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
            public static final class C11151 extends SuspendLambda implements InterfaceC6553 {
                final /* synthetic */ InterfaceC1165 $state;
                /* synthetic */ boolean Z$0;
                int label;

                public C11151(InterfaceC1165 interfaceC1165, InterfaceC4356<? super C11151> interfaceC4356) {
                    super(2, interfaceC4356);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                    C11151 c11151 = new C11151(null, interfaceC4356);
                    c11151.Z$0 = ((Boolean) obj).booleanValue();
                    return c11151;
                }

                public final Object invoke(boolean z, InterfaceC4356<? super C5175> interfaceC4356) {
                    return ((C11151) create(Boolean.valueOf(z), interfaceC4356)).invokeSuspend(C5175.f14739);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                    if (this.Z$0) {
                        return C5175.f14739;
                    }
                    throw null;
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC4356<? super C5175>) obj2);
                }
            }
        }
    }
}
