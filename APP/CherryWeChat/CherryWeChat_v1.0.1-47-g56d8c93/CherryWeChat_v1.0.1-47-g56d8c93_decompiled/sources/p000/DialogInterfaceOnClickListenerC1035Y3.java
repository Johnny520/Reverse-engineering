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

    public DialogInterfaceOnClickListenerC1035Y3(C1394f4 c1394f4) {
        this.f3307d = c1394f4;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: a */
    public final boolean mo1971a() {
        DialogInterfaceC2697x2 dialogInterfaceC2697x2 = this.f3304a;
        if (dialogInterfaceC2697x2 != null) {
            return dialogInterfaceC2697x2.isShowing();
        }
        return false;
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
        DialogInterfaceC2697x2 dialogInterfaceC2697x2 = this.f3304a;
        if (dialogInterfaceC2697x2 != null) {
            dialogInterfaceC2697x2.dismiss();
            this.f3304a = null;
        }
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: f */
    public final void mo1974f(CharSequence charSequence) {
        this.f3306c = charSequence;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: g */
    public final void mo1975g(Drawable drawable) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: j */
    public final void mo1976j(int i) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: k */
    public final void mo1977k(int i) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: l */
    public final void mo1978l(int i) {
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: m */
    public final void mo1979m(int i, int i2) {
        if (this.f3305b == null) {
            return;
        }
        C1394f4 c1394f4 = this.f3307d;
        C2654w2 c2654w2 = new C2654w2(c1394f4.getPopupContext());
        CharSequence charSequence = this.f3306c;
        if (charSequence != null) {
            c2654w2.setTitle(charSequence);
        }
        C1078Z3 c1078z3 = this.f3305b;
        int selectedItemPosition = c1394f4.getSelectedItemPosition();
        C2482s2 c2482s2 = c2654w2.f9188a;
        c2482s2.f8728k = c1078z3;
        c2482s2.f8729l = this;
        c2482s2.f8732o = selectedItemPosition;
        c2482s2.f8731n = true;
        DialogInterfaceC2697x2 dialogInterfaceC2697x2Create = c2654w2.create();
        this.f3304a = dialogInterfaceC2697x2Create;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC2697x2Create.f9274f.f9037e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
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
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1394f4 c1394f4 = this.f3307d;
        c1394f4.setSelection(i);
        if (c1394f4.getOnItemClickListener() != null) {
            c1394f4.performItemClick(null, i, this.f3305b.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: p */
    public final void mo584p(ListAdapter listAdapter) {
        this.f3305b = (C1078Z3) listAdapter;
    }
}
