package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hu extends BaseAdapter {
    public final ku a;
    public int b;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public hu(ku r2, LayoutInflater r3, boolean r4, int r5) {
        this.b = -1;
        this.d = r4;
        this.e = r3;
        this.a = r2;
        this.f = r5;
        a();
    }

    public final void a() {
        ku r0 = this.a;
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
        this.b = r3;
        return;
    L11:
        this.b = -1;
    }

    public final ou b(int r3) {
        boolean r0 = this.d;
        ku r1 = this.a;
        if (r0 == false) goto L5;
        r1.i();
        ArrayList r02 = r1.j;
    L6:
        int r12 = this.b;
        if (r12 < 0) goto L11;
        if (r3 < r12) goto L11;
        r3 = r3 + 1;
    L11:
        return (ou) r02.get(r3);
    L5:
        r02 = r1.l();
        goto L6
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean r0 = this.d;
        ku r1 = this.a;
        if (r0 == false) goto L5;
        r1.i();
        ArrayList r02 = r1.j;
    L7:
        if (this.b >= 0) goto L11;
        return r02.size();
    L11:
        return r02.size() - 1;
    L5:
        r02 = r1.l();
        goto L7
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
    public final View getView(int r6, View r7, ViewGroup r8) {
        boolean r0 = false;
        if (r7 != null) goto L5;
        r7 = this.e.inflate(this.f, r8, false);
    L5:
        int r82 = b(r6).b;
        int r1 = r6 - 1;
        if (r1 < 0) goto L8;
        int r12 = b(r1).b;
    L9:
        ListMenuItemView r2 = (ListMenuItemView) r7;
        if (this.a.m() == false) goto L13;
        if (r82 == r12) goto L13;
        r0 = true;
    L13:
        r2.setGroupDividerEnabled(r0);
        ev r83 = (ev) r7;
        if (this.c == false) goto L16;
        r2.setForceShowIcon(true);
    L16:
        r83.c(b(r6));
        return r7;
    L8:
        r12 = r82;
        goto L9
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
