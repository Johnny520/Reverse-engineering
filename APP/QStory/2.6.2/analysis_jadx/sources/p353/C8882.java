package p353;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8882 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25033 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f25034;

    public C8882(ArrayList arrayList) {
        AbstractC3056.m6668(-3937689878926722471L);
        this.f25034 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f25034.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (String) this.f25034.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AbstractC3056.m6668(-3937690699265476007L);
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_simple_text, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.tv_text)).setText((String) this.f25034.get(i));
        return viewInflate;
    }
}
