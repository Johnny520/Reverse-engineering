package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.C0084;
import androidx.appcompat.app.C0107;
import androidx.appcompat.app.DialogInterfaceC0104;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0116 implements InterfaceC0228, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0227 f538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0119 f539;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CharSequence f540;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DialogInterfaceC0104 f541;

    public DialogInterfaceOnClickListenerC0116(C0227 c0227) {
        this.f538 = c0227;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    public final void dismiss() {
        DialogInterfaceC0104 dialogInterfaceC0104 = this.f541;
        if (dialogInterfaceC0104 != null) {
            dialogInterfaceC0104.dismiss();
            this.f541 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0227 c0227 = this.f538;
        c0227.setSelection(i);
        if (c0227.getOnItemClickListener() != null) {
            c0227.performItemClick(null, i, this.f539.getItemId(i));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo512(CharSequence charSequence) {
        this.f540 = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Drawable mo518() {
        return null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final CharSequence mo513() {
        return this.f540;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo519(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo520() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo521() {
        DialogInterfaceC0104 dialogInterfaceC0104 = this.f541;
        if (dialogInterfaceC0104 != null) {
            return dialogInterfaceC0104.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo514(ListAdapter listAdapter) {
        this.f539 = (C0119) listAdapter;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo522(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo523(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo516(int i, int i2) {
        if (this.f539 == null) {
            return;
        }
        C0227 c0227 = this.f538;
        C0107 c0107 = new C0107(c0227.getPopupContext());
        C0084 c0084 = (C0084) c0107.f315;
        CharSequence charSequence = this.f540;
        if (charSequence != null) {
            c0084.f247 = charSequence;
        }
        C0119 c0119 = this.f539;
        int selectedItemPosition = c0227.getSelectedItemPosition();
        c0084.f252 = c0119;
        c0084.f251 = this;
        c0084.f254 = selectedItemPosition;
        c0084.f253 = true;
        DialogInterfaceC0104 dialogInterfaceC0104M338 = c0107.m338();
        this.f541 = dialogInterfaceC0104M338;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0104M338.f288.f292;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f541.show();
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo524() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo517(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
