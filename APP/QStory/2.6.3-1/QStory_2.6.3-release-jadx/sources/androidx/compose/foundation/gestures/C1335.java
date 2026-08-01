package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.nestedscroll.InterfaceC2455;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1335 implements InterfaceC2455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f1818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1343 f1819;

    public C1335(C1343 c1343, boolean z) {
        this.f1819 = c1343;
        this.f1818 = z;
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final long mo1814(long j, long j2, int i) {
        if (!this.f1818) {
            return 0L;
        }
        C1343 c1343 = this.f1819;
        if (c1343.f1837.mo1810()) {
            return 0L;
        }
        return c1343.m1828(c1343.m1824(c1343.f1837.mo1808(c1343.m1824(c1343.m1829(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1815(long j, long j2, ContinuationImpl continuationImpl) throws Throwable {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jM13908;
        if (continuationImpl instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuationImpl;
            int i = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, continuationImpl);
            }
        }
        Object objM1827 = scrollableNestedScrollConnection$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM1827);
            jM13908 = 0;
            if (this.f1818) {
                C1343 c1343 = this.f1819;
                if (!c1343.f1843) {
                    scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                    scrollableNestedScrollConnection$onPostFling$1.label = 1;
                    objM1827 = c1343.m1827(j2, scrollableNestedScrollConnection$onPostFling$1);
                    if (objM1827 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                jM13908 = C8731.m13908(j2, jM13908);
            }
            return new C8731(jM13908);
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
        AbstractC6017.m10769(objM1827);
        jM13908 = ((C8731) objM1827).f22216;
        jM13908 = C8731.m13908(j2, jM13908);
        return new C8731(jM13908);
    }
}
