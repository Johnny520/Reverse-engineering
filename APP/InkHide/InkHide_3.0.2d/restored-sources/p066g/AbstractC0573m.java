package p066g;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: g.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1141a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        callback.onProvideKeyboardShortcuts(list, menu, i2);
    }
}
