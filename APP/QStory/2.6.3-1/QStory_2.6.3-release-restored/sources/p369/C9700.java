package p369;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9700 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25361 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f25362;

    public C9700(ArrayList arrayList) {
        "list";
        this.f25362 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f25362.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (String) this.f25362.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        "parent";
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.item_simple_text, viewGroup, false);
        ((TextView) viewInflate.findViewById(C0328R.id.tv_text)).setText((String) this.f25362.get(i));
        return viewInflate;
    }
}
