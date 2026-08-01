package p089g0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p250r1.C6457g;

/* JADX INFO: renamed from: g0.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC2457d0 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2471k0 f6645a;

    public ActionModeCallbackC2457d0(InterfaceC2471k0 interfaceC2471k0) {
        this.f6645a = interfaceC2471k0;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f6645a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f6645a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f6645a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C6457g c6457gMo8927a = this.f6645a.mo8927a(actionMode, view);
        rect.set(Math.round(c6457gMo8927a.m25583l()), Math.round(c6457gMo8927a.m25586o()), Math.round(c6457gMo8927a.m25584m()), Math.round(c6457gMo8927a.m25580i()));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f6645a.onPrepareActionMode(actionMode, menu);
    }
}
