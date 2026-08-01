package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.Animatable$runAnimation$2", m556f = "Animatable.kt", m557l = {308}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"T", "Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;", "V", "Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;", "<anonymous>", "()Landroidx/compose/animation/core/飘花落叶言子楪苏世哲兰;"}, m152k = 3, m153mv = {2, 1, 0})
final class Animatable$runAnimation$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC1173 $animation;
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1177 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(C1177 c1177, Object obj, InterfaceC1173 interfaceC1173, long j, InterfaceC7387 interfaceC7387, InterfaceC5189<? super Animatable$runAnimation$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.this$0 = c1177;
        this.$initialVelocity = obj;
        this.$animation = interfaceC1173;
        this.$startTime = j;
        this.$block = interfaceC7387;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(C1177 c1177, C1196 c1196, InterfaceC7387 interfaceC7387, Ref$BooleanRef ref$BooleanRef, C1191 c1191) {
        AbstractC1176.m1575(c1191, c1177.f1472);
        AbstractC2182 abstractC2182 = (AbstractC2182) c1191.f1528;
        Object objM1594 = c1177.m1594(abstractC2182.getValue());
        if (!AbstractC5227.m9466(objM1594, abstractC2182.getValue())) {
            ((AbstractC2182) c1177.f1472.f1544).setValue(objM1594);
            ((AbstractC2182) c1196.f1544).setValue(objM1594);
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(c1177);
            }
            c1191.m1606();
            ref$BooleanRef.element = true;
        } else if (interfaceC7387 != null) {
            interfaceC7387.invoke(c1177);
        }
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C1192> interfaceC5189) {
        return ((Animatable$runAnimation$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1196 c1196;
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.this$0;
                c1177.f1472.f1545 = (AbstractC1189) c1177.f1474.mo1622().invoke(this.$initialVelocity);
                ((AbstractC2182) this.this$0.f1470).setValue(this.$animation.mo1565());
                ((AbstractC2182) this.this$0.f1471).setValue(Boolean.TRUE);
                C1196 c11962 = this.this$0.f1472;
                C1196 c11963 = new C1196(c11962.f1546, ((AbstractC2182) c11962.f1544).getValue(), AbstractC1176.m1586(c11962.f1545), c11962.f1542, Long.MIN_VALUE, c11962.f1543);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC1173 interfaceC1173 = this.$animation;
                long j = this.$startTime;
                C1178 c1178 = new C1178(this.this$0, c11963, this.$block, ref$BooleanRef2, 0);
                this.L$0 = c11963;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (AbstractC1176.m1568(c11963, interfaceC1173, j, c1178, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c1196 = c11963;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                c1196 = (C1196) this.L$0;
                AbstractC6017.m10769(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            C1177.m1590(this.this$0);
            return new C1192(c1196, animationEndReason);
        } catch (CancellationException e) {
            C1177.m1590(this.this$0);
            throw e;
        }
    }
}
