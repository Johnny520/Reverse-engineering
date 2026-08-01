package p007;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6142 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f16735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6143 f16736;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16737;

    public /* synthetic */ RunnableC6142(Ref$ObjectRef ref$ObjectRef, C6143 c6143, int i) {
        this.f16737 = i;
        this.f16735 = ref$ObjectRef;
        this.f16736 = c6143;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16737;
        C6143 c6143 = this.f16736;
        Ref$ObjectRef ref$ObjectRef = this.f16735;
        switch (i) {
            case 0:
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) ref$ObjectRef.element;
                View view = abstractComponentCallbacksC2338.f6880;
                if (view != null) {
                    C6132 c6132 = C6132.f16715;
                    int i2 = c6143.f16740;
                    c6132.getClass();
                    C6132.m11526(i2, abstractComponentCallbacksC2338);
                } else if (view != null) {
                    view.postDelayed(new RunnableC6142(ref$ObjectRef, c6143, 1), 300L);
                }
                break;
            default:
                C6132 c61322 = C6132.f16715;
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382 = (AbstractComponentCallbacksC2338) ref$ObjectRef.element;
                int i3 = c6143.f16740;
                c61322.getClass();
                C6132.m11526(i3, abstractComponentCallbacksC23382);
                break;
        }
    }
}
