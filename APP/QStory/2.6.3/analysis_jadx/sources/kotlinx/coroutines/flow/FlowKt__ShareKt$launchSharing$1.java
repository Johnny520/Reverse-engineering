package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {Opcodes.MUL_INT_LIT16, Opcodes.OR_INT_LIT16, Opcodes.XOR_INT_LIT16, Opcodes.AND_INT_LIT8}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ InterfaceC5294 $shared;
    final /* synthetic */ InterfaceC5272 $started;
    final /* synthetic */ InterfaceC5319 $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, k = 3, mv = {2, 2, 0})
    @InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {Opcodes.XOR_INT_LIT8}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ InterfaceC5294 $shared;
        final /* synthetic */ InterfaceC5319 $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC5319 interfaceC5319, InterfaceC5294 interfaceC5294, Object obj, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$upstream = interfaceC5319;
            this.$shared = interfaceC5294;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(SharingCommand sharingCommand, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(sharingCommand, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharingCommand sharingCommand = (SharingCommand) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                int i2 = AbstractC5336.f14901[sharingCommand.ordinal()];
                if (i2 == 1) {
                    InterfaceC5319 interfaceC5319 = this.$upstream;
                    InterfaceC5294 interfaceC5294 = this.$shared;
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC5319.mo8453(interfaceC5294, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        C4211.m8611();
                        return null;
                    }
                    Object obj2 = this.$initialValue;
                    C4485 c4485 = AbstractC5322.f14891;
                    InterfaceC5294 interfaceC52942 = this.$shared;
                    if (obj2 == c4485) {
                        interfaceC52942.mo10310();
                    } else {
                        interfaceC52942.mo10309(obj2);
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC5272 interfaceC5272, InterfaceC5319 interfaceC5319, InterfaceC5294 interfaceC5294, Object obj, InterfaceC4357<? super FlowKt__ShareKt$launchSharing$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$started = interfaceC5272;
        this.$upstream = interfaceC5319;
        this.$shared = interfaceC5294;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8.mo8453(r1, r7) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8.mo8453(r1, r7) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC5322.m10335(r8, r1, r7) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1e
            if (r1 == r5) goto L1a
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L14
            goto L1e
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r2
        L1a:
            kotlin.AbstractC5185.m10210(r8)
            goto L53
        L1e:
            kotlin.AbstractC5185.m10210(r8)
            goto L9e
        L23:
            kotlin.AbstractC5185.m10210(r8)
            kotlinx.coroutines.flow.飘花落叶言子兰楪苏世哲 r8 = r7.$started
            kotlinx.coroutines.flow.飘花落叶言子兰楪苏哲世 r1 = kotlinx.coroutines.flow.C5268.f14855
            if (r8 != r1) goto L39
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r8 = r7.$upstream
            kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r1 = r7.$shared
            r7.label = r6
            java.lang.Object r7 = r8.mo8453(r1, r7)
            if (r7 != r0) goto L9e
            goto L9d
        L39:
            kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r1 = r7.$shared
            kotlinx.coroutines.flow.飘花落叶言子兰楪苏哲世 r6 = kotlinx.coroutines.flow.C5268.f14854
            if (r8 != r6) goto L60
            kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰 r1 = (kotlinx.coroutines.flow.internal.AbstractC5220) r1
            kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏哲世 r8 = r1.m10304()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r2)
            r7.label = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.AbstractC5322.m10339(r8, r1, r7)
            if (r8 != r0) goto L53
            goto L9d
        L53:
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r8 = r7.$upstream
            kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r1 = r7.$shared
            r7.label = r4
            java.lang.Object r7 = r8.mo8453(r1, r7)
            if (r7 != r0) goto L9e
            goto L9d
        L60:
            kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰 r1 = (kotlinx.coroutines.flow.internal.AbstractC5220) r1
            kotlinx.coroutines.flow.internal.飘花落叶言子楪兰苏哲世 r1 = r1.m10304()
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r8 = r8.mo10308(r1)
            boolean r1 = r8 instanceof kotlinx.coroutines.flow.InterfaceC5264
            if (r1 == 0) goto L6f
            goto L8a
        L6f:
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.flow.AbstractC5322.f14893
            androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世 r4 = kotlinx.coroutines.flow.AbstractC5322.f14892
            boolean r5 = r8 instanceof kotlinx.coroutines.flow.C5300
            if (r5 == 0) goto L84
            r5 = r8
            kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏 r5 = (kotlinx.coroutines.flow.C5300) r5
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r6 = r5.f14881
            if (r6 != r1) goto L84
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r5.f14882
            if (r6 != r4) goto L84
        L82:
            r8 = r5
            goto L8a
        L84:
            kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏 r5 = new kotlinx.coroutines.flow.飘花落叶言子楪世兰哲苏
            r5.<init>(r8, r1, r4)
            goto L82
        L8a:
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r4 = r7.$upstream
            kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r5 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r4, r5, r6, r2)
            r7.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.AbstractC5322.m10335(r8, r1, r7)
            if (r7 != r0) goto L9e
        L9d:
            return r0
        L9e:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC4357);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i, InterfaceC4357<? super Boolean> interfaceC4357) {
            return ((AnonymousClass1) create(Integer.valueOf(i), interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC5185.m10210(obj);
                return Boolean.valueOf(i > 0);
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC4357<? super Boolean>) obj2);
        }
    }
}
