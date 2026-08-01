package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rb0 {
    public static boolean a(android.view.Window.Callback r0, android.view.SearchEvent r1) {
            boolean r0 = r0.onSearchRequested(r1)
            return r0
    }

    public static android.view.ActionMode b(android.view.Window.Callback r0, android.view.ActionMode.Callback r1, int r2) {
            android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
            return r0
    }
}
