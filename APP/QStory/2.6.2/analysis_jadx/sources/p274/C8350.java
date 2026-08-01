package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import p225.AbstractC8001;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8350 extends AbstractC8001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ String f23030;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f23031;

    public C8350(String str, View view) {
        this.f23031 = view;
        this.f23030 = str;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6728(Object obj) {
        Drawable drawable = (Drawable) obj;
        View view = this.f23031;
        if (((String) view.getTag(R.id.action_container)).equals(this.f23030)) {
            view.setBackground(drawable);
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6735(Drawable drawable) {
    }
}
