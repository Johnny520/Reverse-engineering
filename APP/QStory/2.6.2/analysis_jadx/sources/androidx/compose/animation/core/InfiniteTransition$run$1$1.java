package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class InfiniteTransition$run$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1395 $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C0315 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(InterfaceC1395 interfaceC1395, C0315 c0315, InterfaceC4356<? super InfiniteTransition$run$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$toolingOverride = interfaceC1395;
        this.this$0 = c0315;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC1395 interfaceC1395, C0315 c0315, Ref$FloatRef ref$FloatRef, InterfaceC5400 interfaceC5400, long j) {
        InterfaceC1333 interfaceC1333 = (InterfaceC1333) interfaceC1395.getValue();
        long jLongValue = interfaceC1333 != null ? ((Number) interfaceC1333.getValue()).longValue() : j;
        long j2 = c0315.f1058;
        C1224 c1224 = c0315.f1060;
        if (j2 == Long.MIN_VALUE || ref$FloatRef.element != AbstractC0330.m1021(interfaceC5400.mo2420())) {
            c0315.f1058 = j;
            Object[] objArr = c1224.f3520;
            int i = c1224.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0316) objArr[i2]).f1064 = true;
            }
            ref$FloatRef.element = AbstractC0330.m1021(interfaceC5400.mo2420());
        }
        float f = ref$FloatRef.element;
        if (f == 0.0f) {
            Object[] objArr2 = c1224.f3520;
            int i3 = c1224.f3519;
            for (int i4 = 0; i4 < i3; i4++) {
                C0316 c0316 = (C0316) objArr2[i4];
                ((AbstractC1347) c0316.f1067).setValue(c0316.f1062.f1277);
                c0316.f1064 = true;
            }
        } else {
            long j3 = (long) ((jLongValue - c0315.f1058) / f);
            Object[] objArr3 = c1224.f3520;
            int i5 = c1224.f3519;
            boolean z = true;
            for (int i6 = 0; i6 < i5; i6++) {
                C0316 c03162 = (C0316) objArr3[i6];
                if (!c03162.f1061) {
                    ((AbstractC1347) c03162.f1063.f1059).setValue(Boolean.FALSE);
                    if (c03162.f1064) {
                        c03162.f1064 = false;
                        c03162.f1065 = j3;
                    }
                    long j4 = j3 - c03162.f1065;
                    ((AbstractC1347) c03162.f1067).setValue(c03162.f1062.mo998(j4));
                    c03162.f1061 = c03162.f1062.m999(j4);
                }
                if (!c03162.f1061) {
                    z = false;
                }
            }
            ((AbstractC1347) c0315.f1057).setValue(Boolean.valueOf(!z));
        }
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$1(InterfaceC5400 interfaceC5400) {
        return AbstractC0330.m1021(interfaceC5400.mo2420());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, interfaceC4356);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((InfiniteTransition$run$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0041, B:18:0x0073], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:18:0x0073, B:11:0x0041], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008b -> B:11:0x0041). Please report as a decompilation issue!!! */
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
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L21
            if (r1 != r3) goto L1b
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r5 = (kotlinx.coroutines.InterfaceC5400) r5
            kotlin.AbstractC5184.m10206(r13)
            r9 = r1
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r2
        L21:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r5 = (kotlinx.coroutines.InterfaceC5400) r5
            kotlin.AbstractC5184.m10206(r13)
            r9 = r1
            r10 = r5
            goto L6c
        L2f:
            kotlin.AbstractC5184.m10206(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r13 = (kotlinx.coroutines.InterfaceC5400) r13
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.element = r5
            r10 = r13
            r9 = r1
        L41:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r7 = r12.$toolingOverride
            androidx.compose.animation.core.飘花落叶言子世苏哲楪兰 r8 = r12.this$0
            androidx.compose.animation.core.飘花落叶言子楪世苏哲兰 r6 = new androidx.compose.animation.core.飘花落叶言子楪世苏哲兰
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.L$0 = r10
            r12.L$1 = r9
            r12.label = r4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r13 = r12.getContext()
            androidx.compose.ui.platform.飘花落叶言子苏兰世哲楪 r1 = androidx.compose.ui.platform.C1907.f5621
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r13 = r13.get(r1)
            if (r13 != 0) goto L8e
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r13 = r12.getContext()
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r13 = androidx.compose.runtime.AbstractC1367.m2482(r13)
            java.lang.Object r13 = r13.mo2295(r6, r12)
            if (r13 != r0) goto L6c
            goto L8d
        L6c:
            float r13 = r9.element
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L41
            androidx.compose.animation.core.飘花落叶言子苏楪世哲兰 r13 = new androidx.compose.animation.core.飘花落叶言子苏楪世哲兰
            r13.<init>(r10, r3)
            kotlinx.coroutines.flow.飘花落叶言子哲兰楪世苏 r13 = androidx.compose.runtime.AbstractC1367.m2461(r13)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r1.<init>(r2)
            r12.L$0 = r10
            r12.L$1 = r9
            r12.label = r3
            java.lang.Object r13 = kotlinx.coroutines.flow.AbstractC5321.m10335(r13, r1, r12)
            if (r13 != r0) goto L41
        L8d:
            return r0
        L8e:
            com.alibaba.fastjson2.C2941.m6336()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @InterfaceC6861(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        /* synthetic */ float F$0;
        int label;

        public AnonymousClass3(InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC4356);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f, InterfaceC4356<? super Boolean> interfaceC4356) {
            return ((AnonymousClass3) create(Float.valueOf(f), interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC5184.m10206(obj);
                return Boolean.valueOf(this.F$0 > 0.0f);
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (InterfaceC4356<? super Boolean>) obj2);
        }
    }
}
