package androidx.compose.foundation.relocation;

import androidx.compose.foundation.C1868;
import androidx.compose.p001ui.relocation.AbstractC2760;
import androidx.compose.runtime.collection.C2059;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1614 implements InterfaceC1616 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f2589 = new C2059(0, new C1612[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2138(C8157 c8157, ContinuationImpl continuationImpl) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        C8157 c81572;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuationImpl;
            int i3 = bringIntoViewRequesterImpl$bringIntoView$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label = i3 - Integer.MIN_VALUE;
            } else {
                bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuationImpl);
            }
        }
        Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = bringIntoViewRequesterImpl$bringIntoView$1.label;
        if (i4 == 0) {
            AbstractC6017.m10769(obj);
            C2059 c2059 = this.f2589;
            Object[] objArr2 = c2059.f3866;
            i = c2059.f3865;
            c81572 = c8157;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
            i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
            objArr = (Object[]) bringIntoViewRequesterImpl$bringIntoView$1.L$1;
            C8157 c81573 = (C8157) bringIntoViewRequesterImpl$bringIntoView$1.L$0;
            AbstractC6017.m10769(obj);
            c81572 = c81573;
            i2++;
            if (i2 < i) {
                C1612 c1612 = (C1612) objArr[i2];
                C1868 c1868 = new C1868(c81572, 2);
                bringIntoViewRequesterImpl$bringIntoView$1.L$0 = c81572;
                bringIntoViewRequesterImpl$bringIntoView$1.L$1 = objArr;
                bringIntoViewRequesterImpl$bringIntoView$1.I$0 = i2;
                bringIntoViewRequesterImpl$bringIntoView$1.I$1 = i;
                bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                if (AbstractC2760.m4195(c1612, c1868, bringIntoViewRequesterImpl$bringIntoView$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2++;
                if (i2 < i) {
                    return C6008.f15084;
                }
            }
        }
    }
}
