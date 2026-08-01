package androidx.compose.material3;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1", f = "WideNavigationRail.kt", l = {561}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ AbstractC1156 $modalState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1", f = "WideNavigationRail.kt", l = {565, 567}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ AbstractC1156 $modalState;
        final /* synthetic */ boolean $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AbstractC1156 abstractC1156, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$newTarget = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$newTarget, null, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            if (this.$newTarget) {
                this.label = 1;
                throw null;
            }
            this.label = 2;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(InterfaceC5207 interfaceC5207, AbstractC1156 abstractC1156, InterfaceC4357<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC5207;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(this.$channel, null, interfaceC4357);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.L$0 = obj;
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:12:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r4 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r4 = (kotlinx.coroutines.InterfaceC5401) r4
            kotlin.AbstractC5185.m10210(r7)
            goto L39
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r2
        L1c:
            kotlin.AbstractC5185.m10210(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r7 = (kotlinx.coroutines.InterfaceC5401) r7
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r1 = r6.$channel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = r1.iterator()
            r4 = r7
        L2a:
            r6.L$0 = r4
            r6.L$1 = r1
            r6.label = r3
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1
            java.lang.Object r7 = r1.m10264(r6)
            if (r7 != r0) goto L39
            return r0
        L39:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L69
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1
            java.lang.Object r7 = r1.m10262()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r5 = r6.$channel
            java.lang.Object r5 = r5.mo10255()
            java.lang.Object r5 = kotlinx.coroutines.channels.C5202.m10272(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L5f
            boolean r7 = r5.booleanValue()
        L5f:
            androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1 r5 = new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1
            r5.<init>(r7, r2, r2)
            r7 = 3
            kotlinx.coroutines.AbstractC5399.m10477(r4, r2, r2, r5, r7)
            goto L2a
        L69:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
