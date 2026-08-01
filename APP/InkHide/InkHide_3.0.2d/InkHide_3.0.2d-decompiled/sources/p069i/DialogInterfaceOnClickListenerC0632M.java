package p069i;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p061e.C0527c;
import p061e.C0531g;
import p061e.DialogInterfaceC0532h;

/* JADX INFO: renamed from: i.M */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0632M implements InterfaceC0645T, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0532h f2168b;

    /* JADX INFO: renamed from: c */
    public C0634N f2169c;

    /* JADX INFO: renamed from: d */
    public CharSequence f2170d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0647U f2171e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnClickListenerC0632M(C0647U c0647u) {
        this.f2171e = c0647u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: a */
    public final boolean mo1240a() {
        DialogInterfaceC0532h dialogInterfaceC0532h = this.f2168b;
        if (dialogInterfaceC0532h != null) {
            return dialogInterfaceC0532h.isShowing();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: b */
    public final CharSequence mo1241b() {
        return this.f2170d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: c */
    public final void mo1242c(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: d */
    public final int mo1243d() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    public final void dismiss() {
        DialogInterfaceC0532h dialogInterfaceC0532h = this.f2168b;
        if (dialogInterfaceC0532h != null) {
            dialogInterfaceC0532h.dismiss();
            this.f2168b = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: e */
    public final void mo1244e(int i2, int i3) {
        if (this.f2169c == null) {
            return;
        }
        C0647U c0647u = this.f2171e;
        C0531g c0531g = new C0531g(c0647u.getPopupContext());
        CharSequence charSequence = this.f2170d;
        C0527c c0527c = (C0527c) c0531g.f1747b;
        if (charSequence != null) {
            c0527c.f1715d = charSequence;
        }
        C0634N c0634n = this.f2169c;
        int selectedItemPosition = c0647u.getSelectedItemPosition();
        c0527c.f1718g = c0634n;
        c0527c.f1719h = this;
        c0527c.f1721j = selectedItemPosition;
        c0527c.f1720i = true;
        DialogInterfaceC0532h dialogInterfaceC0532hM1069a = c0531g.m1069a();
        this.f2168b = dialogInterfaceC0532hM1069a;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0532hM1069a.f1748f.f1727e;
        AbstractC0628K.m1238d(alertController$RecycleListView, i2);
        AbstractC0628K.m1237c(alertController$RecycleListView, i3);
        this.f2168b.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: g */
    public final void mo1245g(CharSequence charSequence) {
        this.f2170d = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: i */
    public final int mo1246i() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: j */
    public final void mo1247j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: k */
    public final void mo1248k(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: l */
    public final Drawable mo1249l() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: m */
    public final void mo1225m(ListAdapter listAdapter) {
        this.f2169c = (C0634N) listAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: n */
    public final void mo1250n(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0647U c0647u = this.f2171e;
        c0647u.setSelection(i2);
        if (c0647u.getOnItemClickListener() != null) {
            c0647u.performItemClick(null, i2, this.f2169c.getItemId(i2));
        }
        dismiss();
    }
}
