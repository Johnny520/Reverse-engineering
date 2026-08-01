package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cr extends BaseAdapter {
    public int a;
    public final /* synthetic */ dr b;

    public cr(dr r1) {
        this.b = r1;
        this.a = -1;
        a();
    }

    public final void a() {
        ku r0 = this.b.c;
        ou r1 = r0.v;
        if (r1 == null) goto L11;
        r0.i();
        ArrayList r02 = r0.j;
        int r2 = r02.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        if (((ou) r02.get(r3)) == r1) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        this.a = r3;
        return;
    L11:
        this.a = -1;
    }

    public final ou b(int r3) {
        dr r0 = this.b;
        ku r1 = r0.c;
        r1.i();
        ArrayList r12 = r1.j;
        r0.getClass();
        int r02 = this.a;
        if (r02 < 0) goto L7;
        if (r3 < r02) goto L7;
        r3 = r3 + 1;
    L7:
        return (ou) r12.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        dr r0 = this.b;
        ku r1 = r0.c;
        r1.i();
        int r12 = r1.j.size();
        r0.getClass();
        if (this.a >= 0) goto L6;
        return r12;
    L6:
        return r12 - 1;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        if (r4 != null) goto L4;
        r4 = this.b.b.inflate(R.layout.abc_list_menu_item_layout, r5, false);
    L4:
        ((ev) r4).c(b(r3));
        return r4;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
