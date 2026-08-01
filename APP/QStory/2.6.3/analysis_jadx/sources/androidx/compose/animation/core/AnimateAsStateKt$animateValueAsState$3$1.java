package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1333;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {430}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1333 $animSpec$delegate;
    final /* synthetic */ C0331 $animatable;
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ InterfaceC1333 $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {439}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1333 $animSpec$delegate;
        final /* synthetic */ C0331 $animatable;
        final /* synthetic */ InterfaceC1333 $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, C0331 c0331, InterfaceC1333 interfaceC1333, InterfaceC1333 interfaceC13332, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$newTarget = obj;
            this.$animatable = c0331;
            this.$animSpec$delegate = interfaceC1333;
            this.$listener$delegate = interfaceC13332;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                if (!AbstractC4395.m8907(this.$newTarget, ((AbstractC1347) this.$animatable.f1125).getValue())) {
                    C0331 c0331 = this.$animatable;
                    Object obj2 = this.$newTarget;
                    InterfaceC1333 interfaceC1333 = this.$animSpec$delegate;
                    int i2 = AbstractC0328.f1103;
                    InterfaceC0349 interfaceC0349 = (InterfaceC0349) interfaceC1333.getValue();
                    this.label = 1;
                    anonymousClass1 = this;
                    if (C0331.m1029(c0331, obj2, interfaceC0349, null, null, anonymousClass1, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C5176.f14739;
            }
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            anonymousClass1 = this;
            InterfaceC1333 interfaceC13332 = anonymousClass1.$listener$delegate;
            int i3 = AbstractC0328.f1103;
            InterfaceC6558 interfaceC6558 = (InterfaceC6558) interfaceC13332.getValue();
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(anonymousClass1.$animatable.m1033());
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(InterfaceC5207 interfaceC5207, C0331 c0331, InterfaceC1333 interfaceC1333, InterfaceC1333 interfaceC13332, InterfaceC4357<? super AnimateAsStateKt$animateValueAsState$3$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC5207;
        this.$animatable = c0331;
        this.$animSpec$delegate = interfaceC1333;
        this.$listener$delegate = interfaceC13332;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC4357);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:12:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r4 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r4 = (kotlinx.coroutines.InterfaceC5401) r4
            kotlin.AbstractC5185.m10210(r13)
            goto L39
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r2
        L1c:
            kotlin.AbstractC5185.m10210(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r13 = (kotlinx.coroutines.InterfaceC5401) r13
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r1 = r12.$channel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = r1.iterator()
            r4 = r13
        L2a:
            r12.L$0 = r4
            r12.L$1 = r1
            r12.label = r3
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1
            java.lang.Object r13 = r1.m10264(r12)
            if (r13 != r0) goto L39
            return r0
        L39:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L67
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1
            java.lang.Object r13 = r1.m10262()
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r5 = r12.$channel
            java.lang.Object r5 = r5.mo10255()
            java.lang.Object r5 = kotlinx.coroutines.channels.C5202.m10272(r5)
            if (r5 != 0) goto L55
            r7 = r13
            goto L56
        L55:
            r7 = r5
        L56:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r6 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r8 = r12.$animatable
            androidx.compose.runtime.飘花落叶言子哲兰世楪苏 r9 = r12.$animSpec$delegate
            androidx.compose.runtime.飘花落叶言子哲兰世楪苏 r10 = r12.$listener$delegate
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            kotlinx.coroutines.AbstractC5399.m10477(r4, r2, r2, r6, r13)
            goto L2a
        L67:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
