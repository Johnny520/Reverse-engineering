package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.C0038;
import java.util.WeakHashMap;
import yyds.AbstractC1640;
import yyds.AbstractC2237;
import yyds.FragmentC1919;
import yyds.InterfaceC2345;
import yyds.InterfaceC2523;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC2345, InterfaceC2523 {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC1919.f9671;
        AbstractC2237.m4237(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        throw null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public C0038 mo14() {
        return null;
    }
}
