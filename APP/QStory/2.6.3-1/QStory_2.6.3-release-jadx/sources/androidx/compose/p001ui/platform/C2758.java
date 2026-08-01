package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f6016 = AbstractC2202.m3034(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2758 f6017;

    public C2758(C2758 c2758) {
        this.f6017 = c2758;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons m4194(InterfaceC2636 interfaceC2636, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        if (continuationImpl instanceof ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (ChainedPlatformTextInputInterceptor$textInputSession$1) continuationImpl;
            int i = chainedPlatformTextInputInterceptor$textInputSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.label = i - Integer.MIN_VALUE;
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, continuationImpl);
            }
        }
        Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chainedPlatformTextInputInterceptor$textInputSession$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(interfaceC7383, this, null);
            chainedPlatformTextInputInterceptor$textInputSession$1.label = 1;
            if (AbstractC2688.m4041(interfaceC2636, this.f6017, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
