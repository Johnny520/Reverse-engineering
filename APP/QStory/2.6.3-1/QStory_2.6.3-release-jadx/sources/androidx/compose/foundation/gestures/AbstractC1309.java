package androidx.compose.foundation.gestures;

import androidx.compose.foundation.text.selection.C1735;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.p001ui.platform.InterfaceC2698;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1309 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f1775 = 0.125f / 18.0f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0197 -> B:62:0x0199). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1795(InterfaceC2468 interfaceC2468, long j, int i, C1308 c1308, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        float fM1804;
        Ref$LongRef ref$LongRef;
        InterfaceC7383 interfaceC7383;
        C1342 c1342;
        InterfaceC2468 interfaceC24682;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        Ref$LongRef ref$LongRef2;
        float f;
        C1342 c13422;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
        int size;
        Object obj;
        int i2;
        Object obj2;
        C2478 c2478;
        Object obj3;
        Object objM3559;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(baseContinuationImpl);
            }
        }
        Object obj4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i5 = 1;
        Object obj5 = null;
        if (i4 == 0) {
            AbstractC6017.m10769(obj4);
            Orientation orientation = Orientation.Vertical;
            if (m1807(((C2456) interfaceC2468).f5086.f5102, j)) {
                return null;
            }
            fM1804 = m1804(((C2456) interfaceC2468).m3557(), i);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = j;
            interfaceC7383 = c1308;
            c1342 = new C1342(0L, orientation);
            interfaceC24682 = interfaceC2468;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
            C1342 c13423 = (C1342) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
            Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
            InterfaceC7383 interfaceC73832 = (InterfaceC7383) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
            AbstractC6017.m10769(obj4);
            f = f2;
            interfaceC24682 = interfaceC24683;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
            c13422 = c13423;
            interfaceC7383 = interfaceC73832;
            ref$LongRef2 = ref$LongRef3;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
            C2487 c2487 = (C2487) obj4;
            List list = c2487.f5197;
            size = list.size();
            obj = obj5;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
            }
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
        C2478 c24782 = (C2478) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
        C1342 c13424 = (C1342) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
        Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
        InterfaceC2468 interfaceC24684 = (InterfaceC2468) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
        InterfaceC7383 interfaceC73833 = (InterfaceC7383) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
        AbstractC6017.m10769(obj4);
        f = f3;
        interfaceC24682 = interfaceC24684;
        ref$LongRef2 = ref$LongRef4;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        c13422 = c13424;
        char c = 2;
        int i6 = 1;
        obj = null;
        long j2 = 0;
        if (!c24782.m3582()) {
            return obj;
        }
        obj5 = obj;
        i5 = i6;
        c1342 = c13422;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
        fM1804 = f;
        ref$LongRef = ref$LongRef2;
        interfaceC7383 = interfaceC73833;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = c1342;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = fM1804;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
        objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
        if (objM3559 != coroutineSingletons) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
            c13422 = c1342;
            obj4 = objM3559;
            ref$LongRef2 = ref$LongRef;
            f = fM1804;
            interfaceC24682 = interfaceC24682;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
            C2487 c24872 = (C2487) obj4;
            List list2 = c24872.f5197;
            size = list2.size();
            obj = obj5;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj2 = obj;
                    break;
                }
                obj2 = list2.get(i2);
                if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef2.element)) {
                    break;
                }
                i2++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null || c2478.m3582()) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
                i6 = 1;
                long jM1821 = c13422.m1821(f, AbstractC2481.m3591(c2478, true), true);
                if ((9223372034707292159L & jM1821) != 9205357640488583168L) {
                    interfaceC7383.invoke(c2478, new Float(Float.intBitsToFloat((int) (jM1821 & 4294967295L))));
                    if (c2478.m3582()) {
                        return c2478;
                    }
                    c13422.f1830 = 0L;
                    obj5 = obj;
                    i5 = 1;
                    c1342 = c13422;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                    fM1804 = f;
                    ref$LongRef = ref$LongRef2;
                } else {
                    j2 = 0;
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$0 = interfaceC7383;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$1 = interfaceC24682;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$2 = ref$LongRef2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$3 = c13422;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.L$4 = c2478;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.F$0 = f;
                    c = 2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13.label = 2;
                    C2456 c2456 = (C2456) interfaceC24682;
                    if (c2456.m3559(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13) != coroutineSingletons) {
                        interfaceC73833 = interfaceC7383;
                        c24782 = c2478;
                        interfaceC24682 = c2456;
                        if (!c24782.m3582()) {
                        }
                    }
                }
            } else {
                List list3 = c24872.f5197;
                int size2 = list3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj3 = obj;
                        break;
                    }
                    obj3 = list3.get(i7);
                    if (((C2478) obj3).f5151) {
                        break;
                    }
                    i7++;
                }
                C2478 c24783 = (C2478) obj3;
                if (c24783 == null) {
                    return obj;
                }
                ref$LongRef2.element = c24783.f5154;
                obj5 = obj;
                i5 = 1;
                c1342 = c13422;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                fM1804 = f;
                ref$LongRef = ref$LongRef2;
            }
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0185 -> B:61:0x0187). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1796(InterfaceC2468 interfaceC2468, long j, C1735 c1735, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        InterfaceC7383 interfaceC7383;
        Ref$LongRef ref$LongRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f;
        C1342 c1342;
        InterfaceC2468 interfaceC24682;
        Ref$LongRef ref$LongRef2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f2;
        C1342 c13422;
        int size;
        Object obj;
        int i;
        Object obj2;
        C2478 c2478;
        Object obj3;
        Object objM3559;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) baseContinuationImpl;
            int i2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(baseContinuationImpl);
            }
        }
        Object obj4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i4 = 1;
        Object obj5 = null;
        if (i3 == 0) {
            AbstractC6017.m10769(obj4);
            if (m1807(((C2456) interfaceC2468).f5086.f5102, j)) {
                return null;
            }
            float fMo3838 = ((C2456) interfaceC2468).m3557().mo3838();
            Ref$LongRef ref$LongRef3 = new Ref$LongRef();
            ref$LongRef3.element = j;
            interfaceC7383 = c1735;
            ref$LongRef = ref$LongRef3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            f = fMo3838;
            c1342 = new C1342(0L, (Orientation) null);
            interfaceC24682 = interfaceC2468;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = c1342;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = obj5;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
            C1342 c13423 = (C1342) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
            Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
            InterfaceC7383 interfaceC73832 = (InterfaceC7383) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
            AbstractC6017.m10769(obj4);
            f2 = f3;
            interfaceC24682 = interfaceC24683;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            c13422 = c13423;
            interfaceC7383 = interfaceC73832;
            ref$LongRef2 = ref$LongRef4;
            C2487 c2487 = (C2487) obj4;
            List list = c2487.f5197;
            size = list.size();
            obj = obj5;
            i = 0;
            while (true) {
                if (i < size) {
                }
                i++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
            }
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = c1342;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = obj5;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
        C2478 c24782 = (C2478) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
        C1342 c13424 = (C1342) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
        Ref$LongRef ref$LongRef5 = (Ref$LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
        InterfaceC2468 interfaceC24684 = (InterfaceC2468) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
        InterfaceC7383 interfaceC73833 = (InterfaceC7383) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
        AbstractC6017.m10769(obj4);
        f2 = f4;
        interfaceC24682 = interfaceC24684;
        ref$LongRef2 = ref$LongRef5;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        c13422 = c13424;
        char c = 2;
        int i5 = 1;
        obj = null;
        long j2 = 0;
        if (!c24782.m3582()) {
            return obj;
        }
        obj5 = obj;
        i4 = i5;
        c1342 = c13422;
        f = f2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        ref$LongRef = ref$LongRef2;
        interfaceC7383 = interfaceC73833;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = interfaceC7383;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = interfaceC24682;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ref$LongRef;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = c1342;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = obj5;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
        objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12);
        if (objM3559 != coroutineSingletons) {
            float f5 = f;
            c13422 = c1342;
            obj4 = objM3559;
            ref$LongRef2 = ref$LongRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
            f2 = f5;
            interfaceC24682 = interfaceC24682;
            C2487 c24872 = (C2487) obj4;
            List list2 = c24872.f5197;
            size = list2.size();
            obj = obj5;
            i = 0;
            while (true) {
                if (i < size) {
                    obj2 = obj;
                    break;
                }
                obj2 = list2.get(i);
                if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef2.element)) {
                    break;
                }
                i++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null || c2478.m3582()) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
                i5 = 1;
                long jM1821 = c13422.m1821(f2, AbstractC2481.m3591(c2478, true), true);
                if ((9223372034707292159L & jM1821) != 9205357640488583168L) {
                    interfaceC7383.invoke(c2478, new C8158(jM1821));
                    if (c2478.m3582()) {
                        return c2478;
                    }
                    c13422.f1830 = 0L;
                    obj5 = obj;
                    i4 = 1;
                    c1342 = c13422;
                    f = f2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    ref$LongRef = ref$LongRef2;
                } else {
                    j2 = 0;
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$0 = interfaceC7383;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$1 = interfaceC24682;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$2 = ref$LongRef2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$3 = c13422;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$4 = c2478;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.F$0 = f2;
                    c = 2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.label = 2;
                    C2456 c2456 = (C2456) interfaceC24682;
                    if (c2456.m3559(pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) != coroutineSingletons) {
                        interfaceC73833 = interfaceC7383;
                        c24782 = c2478;
                        interfaceC24682 = c2456;
                        if (!c24782.m3582()) {
                        }
                    }
                }
            } else {
                List list3 = c24872.f5197;
                int size2 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        obj3 = obj;
                        break;
                    }
                    obj3 = list3.get(i6);
                    if (((C2478) obj3).f5151) {
                        break;
                    }
                    i6++;
                }
                C2478 c24783 = (C2478) obj3;
                if (c24783 == null) {
                    return obj;
                }
                ref$LongRef2.element = c24783.f5154;
                obj5 = obj;
                i4 = 1;
                c1342 = c13422;
                f = f2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                ref$LongRef = ref$LongRef2;
            }
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = c1342;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = obj5;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12);
            if (objM3559 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1797(InterfaceC2468 interfaceC2468, long j, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        Object obj;
        Ref$BooleanRef ref$BooleanRef;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) baseContinuationImpl;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(baseContinuationImpl);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj3);
                if (!m1807(((C2456) interfaceC2468).f5086.f5102, j)) {
                    C2456 c2456 = (C2456) interfaceC2468;
                    List list = c2456.f5086.f5102.f5197;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (AbstractC2481.m3586(((C2478) obj).f5154, j)) {
                            break;
                        }
                        i3++;
                    }
                    ?? r11 = (C2478) obj;
                    if (r11 != 0) {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        ref$ObjectRef2.element = r11;
                        long jMo3840 = c2456.m3557().mo3840();
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = r11;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ref$ObjectRef;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = ref$BooleanRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (c2456.m3561(jMo3840, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                        j = ref$ObjectRef;
                        obj2 = r11;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = (Ref$BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
            C2478 c2478 = (C2478) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
            AbstractC6017.m10769(obj3);
            j = ref$ObjectRef3;
            obj2 = c2478;
            if (ref$BooleanRef.element) {
                C2478 c24782 = (C2478) j.element;
                return c24782 == null ? obj2 : c24782;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            C2478 c24783 = (C2478) j.element;
            return c24783 == null ? obj2 : c24783;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0194 -> B:62:0x0196). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1798(InterfaceC2468 interfaceC2468, long j, int i, C1308 c1308, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        float fM1804;
        Ref$LongRef ref$LongRef;
        InterfaceC7383 interfaceC7383;
        C1342 c1342;
        InterfaceC2468 interfaceC24682;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        Ref$LongRef ref$LongRef2;
        float f;
        C1342 c13422;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
        int size;
        Object obj;
        int i2;
        Object obj2;
        C2478 c2478;
        Object obj3;
        Object objM3559;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(baseContinuationImpl);
            }
        }
        Object obj4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i5 = 1;
        Object obj5 = null;
        if (i4 == 0) {
            AbstractC6017.m10769(obj4);
            Orientation orientation = Orientation.Horizontal;
            if (m1807(((C2456) interfaceC2468).f5086.f5102, j)) {
                return null;
            }
            fM1804 = m1804(((C2456) interfaceC2468).m3557(), i);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = j;
            interfaceC7383 = c1308;
            c1342 = new C1342(0L, orientation);
            interfaceC24682 = interfaceC2468;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
            C1342 c13423 = (C1342) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
            Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
            InterfaceC7383 interfaceC73832 = (InterfaceC7383) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
            AbstractC6017.m10769(obj4);
            f = f2;
            interfaceC24682 = interfaceC24683;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            c13422 = c13423;
            interfaceC7383 = interfaceC73832;
            ref$LongRef2 = ref$LongRef3;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
            C2487 c2487 = (C2487) obj4;
            List list = c2487.f5197;
            size = list.size();
            obj = obj5;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
        C2478 c24782 = (C2478) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
        C1342 c13424 = (C1342) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
        Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
        InterfaceC2468 interfaceC24684 = (InterfaceC2468) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
        InterfaceC7383 interfaceC73833 = (InterfaceC7383) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
        AbstractC6017.m10769(obj4);
        f = f3;
        interfaceC24682 = interfaceC24684;
        ref$LongRef2 = ref$LongRef4;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        c13422 = c13424;
        char c = 2;
        int i6 = 1;
        obj = null;
        long j2 = 0;
        if (!c24782.m3582()) {
            return obj;
        }
        obj5 = obj;
        i5 = i6;
        c1342 = c13422;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
        fM1804 = f;
        ref$LongRef = ref$LongRef2;
        interfaceC7383 = interfaceC73833;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = c1342;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM1804;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
        objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
        if (objM3559 != coroutineSingletons) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            c13422 = c1342;
            obj4 = objM3559;
            ref$LongRef2 = ref$LongRef;
            f = fM1804;
            interfaceC24682 = interfaceC24682;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
            C2487 c24872 = (C2487) obj4;
            List list2 = c24872.f5197;
            size = list2.size();
            obj = obj5;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj2 = obj;
                    break;
                }
                obj2 = list2.get(i2);
                if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef2.element)) {
                    break;
                }
                i2++;
            }
            c2478 = (C2478) obj2;
            if (c2478 != null || c2478.m3582()) {
                return obj;
            }
            if (AbstractC2481.m3587(c2478)) {
                i6 = 1;
                long jM1821 = c13422.m1821(f, AbstractC2481.m3591(c2478, true), true);
                if ((9223372034707292159L & jM1821) != 9205357640488583168L) {
                    interfaceC7383.invoke(c2478, new Float(Float.intBitsToFloat((int) (jM1821 >> 32))));
                    if (c2478.m3582()) {
                        return c2478;
                    }
                    c13422.f1830 = 0L;
                    obj5 = obj;
                    i5 = 1;
                    c1342 = c13422;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                    fM1804 = f;
                    ref$LongRef = ref$LongRef2;
                } else {
                    j2 = 0;
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = interfaceC7383;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = interfaceC24682;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = ref$LongRef2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = c13422;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.L$4 = c2478;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f;
                    c = 2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                    C2456 c2456 = (C2456) interfaceC24682;
                    if (c2456.m3559(pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13) != coroutineSingletons) {
                        interfaceC73833 = interfaceC7383;
                        c24782 = c2478;
                        interfaceC24682 = c2456;
                        if (!c24782.m3582()) {
                        }
                    }
                }
            } else {
                List list3 = c24872.f5197;
                int size2 = list3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj3 = obj;
                        break;
                    }
                    obj3 = list3.get(i7);
                    if (((C2478) obj3).f5151) {
                        break;
                    }
                    i7++;
                }
                C2478 c24783 = (C2478) obj3;
                if (c24783 == null) {
                    return obj;
                }
                ref$LongRef2.element = c24783.f5154;
                obj5 = obj;
                i5 = 1;
                c1342 = c13422;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                fM1804 = f;
                ref$LongRef = ref$LongRef2;
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = interfaceC7383;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = interfaceC24682;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = c1342;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = fM1804;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
            if (objM3559 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (p128.C8158.m13087(androidx.compose.p001ui.input.pointer.AbstractC2481.m3591(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:22:0x006d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1799(InterfaceC2468 interfaceC2468, long j, ContinuationImpl continuationImpl) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        Ref$LongRef ref$LongRef;
        InterfaceC2468 interfaceC24682;
        Object objM3559;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuationImpl;
            int i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuationImpl);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj3);
            if (!m1807(((C2456) interfaceC2468).f5086.f5102, j)) {
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j;
                interfaceC24682 = interfaceC2468;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = interfaceC24682;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                if (objM3559 != coroutineSingletons) {
                }
            }
            return null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
        InterfaceC2468 interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
        AbstractC6017.m10769(obj3);
        Ref$LongRef ref$LongRef3 = ref$LongRef2;
        interfaceC24682 = interfaceC24683;
        C2487 c2487 = (C2487) obj3;
        List list = c2487.f5197;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (AbstractC2481.m3586(((C2478) obj).f5154, ref$LongRef3.element)) {
                break;
            }
            i4++;
        }
        C2478 c2478 = (C2478) obj;
        if (c2478 == null) {
            if (AbstractC2481.m3587(c2478)) {
                List list2 = c2487.f5197;
                int size2 = list2.size();
                while (true) {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i3);
                    if (((C2478) obj2).f5151) {
                        break;
                    }
                    i3++;
                }
                C2478 c24782 = (C2478) obj2;
                if (c24782 != null) {
                    ref$LongRef3.element = c24782.f5154;
                    ref$LongRef = ref$LongRef3;
                    dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = interfaceC24682;
                    dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                    dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                    objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                    if (objM3559 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef;
                    obj3 = objM3559;
                    ref$LongRef3 = ref$LongRef4;
                }
            }
            C2487 c24872 = (C2487) obj3;
            List list3 = c24872.f5197;
            int size3 = list3.size();
            int i32 = 0;
            int i42 = 0;
            while (true) {
                if (i42 < size3) {
                }
                i42++;
            }
            C2478 c24783 = (C2478) obj;
            if (c24783 == null) {
                c24783 = null;
            }
        }
        if (c24783 == null || c24783.m3582()) {
            return null;
        }
        return c24783;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x00c8, B:35:0x00ce], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0096 -> B:12:0x0046). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1800(InterfaceC2468 interfaceC2468, C2478 c2478, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        Ref$LongRef ref$LongRef;
        C1342 c1342;
        int i;
        float f;
        PointerEventPass pointerEventPass2;
        InterfaceC2468 interfaceC24682;
        Object objM3559;
        int i2;
        Object obj;
        int i3;
        int size;
        int i4;
        Object obj2;
        C2478 c24782;
        int size2;
        int i5;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) baseContinuationImpl;
            int i6 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i6 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(baseContinuationImpl);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0;
            int i9 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0;
            C1342 c13422 = (C1342) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3;
            Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2;
            PointerEventPass pointerEventPass3 = (PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0;
            AbstractC6017.m10769(obj3);
            DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
            float f3 = f2;
            pointerEventPass2 = pointerEventPass3;
            ref$LongRef = ref$LongRef2;
            c1342 = c13422;
            i = i9;
            InterfaceC2468 interfaceC24684 = interfaceC24683;
            DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
            List list = ((C2487) obj3).f5197;
            int size3 = list.size();
            int i10 = 0;
            while (true) {
                if (i10 < size3) {
                    i2 = i;
                    obj = null;
                    break;
                }
                obj = list.get(i10);
                i2 = i;
                if (AbstractC2481.m3586(((C2478) obj).f5154, ref$LongRef.element)) {
                    break;
                }
                i10++;
                i = i2;
            }
            C2478 c24783 = (C2478) obj;
            if (c24783 == null && !AbstractC2481.m3587(c24783)) {
                i3 = 1;
                if ((c1342.m1821(f3, AbstractC2481.m3591(c24783, true), true) & 9223372034707292159L) != 9205357640488583168L) {
                    i = 1;
                }
                size2 = list.size();
                for (i5 = 0; i5 < size2; i5++) {
                    if (((C2478) list.get(i5)).f5151) {
                        f = f3;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                        interfaceC24682 = interfaceC24684;
                        i8 = i3;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0 = interfaceC24682;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1 = pointerEventPass2;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2 = ref$LongRef;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3 = c1342;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0 = i;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0 = f;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i8;
                        C2456 c2456 = (C2456) interfaceC24682;
                        objM3559 = c2456.m3559(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1);
                        if (objM3559 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                        f3 = f;
                        obj3 = objM3559;
                        interfaceC24684 = c2456;
                        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$132 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
                        List list2 = ((C2487) obj3).f5197;
                        int size32 = list2.size();
                        int i102 = 0;
                        while (true) {
                            if (i102 < size32) {
                            }
                            i102++;
                            i = i2;
                        }
                        C2478 c247832 = (C2478) obj;
                        if (c247832 == null) {
                        }
                        i3 = 1;
                        size = list2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                            }
                            i4++;
                        }
                        c24782 = (C2478) obj2;
                        if (c24782 != null) {
                        }
                    }
                }
                return Boolean.valueOf(i == 0 ? i3 : 0);
            }
            i3 = 1;
            size = list2.size();
            i4 = 0;
            while (true) {
                if (i4 < size) {
                    obj2 = null;
                    break;
                }
                obj2 = list2.get(i4);
                if (((C2478) obj2).f5151) {
                    break;
                }
                i4++;
            }
            c24782 = (C2478) obj2;
            if (c24782 != null) {
                return Boolean.valueOf(i2 != 0);
            }
            ref$LongRef.element = c24782.f5154;
            i = i2;
            size2 = list2.size();
            while (i5 < size2) {
            }
            return Boolean.valueOf(i == 0 ? i3 : 0);
        }
        AbstractC6017.m10769(obj3);
        if (AbstractC1362.m1869(interfaceC2468)) {
            return Boolean.FALSE;
        }
        Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = c2478.f5154;
        C2456 c24562 = (C2456) interfaceC2468;
        float fM1804 = m1804(c24562.m3557(), c2478.f5164);
        ref$LongRef = ref$LongRef3;
        c1342 = new C1342((Orientation) null, 3);
        i = 0;
        f = fM1804;
        pointerEventPass2 = pointerEventPass;
        interfaceC24682 = c24562;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0 = interfaceC24682;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1 = pointerEventPass2;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2 = ref$LongRef;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3 = c1342;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0 = i;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0 = f;
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i8;
        C2456 c24563 = (C2456) interfaceC24682;
        objM3559 = c24563.m3559(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1);
        if (objM3559 != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (r0 == 0.0f) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1801(InterfaceC2468 interfaceC2468, long j, C1312 c1312, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        InterfaceC2468 interfaceC24682;
        InterfaceC7387 interfaceC7387;
        int i;
        Orientation orientation2;
        InterfaceC2468 interfaceC24683;
        Ref$LongRef ref$LongRef;
        Object objM3559;
        InterfaceC2468 interfaceC24684;
        Object obj;
        float fIntBitsToFloat;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) baseContinuationImpl;
            int i2 = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(baseContinuationImpl);
            }
        }
        Object obj3 = dragGestureDetectorKt$verticalDrag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dragGestureDetectorKt$verticalDrag$1.label;
        C2478 c2478 = null;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) dragGestureDetectorKt$verticalDrag$1.L$4;
            interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$verticalDrag$1.L$3;
            orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.L$2;
            InterfaceC2468 interfaceC24685 = (InterfaceC2468) dragGestureDetectorKt$verticalDrag$1.L$1;
            InterfaceC7387 interfaceC73872 = (InterfaceC7387) dragGestureDetectorKt$verticalDrag$1.L$0;
            AbstractC6017.m10769(obj3);
            DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
            interfaceC7387 = interfaceC73872;
            C2487 c2487 = (C2487) obj3;
            List list = c2487.f5197;
            int size = list.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    interfaceC24684 = interfaceC24683;
                    obj = null;
                    break;
                }
                obj = list.get(i5);
                interfaceC24684 = interfaceC24683;
                if (AbstractC2481.m3586(((C2478) obj).f5154, ref$LongRef.element)) {
                    break;
                }
                i5++;
                interfaceC24683 = interfaceC24684;
            }
            C2478 c24782 = (C2478) obj;
            if (c24782 == null) {
                if (AbstractC2481.m3587(c24782)) {
                    List list2 = c2487.f5197;
                    int size2 = list2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list2.get(i6);
                        if (((C2478) obj2).f5151) {
                            break;
                        }
                        i6++;
                    }
                    C2478 c24783 = (C2478) obj2;
                    if (c24783 != null) {
                        ref$LongRef.element = c24783.f5154;
                        i = 1;
                    }
                } else {
                    i = 1;
                    long jM3591 = AbstractC2481.m3591(c24782, true);
                    if (orientation2 != null) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? jM3591 & 4294967295L : jM3591 >> 32));
                    } else {
                        fIntBitsToFloat = C8158.m13086(jM3591);
                    }
                }
                interfaceC24683 = interfaceC24684;
                interfaceC24682 = interfaceC24685;
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                i4 = i;
                dragGestureDetectorKt$verticalDrag$12.L$0 = interfaceC7387;
                dragGestureDetectorKt$verticalDrag$12.L$1 = interfaceC24682;
                dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                dragGestureDetectorKt$verticalDrag$12.L$3 = interfaceC24683;
                dragGestureDetectorKt$verticalDrag$12.L$4 = ref$LongRef;
                dragGestureDetectorKt$verticalDrag$12.label = i4;
                objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
                if (objM3559 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                interfaceC24685 = interfaceC24682;
                obj3 = objM3559;
                dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                C2487 c24872 = (C2487) obj3;
                List list3 = c24872.f5197;
                int size3 = list3.size();
                int i52 = 0;
                while (true) {
                    if (i52 < size3) {
                    }
                    i52++;
                    interfaceC24683 = interfaceC24684;
                }
                C2478 c247822 = (C2478) obj;
                if (c247822 == null) {
                    c247822 = null;
                }
            }
            i = 1;
            if (c247822 == null || c247822.m3582()) {
                c2478 = null;
            } else if (AbstractC2481.m3587(c247822)) {
                c2478 = c247822;
            } else {
                interfaceC7387.invoke(c247822);
                orientation = orientation2;
                j2 = c247822.f5154;
                interfaceC24682 = interfaceC24685;
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                i4 = i;
                Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                ref$LongRef2.element = j2;
                interfaceC24683 = interfaceC24682;
                orientation2 = orientation;
                ref$LongRef = ref$LongRef2;
                dragGestureDetectorKt$verticalDrag$12.L$0 = interfaceC7387;
                dragGestureDetectorKt$verticalDrag$12.L$1 = interfaceC24682;
                dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                dragGestureDetectorKt$verticalDrag$12.L$3 = interfaceC24683;
                dragGestureDetectorKt$verticalDrag$12.L$4 = ref$LongRef;
                dragGestureDetectorKt$verticalDrag$12.label = i4;
                objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
                if (objM3559 == coroutineSingletons) {
                }
            }
            return Boolean.valueOf(c2478 == null ? i : 0);
        }
        AbstractC6017.m10769(obj3);
        Orientation orientation3 = Orientation.Vertical;
        j2 = j;
        if (m1807(((C2456) interfaceC2468).f5086.f5102, j2)) {
            i = 1;
            return Boolean.valueOf(c2478 == null ? i : 0);
        }
        orientation = orientation3;
        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
        interfaceC24682 = interfaceC2468;
        interfaceC7387 = c1312;
        Ref$LongRef ref$LongRef22 = new Ref$LongRef();
        ref$LongRef22.element = j2;
        interfaceC24683 = interfaceC24682;
        orientation2 = orientation;
        ref$LongRef = ref$LongRef22;
        dragGestureDetectorKt$verticalDrag$12.L$0 = interfaceC7387;
        dragGestureDetectorKt$verticalDrag$12.L$1 = interfaceC24682;
        dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
        dragGestureDetectorKt$verticalDrag$12.L$3 = interfaceC24683;
        dragGestureDetectorKt$verticalDrag$12.L$4 = ref$LongRef;
        dragGestureDetectorKt$verticalDrag$12.label = i4;
        objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$12);
        if (objM3559 == coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1802(InterfaceC2468 interfaceC2468, long j, InterfaceC7387 interfaceC7387, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        C2478 c2478;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) baseContinuationImpl;
            int i = dragGestureDetectorKt$drag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(baseContinuationImpl);
            }
        }
        Object objM1799 = dragGestureDetectorKt$drag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureDetectorKt$drag$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM1799);
            dragGestureDetectorKt$drag$1.L$0 = interfaceC2468;
            dragGestureDetectorKt$drag$1.L$1 = interfaceC7387;
            dragGestureDetectorKt$drag$1.label = 1;
            objM1799 = m1799(interfaceC2468, j, dragGestureDetectorKt$drag$1);
            if (objM1799 == coroutineSingletons) {
            }
            c2478 = (C2478) objM1799;
            if (c2478 == null) {
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC7387 interfaceC73872 = (InterfaceC7387) dragGestureDetectorKt$drag$1.L$1;
            InterfaceC2468 interfaceC24682 = (InterfaceC2468) dragGestureDetectorKt$drag$1.L$0;
            AbstractC6017.m10769(objM1799);
            interfaceC7387 = interfaceC73872;
            interfaceC2468 = interfaceC24682;
            c2478 = (C2478) objM1799;
            if (c2478 == null) {
                if (AbstractC2481.m3587(c2478)) {
                    return Boolean.TRUE;
                }
                interfaceC7387.invoke(c2478);
                j = c2478.f5154;
                dragGestureDetectorKt$drag$1.L$0 = interfaceC2468;
                dragGestureDetectorKt$drag$1.L$1 = interfaceC7387;
                dragGestureDetectorKt$drag$1.label = 1;
                objM1799 = m1799(interfaceC2468, j, dragGestureDetectorKt$drag$1);
                if (objM1799 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c2478 = (C2478) objM1799;
                if (c2478 == null) {
                    return Boolean.FALSE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m1803(InterfaceC2470 interfaceC2470, final InterfaceC7387 interfaceC7387, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        Object objM1871 = AbstractC1362.m1871(interfaceC2470, new DragGestureDetectorKt$detectDragGestures$13(new C1359(1), null, new InterfaceC7380() { // from class: androidx.compose.foundation.gestures.飘花落叶言子世哲苏楪兰
            @Override // p068.InterfaceC7380
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                interfaceC7387.invoke(new C8158(((C2478) obj2).f5152));
                return C6008.f15084;
            }
        }, interfaceC7383, interfaceC73722, new C1351(interfaceC7372, 1), null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (objM1871 != coroutineSingletons) {
            objM1871 = c6008;
        }
        return objM1871 == coroutineSingletons ? objM1871 : c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final float m1804(InterfaceC2698 interfaceC2698, int i) {
        return i == 2 ? interfaceC2698.mo3838() * f1775 : interfaceC2698.mo3838();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x05e1, code lost:
    
        if (r3 != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0682, code lost:
    
        if (p128.C8158.m13086(androidx.compose.p001ui.input.pointer.AbstractC2481.m3591(r11, true)) == 0.0f) goto L201;
     */
    /* JADX WARN: Path cross not found for [B:199:0x0676, B:188:0x0651], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0400  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x041d -> B:91:0x03ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0465 -> B:120:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0599 -> B:161:0x05a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x05af -> B:166:0x05b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0613 -> B:176:0x0616). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0241 -> B:31:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02d2 -> B:31:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x032a -> B:77:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x037b -> B:74:0x0383). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1805(InterfaceC2468 interfaceC2468, C2478 c2478, InterfaceC7372 interfaceC7372, Orientation orientation, InterfaceC7380 interfaceC7380, InterfaceC7383 interfaceC7383, InterfaceC7372 interfaceC73722, InterfaceC7387 interfaceC7387, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$1;
        long j;
        long j2;
        C2478 c24782;
        InterfaceC7387 interfaceC73872;
        Orientation orientation2;
        InterfaceC7372 interfaceC73723;
        InterfaceC7380 interfaceC73802;
        InterfaceC7383 interfaceC73832;
        InterfaceC2468 interfaceC24682;
        boolean z;
        C2478 c24783;
        Ref$LongRef ref$LongRef;
        CoroutineSingletons coroutineSingletons;
        float fM1804;
        C2478 c24784;
        InterfaceC7380 interfaceC73803;
        Ref$LongRef ref$LongRef2;
        C1342 c1342;
        Orientation orientation3;
        Ref$LongRef ref$LongRef3;
        InterfaceC7383 interfaceC73833;
        InterfaceC2468 interfaceC24683;
        InterfaceC2468 interfaceC24684;
        int size;
        int i;
        InterfaceC7387 interfaceC73873;
        InterfaceC7372 interfaceC73724;
        Object obj;
        C2478 c24785;
        C2478 c24786;
        InterfaceC2468 interfaceC24685;
        InterfaceC7387 interfaceC73874;
        InterfaceC7380 interfaceC73804;
        Ref$LongRef ref$LongRef4;
        C1342 c13422;
        InterfaceC2468 interfaceC24686;
        InterfaceC2468 interfaceC24687;
        Object obj2;
        InterfaceC2468 interfaceC24688;
        int i2;
        int i3;
        Object objM3559;
        InterfaceC2468 interfaceC24689;
        long j3;
        Ref$LongRef ref$LongRef5;
        C2478 c24787;
        C2478 c24788;
        InterfaceC7387 interfaceC73875;
        InterfaceC7372 interfaceC73725;
        InterfaceC7383 interfaceC73834;
        InterfaceC7380 interfaceC73805;
        Orientation orientation4;
        C1342 c13423;
        InterfaceC7387 interfaceC73876;
        InterfaceC7380 interfaceC73806;
        Ref$LongRef ref$LongRef6;
        InterfaceC2468 interfaceC246810;
        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$12;
        float f;
        int size2;
        int i4;
        int size3;
        int i5;
        InterfaceC2468 interfaceC246811;
        float fM18042;
        C1342 c13424;
        InterfaceC7387 interfaceC73877;
        InterfaceC2468 interfaceC246812;
        InterfaceC2468 interfaceC246813;
        InterfaceC2468 interfaceC246814;
        long j4;
        InterfaceC2468 interfaceC246815;
        List list;
        int size4;
        int i6;
        C2478 c24789;
        Object obj3;
        C2478 c247810;
        C2478 c247811;
        Object obj4;
        int i7;
        List list2;
        int i8;
        Object objM35592;
        InterfaceC2468 interfaceC246816;
        InterfaceC2468 interfaceC246817;
        InterfaceC2468 interfaceC246818;
        C2478 c247812;
        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$13;
        Object obj5;
        Object obj6;
        List list3;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$processDragGesture$1) {
            dragGestureDetectorKt$processDragGesture$1 = (DragGestureDetectorKt$processDragGesture$1) baseContinuationImpl;
            int i9 = dragGestureDetectorKt$processDragGesture$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$processDragGesture$1.label = i9 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$processDragGesture$1 = new DragGestureDetectorKt$processDragGesture$1(baseContinuationImpl);
            }
        }
        Object objM35593 = dragGestureDetectorKt$processDragGesture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (dragGestureDetectorKt$processDragGesture$1.label) {
            case 0:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                AbstractC6017.m10769(objM35593);
                boolean zBooleanValue = ((Boolean) interfaceC7372.invoke()).booleanValue();
                if (!zBooleanValue) {
                    c2478.m3584();
                }
                dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC2468;
                dragGestureDetectorKt$processDragGesture$1.L$1 = c2478;
                dragGestureDetectorKt$processDragGesture$1.L$2 = orientation;
                dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC7380;
                dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC7383;
                dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73722;
                dragGestureDetectorKt$processDragGesture$1.L$6 = interfaceC7387;
                dragGestureDetectorKt$processDragGesture$1.Z$0 = zBooleanValue;
                dragGestureDetectorKt$processDragGesture$1.label = 1;
                Object objM1835 = AbstractC1344.m1835(interfaceC2468, null, dragGestureDetectorKt$processDragGesture$1, 2);
                if (objM1835 != coroutineSingletons2) {
                    c24782 = c2478;
                    interfaceC73872 = interfaceC7387;
                    orientation2 = orientation;
                    interfaceC73723 = interfaceC73722;
                    interfaceC73802 = interfaceC7380;
                    interfaceC73832 = interfaceC7383;
                    interfaceC24682 = interfaceC2468;
                    z = zBooleanValue;
                    objM35593 = objM1835;
                    c24783 = (C2478) objM35593;
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = 0L;
                    interfaceC24689 = interfaceC24682;
                    if (!z) {
                        coroutineSingletons = coroutineSingletons2;
                        interfaceC246814 = interfaceC24682;
                        if (c24782 == null) {
                            List list4 = ((C2456) interfaceC246814).f5086.f5102.f5197;
                            int size5 = list4.size();
                            for (int i10 = 0; i10 < size5; i10++) {
                                if (((C2478) list4.get(i10)).f5151) {
                                    InterfaceC7372 interfaceC73726 = interfaceC73723;
                                    c24788 = c24783;
                                    Orientation orientation5 = orientation2;
                                    interfaceC73834 = interfaceC73832;
                                    interfaceC73875 = interfaceC73872;
                                    c24787 = c24782;
                                    interfaceC73805 = interfaceC73802;
                                    interfaceC73725 = interfaceC73726;
                                    ref$LongRef5 = ref$LongRef;
                                    InterfaceC2468 interfaceC246819 = interfaceC246814;
                                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                                    dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC246819;
                                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation5;
                                    dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73805;
                                    dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73834;
                                    dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73725;
                                    dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73875;
                                    dragGestureDetectorKt$processDragGesture$1.L$6 = c24788;
                                    dragGestureDetectorKt$processDragGesture$1.L$7 = c24787;
                                    dragGestureDetectorKt$processDragGesture$1.L$8 = ref$LongRef5;
                                    dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                    dragGestureDetectorKt$processDragGesture$1.label = 4;
                                    C2456 c2456 = (C2456) interfaceC246819;
                                    Object objM35594 = c2456.m3559(pointerEventPass, dragGestureDetectorKt$processDragGesture$1);
                                    if (objM35594 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    orientation4 = orientation5;
                                    objM35593 = objM35594;
                                    interfaceC246810 = c2456;
                                    List list5 = ((C2487) objM35593).f5197;
                                    size2 = list5.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size2) {
                                            if (((C2478) list5.get(i4)).m3582()) {
                                                int size6 = list5.size();
                                                for (int i11 = 0; i11 < size6; i11++) {
                                                    if (((C2478) list5.get(i11)).f5151) {
                                                        orientation5 = orientation4;
                                                        interfaceC246819 = interfaceC246810;
                                                    }
                                                }
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    size3 = list5.size();
                                    for (i5 = 0; i5 < size3; i5++) {
                                        if (((C2478) list5.get(i5)).f5151) {
                                            C2478 c247813 = (C2478) AbstractC5176.m9374(list5);
                                            long jM13085 = C8158.m13085(c247813 != null ? c247813.f5152 : 0L, c24788.f5152);
                                            long j5 = c24788.f5154;
                                            int i12 = c24788.f5164;
                                            if (m1807(((C2456) interfaceC246810).f5086.f5102, j5)) {
                                                c24783 = c24788;
                                                interfaceC73872 = interfaceC73875;
                                                interfaceC73723 = interfaceC73725;
                                                interfaceC73832 = interfaceC73834;
                                                interfaceC73802 = interfaceC73805;
                                                orientation2 = orientation4;
                                                interfaceC246813 = interfaceC246810;
                                                c24782 = null;
                                                interfaceC246811 = interfaceC246813;
                                                ref$LongRef = ref$LongRef5;
                                                interfaceC246814 = interfaceC246811;
                                                if (c24782 == null) {
                                                }
                                            } else {
                                                fM18042 = m1804(((C2456) interfaceC246810).m3557(), i12);
                                                ref$LongRef6 = new Ref$LongRef();
                                                ref$LongRef6.element = j5;
                                                c13424 = new C1342(jM13085, orientation4);
                                                interfaceC73877 = interfaceC73875;
                                                interfaceC246812 = interfaceC246810;
                                                dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC246810;
                                                dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                                                dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73805;
                                                dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73834;
                                                dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73725;
                                                dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73877;
                                                dragGestureDetectorKt$processDragGesture$1.L$6 = c24788;
                                                dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef5;
                                                dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC246812;
                                                dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef6;
                                                dragGestureDetectorKt$processDragGesture$1.L$10 = c13424;
                                                dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                                dragGestureDetectorKt$processDragGesture$1.F$0 = fM18042;
                                                dragGestureDetectorKt$processDragGesture$1.label = 5;
                                                objM35592 = ((C2456) interfaceC246812).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                                if (objM35592 != coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$14 = dragGestureDetectorKt$processDragGesture$1;
                                                f = fM18042;
                                                objM35593 = objM35592;
                                                c13423 = c13424;
                                                interfaceC73806 = interfaceC73805;
                                                interfaceC73876 = interfaceC73877;
                                                dragGestureDetectorKt$processDragGesture$12 = dragGestureDetectorKt$processDragGesture$14;
                                                interfaceC246815 = interfaceC246812;
                                                interfaceC246810 = interfaceC246810;
                                                C2487 c2487 = (C2487) objM35593;
                                                list = c2487.f5197;
                                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                                size4 = list.size();
                                                InterfaceC2468 interfaceC246820 = interfaceC246815;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 >= size4) {
                                                        obj3 = list.get(i6);
                                                        i7 = i6;
                                                        list2 = list;
                                                        i8 = size4;
                                                        c24789 = c24788;
                                                        if (!AbstractC2481.m3586(((C2478) obj3).f5154, ref$LongRef6.element)) {
                                                            i6 = i7 + 1;
                                                            list = list2;
                                                            size4 = i8;
                                                            c24788 = c24789;
                                                        }
                                                    } else {
                                                        c24789 = c24788;
                                                        obj3 = null;
                                                    }
                                                }
                                                c247810 = (C2478) obj3;
                                                if (c247810 != null && !c247810.m3582()) {
                                                    if (AbstractC2481.m3587(c247810)) {
                                                        List list6 = c2487.f5197;
                                                        int size7 = list6.size();
                                                        int i13 = 0;
                                                        while (true) {
                                                            if (i13 < size7) {
                                                                obj4 = list6.get(i13);
                                                                if (!((C2478) obj4).f5151) {
                                                                    i13++;
                                                                }
                                                            } else {
                                                                obj4 = null;
                                                            }
                                                        }
                                                        C2478 c247814 = (C2478) obj4;
                                                        if (c247814 != null) {
                                                            ref$LongRef6.element = c247814.f5154;
                                                            c24788 = c24789;
                                                            fM18042 = f;
                                                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                                            interfaceC73877 = interfaceC73876;
                                                            interfaceC73805 = interfaceC73806;
                                                            interfaceC246812 = interfaceC246820;
                                                            coroutineSingletons = coroutineSingletons3;
                                                            c13424 = c13423;
                                                        }
                                                    } else if ((c13423.m1821(f, AbstractC2481.m3591(c247810, true), true) & j2) != j) {
                                                        c247810.m3584();
                                                        ref$LongRef5.element = AbstractC2481.m3591(c247810, false);
                                                        if (c247810.m3582()) {
                                                            c24783 = c24789;
                                                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                                            interfaceC73832 = interfaceC73834;
                                                            interfaceC73872 = interfaceC73876;
                                                            orientation2 = orientation4;
                                                            interfaceC246814 = interfaceC246810;
                                                            coroutineSingletons = coroutineSingletons3;
                                                            ref$LongRef = ref$LongRef5;
                                                            c24782 = c247810;
                                                            interfaceC73723 = interfaceC73725;
                                                            interfaceC73802 = interfaceC73806;
                                                            if (c24782 == null) {
                                                            }
                                                        } else {
                                                            c13423.f1830 = 0L;
                                                            c24788 = c24789;
                                                            fM18042 = f;
                                                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                                            interfaceC73877 = interfaceC73876;
                                                            interfaceC73805 = interfaceC73806;
                                                            interfaceC246812 = interfaceC246820;
                                                            coroutineSingletons = coroutineSingletons3;
                                                            c13424 = c13423;
                                                        }
                                                    } else {
                                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                                        dragGestureDetectorKt$processDragGesture$12.L$0 = interfaceC246810;
                                                        dragGestureDetectorKt$processDragGesture$12.L$1 = orientation4;
                                                        dragGestureDetectorKt$processDragGesture$12.L$2 = interfaceC73806;
                                                        dragGestureDetectorKt$processDragGesture$12.L$3 = interfaceC73834;
                                                        dragGestureDetectorKt$processDragGesture$12.L$4 = interfaceC73725;
                                                        dragGestureDetectorKt$processDragGesture$12.L$5 = interfaceC73876;
                                                        C2478 c247815 = c24789;
                                                        dragGestureDetectorKt$processDragGesture$12.L$6 = c247815;
                                                        dragGestureDetectorKt$processDragGesture$12.L$7 = ref$LongRef5;
                                                        dragGestureDetectorKt$processDragGesture$12.L$8 = interfaceC246820;
                                                        dragGestureDetectorKt$processDragGesture$12.L$9 = ref$LongRef6;
                                                        dragGestureDetectorKt$processDragGesture$12.L$10 = c13423;
                                                        dragGestureDetectorKt$processDragGesture$12.L$11 = c247810;
                                                        dragGestureDetectorKt$processDragGesture$12.F$0 = f;
                                                        dragGestureDetectorKt$processDragGesture$12.label = 6;
                                                        C2456 c24562 = (C2456) interfaceC246820;
                                                        coroutineSingletons = coroutineSingletons3;
                                                        if (c24562.m3559(pointerEventPass2, dragGestureDetectorKt$processDragGesture$12) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                        fM18042 = f;
                                                        dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                                        interfaceC73877 = interfaceC73876;
                                                        interfaceC73805 = interfaceC73806;
                                                        c13424 = c13423;
                                                        c247811 = c247810;
                                                        c24788 = c247815;
                                                        interfaceC246812 = c24562;
                                                        interfaceC246810 = interfaceC246810;
                                                        if (c247811.m3582()) {
                                                            interfaceC73872 = interfaceC73877;
                                                            c24783 = c24788;
                                                            interfaceC73723 = interfaceC73725;
                                                            interfaceC73832 = interfaceC73834;
                                                            interfaceC73802 = interfaceC73805;
                                                            orientation2 = orientation4;
                                                            interfaceC246813 = interfaceC246810;
                                                            c24782 = null;
                                                            interfaceC246811 = interfaceC246813;
                                                            ref$LongRef = ref$LongRef5;
                                                            interfaceC246814 = interfaceC246811;
                                                            if (c24782 == null) {
                                                            }
                                                        }
                                                    }
                                                    dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC246810;
                                                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                                                    dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73805;
                                                    dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73834;
                                                    dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73725;
                                                    dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73877;
                                                    dragGestureDetectorKt$processDragGesture$1.L$6 = c24788;
                                                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef5;
                                                    dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC246812;
                                                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef6;
                                                    dragGestureDetectorKt$processDragGesture$1.L$10 = c13424;
                                                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                                    dragGestureDetectorKt$processDragGesture$1.F$0 = fM18042;
                                                    dragGestureDetectorKt$processDragGesture$1.label = 5;
                                                    objM35592 = ((C2456) interfaceC246812).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                                    if (objM35592 != coroutineSingletons) {
                                                    }
                                                }
                                                c24783 = c24789;
                                                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                                interfaceC73723 = interfaceC73725;
                                                interfaceC73832 = interfaceC73834;
                                                interfaceC73872 = interfaceC73876;
                                                orientation2 = orientation4;
                                                interfaceC246813 = interfaceC246810;
                                                interfaceC73802 = interfaceC73806;
                                                coroutineSingletons = coroutineSingletons3;
                                                c24782 = null;
                                                interfaceC246811 = interfaceC246813;
                                                ref$LongRef = ref$LongRef5;
                                                interfaceC246814 = interfaceC246811;
                                                if (c24782 == null) {
                                                }
                                            }
                                        }
                                    }
                                    c24783 = c24788;
                                    interfaceC73723 = interfaceC73725;
                                    interfaceC73802 = interfaceC73805;
                                    c24782 = c24787;
                                    interfaceC73872 = interfaceC73875;
                                    interfaceC73832 = interfaceC73834;
                                    orientation2 = orientation4;
                                    interfaceC246811 = interfaceC246810;
                                    ref$LongRef = ref$LongRef5;
                                    interfaceC246814 = interfaceC246811;
                                    if (c24782 == null) {
                                    }
                                }
                            }
                        }
                        if (c24782 != null) {
                            interfaceC73802.invoke(c24783, c24782, new C8158(ref$LongRef.element));
                            interfaceC73832.invoke(c24782, new C8158(ref$LongRef.element));
                            j4 = c24782.f5154;
                            boolean zM1807 = m1807(((C2456) interfaceC246814).f5086.f5102, j4);
                            interfaceC246818 = interfaceC246814;
                            break;
                        }
                        return C6008.f15084;
                    }
                    j3 = c24783.f5154;
                    int i14 = c24783.f5164;
                    if (m1807(((C2456) interfaceC24689).f5086.f5102, j3)) {
                        coroutineSingletons = coroutineSingletons2;
                        interfaceC24688 = interfaceC24689;
                        c24785 = null;
                        interfaceC24687 = interfaceC24688;
                        if (c24785 != null || c24785.m3582()) {
                            c24782 = c24785;
                            interfaceC246814 = interfaceC24687;
                            if (c24782 == null) {
                            }
                            if (c24782 != null) {
                            }
                            return C6008.f15084;
                        }
                        coroutineSingletons2 = coroutineSingletons;
                        interfaceC24689 = interfaceC24687;
                        j3 = c24783.f5154;
                        int i142 = c24783.f5164;
                        if (m1807(((C2456) interfaceC24689).f5086.f5102, j3)) {
                            fM1804 = m1804(((C2456) interfaceC24689).m3557(), i142);
                            Ref$LongRef ref$LongRef7 = new Ref$LongRef();
                            ref$LongRef7.element = j3;
                            c13422 = new C1342(0L, orientation2);
                            ref$LongRef4 = ref$LongRef;
                            interfaceC24683 = interfaceC24689;
                            ref$LongRef2 = ref$LongRef7;
                            orientation3 = orientation2;
                            interfaceC73804 = interfaceC73802;
                            interfaceC73833 = interfaceC73832;
                            interfaceC24686 = interfaceC24683;
                            dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC24683;
                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation3;
                            dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73804;
                            dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73833;
                            dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73723;
                            dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73872;
                            dragGestureDetectorKt$processDragGesture$1.L$6 = c24783;
                            dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                            dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC24686;
                            dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef2;
                            dragGestureDetectorKt$processDragGesture$1.L$10 = c13422;
                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                            dragGestureDetectorKt$processDragGesture$1.F$0 = fM1804;
                            dragGestureDetectorKt$processDragGesture$1.label = 2;
                            objM3559 = ((C2456) interfaceC24686).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                            if (objM3559 != coroutineSingletons2) {
                                InterfaceC7380 interfaceC73807 = interfaceC73804;
                                c24784 = c24783;
                                objM35593 = objM3559;
                                c1342 = c13422;
                                ref$LongRef3 = ref$LongRef4;
                                interfaceC73803 = interfaceC73807;
                                interfaceC24684 = interfaceC24686;
                                interfaceC24683 = interfaceC24683;
                                C2487 c24872 = (C2487) objM35593;
                                List list7 = c24872.f5197;
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                                size = list7.size();
                                InterfaceC2468 interfaceC246821 = interfaceC24684;
                                i = 0;
                                while (true) {
                                    if (i >= size) {
                                        obj = list7.get(i);
                                        i2 = size;
                                        interfaceC73873 = interfaceC73872;
                                        interfaceC73724 = interfaceC73723;
                                        i3 = i;
                                        if (!AbstractC2481.m3586(((C2478) obj).f5154, ref$LongRef2.element)) {
                                            i = i3 + 1;
                                            size = i2;
                                            interfaceC73872 = interfaceC73873;
                                            interfaceC73723 = interfaceC73724;
                                        }
                                    } else {
                                        interfaceC73873 = interfaceC73872;
                                        interfaceC73724 = interfaceC73723;
                                        obj = null;
                                    }
                                }
                                c24785 = (C2478) obj;
                                if (c24785 != null && !c24785.m3582()) {
                                    if (AbstractC2481.m3587(c24785)) {
                                        long jM1821 = c1342.m1821(fM1804, AbstractC2481.m3591(c24785, true), true);
                                        if ((jM1821 & j2) != j) {
                                            c24785.m3584();
                                            ref$LongRef3.element = jM1821;
                                            if (c24785.m3582()) {
                                                interfaceC73872 = interfaceC73873;
                                                interfaceC73723 = interfaceC73724;
                                                interfaceC73832 = interfaceC73833;
                                                c24783 = c24784;
                                                orientation2 = orientation3;
                                                interfaceC24687 = interfaceC24683;
                                                interfaceC73802 = interfaceC73803;
                                                ref$LongRef = ref$LongRef3;
                                                coroutineSingletons = coroutineSingletons4;
                                                if (c24785 != null) {
                                                }
                                                c24782 = c24785;
                                                interfaceC246814 = interfaceC24687;
                                                if (c24782 == null) {
                                                }
                                                if (c24782 != null) {
                                                }
                                                return C6008.f15084;
                                            }
                                            c1342.f1830 = 0L;
                                            interfaceC24686 = interfaceC246821;
                                            interfaceC73872 = interfaceC73873;
                                            interfaceC73723 = interfaceC73724;
                                            c24783 = c24784;
                                            interfaceC73804 = interfaceC73803;
                                            ref$LongRef4 = ref$LongRef3;
                                            c13422 = c1342;
                                            coroutineSingletons2 = coroutineSingletons4;
                                        } else {
                                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                            dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC24683;
                                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation3;
                                            dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73803;
                                            dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73833;
                                            interfaceC73723 = interfaceC73724;
                                            dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73723;
                                            InterfaceC7387 interfaceC73878 = interfaceC73873;
                                            dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73878;
                                            dragGestureDetectorKt$processDragGesture$1.L$6 = c24784;
                                            dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef3;
                                            dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC246821;
                                            dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef2;
                                            dragGestureDetectorKt$processDragGesture$1.L$10 = c1342;
                                            dragGestureDetectorKt$processDragGesture$1.L$11 = c24785;
                                            dragGestureDetectorKt$processDragGesture$1.F$0 = fM1804;
                                            dragGestureDetectorKt$processDragGesture$1.label = 3;
                                            C2456 c24563 = (C2456) interfaceC246821;
                                            coroutineSingletons = coroutineSingletons4;
                                            if (c24563.m3559(pointerEventPass3, dragGestureDetectorKt$processDragGesture$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            c24786 = c24785;
                                            interfaceC24685 = interfaceC24683;
                                            interfaceC73874 = interfaceC73878;
                                            c24783 = c24784;
                                            interfaceC73804 = interfaceC73803;
                                            ref$LongRef4 = ref$LongRef3;
                                            c13422 = c1342;
                                            interfaceC24686 = c24563;
                                            if (!c24786.m3582()) {
                                                interfaceC24688 = interfaceC24685;
                                                interfaceC73832 = interfaceC73833;
                                                interfaceC73802 = interfaceC73804;
                                                orientation2 = orientation3;
                                                interfaceC73872 = interfaceC73874;
                                                ref$LongRef = ref$LongRef4;
                                                c24785 = null;
                                                interfaceC24687 = interfaceC24688;
                                                if (c24785 != null) {
                                                }
                                                c24782 = c24785;
                                                interfaceC246814 = interfaceC24687;
                                                if (c24782 == null) {
                                                }
                                                if (c24782 != null) {
                                                }
                                                return C6008.f15084;
                                            }
                                            interfaceC73872 = interfaceC73874;
                                            interfaceC24683 = interfaceC24685;
                                            coroutineSingletons2 = coroutineSingletons;
                                        }
                                    } else {
                                        List list8 = c24872.f5197;
                                        int size8 = list8.size();
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < size8) {
                                                obj2 = list8.get(i15);
                                                if (!((C2478) obj2).f5151) {
                                                    i15++;
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        C2478 c247816 = (C2478) obj2;
                                        if (c247816 != null) {
                                            ref$LongRef2.element = c247816.f5154;
                                            interfaceC24686 = interfaceC246821;
                                            interfaceC73872 = interfaceC73873;
                                            interfaceC73723 = interfaceC73724;
                                            c24783 = c24784;
                                            interfaceC73804 = interfaceC73803;
                                            ref$LongRef4 = ref$LongRef3;
                                            c13422 = c1342;
                                            coroutineSingletons2 = coroutineSingletons4;
                                        }
                                    }
                                    dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC24683;
                                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation3;
                                    dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73804;
                                    dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73833;
                                    dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73723;
                                    dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73872;
                                    dragGestureDetectorKt$processDragGesture$1.L$6 = c24783;
                                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                                    dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC24686;
                                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef2;
                                    dragGestureDetectorKt$processDragGesture$1.L$10 = c13422;
                                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                    dragGestureDetectorKt$processDragGesture$1.F$0 = fM1804;
                                    dragGestureDetectorKt$processDragGesture$1.label = 2;
                                    objM3559 = ((C2456) interfaceC24686).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                    if (objM3559 != coroutineSingletons2) {
                                    }
                                }
                                interfaceC73872 = interfaceC73873;
                                interfaceC73723 = interfaceC73724;
                                interfaceC73832 = interfaceC73833;
                                c24783 = c24784;
                                orientation2 = orientation3;
                                interfaceC24688 = interfaceC24683;
                                interfaceC73802 = interfaceC73803;
                                ref$LongRef = ref$LongRef3;
                                coroutineSingletons = coroutineSingletons4;
                                c24785 = null;
                                interfaceC24687 = interfaceC24688;
                                if (c24785 != null) {
                                }
                                c24782 = c24785;
                                interfaceC246814 = interfaceC24687;
                                if (c24782 == null) {
                                }
                                if (c24782 != null) {
                                }
                                return C6008.f15084;
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                z = dragGestureDetectorKt$processDragGesture$1.Z$0;
                interfaceC73872 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$6;
                interfaceC73723 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$5;
                interfaceC73832 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$4;
                interfaceC73802 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$2;
                c24782 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246822 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                interfaceC24682 = interfaceC246822;
                c24783 = (C2478) objM35593;
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = 0L;
                interfaceC24689 = interfaceC24682;
                if (!z) {
                }
                j3 = c24783.f5154;
                int i1422 = c24783.f5164;
                if (m1807(((C2456) interfaceC24689).f5086.f5102, j3)) {
                }
                break;
            case 2:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                fM1804 = dragGestureDetectorKt$processDragGesture$1.F$0;
                C1342 c13425 = (C1342) dragGestureDetectorKt$processDragGesture$1.L$10;
                Ref$LongRef ref$LongRef8 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                InterfaceC2468 interfaceC246823 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$8;
                Ref$LongRef ref$LongRef9 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                c24784 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$6;
                InterfaceC7387 interfaceC73879 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$5;
                InterfaceC7372 interfaceC73727 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$4;
                InterfaceC7383 interfaceC73835 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$3;
                interfaceC73803 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$2;
                Orientation orientation6 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246824 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                ref$LongRef2 = ref$LongRef8;
                interfaceC73723 = interfaceC73727;
                c1342 = c13425;
                interfaceC73872 = interfaceC73879;
                orientation3 = orientation6;
                ref$LongRef3 = ref$LongRef9;
                interfaceC73833 = interfaceC73835;
                interfaceC24683 = interfaceC246824;
                interfaceC24684 = interfaceC246823;
                C2487 c248722 = (C2487) objM35593;
                List list72 = c248722.f5197;
                CoroutineSingletons coroutineSingletons42 = coroutineSingletons2;
                size = list72.size();
                InterfaceC2468 interfaceC2468212 = interfaceC24684;
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i = i3 + 1;
                    size = i2;
                    interfaceC73872 = interfaceC73873;
                    interfaceC73723 = interfaceC73724;
                }
                c24785 = (C2478) obj;
                if (c24785 != null) {
                    if (AbstractC2481.m3587(c24785)) {
                    }
                    dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC24683;
                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation3;
                    dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73804;
                    dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73833;
                    dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73723;
                    dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73872;
                    dragGestureDetectorKt$processDragGesture$1.L$6 = c24783;
                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                    dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC24686;
                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef2;
                    dragGestureDetectorKt$processDragGesture$1.L$10 = c13422;
                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                    dragGestureDetectorKt$processDragGesture$1.F$0 = fM1804;
                    dragGestureDetectorKt$processDragGesture$1.label = 2;
                    objM3559 = ((C2456) interfaceC24686).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                    if (objM3559 != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                interfaceC73872 = interfaceC73873;
                interfaceC73723 = interfaceC73724;
                interfaceC73832 = interfaceC73833;
                c24783 = c24784;
                orientation2 = orientation3;
                interfaceC24688 = interfaceC24683;
                interfaceC73802 = interfaceC73803;
                ref$LongRef = ref$LongRef3;
                coroutineSingletons = coroutineSingletons42;
                c24785 = null;
                interfaceC24687 = interfaceC24688;
                if (c24785 != null) {
                }
                c24782 = c24785;
                interfaceC246814 = interfaceC24687;
                if (c24782 == null) {
                }
                if (c24782 != null) {
                }
                return C6008.f15084;
            case 3:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                fM1804 = dragGestureDetectorKt$processDragGesture$1.F$0;
                c24786 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$11;
                C1342 c13426 = (C1342) dragGestureDetectorKt$processDragGesture$1.L$10;
                Ref$LongRef ref$LongRef10 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                InterfaceC2468 interfaceC246825 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$8;
                Ref$LongRef ref$LongRef11 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                C2478 c247817 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$6;
                interfaceC73874 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$5;
                InterfaceC7372 interfaceC73728 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$4;
                InterfaceC7383 interfaceC73836 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$3;
                InterfaceC7380 interfaceC73808 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$2;
                Orientation orientation7 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246826 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                c24783 = c247817;
                ref$LongRef2 = ref$LongRef10;
                interfaceC73833 = interfaceC73836;
                c13422 = c13426;
                interfaceC24686 = interfaceC246825;
                interfaceC73804 = interfaceC73808;
                coroutineSingletons = coroutineSingletons2;
                interfaceC24685 = interfaceC246826;
                interfaceC73723 = interfaceC73728;
                ref$LongRef4 = ref$LongRef11;
                orientation3 = orientation7;
                if (!c24786.m3582()) {
                }
                break;
            case 4:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                ref$LongRef5 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$8;
                c24787 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$7;
                c24788 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$6;
                interfaceC73875 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$5;
                interfaceC73725 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$4;
                interfaceC73834 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$3;
                interfaceC73805 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$2;
                orientation4 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246827 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                coroutineSingletons = coroutineSingletons2;
                interfaceC246810 = interfaceC246827;
                List list52 = ((C2487) objM35593).f5197;
                size2 = list52.size();
                i4 = 0;
                while (true) {
                    if (i4 < size2) {
                    }
                    i4++;
                }
                size3 = list52.size();
                while (i5 < size3) {
                }
                c24783 = c24788;
                interfaceC73723 = interfaceC73725;
                interfaceC73802 = interfaceC73805;
                c24782 = c24787;
                interfaceC73872 = interfaceC73875;
                interfaceC73832 = interfaceC73834;
                orientation2 = orientation4;
                interfaceC246811 = interfaceC246810;
                ref$LongRef = ref$LongRef5;
                interfaceC246814 = interfaceC246811;
                if (c24782 == null) {
                }
                if (c24782 != null) {
                }
                return C6008.f15084;
            case 5:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                float f2 = dragGestureDetectorKt$processDragGesture$1.F$0;
                c13423 = (C1342) dragGestureDetectorKt$processDragGesture$1.L$10;
                Ref$LongRef ref$LongRef12 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                InterfaceC2468 interfaceC246828 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$8;
                Ref$LongRef ref$LongRef13 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                C2478 c247818 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$6;
                interfaceC73876 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$5;
                InterfaceC7372 interfaceC73729 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$4;
                InterfaceC7383 interfaceC73837 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$3;
                interfaceC73806 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$2;
                Orientation orientation8 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246829 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                ref$LongRef6 = ref$LongRef12;
                c24788 = c247818;
                interfaceC73834 = interfaceC73837;
                interfaceC246810 = interfaceC246829;
                coroutineSingletons = coroutineSingletons2;
                dragGestureDetectorKt$processDragGesture$12 = dragGestureDetectorKt$processDragGesture$1;
                f = f2;
                ref$LongRef5 = ref$LongRef13;
                interfaceC73725 = interfaceC73729;
                orientation4 = orientation8;
                interfaceC246815 = interfaceC246828;
                C2487 c24873 = (C2487) objM35593;
                list = c24873.f5197;
                CoroutineSingletons coroutineSingletons32 = coroutineSingletons;
                size4 = list.size();
                InterfaceC2468 interfaceC2468202 = interfaceC246815;
                i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                    }
                    i6 = i7 + 1;
                    list = list2;
                    size4 = i8;
                    c24788 = c24789;
                }
                c247810 = (C2478) obj3;
                if (c247810 != null) {
                    if (AbstractC2481.m3587(c247810)) {
                    }
                    dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC246810;
                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                    dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73805;
                    dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73834;
                    dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73725;
                    dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73877;
                    dragGestureDetectorKt$processDragGesture$1.L$6 = c24788;
                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef5;
                    dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC246812;
                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef6;
                    dragGestureDetectorKt$processDragGesture$1.L$10 = c13424;
                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                    dragGestureDetectorKt$processDragGesture$1.F$0 = fM18042;
                    dragGestureDetectorKt$processDragGesture$1.label = 5;
                    objM35592 = ((C2456) interfaceC246812).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                    if (objM35592 != coroutineSingletons) {
                    }
                }
                c24783 = c24789;
                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                interfaceC73723 = interfaceC73725;
                interfaceC73832 = interfaceC73834;
                interfaceC73872 = interfaceC73876;
                orientation2 = orientation4;
                interfaceC246813 = interfaceC246810;
                interfaceC73802 = interfaceC73806;
                coroutineSingletons = coroutineSingletons32;
                c24782 = null;
                interfaceC246811 = interfaceC246813;
                ref$LongRef = ref$LongRef5;
                interfaceC246814 = interfaceC246811;
                if (c24782 == null) {
                }
                if (c24782 != null) {
                }
                return C6008.f15084;
            case 6:
                float f3 = dragGestureDetectorKt$processDragGesture$1.F$0;
                c247811 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$11;
                C1342 c13427 = (C1342) dragGestureDetectorKt$processDragGesture$1.L$10;
                ref$LongRef6 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                j = 9205357640488583168L;
                InterfaceC2468 interfaceC246830 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$8;
                Ref$LongRef ref$LongRef14 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                j2 = 9223372034707292159L;
                C2478 c247819 = (C2478) dragGestureDetectorKt$processDragGesture$1.L$6;
                InterfaceC7387 interfaceC738710 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$5;
                InterfaceC7372 interfaceC737210 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$4;
                InterfaceC7383 interfaceC73838 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$3;
                InterfaceC7380 interfaceC73809 = (InterfaceC7380) dragGestureDetectorKt$processDragGesture$1.L$2;
                Orientation orientation9 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC2468 interfaceC246831 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                fM18042 = f3;
                ref$LongRef5 = ref$LongRef14;
                interfaceC73725 = interfaceC737210;
                c13424 = c13427;
                c24788 = c247819;
                interfaceC73834 = interfaceC73838;
                orientation4 = orientation9;
                coroutineSingletons = coroutineSingletons2;
                interfaceC73877 = interfaceC738710;
                interfaceC73805 = interfaceC73809;
                interfaceC246810 = interfaceC246831;
                interfaceC246812 = interfaceC246830;
                if (c247811.m3582()) {
                }
                dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC246810;
                dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC73805;
                dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC73834;
                dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC73725;
                dragGestureDetectorKt$processDragGesture$1.L$5 = interfaceC73877;
                dragGestureDetectorKt$processDragGesture$1.L$6 = c24788;
                dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef5;
                dragGestureDetectorKt$processDragGesture$1.L$8 = interfaceC246812;
                dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef6;
                dragGestureDetectorKt$processDragGesture$1.L$10 = c13424;
                dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                dragGestureDetectorKt$processDragGesture$1.F$0 = fM18042;
                dragGestureDetectorKt$processDragGesture$1.label = 5;
                objM35592 = ((C2456) interfaceC246812).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                if (objM35592 != coroutineSingletons) {
                }
                break;
            case 7:
                Ref$LongRef ref$LongRef15 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$5;
                InterfaceC2468 interfaceC246832 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$4;
                InterfaceC2468 interfaceC246833 = (InterfaceC2468) dragGestureDetectorKt$processDragGesture$1.L$3;
                InterfaceC7387 interfaceC738711 = (InterfaceC7387) dragGestureDetectorKt$processDragGesture$1.L$2;
                InterfaceC7372 interfaceC737211 = (InterfaceC7372) dragGestureDetectorKt$processDragGesture$1.L$1;
                InterfaceC7383 interfaceC73839 = (InterfaceC7383) dragGestureDetectorKt$processDragGesture$1.L$0;
                AbstractC6017.m10769(objM35593);
                coroutineSingletons = coroutineSingletons2;
                InterfaceC2468 interfaceC246834 = interfaceC246832;
                InterfaceC2468 interfaceC246835 = interfaceC246833;
                C2487 c24874 = (C2487) objM35593;
                List list9 = c24874.f5197;
                int size9 = list9.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size9) {
                        Object obj7 = list9.get(i16);
                        dragGestureDetectorKt$processDragGesture$13 = dragGestureDetectorKt$processDragGesture$1;
                        list3 = list9;
                        if (AbstractC2481.m3586(((C2478) obj7).f5154, ref$LongRef15.element)) {
                            obj5 = obj7;
                        } else {
                            i16++;
                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                            list9 = list3;
                        }
                    } else {
                        dragGestureDetectorKt$processDragGesture$13 = dragGestureDetectorKt$processDragGesture$1;
                        obj5 = null;
                    }
                }
                C2478 c247820 = (C2478) obj5;
                if (c247820 == null) {
                    if (!AbstractC2481.m3587(c247820)) {
                        break;
                    } else {
                        List list10 = c24874.f5197;
                        int size10 = list10.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size10) {
                                obj6 = list10.get(i17);
                                if (!((C2478) obj6).f5151) {
                                    i17++;
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        C2478 c247821 = (C2478) obj6;
                        if (c247821 != null) {
                            ref$LongRef15.element = c247821.f5154;
                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                            interfaceC246817 = interfaceC246834;
                            interfaceC246816 = interfaceC246835;
                            dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC73839;
                            dragGestureDetectorKt$processDragGesture$1.L$1 = interfaceC737211;
                            dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC738711;
                            dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC246816;
                            dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC246817;
                            dragGestureDetectorKt$processDragGesture$1.L$5 = ref$LongRef15;
                            dragGestureDetectorKt$processDragGesture$1.L$6 = null;
                            dragGestureDetectorKt$processDragGesture$1.L$7 = null;
                            dragGestureDetectorKt$processDragGesture$1.L$8 = null;
                            dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                            dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                            dragGestureDetectorKt$processDragGesture$1.label = 7;
                            objM35593 = ((C2456) interfaceC246817).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                            interfaceC246834 = interfaceC246817;
                            interfaceC246835 = interfaceC246816;
                            if (objM35593 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            C2487 c248742 = (C2487) objM35593;
                            List list92 = c248742.f5197;
                            int size92 = list92.size();
                            int i162 = 0;
                            while (true) {
                                if (i162 < size92) {
                                }
                                i162++;
                                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                                list92 = list3;
                            }
                            C2478 c2478202 = (C2478) obj5;
                            if (c2478202 == null) {
                                c2478202 = null;
                            }
                        }
                    }
                }
                if (c2478202 == null || c2478202.m3582()) {
                    interfaceC73872 = interfaceC738711;
                    interfaceC73723 = interfaceC737211;
                    c247812 = null;
                    if (c247812 == null) {
                    }
                    return C6008.f15084;
                }
                if (!AbstractC2481.m3587(c2478202)) {
                    interfaceC73872 = interfaceC738711;
                    interfaceC73723 = interfaceC737211;
                    c247812 = c2478202;
                    if (c247812 == null) {
                        interfaceC73723.invoke();
                    } else {
                        interfaceC73872.invoke(c247812);
                    }
                    return C6008.f15084;
                }
                interfaceC73839.invoke(c2478202, new C8158(AbstractC2481.m3591(c2478202, false)));
                c2478202.m3584();
                j4 = c2478202.f5154;
                interfaceC246818 = interfaceC246835;
                interfaceC73872 = interfaceC738711;
                interfaceC73723 = interfaceC737211;
                interfaceC73832 = interfaceC73839;
                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                Ref$LongRef ref$LongRef16 = new Ref$LongRef();
                ref$LongRef16.element = j4;
                ref$LongRef15 = ref$LongRef16;
                interfaceC737211 = interfaceC73723;
                interfaceC73839 = interfaceC73832;
                InterfaceC2468 interfaceC246836 = interfaceC246818;
                interfaceC738711 = interfaceC73872;
                interfaceC246817 = interfaceC246836;
                interfaceC246816 = interfaceC246836;
                dragGestureDetectorKt$processDragGesture$1.L$0 = interfaceC73839;
                dragGestureDetectorKt$processDragGesture$1.L$1 = interfaceC737211;
                dragGestureDetectorKt$processDragGesture$1.L$2 = interfaceC738711;
                dragGestureDetectorKt$processDragGesture$1.L$3 = interfaceC246816;
                dragGestureDetectorKt$processDragGesture$1.L$4 = interfaceC246817;
                dragGestureDetectorKt$processDragGesture$1.L$5 = ref$LongRef15;
                dragGestureDetectorKt$processDragGesture$1.L$6 = null;
                dragGestureDetectorKt$processDragGesture$1.L$7 = null;
                dragGestureDetectorKt$processDragGesture$1.L$8 = null;
                dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                dragGestureDetectorKt$processDragGesture$1.label = 7;
                objM35593 = ((C2456) interfaceC246817).m3559(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                interfaceC246834 = interfaceC246817;
                interfaceC246835 = interfaceC246816;
                if (objM35593 == coroutineSingletons) {
                }
                C2487 c2487422 = (C2487) objM35593;
                List list922 = c2487422.f5197;
                int size922 = list922.size();
                int i1622 = 0;
                while (true) {
                    if (i1622 < size922) {
                    }
                    i1622++;
                    dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                    list922 = list3;
                }
                C2478 c24782022 = (C2478) obj5;
                if (c24782022 == null) {
                }
                if (c24782022 == null) {
                    if (!AbstractC2481.m3587(c24782022)) {
                    }
                }
                interfaceC73872 = interfaceC738711;
                interfaceC73723 = interfaceC737211;
                c247812 = null;
                if (c247812 == null) {
                }
                return C6008.f15084;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (r0 == 0.0f) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1806(InterfaceC2468 interfaceC2468, long j, C1312 c1312, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        InterfaceC2468 interfaceC24682;
        InterfaceC7387 interfaceC7387;
        int i;
        Orientation orientation2;
        InterfaceC2468 interfaceC24683;
        Ref$LongRef ref$LongRef;
        Object objM3559;
        InterfaceC2468 interfaceC24684;
        Object obj;
        float fIntBitsToFloat;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) baseContinuationImpl;
            int i2 = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(baseContinuationImpl);
            }
        }
        Object obj3 = dragGestureDetectorKt$horizontalDrag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dragGestureDetectorKt$horizontalDrag$1.label;
        C2478 c2478 = null;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) dragGestureDetectorKt$horizontalDrag$1.L$4;
            interfaceC24683 = (InterfaceC2468) dragGestureDetectorKt$horizontalDrag$1.L$3;
            orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
            InterfaceC2468 interfaceC24685 = (InterfaceC2468) dragGestureDetectorKt$horizontalDrag$1.L$1;
            InterfaceC7387 interfaceC73872 = (InterfaceC7387) dragGestureDetectorKt$horizontalDrag$1.L$0;
            AbstractC6017.m10769(obj3);
            DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
            interfaceC7387 = interfaceC73872;
            C2487 c2487 = (C2487) obj3;
            List list = c2487.f5197;
            int size = list.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    interfaceC24684 = interfaceC24683;
                    obj = null;
                    break;
                }
                obj = list.get(i5);
                interfaceC24684 = interfaceC24683;
                if (AbstractC2481.m3586(((C2478) obj).f5154, ref$LongRef.element)) {
                    break;
                }
                i5++;
                interfaceC24683 = interfaceC24684;
            }
            C2478 c24782 = (C2478) obj;
            if (c24782 == null) {
                if (AbstractC2481.m3587(c24782)) {
                    List list2 = c2487.f5197;
                    int size2 = list2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list2.get(i6);
                        if (((C2478) obj2).f5151) {
                            break;
                        }
                        i6++;
                    }
                    C2478 c24783 = (C2478) obj2;
                    if (c24783 != null) {
                        ref$LongRef.element = c24783.f5154;
                        i = 1;
                    }
                } else {
                    i = 1;
                    long jM3591 = AbstractC2481.m3591(c24782, true);
                    if (orientation2 != null) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? jM3591 & 4294967295L : jM3591 >> 32));
                    } else {
                        fIntBitsToFloat = C8158.m13086(jM3591);
                    }
                }
                interfaceC24683 = interfaceC24684;
                interfaceC24682 = interfaceC24685;
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                i4 = i;
                dragGestureDetectorKt$horizontalDrag$12.L$0 = interfaceC7387;
                dragGestureDetectorKt$horizontalDrag$12.L$1 = interfaceC24682;
                dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                dragGestureDetectorKt$horizontalDrag$12.L$3 = interfaceC24683;
                dragGestureDetectorKt$horizontalDrag$12.L$4 = ref$LongRef;
                dragGestureDetectorKt$horizontalDrag$12.label = i4;
                objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
                if (objM3559 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                interfaceC24685 = interfaceC24682;
                obj3 = objM3559;
                dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                C2487 c24872 = (C2487) obj3;
                List list3 = c24872.f5197;
                int size3 = list3.size();
                int i52 = 0;
                while (true) {
                    if (i52 < size3) {
                    }
                    i52++;
                    interfaceC24683 = interfaceC24684;
                }
                C2478 c247822 = (C2478) obj;
                if (c247822 == null) {
                    c247822 = null;
                }
            }
            i = 1;
            if (c247822 == null || c247822.m3582()) {
                c2478 = null;
            } else if (AbstractC2481.m3587(c247822)) {
                c2478 = c247822;
            } else {
                interfaceC7387.invoke(c247822);
                orientation = orientation2;
                j2 = c247822.f5154;
                interfaceC24682 = interfaceC24685;
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                i4 = i;
                Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                ref$LongRef2.element = j2;
                interfaceC24683 = interfaceC24682;
                orientation2 = orientation;
                ref$LongRef = ref$LongRef2;
                dragGestureDetectorKt$horizontalDrag$12.L$0 = interfaceC7387;
                dragGestureDetectorKt$horizontalDrag$12.L$1 = interfaceC24682;
                dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                dragGestureDetectorKt$horizontalDrag$12.L$3 = interfaceC24683;
                dragGestureDetectorKt$horizontalDrag$12.L$4 = ref$LongRef;
                dragGestureDetectorKt$horizontalDrag$12.label = i4;
                objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
                if (objM3559 == coroutineSingletons) {
                }
            }
            return Boolean.valueOf(c2478 == null ? i : 0);
        }
        AbstractC6017.m10769(obj3);
        Orientation orientation3 = Orientation.Horizontal;
        j2 = j;
        if (m1807(((C2456) interfaceC2468).f5086.f5102, j2)) {
            i = 1;
            return Boolean.valueOf(c2478 == null ? i : 0);
        }
        orientation = orientation3;
        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
        interfaceC24682 = interfaceC2468;
        interfaceC7387 = c1312;
        Ref$LongRef ref$LongRef22 = new Ref$LongRef();
        ref$LongRef22.element = j2;
        interfaceC24683 = interfaceC24682;
        orientation2 = orientation;
        ref$LongRef = ref$LongRef22;
        dragGestureDetectorKt$horizontalDrag$12.L$0 = interfaceC7387;
        dragGestureDetectorKt$horizontalDrag$12.L$1 = interfaceC24682;
        dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
        dragGestureDetectorKt$horizontalDrag$12.L$3 = interfaceC24683;
        dragGestureDetectorKt$horizontalDrag$12.L$4 = ref$LongRef;
        dragGestureDetectorKt$horizontalDrag$12.label = i4;
        objM3559 = ((C2456) interfaceC24683).m3559(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$12);
        if (objM3559 == coroutineSingletons) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m1807(C2487 c2487, long j) {
        Object obj;
        List list = c2487.f5197;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC2481.m3586(((C2478) obj).f5154, j)) {
                break;
            }
            i++;
        }
        C2478 c2478 = (C2478) obj;
        if (c2478 != null && c2478.f5151) {
            z = true;
        }
        return true ^ z;
    }
}
