package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC0799 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0790 f2284;

    public ActionModeCallbackC0799(InterfaceC0790 interfaceC0790) {
        this.f2284 = interfaceC0790;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f2284.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ((C0791) this.f2284).m1625(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C0791) this.f2284).f2265.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C7328 c7328 = (C7328) ((C0791) this.f2284).f2263.invoke();
        rect.set(Math.round(c7328.f19540), Math.round(c7328.f19539), Math.round(c7328.f19538), Math.round(c7328.f19537));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return ((C0791) this.f2284).m1625(menu);
    }
}
