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
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m556f = "DragGestureDetector.kt", m557l = {1172, 1216}, m558m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(InterfaceC5189<? super DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        if (r1 == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0114 -> B:47:0x0117). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        C1342 c1342;
        InterfaceC2468 interfaceC2468;
        Ref$LongRef ref$LongRef;
        InterfaceC7383 interfaceC7383;
        int size;
        int i;
        InterfaceC2468 interfaceC24682;
        Object obj2;
        InterfaceC2468 interfaceC24683;
        Object obj3;
        C2478 c2478;
        Object obj4;
        Object objM3559 = obj;
        this.result = objM3559;
        int i2 = this.label | Integer.MIN_VALUE;
        this.label = i2;
        float f2 = AbstractC1309.f1775;
        int i3 = i2 - Integer.MIN_VALUE;
        this.label = i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj5 = null;
        if (i3 == 0) {
            AbstractC6017.m10769(objM3559);
            Orientation orientation = Orientation.Vertical;
            throw null;
        }
        if (i3 == 1) {
            f = this.F$0;
            C1342 c13422 = (C1342) this.L$3;
            Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.L$2;
            InterfaceC2468 interfaceC24684 = (InterfaceC2468) this.L$1;
            InterfaceC7383 interfaceC73832 = (InterfaceC7383) this.L$0;
            AbstractC6017.m10769(objM3559);
            c1342 = c13422;
            interfaceC2468 = interfaceC24684;
            ref$LongRef = ref$LongRef2;
            interfaceC7383 = interfaceC73832;
            C2487 c2487 = (C2487) objM3559;
            List list = c2487.f5197;
            size = list.size();
            i = 0;
            interfaceC24682 = interfaceC2468;
            while (true) {
                if (i < size) {
                }
                i++;
                interfaceC24682 = interfaceC24683;
                obj5 = obj2;
            }
            c2478 = (C2478) obj3;
            if (c2478 != null) {
                if (AbstractC2481.m3587(c2478)) {
                }
                this.L$0 = interfaceC7383;
                this.L$1 = interfaceC2468;
                this.L$2 = ref$LongRef;
                this.L$3 = c1342;
                obj5 = obj2;
                this.L$4 = obj5;
                this.F$0 = f;
                this.label = 1;
                objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                if (objM3559 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return obj2;
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f = this.F$0;
        c2478 = (C2478) this.L$4;
        c1342 = (C1342) this.L$3;
        ref$LongRef = (Ref$LongRef) this.L$2;
        InterfaceC2468 interfaceC24685 = (InterfaceC2468) this.L$1;
        interfaceC7383 = (InterfaceC7383) this.L$0;
        AbstractC6017.m10769(objM3559);
        obj2 = null;
        InterfaceC2468 interfaceC24686 = interfaceC24685;
        if (!c2478.m3582()) {
            InterfaceC2468 interfaceC24687 = interfaceC24686;
            this.L$0 = interfaceC7383;
            this.L$1 = interfaceC24687;
            this.L$2 = ref$LongRef;
            this.L$3 = c1342;
            obj5 = obj2;
            this.L$4 = obj5;
            this.F$0 = f;
            this.label = 1;
            objM3559 = ((C2456) interfaceC24687).m3559(PointerEventPass.Main, this);
            if (objM3559 != coroutineSingletons) {
                interfaceC2468 = interfaceC24687;
                C2487 c24872 = (C2487) objM3559;
                List list2 = c24872.f5197;
                size = list2.size();
                i = 0;
                interfaceC24682 = interfaceC2468;
                while (true) {
                    if (i < size) {
                        obj2 = obj5;
                        interfaceC24683 = interfaceC24682;
                        obj3 = obj2;
                        break;
                    }
                    obj3 = list2.get(i);
                    obj2 = obj5;
                    interfaceC24683 = interfaceC24682;
                    if (AbstractC2481.m3586(((C2478) obj3).f5154, ref$LongRef.element)) {
                        break;
                    }
                    i++;
                    interfaceC24682 = interfaceC24683;
                    obj5 = obj2;
                }
                c2478 = (C2478) obj3;
                if (c2478 != null && !c2478.m3582()) {
                    if (AbstractC2481.m3587(c2478)) {
                        long jM1821 = c1342.m1821(f, AbstractC2481.m3591(c2478, true), true);
                        if ((9223372034707292159L & jM1821) != 9205357640488583168L) {
                            interfaceC7383.invoke(c2478, new Float(Float.intBitsToFloat((int) (jM1821 >> 32))));
                            if (c2478.m3582()) {
                                return c2478;
                            }
                            c1342.f1830 = 0L;
                            interfaceC24687 = interfaceC24683;
                        } else {
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            this.L$0 = interfaceC7383;
                            InterfaceC2468 interfaceC24688 = interfaceC24683;
                            this.L$1 = interfaceC24688;
                            this.L$2 = ref$LongRef;
                            this.L$3 = c1342;
                            this.L$4 = c2478;
                            this.F$0 = f;
                            this.label = 2;
                            C2456 c2456 = (C2456) interfaceC24688;
                            Object objM35592 = c2456.m3559(pointerEventPass, this);
                            interfaceC24686 = c2456;
                        }
                    } else {
                        List list3 = c24872.f5197;
                        int size2 = list3.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                obj4 = obj2;
                                break;
                            }
                            obj4 = list3.get(i4);
                            if (((C2478) obj4).f5151) {
                                break;
                            }
                            i4++;
                        }
                        C2478 c24782 = (C2478) obj4;
                        if (c24782 != null) {
                            ref$LongRef.element = c24782.f5154;
                            interfaceC24687 = interfaceC24683;
                        }
                    }
                    this.L$0 = interfaceC7383;
                    this.L$1 = interfaceC24687;
                    this.L$2 = ref$LongRef;
                    this.L$3 = c1342;
                    obj5 = obj2;
                    this.L$4 = obj5;
                    this.F$0 = f;
                    this.label = 1;
                    objM3559 = ((C2456) interfaceC24687).m3559(PointerEventPass.Main, this);
                    if (objM3559 != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return obj2;
    }
}
