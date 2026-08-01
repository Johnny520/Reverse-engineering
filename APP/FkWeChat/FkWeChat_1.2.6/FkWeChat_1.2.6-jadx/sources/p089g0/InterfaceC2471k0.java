package p089g0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p250r1.C6457g;

/* JADX INFO: renamed from: g0.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2471k0 {
    /* JADX INFO: renamed from: a */
    C6457g mo8927a(ActionMode actionMode, View view);

    boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

    boolean onCreateActionMode(ActionMode actionMode, Menu menu);

    void onDestroyActionMode(ActionMode actionMode);

    boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
}
