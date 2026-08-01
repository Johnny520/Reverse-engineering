package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import p225.AbstractC8002;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8351 extends AbstractC8002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f23029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f23030;

    public C8351(String str, View view) {
        this.f23030 = view;
        this.f23029 = str;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6773(Object obj) {
        Drawable drawable = (Drawable) obj;
        View view = this.f23030;
        if (((String) view.getTag(R.id.action_container)).equals(this.f23029)) {
            view.setBackground(drawable);
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6780(Drawable drawable) {
    }
}
