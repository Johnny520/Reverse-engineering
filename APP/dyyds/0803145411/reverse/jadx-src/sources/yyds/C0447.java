package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛲᲁᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0447 extends BaseAdapter {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f2276 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2711 f2277;

    public C0447(C2711 c2711) {
        this.f2277 = c2711;
        m1229();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        MenuC0836 menuC0836 = this.f2277.f13325;
        menuC0836.m1898();
        int size = menuC0836.f3838.size();
        return this.f2276 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2277.f13329.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2468) view).mo26(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1229();
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1229() {
        MenuC0836 menuC0836 = this.f2277.f13325;
        C1148 c1148 = menuC0836.f3827;
        if (c1148 != null) {
            menuC0836.m1898();
            ArrayList arrayList = menuC0836.f3838;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1148) arrayList.get(i)) == c1148) {
                    this.f2276 = i;
                    return;
                }
            }
        }
        this.f2276 = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1148 getItem(int i) {
        MenuC0836 menuC0836 = this.f2277.f13325;
        menuC0836.m1898();
        ArrayList arrayList = menuC0836.f3838;
        int i2 = this.f2276;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1148) arrayList.get(i);
    }
}
