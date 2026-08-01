package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.Scrollable2DKt", m556f = "Scrollable2D.kt", m557l = {514}, m558m = "semanticsScrollBy-d-4ec7I", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class Scrollable2DKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public Scrollable2DKt$semanticsScrollBy$1(InterfaceC5189<? super Scrollable2DKt$semanticsScrollBy$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Scrollable2DKt$semanticsScrollBy$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
            AbstractC6017.m10769(obj2);
            return new C8158(ref$LongRef.element);
        }
        AbstractC6017.m10769(obj2);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = 0L;
        MutatePriority mutatePriority = MutatePriority.Default;
        new Scrollable2DKt$semanticsScrollBy$2(0L, ref$LongRef2, null);
        this.L$0 = ref$LongRef2;
        this.label = 1;
        throw null;
    }
}
