package p206;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8609 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8608 f21482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21483 = -1;

    public C8609(C8608 c8608) {
        this.f21482 = c8608;
        m13700();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C8608 c8608 = this.f21482;
        MenuC8631 menuC8631 = c8608.f21480;
        menuC8631.m13727();
        int size = menuC8631.f21599.size();
        c8608.getClass();
        return this.f21483 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21482.f21479.inflate(C0328R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC8616) view).mo1014(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13700();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C8629 getItem(int i) {
        C8608 c8608 = this.f21482;
        MenuC8631 menuC8631 = c8608.f21480;
        menuC8631.m13727();
        ArrayList arrayList = menuC8631.f21599;
        c8608.getClass();
        int i2 = this.f21483;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C8629) arrayList.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13700() {
        MenuC8631 menuC8631 = this.f21482.f21480;
        C8629 c8629 = menuC8631.f21592;
        if (c8629 != null) {
            menuC8631.m13727();
            ArrayList arrayList = menuC8631.f21599;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C8629) arrayList.get(i)) == c8629) {
                    this.f21483 = i;
                    return;
                }
            }
        }
        this.f21483 = -1;
    }
}
