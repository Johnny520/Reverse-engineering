package yyds;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: yyds.ᛶᛳᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1295 implements InterfaceC1710, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public CharSequence f5944;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public DialogC0194 f5945;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1921 f5946;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0223 f5947;

    public DialogInterfaceOnClickListenerC1295(C1921 c1921) {
        this.f5946 = c1921;
    }

    @Override // yyds.InterfaceC1710
    public final void dismiss() {
        DialogC0194 dialogC0194 = this.f5945;
        if (dialogC0194 != null) {
            dialogC0194.dismiss();
            this.f5945 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1921 c1921 = this.f5946;
        c1921.setSelection(i);
        if (c1921.getOnItemClickListener() != null) {
            c1921.performItemClick(null, i, this.f5947.getItemId(i));
        }
        dismiss();
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void mo2569(ListAdapter listAdapter) {
        this.f5947 = (C0223) listAdapter;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void mo2570(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final CharSequence mo2571() {
        return this.f5944;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo2572(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo2573(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo2574() {
        DialogC0194 dialogC0194 = this.f5945;
        if (dialogC0194 != null) {
            return dialogC0194.isShowing();
        }
        return false;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int mo2575() {
        return 0;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void mo2576(int i, int i2) {
        if (this.f5947 == null) {
            return;
        }
        C1921 c1921 = this.f5946;
        C1760 c1760 = new C1760(c1921.getPopupContext());
        C0493 c0493 = (C0493) c1760.f8839;
        CharSequence charSequence = this.f5944;
        if (charSequence != null) {
            c0493.f2425 = charSequence;
        }
        C0223 c0223 = this.f5947;
        int selectedItemPosition = c1921.getSelectedItemPosition();
        c0493.f2421 = c0223;
        c0493.f2416 = this;
        c0493.f2422 = selectedItemPosition;
        c0493.f2417 = true;
        DialogC0194 dialogC0194M3501 = c1760.m3501();
        this.f5945 = dialogC0194M3501;
        AlertController$RecycleListView alertController$RecycleListView = dialogC0194M3501.f1149.f11049;
        AbstractC0162.m730(alertController$RecycleListView, i);
        AbstractC0162.m729(alertController$RecycleListView, i2);
        this.f5945.show();
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int mo2577() {
        return 0;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void mo2578(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Drawable mo2579() {
        return null;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo2580(CharSequence charSequence) {
        this.f5944 = charSequence;
    }
}
