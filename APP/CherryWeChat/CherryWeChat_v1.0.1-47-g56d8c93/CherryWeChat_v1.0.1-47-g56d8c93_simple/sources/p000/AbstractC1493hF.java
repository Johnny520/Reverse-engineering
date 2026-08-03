package p000;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: hF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1493hF {
    /* JADX INFO: renamed from: a */
    public static boolean m2856a(Window.Callback r0, SearchEvent r1) {
        return r0.onSearchRequested(r1);
    }

    /* JADX INFO: renamed from: b */
    public static ActionMode m2857b(Window.Callback r0, ActionMode.Callback r1, int r2) {
        return r0.onWindowStartingActionMode(r1, r2);
    }
}
