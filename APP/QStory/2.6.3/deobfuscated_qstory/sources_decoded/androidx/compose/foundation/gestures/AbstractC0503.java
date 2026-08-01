package androidx.compose.foundation.gestures;

import androidx.compose.foundation.text.C1004;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6551 f1500 = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m1271(InterfaceC1635 interfaceC1635, InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new TapGestureDetectorKt$detectTapGestures$2(interfaceC1635, null, null, f1500, interfaceC6558, null), interfaceC4357);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m1272(InterfaceC1635 interfaceC1635, InterfaceC6551 interfaceC6551, C1004 c1004, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new TapGestureDetectorKt$detectTapAndPress$2(interfaceC1635, interfaceC6551, c1004, new C0553(interfaceC1635), null), interfaceC4357);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1273(androidx.compose.ui.input.pointer.InterfaceC1633 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.ui.input.pointer.InterfaceC1633) r8
            kotlin.AbstractC5185.m10210(r9)
            goto L40
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L32:
            kotlin.AbstractC5185.m10210(r9)
        L35:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = androidx.compose.ui.input.pointer.InterfaceC1633.m3016(r8, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
            java.util.List r2 = r9.f4852
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r7 = (androidx.compose.ui.input.pointer.C1643) r7
            r7.m3024()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List r9 = r9.f4852
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r4 = (androidx.compose.ui.input.pointer.C1643) r4
            boolean r4 = r4.f4806
            if (r4 == 0) goto L6b
            goto L35
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1273(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1274(androidx.compose.ui.input.pointer.InterfaceC1633 r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r2 = (androidx.compose.ui.input.pointer.InterfaceC1633) r2
            kotlin.AbstractC5185.m10210(r9)
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r0
            r0 = r6
            goto L58
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L3e:
            kotlin.AbstractC5185.m10210(r9)
            r9 = r8
            r8 = r3
        L43:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r4
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7
            java.lang.Object r2 = r7.m2999(r9, r0)
            if (r2 != r1) goto L54
            return r1
        L54:
            r6 = r0
            r0 = r9
            r9 = r2
            r2 = r6
        L58:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
            boolean r5 = m1278(r9, r8, r4)
            if (r5 == 0) goto L67
            java.util.List r7 = r9.f4852
            java.lang.Object r7 = r7.get(r3)
            return r7
        L67:
            r9 = r0
            r0 = r2
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1274(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ Object m1275(InterfaceC1633 interfaceC1633, PointerEventPass pointerEventPass, InterfaceC4357 interfaceC4357, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return m1276(interfaceC1633, z, pointerEventPass, interfaceC4357);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1276(androidx.compose.ui.input.pointer.InterfaceC1633 r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.InterfaceC4357 r9) {
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
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.ui.input.pointer.InterfaceC1633) r8
            kotlin.AbstractC5185.m10210(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L50
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L3c:
            kotlin.AbstractC5185.m10210(r9)
        L3f:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r6 = (androidx.compose.ui.input.pointer.C1621) r6
            java.lang.Object r9 = r6.m2999(r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
            r2 = 0
            boolean r4 = m1278(r9, r7, r2)
            if (r4 == 0) goto L3f
            java.util.List r6 = r9.f4852
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1276(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C5417 m1277(InterfaceC5401 interfaceC5401, InterfaceC5452 interfaceC5452, InterfaceC6554 interfaceC6554) {
        return AbstractC5399.m10477(interfaceC5401, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$launchAwaitingReset$1(interfaceC5452, interfaceC6554, null), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m1278(C1652 c1652, boolean z, boolean z2) {
        if (z2) {
            List list = c1652.f4852;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((C1643) list.get(i)).f4819 != 2) {
                        break;
                    }
                    i++;
                } else if ((c1652.f4849 & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = c1652.f4852;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1643 c1643 = (C1643) list2.get(i2);
            if (!(z ? AbstractC1646.m3030(c1643) : AbstractC1646.m3029(c1643))) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1279(androidx.compose.ui.input.pointer.InterfaceC1633 r17, androidx.compose.ui.input.pointer.PointerEventPass r18, kotlin.coroutines.jvm.internal.BaseContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1279(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1280(androidx.compose.ui.input.pointer.InterfaceC1633 r19, kotlinx.coroutines.InterfaceC5401 r20, androidx.compose.foundation.gestures.C0553 r21, p052.InterfaceC6558 r22, p052.InterfaceC6558 r23, p052.InterfaceC6551 r24, p052.InterfaceC6558 r25, kotlin.coroutines.jvm.internal.BaseContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1280(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlinx.coroutines.飘花落叶言子世楪哲兰苏, androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲楪兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1281(androidx.compose.ui.input.pointer.InterfaceC1633 r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.AbstractC5185.m10210(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            goto L59
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L32:
            kotlin.AbstractC5185.m10210(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.飘花落叶言子苏世哲楪兰 r2 = androidx.compose.foundation.gestures.C0545.f1570
            r9.element = r2
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            androidx.compose.ui.platform.飘花落叶言子哲兰苏世楪 r2 = r7.m2997()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            long r5 = r2.mo3280()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r2.<init>(r8, r9, r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r0.L$0 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r0.label = r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            java.lang.Object r7 = r7.m3001(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r9
        L59:
            T r7 = r7.element
            return r7
        L5c:
            androidx.compose.foundation.gestures.飘花落叶言子苏世兰楪哲 r7 = androidx.compose.foundation.gestures.C0543.f1568
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0503.m1281(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
