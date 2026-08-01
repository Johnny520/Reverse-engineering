package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.window.area.AbstractC3400;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C6253;
import p068.InterfaceC7383;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0923 f1946 = new C0923(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f1947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC8725 f1948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f1949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1343 f1950;

    public AbstractC1397(C1343 c1343, InterfaceC7383 interfaceC7383, InterfaceC8725 interfaceC8725) {
        this.f1950 = c1343;
        this.f1949 = interfaceC7383;
        this.f1948 = interfaceC8725;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m1910(C2487 c2487) {
        List list = c2487.f5197;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2478) list.get(i)).m3584();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1911(InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        NonTouchScrollingLogic$userScroll$1 nonTouchScrollingLogic$userScroll$1;
        if (continuationImpl instanceof NonTouchScrollingLogic$userScroll$1) {
            nonTouchScrollingLogic$userScroll$1 = (NonTouchScrollingLogic$userScroll$1) continuationImpl;
            int i = nonTouchScrollingLogic$userScroll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonTouchScrollingLogic$userScroll$1.label = i - Integer.MIN_VALUE;
            } else {
                nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, continuationImpl);
            }
        }
        Object obj = nonTouchScrollingLogic$userScroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nonTouchScrollingLogic$userScroll$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.f1947 = true;
            NonTouchScrollingLogic$userScroll$2 nonTouchScrollingLogic$userScroll$2 = new NonTouchScrollingLogic$userScroll$2(this, interfaceC7383, null);
            nonTouchScrollingLogic$userScroll$1.label = 1;
            C6253 c6253 = new C6253(nonTouchScrollingLogic$userScroll$1, nonTouchScrollingLogic$userScroll$1.getContext());
            if (AbstractC3400.m5629(c6253, true, c6253, nonTouchScrollingLogic$userScroll$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        this.f1947 = false;
        return C6008.f15084;
    }
}
