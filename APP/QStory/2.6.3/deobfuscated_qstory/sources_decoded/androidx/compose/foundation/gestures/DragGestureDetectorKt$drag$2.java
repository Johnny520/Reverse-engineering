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
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1159}, m = "drag-VnAYq1g", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$2(InterfaceC4357<? super DragGestureDetectorKt$drag$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633;
        C1643 c1643;
        Object obj2;
        Object obj3;
        Object objM2999 = obj;
        this.result = objM2999;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        float f = AbstractC0468.f1430;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(objM2999);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$5;
        InterfaceC1633 interfaceC16332 = (InterfaceC1633) this.L$4;
        InterfaceC6558 interfaceC6558 = (InterfaceC6558) this.L$3;
        Orientation orientation = (Orientation) this.L$2;
        InterfaceC6558 interfaceC65582 = (InterfaceC6558) this.L$1;
        InterfaceC1633 interfaceC16333 = (InterfaceC1633) this.L$0;
        AbstractC5185.m10210(objM2999);
        do {
            C1652 c1652 = (C1652) objM2999;
            List list = c1652.f4852;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC1633 = interfaceC16332;
                    c1643 = null;
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i3);
                c1643 = null;
                int i4 = i3;
                interfaceC1633 = interfaceC16332;
                if (AbstractC1646.m3026(((C1643) obj2).f4809, ref$LongRef.element)) {
                    break;
                }
                i3 = i4 + 1;
                interfaceC16332 = interfaceC1633;
            }
            C1643 c16432 = (C1643) obj2;
            if (c16432 == null) {
                c16432 = c1643;
            } else {
                if (AbstractC1646.m3027(c16432)) {
                    List list2 = c1652.f4852;
                    int size2 = list2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            obj3 = c1643;
                            break;
                        }
                        obj3 = list2.get(i5);
                        if (((C1643) obj3).f4806) {
                            break;
                        }
                        i5++;
                    }
                    C1643 c16433 = (C1643) obj3;
                    if (c16433 != null) {
                        ref$LongRef.element = c16433.f4809;
                        interfaceC16332 = interfaceC1633;
                    }
                } else {
                    long jM3031 = AbstractC1646.m3031(c16432, true);
                    if ((orientation == null ? C7329.m12527(jM3031) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jM3031 & 4294967295L)) : Float.intBitsToFloat((int) (jM3031 >> 32))) == 0.0f) {
                        interfaceC16332 = interfaceC1633;
                    }
                }
                this.L$0 = interfaceC16333;
                this.L$1 = interfaceC65582;
                this.L$2 = orientation;
                this.L$3 = interfaceC6558;
                this.L$4 = interfaceC16332;
                this.L$5 = ref$LongRef;
                this.label = 1;
                objM2999 = ((C1621) interfaceC16332).m2999(PointerEventPass.Main, this);
            }
            if (c16432 == null || ((Boolean) interfaceC6558.invoke(c16432)).booleanValue()) {
                return c1643;
            }
            if (AbstractC1646.m3027(c16432)) {
                return c16432;
            }
            interfaceC65582.invoke(c16432);
            long j = c16432.f4809;
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = j;
            ref$LongRef = ref$LongRef2;
            interfaceC16332 = interfaceC16333;
            this.L$0 = interfaceC16333;
            this.L$1 = interfaceC65582;
            this.L$2 = orientation;
            this.L$3 = interfaceC6558;
            this.L$4 = interfaceC16332;
            this.L$5 = ref$LongRef;
            this.label = 1;
            objM2999 = ((C1621) interfaceC16332).m2999(PointerEventPass.Main, this);
        } while (objM2999 != coroutineSingletons);
        return coroutineSingletons;
    }
}
