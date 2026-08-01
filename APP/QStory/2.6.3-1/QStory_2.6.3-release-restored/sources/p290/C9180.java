package p290;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import p241.AbstractC8831;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9180 extends AbstractC8831 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f23374;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f23375;

    public C9180(String str, View view) {
        this.f23375 = view;
        this.f23374 = str;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7333(Object obj) {
        Drawable drawable = (Drawable) obj;
        View view = this.f23375;
        if (((String) view.getTag(C0328R.id.action_container)).equals(this.f23374)) {
            view.setBackground(drawable);
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7340(Drawable drawable) {
    }
}
