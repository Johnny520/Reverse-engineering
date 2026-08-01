package androidx.compose.foundation.gestures;

import androidx.compose.foundation.text.C1842;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.input.pointer.PointerEventTimeoutCancellationException;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6253;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7380 f1845 = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m1831(InterfaceC2470 interfaceC2470, InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new TapGestureDetectorKt$detectTapGestures$2(interfaceC2470, null, null, f1845, interfaceC7387, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m1832(InterfaceC2470 interfaceC2470, InterfaceC7380 interfaceC7380, C1842 c1842, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new TapGestureDetectorKt$detectTapAndPress$2(interfaceC2470, interfaceC7380, c1842, new C1394(interfaceC2470), null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1833(InterfaceC2468 interfaceC2468, ContinuationImpl continuationImpl) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int size;
        int i;
        int i2;
        int size2;
        if (continuationImpl instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuationImpl;
            int i3 = tapGestureDetectorKt$consumeUntilUp$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuationImpl);
            }
        }
        Object objM3559 = tapGestureDetectorKt$consumeUntilUp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i4 == 0) {
            AbstractC6017.m10769(objM3559);
            tapGestureDetectorKt$consumeUntilUp$1.L$0 = interfaceC2468;
            tapGestureDetectorKt$consumeUntilUp$1.label = 1;
            objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
            if (objM3559 == coroutineSingletons) {
            }
            C2487 c2487 = (C2487) objM3559;
            List list = c2487.f5197;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = c2487.f5197;
            size2 = list2.size();
            while (i < size2) {
            }
            return C6008.f15084;
        }
        if (i4 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC2468 = (InterfaceC2468) tapGestureDetectorKt$consumeUntilUp$1.L$0;
        AbstractC6017.m10769(objM3559);
        C2487 c24872 = (C2487) objM3559;
        List list3 = c24872.f5197;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((C2478) list3.get(i2)).m3584();
        }
        List list22 = c24872.f5197;
        size2 = list22.size();
        while (i < size2) {
            if (((C2478) list22.get(i)).f5151) {
                tapGestureDetectorKt$consumeUntilUp$1.L$0 = interfaceC2468;
                tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
                if (objM3559 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C2487 c248722 = (C2487) objM3559;
                List list32 = c248722.f5197;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = c248722.f5197;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1834(InterfaceC2468 interfaceC2468, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$1;
        PointerEventPass pointerEventPass2;
        boolean z;
        InterfaceC2468 interfaceC24682;
        Object objM3559;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$awaitPrimaryFirstDown$1) {
            tapGestureDetectorKt$awaitPrimaryFirstDown$1 = (TapGestureDetectorKt$awaitPrimaryFirstDown$1) baseContinuationImpl;
            int i = tapGestureDetectorKt$awaitPrimaryFirstDown$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = i - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$awaitPrimaryFirstDown$1 = new TapGestureDetectorKt$awaitPrimaryFirstDown$1(baseContinuationImpl);
            }
        }
        Object obj = tapGestureDetectorKt$awaitPrimaryFirstDown$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tapGestureDetectorKt$awaitPrimaryFirstDown$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            pointerEventPass2 = pointerEventPass;
            z = false;
            interfaceC24682 = interfaceC2468;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0 = interfaceC24682;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1 = pointerEventPass2;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0 = z;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = 1;
            C2456 c2456 = (C2456) interfaceC24682;
            objM3559 = c2456.m3559(pointerEventPass2, tapGestureDetectorKt$awaitPrimaryFirstDown$1);
            if (objM3559 != coroutineSingletons) {
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0;
            PointerEventPass pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0;
            AbstractC6017.m10769(obj);
            z = z2;
            InterfaceC2468 interfaceC24684 = interfaceC24683;
            TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$12 = tapGestureDetectorKt$awaitPrimaryFirstDown$1;
            PointerEventPass pointerEventPass4 = pointerEventPass3;
            C2487 c2487 = (C2487) obj;
            if (!m1838(c2487, z, true)) {
                return c2487.f5197.get(0);
            }
            pointerEventPass2 = pointerEventPass4;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1 = tapGestureDetectorKt$awaitPrimaryFirstDown$12;
            interfaceC24682 = interfaceC24684;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0 = interfaceC24682;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1 = pointerEventPass2;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0 = z;
            tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = 1;
            C2456 c24562 = (C2456) interfaceC24682;
            objM3559 = c24562.m3559(pointerEventPass2, tapGestureDetectorKt$awaitPrimaryFirstDown$1);
            if (objM3559 != coroutineSingletons) {
                return coroutineSingletons;
            }
            TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$13 = tapGestureDetectorKt$awaitPrimaryFirstDown$1;
            pointerEventPass4 = pointerEventPass2;
            obj = objM3559;
            tapGestureDetectorKt$awaitPrimaryFirstDown$12 = tapGestureDetectorKt$awaitPrimaryFirstDown$13;
            interfaceC24684 = c24562;
            C2487 c24872 = (C2487) obj;
            if (!m1838(c24872, z, true)) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ Object m1835(InterfaceC2468 interfaceC2468, PointerEventPass pointerEventPass, InterfaceC5189 interfaceC5189, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return m1836(interfaceC2468, z, pointerEventPass, interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1836(androidx.compose.p001ui.input.pointer.InterfaceC2468 r6, boolean r7, androidx.compose.p001ui.input.pointer.PointerEventPass r8, kotlin.coroutines.InterfaceC5189 r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.p001ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r8
            kotlin.AbstractC6017.m10769(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L50
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r6)
            r6 = 0
            return r6
        L3c:
            kotlin.AbstractC6017.m10769(r9)
        L3f:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r6 = (androidx.compose.p001ui.input.pointer.C2456) r6
            java.lang.Object r9 = r6.m3559(r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.p001ui.input.pointer.C2487) r9
            r2 = 0
            boolean r4 = m1838(r9, r7, r2)
            if (r4 == 0) goto L3f
            java.util.List r6 = r9.f5197
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC1344.m1836(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C6249 m1837(InterfaceC6233 interfaceC6233, InterfaceC6284 interfaceC6284, InterfaceC7383 interfaceC7383) {
        return AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$launchAwaitingReset$1(interfaceC6284, interfaceC7383, null), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m1838(C2487 c2487, boolean z, boolean z2) {
        if (z2) {
            List list = c2487.f5197;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((C2478) list.get(i)).f5164 != 2) {
                        break;
                    }
                    i++;
                } else if ((c2487.f5194 & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = c2487.f5197;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C2478 c2478 = (C2478) list2.get(i2);
            if (!(z ? AbstractC2481.m3590(c2478) : AbstractC2481.m3589(c2478))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bb -> B:13:0x0035). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1839(InterfaceC2468 interfaceC2468, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        InterfaceC2468 interfaceC24682;
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        PointerEventPass pointerEventPass2;
        InterfaceC2468 interfaceC24683;
        PointerEventPass pointerEventPass3;
        int size;
        int i;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (TapGestureDetectorKt$waitForUpOrCancellation$2) baseContinuationImpl;
            int i2 = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.label = i2 - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$waitForUpOrCancellation$2 = new TapGestureDetectorKt$waitForUpOrCancellation$2(baseContinuationImpl);
            }
        }
        Object objM3559 = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objM3559);
            interfaceC24682 = interfaceC2468;
            tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
            pointerEventPass2 = pointerEventPass;
            tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = interfaceC24682;
            tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
            tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
            C2456 c2456 = (C2456) interfaceC24682;
            objM3559 = c2456.m3559(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
            InterfaceC2468 interfaceC24684 = (InterfaceC2468) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
            AbstractC6017.m10769(objM3559);
            interfaceC24683 = interfaceC24684;
            List list = ((C2487) objM3559).f5197;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
        InterfaceC2468 interfaceC24685 = (InterfaceC2468) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
        AbstractC6017.m10769(objM3559);
        InterfaceC2468 interfaceC24686 = interfaceC24685;
        PointerEventPass pointerEventPass4 = pointerEventPass3;
        tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
        pointerEventPass2 = pointerEventPass4;
        List list2 = ((C2487) objM3559).f5197;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((C2478) list2.get(i4)).m3582()) {
                break;
            }
        }
        interfaceC24682 = interfaceC24686;
        tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = interfaceC24682;
        tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
        tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
        C2456 c24562 = (C2456) interfaceC24682;
        objM3559 = c24562.m3559(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
        if (objM3559 != coroutineSingletons) {
            TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
            pointerEventPass3 = pointerEventPass2;
            tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
            interfaceC24683 = c24562;
            List list3 = ((C2487) objM3559).f5197;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!AbstractC2481.m3588((C2478) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        C2478 c2478 = (C2478) list3.get(i5);
                        if (c2478.m3582() || AbstractC2481.m3585(c2478, ((C2456) interfaceC24683).f5086.f5098, ((C2456) interfaceC24683).m3558())) {
                            break;
                        }
                    }
                    PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.L$0 = interfaceC24683;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.L$1 = pointerEventPass3;
                    tapGestureDetectorKt$waitForUpOrCancellation$2.label = 2;
                    C2456 c24563 = (C2456) interfaceC24683;
                    objM3559 = c24563.m3559(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                    interfaceC24686 = c24563;
                }
            }
            return list3.get(0);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0394  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1840(InterfaceC2468 interfaceC2468, InterfaceC6233 interfaceC6233, C1394 c1394, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$1;
        InterfaceC7387 interfaceC73874;
        InterfaceC7387 interfaceC73875;
        C6253 c6253;
        Object objM1835;
        InterfaceC6233 interfaceC62332;
        InterfaceC7387 interfaceC73876;
        C1394 c13942;
        InterfaceC7380 interfaceC73802;
        C6008 c6008;
        InterfaceC2468 interfaceC24682;
        InterfaceC6284 interfaceC6284;
        InterfaceC7387 interfaceC73877;
        InterfaceC7387 interfaceC73878;
        InterfaceC7380 interfaceC73803;
        C2478 c2478;
        InterfaceC7387 interfaceC73879;
        InterfaceC7387 interfaceC738710;
        InterfaceC2468 interfaceC24683;
        InterfaceC7380 interfaceC73804;
        InterfaceC7387 interfaceC738711;
        C2478 c24782;
        C6249 c6249M1837;
        InterfaceC7387 interfaceC738712;
        InterfaceC7387 interfaceC738713;
        InterfaceC7380 interfaceC73805;
        InterfaceC7387 interfaceC738714;
        C2478 c24783;
        InterfaceC6284 interfaceC62842;
        AbstractC1383 abstractC1383;
        InterfaceC5189 interfaceC5189;
        C1394 c13943;
        InterfaceC6233 interfaceC62333;
        C2478 c24784;
        C1384 c1384;
        InterfaceC7387 interfaceC738715;
        InterfaceC7387 interfaceC738716;
        InterfaceC6284 interfaceC62843;
        C2478 c24785;
        InterfaceC6284 interfaceC62844;
        C2478 c24786;
        InterfaceC7387 interfaceC738717;
        InterfaceC7387 interfaceC738718;
        C1394 c13944;
        InterfaceC6233 interfaceC62334;
        C2478 c24787;
        AbstractC1383 abstractC13832;
        InterfaceC5189 interfaceC51892;
        InterfaceC6284 interfaceC62845;
        C1394 c13945;
        InterfaceC6233 interfaceC62335;
        InterfaceC2468 interfaceC24684 = interfaceC2468;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$processTapGesture$1) {
            tapGestureDetectorKt$processTapGesture$1 = (TapGestureDetectorKt$processTapGesture$1) baseContinuationImpl;
            int i = tapGestureDetectorKt$processTapGesture$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$processTapGesture$1.label = i - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(baseContinuationImpl);
            }
        }
        Object objM1839 = tapGestureDetectorKt$processTapGesture$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tapGestureDetectorKt$processTapGesture$1.label;
        C1384 c13842 = C1384.f1913;
        InterfaceC7380 interfaceC73806 = f1845;
        C6008 c60082 = C6008.f15084;
        switch (i2) {
            case 0:
                AbstractC6017.m10769(objM1839);
                tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC24684;
                tapGestureDetectorKt$processTapGesture$1.L$1 = interfaceC6233;
                tapGestureDetectorKt$processTapGesture$1.L$2 = c1394;
                interfaceC73874 = interfaceC7387;
                tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC73874;
                interfaceC73875 = interfaceC73872;
                tapGestureDetectorKt$processTapGesture$1.L$4 = interfaceC73875;
                tapGestureDetectorKt$processTapGesture$1.L$5 = interfaceC7380;
                tapGestureDetectorKt$processTapGesture$1.L$6 = interfaceC73873;
                tapGestureDetectorKt$processTapGesture$1.label = 1;
                c6253 = null;
                objM1835 = m1835(interfaceC24684, null, tapGestureDetectorKt$processTapGesture$1, 3);
                if (objM1835 != coroutineSingletons) {
                    interfaceC62332 = interfaceC6233;
                    interfaceC73876 = interfaceC73873;
                    c13942 = c1394;
                    interfaceC73802 = interfaceC7380;
                    C2478 c24788 = (C2478) objM1835;
                    c24788.m3584();
                    c6008 = c60082;
                    C6249 c6249M11036 = AbstractC6231.m11036(interfaceC62332, c6253, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(c13942, c6253), 1);
                    if (interfaceC73802 != interfaceC73806) {
                        m1837(interfaceC62332, c6249M11036, new TapGestureDetectorKt$processTapGesture$2(interfaceC73802, c13942, c24788, c6253));
                    }
                    if (interfaceC73875 != null) {
                        tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC24684;
                        tapGestureDetectorKt$processTapGesture$1.L$1 = interfaceC62332;
                        tapGestureDetectorKt$processTapGesture$1.L$2 = c13942;
                        tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC73874;
                        tapGestureDetectorKt$processTapGesture$1.L$4 = interfaceC73875;
                        tapGestureDetectorKt$processTapGesture$1.L$5 = interfaceC73802;
                        tapGestureDetectorKt$processTapGesture$1.L$6 = interfaceC73876;
                        tapGestureDetectorKt$processTapGesture$1.L$7 = c6249M11036;
                        tapGestureDetectorKt$processTapGesture$1.label = 2;
                        Object objM18392 = m1839(interfaceC24684, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM18392 != coroutineSingletons) {
                            InterfaceC7387 interfaceC738719 = interfaceC73875;
                            interfaceC73879 = interfaceC73874;
                            interfaceC738710 = interfaceC738719;
                            interfaceC24683 = interfaceC24684;
                            interfaceC6284 = c6249M11036;
                            interfaceC73804 = interfaceC73802;
                            interfaceC738711 = interfaceC73876;
                            objM1839 = objM18392;
                            c24782 = (C2478) objM1839;
                            if (c24782 == null) {
                                c6249M1837 = m1837(interfaceC62332, interfaceC6284, new TapGestureDetectorKt$processTapGesture$4(c13942, null));
                            } else {
                                c24782.m3584();
                                c6249M1837 = m1837(interfaceC62332, interfaceC6284, new TapGestureDetectorKt$processTapGesture$5(c13942, null));
                            }
                            if (c24782 != null) {
                                if (interfaceC73879 != null) {
                                    tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC24683;
                                    tapGestureDetectorKt$processTapGesture$1.L$1 = interfaceC62332;
                                    tapGestureDetectorKt$processTapGesture$1.L$2 = c13942;
                                    tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC73879;
                                    tapGestureDetectorKt$processTapGesture$1.L$4 = interfaceC738710;
                                    tapGestureDetectorKt$processTapGesture$1.L$5 = interfaceC73804;
                                    tapGestureDetectorKt$processTapGesture$1.L$6 = interfaceC738711;
                                    tapGestureDetectorKt$processTapGesture$1.L$7 = c24782;
                                    tapGestureDetectorKt$processTapGesture$1.L$8 = c6249M1837;
                                    tapGestureDetectorKt$processTapGesture$1.label = 5;
                                    C2456 c2456 = (C2456) interfaceC24683;
                                    InterfaceC7387 interfaceC738720 = interfaceC738710;
                                    C6249 c6249 = c6249M1837;
                                    Object objM3560 = c2456.m3560(c2456.m3557().mo3841(), new TapGestureDetectorKt$awaitSecondDown$2(c24782, null), tapGestureDetectorKt$processTapGesture$1);
                                    if (objM3560 != coroutineSingletons) {
                                        interfaceC738712 = interfaceC738720;
                                        interfaceC738713 = interfaceC73879;
                                        interfaceC73805 = interfaceC73804;
                                        interfaceC738714 = interfaceC738711;
                                        c24783 = c24782;
                                        objM1839 = objM3560;
                                        interfaceC62842 = c6249;
                                        c24784 = (C2478) objM1839;
                                        if (c24784 == null) {
                                            c1384 = c13842;
                                            C6249 c6249M110362 = AbstractC6231.m11036(interfaceC62332, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(interfaceC62842, c13942, null), 1);
                                            if (interfaceC73805 != interfaceC73806) {
                                                m1837(interfaceC62332, c6249M110362, new TapGestureDetectorKt$processTapGesture$7(interfaceC73805, c13942, c24784, null));
                                            }
                                            if (interfaceC738712 == null) {
                                                tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC62332;
                                                tapGestureDetectorKt$processTapGesture$1.L$1 = c13942;
                                                tapGestureDetectorKt$processTapGesture$1.L$2 = interfaceC738713;
                                                tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC738714;
                                                tapGestureDetectorKt$processTapGesture$1.L$4 = c6249M110362;
                                                tapGestureDetectorKt$processTapGesture$1.L$5 = c24783;
                                                tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                tapGestureDetectorKt$processTapGesture$1.label = 6;
                                                objM1839 = m1839(interfaceC24683, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM1839 != coroutineSingletons) {
                                                    interfaceC62844 = c6249M110362;
                                                    c24786 = c24783;
                                                    interfaceC738717 = interfaceC738714;
                                                    interfaceC738718 = interfaceC738713;
                                                    c13944 = c13942;
                                                    interfaceC62334 = interfaceC62332;
                                                    c24787 = (C2478) objM1839;
                                                    if (c24787 != null) {
                                                        c24787.m3584();
                                                        m1837(interfaceC62334, interfaceC62844, new TapGestureDetectorKt$processTapGesture$8(c13944, null));
                                                        interfaceC738718.invoke(new C8158(c24787.f5152));
                                                        return c6008;
                                                    }
                                                    m1837(interfaceC62334, interfaceC62844, new TapGestureDetectorKt$processTapGesture$9(c13944, null));
                                                    if (interfaceC738717 != null) {
                                                        interfaceC738717.invoke(new C8158(c24786.f5152));
                                                        return c6008;
                                                    }
                                                }
                                            } else {
                                                tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC24683;
                                                tapGestureDetectorKt$processTapGesture$1.L$1 = interfaceC62332;
                                                tapGestureDetectorKt$processTapGesture$1.L$2 = c13942;
                                                tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC738713;
                                                tapGestureDetectorKt$processTapGesture$1.L$4 = interfaceC738712;
                                                tapGestureDetectorKt$processTapGesture$1.L$5 = interfaceC738714;
                                                tapGestureDetectorKt$processTapGesture$1.L$6 = c6249M110362;
                                                tapGestureDetectorKt$processTapGesture$1.L$7 = c24783;
                                                tapGestureDetectorKt$processTapGesture$1.L$8 = c24784;
                                                tapGestureDetectorKt$processTapGesture$1.label = 7;
                                                Object objM1841 = m1841(interfaceC24683, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                if (objM1841 != coroutineSingletons) {
                                                    interfaceC738715 = interfaceC738714;
                                                    interfaceC738716 = interfaceC738713;
                                                    interfaceC62843 = c6249M110362;
                                                    c24785 = c24784;
                                                    objM1839 = objM1841;
                                                    abstractC13832 = (AbstractC1383) objM1839;
                                                    if (AbstractC5227.m9466(abstractC13832, c1384)) {
                                                        if (abstractC13832 instanceof C1385) {
                                                            c24787 = ((C1385) abstractC13832).f1914;
                                                            c24786 = c24783;
                                                            interfaceC62844 = interfaceC62843;
                                                            interfaceC738717 = interfaceC738715;
                                                            interfaceC738718 = interfaceC738716;
                                                            c13944 = c13942;
                                                            interfaceC62334 = interfaceC62332;
                                                        } else {
                                                            if (!(abstractC13832 instanceof C1386)) {
                                                                C5043.m9170();
                                                                return null;
                                                            }
                                                            c24786 = c24783;
                                                            interfaceC62844 = interfaceC62843;
                                                            interfaceC738717 = interfaceC738715;
                                                            interfaceC738718 = interfaceC738716;
                                                            c13944 = c13942;
                                                            interfaceC62334 = interfaceC62332;
                                                            c24787 = null;
                                                        }
                                                        if (c24787 != null) {
                                                        }
                                                    } else {
                                                        interfaceC738712.invoke(new C8158(c24785.f5152));
                                                        tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC62332;
                                                        tapGestureDetectorKt$processTapGesture$1.L$1 = c13942;
                                                        tapGestureDetectorKt$processTapGesture$1.L$2 = interfaceC62843;
                                                        interfaceC51892 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.label = 8;
                                                        if (m1833(interfaceC24683, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                            interfaceC62845 = interfaceC62843;
                                                            c13945 = c13942;
                                                            interfaceC62335 = interfaceC62332;
                                                            m1837(interfaceC62335, interfaceC62845, new TapGestureDetectorKt$processTapGesture$secondUp$1(c13945, interfaceC51892));
                                                            return c6008;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (interfaceC738714 != null) {
                                            interfaceC738714.invoke(new C8158(c24783.f5152));
                                            return c6008;
                                        }
                                    }
                                } else if (interfaceC738711 != null) {
                                    interfaceC738711.invoke(new C8158(c24782.f5152));
                                    return c6008;
                                }
                            }
                            return c6008;
                        }
                    } else {
                        tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC24684;
                        tapGestureDetectorKt$processTapGesture$1.L$1 = interfaceC62332;
                        tapGestureDetectorKt$processTapGesture$1.L$2 = c13942;
                        tapGestureDetectorKt$processTapGesture$1.L$3 = interfaceC73874;
                        tapGestureDetectorKt$processTapGesture$1.L$4 = interfaceC73875;
                        tapGestureDetectorKt$processTapGesture$1.L$5 = interfaceC73802;
                        tapGestureDetectorKt$processTapGesture$1.L$6 = interfaceC73876;
                        tapGestureDetectorKt$processTapGesture$1.L$7 = c24788;
                        tapGestureDetectorKt$processTapGesture$1.L$8 = c6249M11036;
                        tapGestureDetectorKt$processTapGesture$1.label = 3;
                        Object objM18412 = m1841(interfaceC24684, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                        if (objM18412 != coroutineSingletons) {
                            interfaceC24682 = interfaceC24684;
                            interfaceC6284 = c6249M11036;
                            interfaceC73877 = interfaceC73876;
                            objM1839 = objM18412;
                            interfaceC73878 = interfaceC73874;
                            interfaceC73803 = interfaceC73802;
                            c2478 = c24788;
                            abstractC1383 = (AbstractC1383) objM1839;
                            if (AbstractC5227.m9466(abstractC1383, c13842)) {
                                if (abstractC1383 instanceof C1385) {
                                    c24782 = ((C1385) abstractC1383).f1914;
                                } else {
                                    if (!(abstractC1383 instanceof C1386)) {
                                        C5043.m9170();
                                        return null;
                                    }
                                    c24782 = null;
                                }
                                interfaceC738711 = interfaceC73877;
                                interfaceC73804 = interfaceC73803;
                                interfaceC738710 = interfaceC73875;
                                interfaceC24683 = interfaceC24682;
                                interfaceC73879 = interfaceC73878;
                                if (c24782 == null) {
                                }
                                if (c24782 != null) {
                                }
                                return c6008;
                            }
                            interfaceC73875.invoke(new C8158(c2478.f5152));
                            tapGestureDetectorKt$processTapGesture$1.L$0 = interfaceC62332;
                            tapGestureDetectorKt$processTapGesture$1.L$1 = c13942;
                            tapGestureDetectorKt$processTapGesture$1.L$2 = interfaceC6284;
                            interfaceC5189 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                            tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                            tapGestureDetectorKt$processTapGesture$1.label = 4;
                            if (m1833(interfaceC24682, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                c13943 = c13942;
                                interfaceC62333 = interfaceC62332;
                                m1837(interfaceC62333, interfaceC6284, new TapGestureDetectorKt$processTapGesture$3(c13943, interfaceC5189));
                                return c6008;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                InterfaceC7387 interfaceC738721 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$6;
                interfaceC73802 = (InterfaceC7380) tapGestureDetectorKt$processTapGesture$1.L$5;
                InterfaceC7387 interfaceC738722 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$4;
                InterfaceC7387 interfaceC738723 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                c13942 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$2;
                interfaceC62332 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$1;
                InterfaceC2468 interfaceC24685 = (InterfaceC2468) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                interfaceC73875 = interfaceC738722;
                interfaceC73874 = interfaceC738723;
                objM1835 = objM1839;
                interfaceC73876 = interfaceC738721;
                interfaceC24684 = interfaceC24685;
                c6253 = null;
                C2478 c247882 = (C2478) objM1835;
                c247882.m3584();
                c6008 = c60082;
                C6249 c6249M110363 = AbstractC6231.m11036(interfaceC62332, c6253, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(c13942, c6253), 1);
                if (interfaceC73802 != interfaceC73806) {
                }
                if (interfaceC73875 != null) {
                }
                return coroutineSingletons;
            case 2:
                interfaceC6284 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$7;
                interfaceC738711 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$6;
                interfaceC73804 = (InterfaceC7380) tapGestureDetectorKt$processTapGesture$1.L$5;
                interfaceC738710 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$4;
                interfaceC73879 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                c13942 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$2;
                interfaceC62332 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC24683 = (InterfaceC2468) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                c24782 = (C2478) objM1839;
                if (c24782 == null) {
                }
                if (c24782 != null) {
                }
                return c6008;
            case 3:
                interfaceC6284 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$8;
                c2478 = (C2478) tapGestureDetectorKt$processTapGesture$1.L$7;
                interfaceC73877 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$6;
                interfaceC73803 = (InterfaceC7380) tapGestureDetectorKt$processTapGesture$1.L$5;
                interfaceC73875 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$4;
                InterfaceC7387 interfaceC738724 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                C1394 c13946 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$2;
                InterfaceC6233 interfaceC62336 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC24682 = (InterfaceC2468) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                interfaceC73878 = interfaceC738724;
                c13942 = c13946;
                interfaceC62332 = interfaceC62336;
                abstractC1383 = (AbstractC1383) objM1839;
                if (AbstractC5227.m9466(abstractC1383, c13842)) {
                }
                break;
            case 4:
                interfaceC6284 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$2;
                c13943 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC62333 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                interfaceC5189 = null;
                m1837(interfaceC62333, interfaceC6284, new TapGestureDetectorKt$processTapGesture$3(c13943, interfaceC5189));
                return c6008;
            case 5:
                interfaceC62842 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$8;
                c24783 = (C2478) tapGestureDetectorKt$processTapGesture$1.L$7;
                interfaceC738714 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$6;
                interfaceC73805 = (InterfaceC7380) tapGestureDetectorKt$processTapGesture$1.L$5;
                InterfaceC7387 interfaceC738725 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$4;
                InterfaceC7387 interfaceC738726 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                C1394 c13947 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$2;
                InterfaceC6233 interfaceC62337 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$1;
                InterfaceC2468 interfaceC24686 = (InterfaceC2468) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                interfaceC738712 = interfaceC738725;
                interfaceC738713 = interfaceC738726;
                c13942 = c13947;
                interfaceC62332 = interfaceC62337;
                interfaceC24683 = interfaceC24686;
                c24784 = (C2478) objM1839;
                if (c24784 == null) {
                }
                break;
            case 6:
                c24786 = (C2478) tapGestureDetectorKt$processTapGesture$1.L$5;
                interfaceC62844 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$4;
                interfaceC738717 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                interfaceC738718 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$2;
                c13944 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC62334 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                c24787 = (C2478) objM1839;
                if (c24787 != null) {
                }
                break;
            case 7:
                c24785 = (C2478) tapGestureDetectorKt$processTapGesture$1.L$8;
                c24783 = (C2478) tapGestureDetectorKt$processTapGesture$1.L$7;
                interfaceC62843 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$6;
                interfaceC738715 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$5;
                interfaceC738712 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$4;
                interfaceC738716 = (InterfaceC7387) tapGestureDetectorKt$processTapGesture$1.L$3;
                c13942 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$2;
                interfaceC62332 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC24683 = (InterfaceC2468) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c1384 = c13842;
                c6008 = c60082;
                abstractC13832 = (AbstractC1383) objM1839;
                if (AbstractC5227.m9466(abstractC13832, c1384)) {
                }
                break;
            case 8:
                interfaceC62845 = (InterfaceC6284) tapGestureDetectorKt$processTapGesture$1.L$2;
                c13945 = (C1394) tapGestureDetectorKt$processTapGesture$1.L$1;
                interfaceC62335 = (InterfaceC6233) tapGestureDetectorKt$processTapGesture$1.L$0;
                AbstractC6017.m10769(objM1839);
                c6008 = c60082;
                interfaceC51892 = null;
                m1837(interfaceC62335, interfaceC62845, new TapGestureDetectorKt$processTapGesture$secondUp$1(c13945, interfaceC51892));
                return c6008;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲楪兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1841(InterfaceC2468 interfaceC2468, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        Ref$ObjectRef ref$ObjectRef;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$waitForLongPress$1) {
            tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) baseContinuationImpl;
            int i = tapGestureDetectorKt$waitForLongPress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForLongPress$1.label = i - Integer.MIN_VALUE;
            } else {
                tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(baseContinuationImpl);
            }
        }
        Object obj = tapGestureDetectorKt$waitForLongPress$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tapGestureDetectorKt$waitForLongPress$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = C1386.f1915;
                C2456 c2456 = (C2456) interfaceC2468;
                long jMo3840 = c2456.m3557().mo3840();
                TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, ref$ObjectRef2, null);
                tapGestureDetectorKt$waitForLongPress$1.L$0 = ref$ObjectRef2;
                tapGestureDetectorKt$waitForLongPress$1.label = 1;
                if (c2456.m3561(jMo3840, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) tapGestureDetectorKt$waitForLongPress$1.L$0;
                AbstractC6017.m10769(obj);
            }
            return ref$ObjectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return C1384.f1913;
        }
    }
}
