package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC1639 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1630 f2629;

    public ActionModeCallbackC1639(InterfaceC1630 interfaceC1630) {
        this.f2629 = interfaceC1630;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f2629.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ((C1631) this.f2629).m2185(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C1631) this.f2629).f2610.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C8157 c8157 = (C8157) ((C1631) this.f2629).f2608.invoke();
        rect.set(Math.round(c8157.f19885), Math.round(c8157.f19884), Math.round(c8157.f19883), Math.round(c8157.f19882));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return ((C1631) this.f2629).m2185(menu);
    }
}
