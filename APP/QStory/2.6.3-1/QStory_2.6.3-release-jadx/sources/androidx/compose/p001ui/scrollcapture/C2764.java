package androidx.compose.p001ui.scrollcapture;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2764 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f6024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f6025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6026;

    public C2764(int i, InterfaceC7383 interfaceC7383) {
        this.f6026 = i;
        this.f6025 = interfaceC7383;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4197(float f, ContinuationImpl continuationImpl) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i = relativeScroller$scrollBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.label = i - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
            }
        }
        Object objInvoke = relativeScroller$scrollBy$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = relativeScroller$scrollBy$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objInvoke);
            Float f2 = new Float(f);
            relativeScroller$scrollBy$1.label = 1;
            objInvoke = this.f6025.invoke(f2, relativeScroller$scrollBy$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objInvoke);
        }
        this.f6024 += ((Number) objInvoke).floatValue();
        return C6008.f15084;
    }
}
