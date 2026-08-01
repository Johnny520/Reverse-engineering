package androidx.compose.material3;

import androidx.collection.AbstractC0270;
import androidx.collection.AbstractC0274;
import androidx.collection.C0247;
import java.util.Arrays;
import p118.AbstractC7362;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1170 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f3370 = 0;

    static {
        int i = AbstractC7362.f19710;
        AbstractC0270.m835(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        C0247 c0247M835 = AbstractC0270.m835(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int i2 = c0247M835.f985;
        int[] iArrCopyOf = i2 == 0 ? AbstractC0274.f979 : new int[i2];
        int[] iArr = c0247M835.f986;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = (iArr[i3] % 12) + 12;
            int i6 = i4 + 1;
            if (iArrCopyOf.length < i6) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i6, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i4] = i5;
            i3++;
            i4 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2027(float r4, float r5, long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.material3.TimePickerKt$onTap$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.TimePickerKt$onTap$1 r0 = (androidx.compose.material3.TimePickerKt$onTap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.TimePickerKt$onTap$1 r0 = new androidx.compose.material3.TimePickerKt$onTap$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            if (r1 == 0) goto L4a
            r4 = 1
            if (r1 == r4) goto L3e
            r4 = 2
            if (r1 != r4) goto L38
            boolean r4 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            if (r5 != 0) goto L34
            kotlin.AbstractC5185.m10210(r8)
            if (r4 != 0) goto L33
            return
        L33:
            throw r2
        L34:
            com.alibaba.fastjson2.C2942.m6394()
            return
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return
        L3e:
            java.lang.Object r4 = r0.L$0
            if (r4 == 0) goto L46
            com.alibaba.fastjson2.C2942.m6394()
            return
        L46:
            kotlin.AbstractC5185.m10210(r8)
            throw r2
        L4a:
            kotlin.AbstractC5185.m10210(r8)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r8 = (int) r0
            float r8 = (float) r8
            float r5 = r5 - r8
            r8 = 32
            long r6 = r6 >> r8
            int r6 = (int) r6
            float r6 = (float) r6
            float r4 = r4 - r6
            double r5 = (double) r5
            double r7 = (double) r4
            java.lang.Math.atan2(r5, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AbstractC1170.m2027(float, float, long, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
