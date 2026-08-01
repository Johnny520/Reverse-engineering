package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m556f = "DragGestureDetector.kt", m557l = {1159}, m558m = "drag-VnAYq1g", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 176)
final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$2(InterfaceC5189<? super DragGestureDetectorKt$drag$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        C2478 c2478;
        Object obj2;
        Object obj3;
        Object objM3559 = obj;
        this.result = objM3559;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        float f = AbstractC1309.f1775;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(objM3559);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$5;
        InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$4;
        InterfaceC7387 interfaceC7387 = (InterfaceC7387) this.L$3;
        Orientation orientation = (Orientation) this.L$2;
        InterfaceC7387 interfaceC73872 = (InterfaceC7387) this.L$1;
        InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(objM3559);
        do {
            C2487 c2487 = (C2487) objM3559;
            List list = c2487.f5197;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC2468 = interfaceC24682;
                    c2478 = null;
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i3);
                c2478 = null;
                int i4 = i3;
                interfaceC2468 = interfaceC24682;
                if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef.element)) {
                    break;
                }
                i3 = i4 + 1;
                interfaceC24682 = interfaceC2468;
            }
            C2478 c24782 = (C2478) obj2;
            if (c24782 == null) {
                c24782 = c2478;
            } else {
                if (AbstractC2481.m3587(c24782)) {
                    List list2 = c2487.f5197;
                    int size2 = list2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            obj3 = c2478;
                            break;
                        }
                        obj3 = list2.get(i5);
                        if (((C2478) obj3).f5151) {
                            break;
                        }
                        i5++;
                    }
                    C2478 c24783 = (C2478) obj3;
                    if (c24783 != null) {
                        ref$LongRef.element = c24783.f5154;
                        interfaceC24682 = interfaceC2468;
                    }
                } else {
                    long jM3591 = AbstractC2481.m3591(c24782, true);
                    if ((orientation == null ? C8158.m13086(jM3591) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jM3591 & 4294967295L)) : Float.intBitsToFloat((int) (jM3591 >> 32))) == 0.0f) {
                        interfaceC24682 = interfaceC2468;
                    }
                }
                this.L$0 = interfaceC24683;
                this.L$1 = interfaceC73872;
                this.L$2 = orientation;
                this.L$3 = interfaceC7387;
                this.L$4 = interfaceC24682;
                this.L$5 = ref$LongRef;
                this.label = 1;
                objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
            }
            if (c24782 == null || ((Boolean) interfaceC7387.invoke(c24782)).booleanValue()) {
                return c2478;
            }
            if (AbstractC2481.m3587(c24782)) {
                return c24782;
            }
            interfaceC73872.invoke(c24782);
            long j = c24782.f5154;
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = j;
            ref$LongRef = ref$LongRef2;
            interfaceC24682 = interfaceC24683;
            this.L$0 = interfaceC24683;
            this.L$1 = interfaceC73872;
            this.L$2 = orientation;
            this.L$3 = interfaceC7387;
            this.L$4 = interfaceC24682;
            this.L$5 = ref$LongRef;
            this.label = 1;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
        } while (objM3559 != coroutineSingletons);
        return coroutineSingletons;
    }
}
