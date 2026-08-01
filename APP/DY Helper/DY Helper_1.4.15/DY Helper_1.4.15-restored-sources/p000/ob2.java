package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob2 {
    /* JADX INFO: renamed from: α */
    public static boolean m4215(android.view.Window.Callback r0, android.view.SearchEvent r1) {
            boolean r0 = r0.onSearchRequested(r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static android.view.ActionMode m4216(android.view.Window.Callback r0, android.view.ActionMode.Callback r1, int r2) {
            android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
            return r0
    }
}
