package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.C0931;
import androidx.appcompat.app.C0954;
import androidx.appcompat.app.DialogInterfaceC0951;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0963 implements InterfaceC1075, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1074 f883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0966 f884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CharSequence f885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DialogInterfaceC0951 f886;

    public DialogInterfaceOnClickListenerC0963(C1074 c1074) {
        this.f883 = c1074;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    public final void dismiss() {
        DialogInterfaceC0951 dialogInterfaceC0951 = this.f886;
        if (dialogInterfaceC0951 != null) {
            dialogInterfaceC0951.dismiss();
            this.f886 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1074 c1074 = this.f883;
        c1074.setSelection(i);
        if (c1074.getOnItemClickListener() != null) {
            c1074.performItemClick(null, i, this.f884.getItemId(i));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo1072(CharSequence charSequence) {
        this.f885 = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Drawable mo1078() {
        return null;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final CharSequence mo1073() {
        return this.f885;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1079(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1080() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1081() {
        DialogInterfaceC0951 dialogInterfaceC0951 = this.f886;
        if (dialogInterfaceC0951 != null) {
            return dialogInterfaceC0951.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo1074(ListAdapter listAdapter) {
        this.f884 = (C0966) listAdapter;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1082(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo1083(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo1076(int i, int i2) {
        if (this.f884 == null) {
            return;
        }
        C1074 c1074 = this.f883;
        C0954 c0954 = new C0954(c1074.getPopupContext());
        C0931 c0931 = (C0931) c0954.f660;
        CharSequence charSequence = this.f885;
        if (charSequence != null) {
            c0931.f592 = charSequence;
        }
        C0966 c0966 = this.f884;
        int selectedItemPosition = c1074.getSelectedItemPosition();
        c0931.f597 = c0966;
        c0931.f596 = this;
        c0931.f599 = selectedItemPosition;
        c0931.f598 = true;
        DialogInterfaceC0951 dialogInterfaceC0951M898 = c0954.m898();
        this.f886 = dialogInterfaceC0951M898;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0951M898.f633.f637;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f886.show();
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo1084() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo1077(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
