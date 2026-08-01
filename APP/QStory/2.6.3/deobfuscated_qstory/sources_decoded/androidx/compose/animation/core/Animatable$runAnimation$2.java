package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;", "V", "Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;", "<anonymous>", "()Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;"}, k = 3, mv = {2, 1, 0})
final class Animatable$runAnimation$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC0327 $animation;
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C0331 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(C0331 c0331, Object obj, InterfaceC0327 interfaceC0327, long j, InterfaceC6558 interfaceC6558, InterfaceC4357<? super Animatable$runAnimation$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.this$0 = c0331;
        this.$initialVelocity = obj;
        this.$animation = interfaceC0327;
        this.$startTime = j;
        this.$block = interfaceC6558;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(C0331 c0331, C0350 c0350, InterfaceC6558 interfaceC6558, Ref$BooleanRef ref$BooleanRef, C0345 c0345) {
        AbstractC0330.m1015(c0345, c0331.f1127);
        AbstractC1347 abstractC1347 = (AbstractC1347) c0345.f1183;
        Object objM1034 = c0331.m1034(abstractC1347.getValue());
        if (!AbstractC4395.m8907(objM1034, abstractC1347.getValue())) {
            ((AbstractC1347) c0331.f1127.f1199).setValue(objM1034);
            ((AbstractC1347) c0350.f1199).setValue(objM1034);
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(c0331);
            }
            c0345.m1046();
            ref$BooleanRef.element = true;
        } else if (interfaceC6558 != null) {
            interfaceC6558.invoke(c0331);
        }
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C0346> interfaceC4357) {
        return ((Animatable$runAnimation$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0350 c0350;
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0331 c0331 = this.this$0;
                c0331.f1127.f1200 = (AbstractC0343) c0331.f1129.mo1062().invoke(this.$initialVelocity);
                ((AbstractC1347) this.this$0.f1125).setValue(this.$animation.mo1005());
                ((AbstractC1347) this.this$0.f1126).setValue(Boolean.TRUE);
                C0350 c03502 = this.this$0.f1127;
                C0350 c03503 = new C0350(c03502.f1201, ((AbstractC1347) c03502.f1199).getValue(), AbstractC0330.m1026(c03502.f1200), c03502.f1197, Long.MIN_VALUE, c03502.f1198);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC0327 interfaceC0327 = this.$animation;
                long j = this.$startTime;
                C0332 c0332 = new C0332(this.this$0, c03503, this.$block, ref$BooleanRef2, 0);
                this.L$0 = c03503;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (AbstractC0330.m1008(c03503, interfaceC0327, j, c0332, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0350 = c03503;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                c0350 = (C0350) this.L$0;
                AbstractC5185.m10210(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            C0331.m1030(this.this$0);
            return new C0346(c0350, animationEndReason);
        } catch (CancellationException e) {
            C0331.m1030(this.this$0);
            throw e;
        }
    }
}
