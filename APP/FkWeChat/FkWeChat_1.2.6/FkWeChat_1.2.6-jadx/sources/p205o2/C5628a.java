package p205o2;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p250r1.C6457g;

/* JADX INFO: renamed from: o2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5628a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a */
    public final C5630c f17622a;

    public C5628a(C5630c c5630c) {
        this.f17622a = c5630c;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f17622a.m22799d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f17622a.m22800e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f17622a.m22801f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C6457g c6457gM22798c = this.f17622a.m22798c();
        if (rect != null) {
            rect.set((int) c6457gM22798c.m25583l(), (int) c6457gM22798c.m25586o(), (int) c6457gM22798c.m25584m(), (int) c6457gM22798c.m25580i());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f17622a.m22802g(actionMode, menu);
    }
}
