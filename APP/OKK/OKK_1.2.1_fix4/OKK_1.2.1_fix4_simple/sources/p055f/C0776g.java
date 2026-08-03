package p055f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0776g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC0779j f2778a;

    /* JADX INFO: renamed from: b */
    public int f2779b;

    /* JADX INFO: renamed from: c */
    public boolean f2780c;

    /* JADX INFO: renamed from: d */
    public final boolean f2781d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f2782e;

    /* JADX INFO: renamed from: f */
    public final int f2783f;

    public C0776g(MenuC0779j r2, LayoutInflater r3, boolean r4, int r5) {
        this.f2779b = -1;
        this.f2781d = r4;
        this.f2782e = r3;
        this.f2778a = r2;
        this.f2783f = r5;
        m1993a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1993a() {
        MenuC0779j r02 = this.f2778a;
        MenuItemC0780k r1 = r02.f2803s;
        if (r1 == null) goto L11;
        r02.m2003i();
        ArrayList r03 = r02.f2794j;
        int r2 = r03.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        if (((MenuItemC0780k) r03.get(r3)) == r1) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        this.f2779b = r3;
        return;
    L11:
        this.f2779b = -1;
    }

    /* JADX INFO: renamed from: b */
    public final MenuItemC0780k m1994b(int r3) {
        boolean r02 = this.f2781d;
        MenuC0779j r1 = this.f2778a;
        if (r02 == false) goto L5;
        r1.m2003i();
        ArrayList r03 = r1.f2794j;
    L6:
        int r12 = this.f2779b;
        if (r12 < 0) goto L11;
        if (r3 < r12) goto L11;
        r3 = r3 + 1;
    L11:
        return (MenuItemC0780k) r03.get(r3);
    L5:
        r03 = r1.m2005k();
        goto L6
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean r02 = this.f2781d;
        MenuC0779j r1 = this.f2778a;
        if (r02 == false) goto L5;
        r1.m2003i();
        ArrayList r03 = r1.f2794j;
    L7:
        if (this.f2779b >= 0) goto L11;
        return r03.size();
    L11:
        return r03.size() - 1;
    L5:
        r03 = r1.m2005k();
        goto L7
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return m1994b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r6, View r7, ViewGroup r8) {
        boolean r02 = false;
        if (r7 != null) goto L5;
        r7 = this.f2782e.inflate(this.f2783f, r8, false);
    L5:
        int r82 = m1994b(r6).f2808b;
        int r1 = r6 - 1;
        if (r1 < 0) goto L8;
        int r12 = m1994b(r1).f2808b;
    L9:
        ListMenuItemView r2 = (ListMenuItemView) r7;
        if (this.f2778a.mo2006l() == false) goto L13;
        if (r82 == r12) goto L13;
        r02 = true;
    L13:
        r2.setGroupDividerEnabled(r02);
        InterfaceC0786q r83 = (InterfaceC0786q) r7;
        if (this.f2780c == false) goto L16;
        r2.setForceShowIcon(true);
    L16:
        r83.mo1113c(m1994b(r6));
        return r7;
    L8:
        r12 = r82;
        goto L9
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1993a();
        super.notifyDataSetChanged();
    }
}
