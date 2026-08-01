package p009;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6177 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f16988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6174 f16989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16990;

    public /* synthetic */ RunnableC6177(Ref$ObjectRef ref$ObjectRef, C6174 c6174, int i) {
        this.f16990 = i;
        this.f16988 = ref$ObjectRef;
        this.f16989 = c6174;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16990;
        C6174 c6174 = this.f16989;
        Ref$ObjectRef ref$ObjectRef = this.f16988;
        switch (i) {
            case 0:
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) ref$ObjectRef.element;
                View view = abstractComponentCallbacksC2338.f6881;
                if (view != null) {
                    C6170 c6170 = C6170.f16967;
                    int i2 = c6174.f16980;
                    c6170.getClass();
                    C6170.m11564(i2, abstractComponentCallbacksC2338);
                } else if (view != null) {
                    view.postDelayed(new RunnableC6177(ref$ObjectRef, c6174, 1), 300L);
                }
                break;
            default:
                C6170 c61702 = C6170.f16967;
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) ref$ObjectRef.element;
                int i3 = c6174.f16980;
                c61702.getClass();
                C6170.m11564(i3, abstractComponentCallbacksC23382);
                break;
        }
    }
}
