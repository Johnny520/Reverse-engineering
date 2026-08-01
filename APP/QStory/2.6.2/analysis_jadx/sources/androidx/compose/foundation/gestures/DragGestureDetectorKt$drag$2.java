package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1159}, m = "drag-VnAYq1g", v = 1)
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

    public DragGestureDetectorKt$drag$2(InterfaceC4356<? super DragGestureDetectorKt$drag$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633;
        C1643 c1643;
        Object obj2;
        Object obj3;
        Object objM2989 = obj;
        this.result = objM2989;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        float f = AbstractC0468.f1429;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5184.m10206(objM2989);
            throw null;
        }
        if (i2 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$5;
        InterfaceC1633 interfaceC16332 = (InterfaceC1633) this.L$4;
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) this.L$3;
        Orientation orientation = (Orientation) this.L$2;
        InterfaceC6557 interfaceC65572 = (InterfaceC6557) this.L$1;
        InterfaceC1633 interfaceC16333 = (InterfaceC1633) this.L$0;
        AbstractC5184.m10206(objM2989);
        do {
            C1652 c1652 = (C1652) objM2989;
            List list = c1652.f4851;
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
                if (AbstractC1646.m3016(((C1643) obj2).f4808, ref$LongRef.element)) {
                    break;
                }
                i3 = i4 + 1;
                interfaceC16332 = interfaceC1633;
            }
            C1643 c16432 = (C1643) obj2;
            if (c16432 == null) {
                c16432 = c1643;
            } else {
                if (AbstractC1646.m3017(c16432)) {
                    List list2 = c1652.f4851;
                    int size2 = list2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            obj3 = c1643;
                            break;
                        }
                        obj3 = list2.get(i5);
                        if (((C1643) obj3).f4805) {
                            break;
                        }
                        i5++;
                    }
                    C1643 c16433 = (C1643) obj3;
                    if (c16433 != null) {
                        ref$LongRef.element = c16433.f4808;
                        interfaceC16332 = interfaceC1633;
                    }
                } else {
                    long jM3021 = AbstractC1646.m3021(c16432, true);
                    if ((orientation == null ? C7328.m12500(jM3021) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jM3021 & 4294967295L)) : Float.intBitsToFloat((int) (jM3021 >> 32))) == 0.0f) {
                        interfaceC16332 = interfaceC1633;
                    }
                }
                this.L$0 = interfaceC16333;
                this.L$1 = interfaceC65572;
                this.L$2 = orientation;
                this.L$3 = interfaceC6557;
                this.L$4 = interfaceC16332;
                this.L$5 = ref$LongRef;
                this.label = 1;
                objM2989 = ((C1621) interfaceC16332).m2989(PointerEventPass.Main, this);
            }
            if (c16432 == null || ((Boolean) interfaceC6557.invoke(c16432)).booleanValue()) {
                return c1643;
            }
            if (AbstractC1646.m3017(c16432)) {
                return c16432;
            }
            interfaceC65572.invoke(c16432);
            long j = c16432.f4808;
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = j;
            ref$LongRef = ref$LongRef2;
            interfaceC16332 = interfaceC16333;
            this.L$0 = interfaceC16333;
            this.L$1 = interfaceC65572;
            this.L$2 = orientation;
            this.L$3 = interfaceC6557;
            this.L$4 = interfaceC16332;
            this.L$5 = ref$LongRef;
            this.label = 1;
            objM2989 = ((C1621) interfaceC16332).m2989(PointerEventPass.Main, this);
        } while (objM2989 != coroutineSingletons);
        return coroutineSingletons;
    }
}
