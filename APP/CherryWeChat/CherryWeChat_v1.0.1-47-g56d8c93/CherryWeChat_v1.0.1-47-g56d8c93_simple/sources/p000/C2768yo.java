package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: yo */
/* JADX INFO: loaded from: classes.dex */
public final class C2768yo implements InterfaceC0163Dr, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f9409a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f9410b;

    /* JADX INFO: renamed from: c */
    public MenuC2204lr f9411c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f9412d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0120Cr f9413e;

    /* JADX INFO: renamed from: f */
    public C2725xo f9414f;

    public C2768yo(Context r1) {
        this.f9409a = r1;
        this.f9410b = LayoutInflater.from(r1);
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr r2, boolean r3) {
        InterfaceC0120Cr r0 = this.f9413e;
        if (r0 == null) goto L6;
        r0.mo193b(r2, r3);
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr r1) {
        throw null;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        C2725xo r0 = this.f9414f;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context r2, MenuC2204lr r3) {
        if (this.f9409a == null) goto L7;
        this.f9409a = r2;
        if (this.f9410b != null) goto L7;
        this.f9410b = LayoutInflater.from(r2);
    L7:
        this.f9411c = r3;
        C2725xo r22 = this.f9414f;
        if (r22 == null) goto L11;
        r22.notifyDataSetChanged();
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez r6) {
        boolean r0 = r6.hasVisibleItems();
        Context r1 = r6.f7660a;
        if (r0 == true) goto L6;
        return false;
    L6:
        DialogInterfaceOnKeyListenerC2247mr r02 = new DialogInterfaceOnKeyListenerC2247mr();
        r02.f7948a = r6;
        C2654w2 r2 = new C2654w2(r1);
        C2768yo r3 = new C2768yo(r2.getContext());
        r02.f7950c = r3;
        r3.f9413e = r02;
        r6.m4429b(r3, r1);
        C2768yo r12 = r02.f7950c;
        if (r12.f9414f != null) goto L9;
        r12.f9414f = new C2725xo(r12);
    L9:
        C2725xo r13 = r12.f9414f;
        C2482s2 r32 = r2.f9188a;
        r32.f8728k = r13;
        r32.f8729l = r02;
        View r14 = r6.f7674o;
        if (r14 == null) goto L12;
        r32.f8722e = r14;
    L13:
        r32.f8727j = r02;
        DialogInterfaceC2697x2 r15 = r2.create();
        r02.f7949b = r15;
        r15.setOnDismissListener(r02);
        WindowManager.LayoutParams r16 = r02.f7949b.getWindow().getAttributes();
        r16.type = 1003;
        r16.flags |= 131072;
        r02.f7949b.show();
        InterfaceC0120Cr r03 = this.f9413e;
        if (r03 == null) goto L18;
        r03.mo194s(r6);
        return true;
    L18:
        return true;
    L12:
        r32.f8720c = r6.f7673n;
        r2.setTitle(r6.f7672m);
        goto L13
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        this.f9411c.m4436q(this.f9414f.m5289b(r3), this, 0);
    }
}
