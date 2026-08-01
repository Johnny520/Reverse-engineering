package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class rb0 {
    public static boolean a(Window.Callback r0, SearchEvent r1) {
        return r0.onSearchRequested(r1);
    }

    public static ActionMode b(Window.Callback r0, ActionMode.Callback r1, int r2) {
        return r0.onWindowStartingActionMode(r1, r2);
    }
}
