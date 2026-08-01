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
import com.alibaba.fastjson2.C2943;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p110.C7321;
import p110.C7322;
import p112.C7329;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0536 f1532 = new C0536(0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m1297(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Float m1298(C1652 c1652) {
        int i = c1652.f4847;
        List list = c1652.f4852;
        if (i != 7 && i != 8 && i != 9) {
            return null;
        }
        int size = list.size();
        float f = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            f *= c1643.f4817;
            List listM3023 = c1643.m3023();
            int size2 = listM3023.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f *= ((C1632) listM3023.get(i3)).f4776;
            }
        }
        if (f == 1.0f) {
            return null;
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((C1643) list.get(i4)).m3024();
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7329 m1299(C1652 c1652) {
        long jM12525;
        long j;
        int i = c1652.f4847;
        List list = c1652.f4852;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        C1643 c1643 = (C1643) AbstractC4344.m8815(list);
        if (c1643 != null) {
            long j2 = c1643.f4818 ^ (-9223372034707292160L);
            List listM3023 = c1643.m3023();
            C7329 c7329 = new C7329(0L);
            int size = listM3023.size();
            int i2 = 0;
            while (true) {
                j = c7329.f19541;
                if (i2 >= size) {
                    break;
                }
                c7329 = new C7329(C7329.m12526(j, ((C1632) listM3023.get(i2)).f4775));
                i2++;
            }
            jM12525 = C7329.m12525(j2, j);
        } else {
            jM12525 = 0;
        }
        if (C7329.m12528(jM12525, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C1643) list.get(i3)).m3024();
        }
        return new C7329(jM12525);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7329 m1300(InterfaceC1633 interfaceC1633, C1652 c1652, InterfaceC0548 interfaceC0548) {
        long jM12525;
        long j;
        int i = c1652.f4848;
        List list = c1652.f4852;
        if ((i & 4096) == 0) {
            return null;
        }
        int i2 = c1652.f4847;
        if (i2 != 6 && i2 != 10 && i2 != 11 && i2 != 12) {
            return null;
        }
        C1627 c1627 = ((C1621) interfaceC1633).f4741;
        long jM444 = ((C0113) interfaceC0548).m444(c1652);
        C1643 c1643 = (C1643) AbstractC4344.m8815(list);
        if (c1643 != null) {
            long j2 = c1643.f4818 ^ (-9223372034707292160L);
            List listM3023 = c1643.m3023();
            C7329 c7329 = new C7329(0L);
            int size = listM3023.size();
            int i3 = 0;
            while (true) {
                j = c7329.f19541;
                if (i3 >= size) {
                    break;
                }
                c7329 = new C7329(C7329.m12526(j, ((C1632) listM3023.get(i3)).f4775));
                i3++;
            }
            jM12525 = C7329.m12525(j2, j);
        } else {
            jM12525 = 0;
        }
        long jM125252 = C7329.m12525(jM444, jM12525);
        if (C7329.m12528(jM125252, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((C1643) list.get(i4)).m3024();
        }
        return new C7329(jM125252);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m1301(C7321 c7321) {
        return c7321.f19521 && !c7321.f19517;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1302(C5856 c5856, C7321 c7321, Orientation orientation, C7322 c7322, C0107 c0107, long j) {
        float fIntBitsToFloat;
        C0244 c0244 = (C0244) c0107.f315;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c7321.f19518 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c7321.f19518 & 4294967295L));
        if (m1307(c7321)) {
            c0107.f314 = 0;
            c0244.m779();
        }
        if (!m1301(c7321) && !m1307(c7321)) {
            if (c0244.f1004 == 3) {
                int i = c0107.f314;
                c0107.f314 = i + 1;
                c0244.m772(i, c7321);
            } else {
                c0244.m775(c7321);
            }
            if (c0107.f314 == 3) {
                c0107.f314 = 0;
            }
            Object[] objArr = c0244.f1005;
            int i2 = c0244.f1004;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C7321) objArr[i3]).f19518 >> 32));
            }
            int i4 = c0244.f1004;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = c0244.f1005;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C7321) objArr2[i5]).f19518 & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c0244.f1004;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (orientation != null) {
            int i6 = c7322.f19524;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = orientation == Orientation.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C2943) c5856.f16014).m6413(c7321.f19519, C7329.m12525(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final float m1303(C1652 c1652) {
        List list = c1652.f4852;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C1643 c1643 = (C1643) list.get(i);
            if (!c1643.f4815 || !c1643.f4806) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jM1312 = m1312(c1652, true, new C0520(8));
            long jM13122 = m1312(c1652, false, new C0520(8));
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                C1643 c16432 = (C1643) list.get(i4);
                if (c16432.f4806 && c16432.f4815) {
                    long j = c16432.f4807;
                    long jM12526 = C7329.m12526(c16432.f4816, jM13122);
                    long jM125262 = C7329.m12526(j, jM1312);
                    float fM1313 = m1313(jM125262) - m1313(jM12526);
                    float fM12527 = C7329.m12527(C7329.m12525(jM125262, jM12526)) / 2.0f;
                    if (fM1313 > 180.0f) {
                        fM1313 -= 360.0f;
                    } else if (fM1313 < -180.0f) {
                        fM1313 += 360.0f;
                    }
                    f2 += fM1313 * fM12527;
                    f += fM12527;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final float m1304(C1652 c1652, boolean z) {
        long jM1312 = m1312(c1652, z, new C0520(8));
        float fM12527 = 0.0f;
        if (C7329.m12528(jM1312, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = c1652.f4852;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            if (c1643.f4806 && c1643.f4815) {
                i++;
                fM12527 = C7329.m12527(C7329.m12526(z ? c1643.f4807 : c1643.f4816, jM1312)) + fM12527;
            }
        }
        return fM12527 / i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final long m1305(C7321 c7321, Orientation orientation, C7322 c7322) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (orientation == null) {
            return c7321.f19518;
        }
        int i = c7322.f19524;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c7321.f19518 >> 32));
        } else {
            if (i != 2) {
                return c7321.f19518;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c7321.f19518 & 4294967295L));
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
    public static Object m1306(InterfaceC0513 interfaceC0513, SuspendLambda suspendLambda) {
        Object objMo1249 = interfaceC0513.mo1249(MutatePriority.Default, new ScrollExtensionsKt$stopScroll$2(null), suspendLambda);
        return objMo1249 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1249 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m1307(C7321 c7321) {
        return !c7321.f19521 && c7321.f19517;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m1308(C7321 c7321, Orientation orientation, C7322 c7322, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = c7321.f19522;
        if (orientation != null) {
            int i = c7322.f19524;
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
        long jM12526 = C7329.m12526(m1305(c7321, orientation, c7322), j2);
        if (z || !c7321.f19523) {
            return jM12526;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m1309(InterfaceC1633 interfaceC1633) {
        List list = ((C1621) interfaceC1633).f4741.f4757.f4852;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C1643) list.get(i)).f4806) {
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
    public static final java.lang.Object m1310(androidx.compose.foundation.gestures.C0518 r5, p052.InterfaceC6554 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
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
            kotlin.AbstractC5185.m10210(r7)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            goto L3f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L2e:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r7 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            r7.<init>(r5, r6, r3)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            r0.label = r4     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            java.lang.Object r5 = kotlinx.coroutines.AbstractC5399.m10507(r7, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L3f
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0521.m1310(androidx.compose.foundation.gestures.飘花落叶言子楪世兰哲苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1311(InterfaceC1635 interfaceC1635, InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) {
        Object objM3005 = ((C1627) interfaceC1635).m3005(new ForEachGestureKt$awaitEachGesture$2(interfaceC4357.getContext(), interfaceC6554, null), interfaceC4357);
        return objM3005 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3005 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m1312(C1652 c1652, boolean z, InterfaceC6558 interfaceC6558) {
        List list = c1652.f4852;
        int size = list.size();
        long jM12525 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1643 c1643 = (C1643) list.get(i2);
            if (((Boolean) interfaceC6558.invoke(c1643)).booleanValue()) {
                jM12525 = C7329.m12525(jM12525, z ? c1643.f4807 : c1643.f4816);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C7329.m12529(i, jM12525);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final float m1313(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (m1309(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:19:0x0051). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1314(androidx.compose.ui.input.pointer.InterfaceC1633 r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
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
            kotlin.AbstractC5185.m10210(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L51
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L39:
            kotlin.AbstractC5185.m10210(r9)
            boolean r9 = m1309(r7)
            if (r9 != 0) goto L6a
        L42:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r7 = (androidx.compose.ui.input.pointer.C1621) r7
            java.lang.Object r9 = r7.m2999(r8, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r9 = (androidx.compose.ui.input.pointer.C1652) r9
            java.util.List r9 = r9.f4852
            int r2 = r9.size()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L6a
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.ui.input.pointer.C1643) r5
            boolean r5 = r5.f4806
            if (r5 == 0) goto L67
            goto L42
        L67:
            int r4 = r4 + 1
            goto L5a
        L6a:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0521.m1314(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
