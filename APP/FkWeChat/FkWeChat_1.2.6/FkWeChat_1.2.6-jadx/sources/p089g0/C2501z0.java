package p089g0;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: g0.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2501z0 {

    /* JADX INFO: renamed from: a */
    public static final C2501z0 f6758a = new C2501z0();

    /* JADX INFO: renamed from: a */
    public final void m8973a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    /* JADX INFO: renamed from: b */
    public final ActionMode m8974b(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
