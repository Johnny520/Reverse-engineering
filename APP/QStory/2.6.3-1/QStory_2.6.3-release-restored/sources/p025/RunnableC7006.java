package p025;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7006 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f17333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7003 f17334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17335;

    public /* synthetic */ RunnableC7006(Ref$ObjectRef ref$ObjectRef, C7003 c7003, int i) {
        this.f17335 = i;
        this.f17333 = ref$ObjectRef;
        this.f17334 = c7003;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17335;
        C7003 c7003 = this.f17334;
        Ref$ObjectRef ref$ObjectRef = this.f17333;
        switch (i) {
            case 0:
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) ref$ObjectRef.element;
                View view = abstractComponentCallbacksC3171.f7226;
                if (view != null) {
                    C6999 c6999 = C6999.f17312;
                    int i2 = c7003.f17325;
                    c6999.getClass();
                    C6999.m12123(i2, abstractComponentCallbacksC3171);
                } else if (view != null) {
                    view.postDelayed(new RunnableC7006(ref$ObjectRef, c7003, 1), 300L);
                }
                break;
            default:
                C6999 c69992 = C6999.f17312;
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC31712 = (AbstractComponentCallbacksC3171) ref$ObjectRef.element;
                int i3 = c7003.f17325;
                c69992.getClass();
                C6999.m12123(i3, abstractComponentCallbacksC31712);
                break;
        }
    }
}
