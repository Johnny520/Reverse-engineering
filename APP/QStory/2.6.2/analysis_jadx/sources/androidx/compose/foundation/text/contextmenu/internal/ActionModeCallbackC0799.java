package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC0799 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0790 f2283;

    public ActionModeCallbackC0799(InterfaceC0790 interfaceC0790) {
        this.f2283 = interfaceC0790;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f2283.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ((C0791) this.f2283).m1615(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C0791) this.f2283).f2264.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C7327 c7327 = (C7327) ((C0791) this.f2283).f2262.invoke();
        rect.set(Math.round(c7327.f19545), Math.round(c7327.f19544), Math.round(c7327.f19543), Math.round(c7327.f19542));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return ((C0791) this.f2283).m1615(menu);
    }
}
