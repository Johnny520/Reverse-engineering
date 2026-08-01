package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0546o4 implements InterfaceC0769u4, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogC0246g2 f3483a;

    /* JADX INFO: renamed from: b */
    public C0584p4 f3484b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3485c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0806v4 f3486d;

    public DialogInterfaceOnClickListenerC0546o4(C0806v4 c0806v4) {
        this.f3486d = c0806v4;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: b */
    public final boolean mo1989b() {
        DialogC0246g2 dialogC0246g2 = this.f3483a;
        if (dialogC0246g2 != null) {
            return dialogC0246g2.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: c */
    public final void mo1990c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: d */
    public final int mo1991d() {
        return 0;
    }

    @Override // p000.InterfaceC0769u4
    public final void dismiss() {
        DialogC0246g2 dialogC0246g2 = this.f3483a;
        if (dialogC0246g2 != null) {
            dialogC0246g2.dismiss();
            this.f3483a = null;
        }
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: e */
    public final void mo1992e(int i, int i2) {
        if (this.f3484b == null) {
            return;
        }
        C0806v4 c0806v4 = this.f3486d;
        C0209f2 c0209f2 = new C0209f2(c0806v4.getPopupContext());
        C0053b2 c0053b2 = (C0053b2) c0209f2.f1872b;
        CharSequence charSequence = this.f3485c;
        if (charSequence != null) {
            c0053b2.f718d = charSequence;
        }
        C0584p4 c0584p4 = this.f3484b;
        int selectedItemPosition = c0806v4.getSelectedItemPosition();
        c0053b2.f721g = c0584p4;
        c0053b2.f722h = this;
        c0053b2.f724j = selectedItemPosition;
        c0053b2.f723i = true;
        DialogC0246g2 dialogC0246g2M1133a = c0209f2.m1133a();
        this.f3483a = dialogC0246g2M1133a;
        AlertController$RecycleListView alertController$RecycleListView = dialogC0246g2M1133a.f2009f.f1665e;
        AbstractC0472m4.m1783d(alertController$RecycleListView, i);
        AbstractC0472m4.m1782c(alertController$RecycleListView, i2);
        this.f3483a.show();
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: g */
    public final int mo1993g() {
        return 0;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: h */
    public final Drawable mo1994h() {
        return null;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: i */
    public final CharSequence mo1995i() {
        return this.f3485c;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: k */
    public final void mo1996k(CharSequence charSequence) {
        this.f3485c = charSequence;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: l */
    public final void mo1997l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: m */
    public final void mo1998m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: n */
    public final void mo1714n(ListAdapter listAdapter) {
        this.f3484b = (C0584p4) listAdapter;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: o */
    public final void mo1999o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0806v4 c0806v4 = this.f3486d;
        c0806v4.setSelection(i);
        if (c0806v4.getOnItemClickListener() != null) {
            c0806v4.performItemClick(null, i, this.f3484b.getItemId(i));
        }
        dismiss();
    }
}
