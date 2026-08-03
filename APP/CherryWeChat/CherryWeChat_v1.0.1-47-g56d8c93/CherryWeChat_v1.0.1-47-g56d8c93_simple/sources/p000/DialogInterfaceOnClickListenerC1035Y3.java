package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1035Y3 implements InterfaceC1350e4, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogInterfaceC2697x2 f3304a;

    /* JADX INFO: renamed from: b */
    public C1078Z3 f3305b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1394f4 f3307d;

    public DialogInterfaceOnClickListenerC1035Y3(C1394f4 r1) {
        this.f3307d = r1;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: a */
    public final boolean mo1971a() {
        DialogInterfaceC2697x2 r0 = this.f3304a;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.isShowing();
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: b */
    public final int mo1972b() {
        return 0;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: d */
    public final Drawable mo1973d() {
        return null;
    }

    @Override // p000.InterfaceC1350e4
    public final void dismiss() {
        DialogInterfaceC2697x2 r0 = this.f3304a;
        if (r0 == null) goto L6;
        r0.dismiss();
        this.f3304a = null;
        return;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: f */
    public final void mo1974f(CharSequence r1) {
        this.f3306c = r1;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: g */
    public final void mo1975g(Drawable r1) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: j */
    public final void mo1976j(int r1) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: k */
    public final void mo1977k(int r1) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: l */
    public final void mo1978l(int r1) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: m */
    public final void mo1979m(int r5, int r6) {
        if (this.f3305b != null) goto L5;
        return;
    L5:
        C1394f4 r1 = this.f3307d;
        C2654w2 r0 = new C2654w2(r1.getPopupContext());
        CharSequence r2 = this.f3306c;
        if (r2 == null) goto L8;
        r0.setTitle(r2);
    L8:
        C1078Z3 r22 = this.f3305b;
        int r12 = r1.getSelectedItemPosition();
        C2482s2 r3 = r0.f9188a;
        r3.f8728k = r22;
        r3.f8729l = this;
        r3.f8732o = r12;
        r3.f8731n = true;
        DialogInterfaceC2697x2 r02 = r0.create();
        this.f3304a = r02;
        AlertController$RecycleListView r03 = r02.f9274f.f9037e;
        r03.setTextDirection(r5);
        r03.setTextAlignment(r6);
        this.f3304a.show();
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: n */
    public final int mo1980n() {
        return 0;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: o */
    public final CharSequence mo1981o() {
        return this.f3306c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r4, int r5) {
        C1394f4 r42 = this.f3307d;
        r42.setSelection(r5);
        if (r42.getOnItemClickListener() == null) goto L5;
        r42.performItemClick(null, r5, this.f3305b.getItemId(r5));
    L5:
        dismiss();
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: p */
    public final void mo584p(ListAdapter r1) {
        this.f3305b = (C1078Z3) r1;
    }
}
