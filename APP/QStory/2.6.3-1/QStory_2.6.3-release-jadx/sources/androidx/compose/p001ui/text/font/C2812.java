package androidx.compose.p001ui.text.font;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2812 implements InterfaceC2818 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4259(ContinuationImpl continuationImpl) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        if (continuationImpl instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) continuationImpl;
            int i = androidFontLoader$awaitLoad$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label = i - Integer.MIN_VALUE;
            } else {
                androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, continuationImpl);
            }
        }
        Object obj = androidFontLoader$awaitLoad$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidFontLoader$awaitLoad$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6755.m11869("Unknown font type: null");
            return null;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(obj);
            return obj;
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (androidFontLoader$awaitLoad$1.L$0 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
