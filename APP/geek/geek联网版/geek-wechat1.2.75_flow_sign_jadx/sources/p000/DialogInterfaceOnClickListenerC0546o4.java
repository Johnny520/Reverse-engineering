package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0546o4 implements InterfaceC0768u4, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogC0246g2 f3378a;

    /* JADX INFO: renamed from: b */
    public C0583p4 f3379b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3380c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0805v4 f3381d;

    public DialogInterfaceOnClickListenerC0546o4(C0805v4 c0805v4) {
        this.f3381d = c0805v4;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: b */
    public final boolean mo1972b() {
        DialogC0246g2 dialogC0246g2 = this.f3378a;
        if (dialogC0246g2 != null) {
            return dialogC0246g2.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: c */
    public final void mo1973c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: d */
    public final int mo1974d() {
        return 0;
    }

    @Override // p000.InterfaceC0768u4
    public final void dismiss() {
        DialogC0246g2 dialogC0246g2 = this.f3378a;
        if (dialogC0246g2 != null) {
            dialogC0246g2.dismiss();
            this.f3378a = null;
        }
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: e */
    public final void mo1975e(int i, int i2) {
        if (this.f3379b == null) {
            return;
        }
        C0805v4 c0805v4 = this.f3381d;
        C0209f2 c0209f2 = new C0209f2(c0805v4.getPopupContext());
        C0053b2 c0053b2 = (C0053b2) c0209f2.f1722b;
        CharSequence charSequence = this.f3380c;
        if (charSequence != null) {
            c0053b2.f658d = charSequence;
        }
        C0583p4 c0583p4 = this.f3379b;
        int selectedItemPosition = c0805v4.getSelectedItemPosition();
        c0053b2.f661g = c0583p4;
        c0053b2.f662h = this;
        c0053b2.f664j = selectedItemPosition;
        c0053b2.f663i = true;
        DialogC0246g2 dialogC0246g2M1071a = c0209f2.m1071a();
        this.f3378a = dialogC0246g2M1071a;
        AlertController$RecycleListView alertController$RecycleListView = dialogC0246g2M1071a.f1862f.f1469e;
        AbstractC0472m4.m1806d(alertController$RecycleListView, i);
        AbstractC0472m4.m1805c(alertController$RecycleListView, i2);
        this.f3378a.show();
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: g */
    public final int mo1976g() {
        return 0;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: h */
    public final Drawable mo1977h() {
        return null;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: i */
    public final CharSequence mo1978i() {
        return this.f3380c;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: k */
    public final void mo1979k(CharSequence charSequence) {
        this.f3380c = charSequence;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: l */
    public final void mo1980l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: m */
    public final void mo1981m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: n */
    public final void mo1982n(ListAdapter listAdapter) {
        this.f3379b = (C0583p4) listAdapter;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: o */
    public final void mo1983o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0805v4 c0805v4 = this.f3381d;
        c0805v4.setSelection(i);
        if (c0805v4.getOnItemClickListener() != null) {
            c0805v4.performItemClick(null, i, this.f3379b.getItemId(i));
        }
        dismiss();
    }
}
