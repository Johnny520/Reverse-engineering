package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: gr */
/* JADX INFO: loaded from: classes.dex */
public final class C0271gr extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f2042a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0308hr f2043b;

    public C0271gr(C0308hr c0308hr) {
        this.f2043b = c0308hr;
        m1297a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1297a() {
        MenuC0646qu menuC0646qu = this.f2043b.f2254c;
        C0869wu c0869wu = menuC0646qu.f3972v;
        if (c0869wu != null) {
            menuC0646qu.m2170i();
            ArrayList arrayList = menuC0646qu.f3960j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0869wu) arrayList.get(i)) == c0869wu) {
                    this.f2042a = i;
                    return;
                }
            }
        }
        this.f2042a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0869wu getItem(int i) {
        C0308hr c0308hr = this.f2043b;
        MenuC0646qu menuC0646qu = c0308hr.f2254c;
        menuC0646qu.m2170i();
        ArrayList arrayList = menuC0646qu.f3960j;
        c0308hr.getClass();
        int i2 = this.f2042a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0869wu) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0308hr c0308hr = this.f2043b;
        MenuC0646qu menuC0646qu = c0308hr.f2254c;
        menuC0646qu.m2170i();
        int size = menuC0646qu.f3960j.size();
        c0308hr.getClass();
        return this.f2042a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2043b.f2253b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0499mv) view).mo119c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1297a();
        super.notifyDataSetChanged();
    }
}
