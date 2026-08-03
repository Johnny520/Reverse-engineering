package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: xo */
/* JADX INFO: loaded from: classes.dex */
public final class C2725xo extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f9309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768yo f9310b;

    public C2725xo(C2768yo r1) {
        this.f9310b = r1;
        this.f9309a = -1;
        m5288a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5288a() {
        MenuC2204lr r0 = this.f9310b.f9411c;
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
        this.f9309a = r3;
        return;
    L11:
        this.f9309a = -1;
    }

    /* JADX INFO: renamed from: b */
    public final C2427qr m5289b(int r3) {
        C2768yo r0 = this.f9310b;
        MenuC2204lr r1 = r0.f9411c;
        r1.m4433i();
        ArrayList r12 = r1.f7669j;
        r0.getClass();
        int r02 = this.f9309a;
        if (r02 < 0) goto L7;
        if (r3 < r02) goto L7;
        r3 = r3 + 1;
    L7:
        return (C2427qr) r12.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2768yo r0 = this.f9310b;
        MenuC2204lr r1 = r0.f9411c;
        r1.m4433i();
        int r12 = r1.f7669j.size();
        r0.getClass();
        if (this.f9309a >= 0) goto L6;
        return r12;
    L6:
        return r12 - 1;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return m5289b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        if (r4 != null) goto L4;
        r4 = this.f9310b.f9410b.inflate(R.layout.abc_list_menu_item_layout, r5, false);
    L4:
        ((InterfaceC0249Fr) r4).mo521c(m5289b(r3));
        return r4;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m5288a();
        super.notifyDataSetChanged();
    }
}
