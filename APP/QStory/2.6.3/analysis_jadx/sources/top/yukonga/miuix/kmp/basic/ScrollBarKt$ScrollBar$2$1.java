package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1", f = "ScrollBar.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5401 $coroutineScope;
    final /* synthetic */ InterfaceC1395 $hideJob$delegate;
    final /* synthetic */ boolean $isHighlighted;
    final /* synthetic */ InterfaceC1397 $opacity$delegate;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1$1", f = "ScrollBar.kt", l = {288, 289}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1397 $opacity$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1397 interfaceC1397, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$opacity$delegate = interfaceC1397;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5176 invokeSuspend$lambda$0(InterfaceC1397 interfaceC1397, float f, float f2) {
            ((AbstractC1349) interfaceC1397).m2435(f);
            return C5176.f14739;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$opacity$delegate, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (androidx.compose.animation.core.AbstractC0330.m1024(1.0f, 0.0f, r6, r7, r10, 4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                kotlin.AbstractC5185.m10210(r11)
                goto L46
            L11:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r10)
                return r2
            L17:
                kotlin.AbstractC5185.m10210(r11)
                goto L29
            L1b:
                kotlin.AbstractC5185.m10210(r11)
                r10.label = r4
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10499(r4, r10)
                if (r11 != r0) goto L29
                goto L45
            L29:
                r11 = 500(0x1f4, float:7.0E-43)
                r1 = 6
                androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r6 = androidx.compose.animation.core.AbstractC0330.m1013(r11, r1, r2)
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r10.$opacity$delegate
                top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲 r7 = new top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲
                r1 = 0
                r7.<init>(r11, r1)
                r10.label = r3
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 0
                r9 = 4
                r8 = r10
                java.lang.Object r10 = androidx.compose.animation.core.AbstractC0330.m1024(r4, r5, r6, r7, r8, r9)
                if (r10 != r0) goto L46
            L45:
                return r0
            L46:
                kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$2$1(boolean z, InterfaceC5401 interfaceC5401, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC4357<? super ScrollBarKt$ScrollBar$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$isHighlighted = z;
        this.$coroutineScope = interfaceC5401;
        this.$hideJob$delegate = interfaceC1395;
        this.$opacity$delegate = interfaceC1397;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ScrollBarKt$ScrollBar$2$1(this.$isHighlighted, this.$coroutineScope, this.$hideJob$delegate, this.$opacity$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollBarKt$ScrollBar$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.$isHighlighted) {
            InterfaceC5452 interfaceC5452 = (InterfaceC5452) this.$hideJob$delegate.getValue();
            if (interfaceC5452 != null) {
                interfaceC5452.mo10256(null);
            }
            ((AbstractC1349) this.$opacity$delegate).m2435(1.0f);
        } else if (((AbstractC1349) this.$opacity$delegate).m2434() > 0.0f) {
            InterfaceC5452 interfaceC54522 = (InterfaceC5452) this.$hideJob$delegate.getValue();
            if (interfaceC54522 != null) {
                interfaceC54522.mo10256(null);
            }
            this.$hideJob$delegate.setValue(AbstractC5399.m10477(this.$coroutineScope, null, null, new AnonymousClass1(this.$opacity$delegate, null), 3));
        }
        return C5176.f14739;
    }
}
