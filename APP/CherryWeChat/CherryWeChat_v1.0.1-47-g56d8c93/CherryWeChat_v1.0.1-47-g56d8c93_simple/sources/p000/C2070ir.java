package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ir */
/* JADX INFO: loaded from: classes.dex */
public final class C2070ir extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC2204lr f7324a;

    /* JADX INFO: renamed from: b */
    public int f7325b;

    /* JADX INFO: renamed from: c */
    public boolean f7326c;

    /* JADX INFO: renamed from: d */
    public final boolean f7327d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f7328e;

    /* JADX INFO: renamed from: f */
    public final int f7329f;

    public C2070ir(MenuC2204lr r2, LayoutInflater r3, boolean r4, int r5) {
        this.f7325b = -1;
        this.f7327d = r4;
        this.f7328e = r3;
        this.f7324a = r2;
        this.f7329f = r5;
        m4239a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4239a() {
        MenuC2204lr r0 = this.f7324a;
        C2427qr r1 = r0.f7681v;
        if (r1 == null) goto L11;
        r0.m4433i();
        ArrayList r02 = r0.f7669j;
        int r2 = r02.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        if (((C2427qr) r02.get(r3)) == r1) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        this.f7325b = r3;
        return;
    L11:
        this.f7325b = -1;
    }

    /* JADX INFO: renamed from: b */
    public final C2427qr m4240b(int r3) {
        boolean r0 = this.f7327d;
        MenuC2204lr r1 = this.f7324a;
        if (r0 == false) goto L5;
        r1.m4433i();
        ArrayList r02 = r1.f7669j;
    L6:
        int r12 = this.f7325b;
        if (r12 < 0) goto L11;
        if (r3 < r12) goto L11;
        r3 = r3 + 1;
    L11:
        return (C2427qr) r02.get(r3);
    L5:
        r02 = r1.m4434l();
        goto L6
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean r0 = this.f7327d;
        MenuC2204lr r1 = this.f7324a;
        if (r0 == false) goto L5;
        r1.m4433i();
        ArrayList r02 = r1.f7669j;
    L7:
        if (this.f7325b >= 0) goto L11;
        return r02.size();
    L11:
        return r02.size() - 1;
    L5:
        r02 = r1.m4434l();
        goto L7
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return m4240b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r6, View r7, ViewGroup r8) {
        boolean r0 = false;
        if (r7 != null) goto L5;
        r7 = this.f7328e.inflate(this.f7329f, r8, false);
    L5:
        int r82 = m4240b(r6).f8493b;
        int r1 = r6 - 1;
        if (r1 < 0) goto L8;
        int r12 = m4240b(r1).f8493b;
    L9:
        ListMenuItemView r2 = (ListMenuItemView) r7;
        if (this.f7324a.mo431m() == false) goto L13;
        if (r82 == r12) goto L13;
        r0 = true;
    L13:
        r2.setGroupDividerEnabled(r0);
        InterfaceC0249Fr r83 = (InterfaceC0249Fr) r7;
        if (this.f7326c == false) goto L16;
        r2.setForceShowIcon(true);
    L16:
        r83.mo521c(m4240b(r6));
        return r7;
    L8:
        r12 = r82;
        goto L9
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4239a();
        super.notifyDataSetChanged();
    }
}
