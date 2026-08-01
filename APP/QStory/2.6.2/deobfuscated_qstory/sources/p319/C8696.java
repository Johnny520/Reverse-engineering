package p319;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import p257.C8207;
import p257.C8232;
import p342.RunnableC8819;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8696 extends AbstractC3748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24516;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8696(View view, int i) {
        super(view);
        this.f24516 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3748
    public final void onBind(Object obj, View view) {
        switch (this.f24516) {
            case 0:
                "dialog";
                ((C8207) obj).getClass();
                "v";
                view.getClass();
                break;
            case 1:
                C8232 c8232 = (C8232) obj;
                c8232.getClass();
                view.getClass();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC8819(c8232, 4), 2000L);
                break;
            case 2:
                ((C8207) obj).getClass();
                view.getClass();
                break;
            default:
                ((C8207) obj).getClass();
                view.getClass();
                break;
        }
    }
}
