package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0107;
import androidx.appcompat.app.C0113;
import androidx.collection.C0244;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1632;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import com.alibaba.fastjson2.C2942;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p110.C7320;
import p110.C7321;
import p112.C7328;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0536 f1531 = new C0536(0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m1287(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Float m1288(C1652 c1652) {
        int i = c1652.f4846;
        List list = c1652.f4851;
        if (i != 7 && i != 8 && i != 9) {
            return null;
        }
        int size = list.size();
        float f = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            f *= c1643.f4816;
            List listM3013 = c1643.m3013();
            int size2 = listM3013.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f *= ((C1632) listM3013.get(i3)).f4775;
            }
        }
        if (f == 1.0f) {
            return null;
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((C1643) list.get(i4)).m3014();
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7328 m1289(C1652 c1652) {
        long jM12498;
        long j;
        int i = c1652.f4846;
        List list = c1652.f4851;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        C1643 c1643 = (C1643) AbstractC4343.m8830(list);
        if (c1643 != null) {
            long j2 = c1643.f4817 ^ (-9223372034707292160L);
            List listM3013 = c1643.m3013();
            C7328 c7328 = new C7328(0L);
            int size = listM3013.size();
            int i2 = 0;
            while (true) {
                j = c7328.f19546;
                if (i2 >= size) {
                    break;
                }
                c7328 = new C7328(C7328.m12499(j, ((C1632) listM3013.get(i2)).f4774));
                i2++;
            }
            jM12498 = C7328.m12498(j2, j);
        } else {
            jM12498 = 0;
        }
        if (C7328.m12501(jM12498, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C1643) list.get(i3)).m3014();
        }
        return new C7328(jM12498);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7328 m1290(InterfaceC1633 interfaceC1633, C1652 c1652, InterfaceC0548 interfaceC0548) {
        long jM12498;
        long j;
        int i = c1652.f4847;
        List list = c1652.f4851;
        if ((i & 4096) == 0) {
            return null;
        }
        int i2 = c1652.f4846;
        if (i2 != 6 && i2 != 10 && i2 != 11 && i2 != 12) {
            return null;
        }
        C1627 c1627 = ((C1621) interfaceC1633).f4740;
        long jM443 = ((C0113) interfaceC0548).m443(c1652);
        C1643 c1643 = (C1643) AbstractC4343.m8830(list);
        if (c1643 != null) {
            long j2 = c1643.f4817 ^ (-9223372034707292160L);
            List listM3013 = c1643.m3013();
            C7328 c7328 = new C7328(0L);
            int size = listM3013.size();
            int i3 = 0;
            while (true) {
                j = c7328.f19546;
                if (i3 >= size) {
                    break;
                }
                c7328 = new C7328(C7328.m12499(j, ((C1632) listM3013.get(i3)).f4774));
                i3++;
            }
            jM12498 = C7328.m12498(j2, j);
        } else {
            jM12498 = 0;
        }
        long jM124982 = C7328.m12498(jM443, jM12498);
        if (C7328.m12501(jM124982, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((C1643) list.get(i4)).m3014();
        }
        return new C7328(jM124982);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m1291(C7320 c7320) {
        return c7320.f19526 && !c7320.f19522;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1292(C5851 c5851, C7320 c7320, Orientation orientation, C7321 c7321, C0107 c0107, long j) {
        float fIntBitsToFloat;
        C0244 c0244 = (C0244) c0107.f315;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c7320.f19523 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c7320.f19523 & 4294967295L));
        if (m1297(c7320)) {
            c0107.f314 = 0;
            c0244.m778();
        }
        if (!m1291(c7320) && !m1297(c7320)) {
            if (c0244.f1004 == 3) {
                int i = c0107.f314;
                c0107.f314 = i + 1;
                c0244.m771(i, c7320);
            } else {
                c0244.m774(c7320);
            }
            if (c0107.f314 == 3) {
                c0107.f314 = 0;
            }
            Object[] objArr = c0244.f1005;
            int i2 = c0244.f1004;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C7320) objArr[i3]).f19523 >> 32));
            }
            int i4 = c0244.f1004;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = c0244.f1005;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C7320) objArr2[i5]).f19523 & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c0244.f1004;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (orientation != null) {
            int i6 = c7321.f19529;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = orientation == Orientation.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C2942) c5851.f16007).m6355(c7320.f19524, C7328.m12498(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final float m1293(C1652 c1652) {
        List list = c1652.f4851;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C1643 c1643 = (C1643) list.get(i);
            if (!c1643.f4814 || !c1643.f4805) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jM1302 = m1302(c1652, true, new C0520(8));
            long jM13022 = m1302(c1652, false, new C0520(8));
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                C1643 c16432 = (C1643) list.get(i4);
                if (c16432.f4805 && c16432.f4814) {
                    long j = c16432.f4806;
                    long jM12499 = C7328.m12499(c16432.f4815, jM13022);
                    long jM124992 = C7328.m12499(j, jM1302);
                    float fM1303 = m1303(jM124992) - m1303(jM12499);
                    float fM12500 = C7328.m12500(C7328.m12498(jM124992, jM12499)) / 2.0f;
                    if (fM1303 > 180.0f) {
                        fM1303 -= 360.0f;
                    } else if (fM1303 < -180.0f) {
                        fM1303 += 360.0f;
                    }
                    f2 += fM1303 * fM12500;
                    f += fM12500;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final float m1294(C1652 c1652, boolean z) {
        long jM1302 = m1302(c1652, z, new C0520(8));
        float fM12500 = 0.0f;
        if (C7328.m12501(jM1302, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = c1652.f4851;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            if (c1643.f4805 && c1643.f4814) {
                i++;
                fM12500 = C7328.m12500(C7328.m12499(z ? c1643.f4806 : c1643.f4815, jM1302)) + fM12500;
            }
        }
        return fM12500 / i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final long m1295(C7320 c7320, Orientation orientation, C7321 c7321) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (orientation == null) {
            return c7320.f19523;
        }
        int i = c7321.f19529;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c7320.f19523 >> 32));
        } else {
            if (i != 2) {
                return c7320.f19523;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c7320.f19523 & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m1296(InterfaceC0513 interfaceC0513, SuspendLambda suspendLambda) {
        Object objMo1239 = interfaceC0513.mo1239(MutatePriority.Default, new ScrollExtensionsKt$stopScroll$2(null), suspendLambda);
        return objMo1239 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1239 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m1297(C7320 c7320) {
        return !c7320.f19526 && c7320.f19522;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m1298(C7320 c7320, Orientation orientation, C7321 c7321, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = c7320.f19527;
        if (orientation != null) {
            int i = c7321.f19529;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (orientation == Orientation.Horizontal) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jM12499 = C7328.m12499(m1295(c7320, orientation, c7321), j2);
        if (z || !c7320.f19528) {
            return jM12499;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m1299(InterfaceC1633 interfaceC1633) {
        List list = ((C1621) interfaceC1633).f4740.f4756.f4851;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C1643) list.get(i)).f4805) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1300(androidx.compose.foundation.gestures.C0518 r5, p052.InterfaceC6553 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r7)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            goto L3f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r7)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r7 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            r7.<init>(r5, r6, r3)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            r0.label = r4     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            java.lang.Object r5 = kotlinx.coroutines.AbstractC5398.m10503(r7, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0521.m1300(androidx.compose.foundation.gestures.飘花落叶言子楪世兰哲苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1301(InterfaceC1635 interfaceC1635, InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) {
        Object objM2995 = ((C1627) interfaceC1635).m2995(new ForEachGestureKt$awaitEachGesture$2(interfaceC4356.getContext(), interfaceC6553, null), interfaceC4356);
        return objM2995 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2995 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m1302(C1652 c1652, boolean z, InterfaceC6557 interfaceC6557) {
        List list = c1652.f4851;
        int size = list.size();
        long jM12498 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            if (((Boolean) interfaceC6557.invoke(c1643)).booleanValue()) {
                jM12498 = C7328.m12498(jM12498, z ? c1643.f4806 : c1643.f4815);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C7328.m12502(i, jM12498);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final float m1303(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (m1299(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:19:0x0051). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1304(androidx.compose.ui.input.pointer.InterfaceC1633 r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.ui.input.pointer.InterfaceC1633) r8
            kotlin.AbstractC5184.m10206(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L51
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L39:
            kotlin.AbstractC5184.m10206(r9)
            boolean r9 = m1299(r7)
            if (r9 != 0) goto L6a
        L42:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7
            java.lang.Object r9 = r7.m2989(r8, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
            java.util.List r9 = r9.f4851
            int r2 = r9.size()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L6a
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.ui.input.pointer.C1643) r5
            boolean r5 = r5.f4805
            if (r5 == 0) goto L67
            goto L42
        L67:
            int r4 = r4 + 1
            goto L5a
        L6a:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0521.m1304(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
