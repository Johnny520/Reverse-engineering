package defpackage;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sb0 {
    public static void a(Window.Callback r0, List<KeyboardShortcutGroup> r1, Menu r2, int r3) {
        r0.onProvideKeyboardShortcuts(r1, r2, r3);
    }
}
