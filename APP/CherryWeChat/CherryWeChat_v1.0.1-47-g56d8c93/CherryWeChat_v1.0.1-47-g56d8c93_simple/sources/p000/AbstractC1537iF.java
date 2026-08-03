package p000;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: iF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1537iF {
    /* JADX INFO: renamed from: a */
    public static void m2915a(Window.Callback r0, List<KeyboardShortcutGroup> r1, Menu r2, int r3) {
        r0.onProvideKeyboardShortcuts(r1, r2, r3);
    }
}
