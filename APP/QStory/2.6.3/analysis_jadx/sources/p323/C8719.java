package p323;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import p257.C8208;
import p257.C8233;
import p287.AbstractC8405;
import p352.RunnableC8867;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8719 extends AbstractC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24564;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8719(View view, int i) {
        super(view);
        this.f24564 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3749
    public final void onBind(Object obj, View view) {
        switch (this.f24564) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C8208) obj).getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
                view.getClass();
                break;
            case 1:
                C8233 c8233 = (C8233) obj;
                c8233.getClass();
                view.getClass();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC8867(c8233, 4), 2000L);
                break;
            case 2:
                ((C8208) obj).getClass();
                view.getClass();
                break;
            default:
                ((C8208) obj).getClass();
                view.getClass();
                break;
        }
    }
}
