package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.text.C1840;
import androidx.compose.p001ui.InterfaceC2962;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1361 f1825 = new C1361(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1338 f1824 = new C1338();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1350 f1823 = new C1350();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1337 f1822 = new C1337();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC2962 m1818(C1840 c1840, Orientation orientation, boolean z, boolean z2) {
        return new C1349(c1840, orientation, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1819(C1343 c1343, long j, ContinuationImpl continuationImpl) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        C1343 c13432;
        if (continuationImpl instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) continuationImpl;
            int i = scrollableKt$semanticsScrollBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
            }
        }
        Object obj = scrollableKt$semanticsScrollBy$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollableKt$semanticsScrollBy$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            ref$FloatRef = new Ref$FloatRef();
            MutatePriority mutatePriority = MutatePriority.Default;
            ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(c1343, j, ref$FloatRef, null);
            scrollableKt$semanticsScrollBy$1.L$0 = c1343;
            scrollableKt$semanticsScrollBy$1.L$1 = ref$FloatRef;
            scrollableKt$semanticsScrollBy$1.label = 1;
            if (c1343.m1822(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c13432 = c1343;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) scrollableKt$semanticsScrollBy$1.L$1;
            C1343 c13433 = (C1343) scrollableKt$semanticsScrollBy$1.L$0;
            AbstractC6017.m10769(obj);
            ref$FloatRef = ref$FloatRef2;
            c13432 = c13433;
        }
        return new C8158(c13432.m1828(ref$FloatRef.element));
    }
}
