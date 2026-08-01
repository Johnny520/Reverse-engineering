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
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m556f = "DragGestureDetector.kt", m557l = {1159}, m558m = "awaitVerticalDragOrCancellation-rnUCldI", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(InterfaceC5189<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        float f = AbstractC1309.f1775;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$1;
        InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        do {
            C2487 c2487 = (C2487) obj;
            List list = c2487.f5197;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i4);
                if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef.element)) {
                    break;
                }
                i4++;
            }
            C2478 c2478 = (C2478) obj2;
            if (c2478 == null) {
                c2478 = null;
            } else if (AbstractC2481.m3587(c2478)) {
                List list2 = c2487.f5197;
                int size2 = list2.size();
                while (true) {
                    if (i3 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list2.get(i3);
                    if (((C2478) obj3).f5151) {
                        break;
                    }
                    i3++;
                }
                C2478 c24782 = (C2478) obj3;
                if (c24782 != null) {
                    ref$LongRef.element = c24782.f5154;
                    this.L$0 = interfaceC2468;
                    this.L$1 = ref$LongRef;
                    this.label = 1;
                    obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                }
            } else {
                if (Float.intBitsToFloat((int) (AbstractC2481.m3591(c2478, true) & 4294967295L)) != 0.0f) {
                }
                this.L$0 = interfaceC2468;
                this.L$1 = ref$LongRef;
                this.label = 1;
                obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
            }
            if (c2478 == null || c2478.m3582()) {
                return null;
            }
            return c2478;
        } while (obj != coroutineSingletons);
        return coroutineSingletons;
    }
}
