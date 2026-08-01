package androidx.compose.material3;

import androidx.collection.AbstractC1117;
import androidx.collection.AbstractC1121;
import androidx.collection.C1094;
import com.alibaba.fastjson2.C3775;
import java.util.Arrays;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p134.AbstractC8191;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f3715 = 0;

    static {
        int i = AbstractC8191.f20055;
        AbstractC1117.m1395(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        C1094 c1094M1395 = AbstractC1117.m1395(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int i2 = c1094M1395.f1330;
        int[] iArrCopyOf = i2 == 0 ? AbstractC1121.f1324 : new int[i2];
        int[] iArr = c1094M1395.f1331;
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
    */
    public static final void m2587(float f, float f2, long j, ContinuationImpl continuationImpl) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        if (continuationImpl instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) continuationImpl;
            int i = timePickerKt$onTap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timePickerKt$onTap$1.label = i - Integer.MIN_VALUE;
            } else {
                timePickerKt$onTap$1 = new TimePickerKt$onTap$1(continuationImpl);
            }
        }
        Object obj = timePickerKt$onTap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timePickerKt$onTap$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Math.atan2(f2 - ((int) (4294967295L & j)), f - ((int) (j >> 32)));
            throw null;
        }
        if (i2 == 1) {
            if (timePickerKt$onTap$1.L$0 != null) {
                C3775.m6954();
                return;
            } else {
                AbstractC6017.m10769(obj);
                throw null;
            }
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        boolean z = timePickerKt$onTap$1.Z$0;
        if (timePickerKt$onTap$1.L$0 != null) {
            C3775.m6954();
            return;
        }
        AbstractC6017.m10769(obj);
        if (z) {
            throw null;
        }
    }
}
