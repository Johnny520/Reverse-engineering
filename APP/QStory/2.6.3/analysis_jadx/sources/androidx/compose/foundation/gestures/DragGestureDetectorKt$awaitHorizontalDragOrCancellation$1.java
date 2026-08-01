package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1159}, m = "awaitHorizontalDragOrCancellation-rnUCldI", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(InterfaceC4357<? super DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        float f = AbstractC0468.f1430;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$1;
        InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
        AbstractC5185.m10210(obj);
        do {
            C1652 c1652 = (C1652) obj;
            List list = c1652.f4852;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i4);
                if (AbstractC1646.m3026(((C1643) obj2).f4809, ref$LongRef.element)) {
                    break;
                }
                i4++;
            }
            C1643 c1643 = (C1643) obj2;
            if (c1643 == null) {
                c1643 = null;
            } else if (AbstractC1646.m3027(c1643)) {
                List list2 = c1652.f4852;
                int size2 = list2.size();
                while (true) {
                    if (i3 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list2.get(i3);
                    if (((C1643) obj3).f4806) {
                        break;
                    }
                    i3++;
                }
                C1643 c16432 = (C1643) obj3;
                if (c16432 != null) {
                    ref$LongRef.element = c16432.f4809;
                    this.L$0 = interfaceC1633;
                    this.L$1 = ref$LongRef;
                    this.label = 1;
                    obj = ((C1621) interfaceC1633).m2999(PointerEventPass.Main, this);
                }
            } else {
                if (Float.intBitsToFloat((int) (AbstractC1646.m3031(c1643, true) >> 32)) != 0.0f) {
                }
                this.L$0 = interfaceC1633;
                this.L$1 = ref$LongRef;
                this.label = 1;
                obj = ((C1621) interfaceC1633).m2999(PointerEventPass.Main, this);
            }
            if (c1643 == null || c1643.m3022()) {
                return null;
            }
            return c1643;
        } while (obj != coroutineSingletons);
        return coroutineSingletons;
    }
}
