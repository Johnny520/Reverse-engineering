package p339;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import p273.C9037;
import p273.C9062;
import p303.AbstractC9234;
import p368.RunnableC9696;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9548 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24909;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9548(View view, int i) {
        super(view);
        this.f24909 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    public final void onBind(Object obj, View view) {
        switch (this.f24909) {
            case 0:
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C9037) obj).getClass();
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
                view.getClass();
                break;
            case 1:
                C9062 c9062 = (C9062) obj;
                c9062.getClass();
                view.getClass();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC9696(c9062, 4), 2000L);
                break;
            case 2:
                ((C9037) obj).getClass();
                view.getClass();
                break;
            default:
                ((C9037) obj).getClass();
                view.getClass();
                break;
        }
    }
}
