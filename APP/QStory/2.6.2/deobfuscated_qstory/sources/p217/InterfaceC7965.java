package p217;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2484;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7965 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    void mo11521(AbstractC2484 abstractC2484, int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    AbstractC2484 mo11522(Context context, ViewGroup viewGroup);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default void mo11523(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        abstractC2484.getClass();
        list.getClass();
        mo11521(abstractC2484, i, obj);
    }
}
