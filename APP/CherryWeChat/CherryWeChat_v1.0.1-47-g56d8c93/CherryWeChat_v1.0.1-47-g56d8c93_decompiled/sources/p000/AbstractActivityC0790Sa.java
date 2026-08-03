package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Sa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0790Sa extends Activity implements InterfaceC1061Yn, InterfaceC0974Wm {

    /* JADX INFO: renamed from: a */
    public final C2520sy f2489a = new C2520sy(0);

    /* JADX INFO: renamed from: b */
    public final C1185ao f2490b = new C1185ao(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends AbstractC0490La> T getExtraData(Class<T> cls) {
        if (this.f2489a.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0983Wv.f3092b;
        AbstractC0897Uv.m1751b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C1185ao c1185ao = this.f2490b;
        c1185ao.m2275d("setCurrentState");
        c1185ao.m2277f(EnumC0675Pn.f2149c);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(AbstractC0490La abstractC0490La) {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                    }
                    break;
            }
        }
        return !z;
    }

    @Override // p000.InterfaceC0974Wm
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
