package p027;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC6300 extends DialogC6299 {
    public DialogC6300(Context context) {
        super(context);
        getWindow().setBackgroundDrawable(null);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(view);
        m11805((int) (((double) m11806()) * 0.7d));
    }
}
