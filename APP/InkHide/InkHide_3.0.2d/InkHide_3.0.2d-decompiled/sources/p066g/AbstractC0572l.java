package p066g;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: g.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0572l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m1139a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ActionMode m1140b(Window.Callback callback, ActionMode.Callback callback2, int i2) {
        return callback.onWindowStartingActionMode(callback2, i2);
    }
}
