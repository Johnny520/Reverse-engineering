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
    public final C2520sy f2489a;

    /* JADX INFO: renamed from: b */
    public final C1185ao f2490b;

    public AbstractActivityC0790Sa() {
        this.f2489a = new C2520sy(0);
        this.f2490b = new C1185ao(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r2) {
        getWindow().getDecorView();
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        return superDispatchKeyEvent(r2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        getWindow().getDecorView();
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        return super.dispatchKeyShortcutEvent(r2);
    }

    public <T extends AbstractC0490La> T getExtraData(Class<T> r2) {
        if (this.f2489a.get(r2) != null) goto L7;
        return null;
    L7:
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        int r12 = FragmentC0983Wv.f3092b;
        AbstractC0897Uv.m1751b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle r3) {
        C1185ao r1 = this.f2490b;
        r1.m2275d("setCurrentState");
        r1.m2277f(EnumC0675Pn.f2149c);
        super.onSaveInstanceState(r3);
    }

    public void putExtraData(AbstractC0490La r1) {
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] r4) {
        boolean r1 = false;
        if (r4 == null) goto L36;
        if (r4.length == 0) goto L36;
        String r42 = r4[0];
        switch(r42.hashCode()) {
            case -645125871: goto L30;
            case 100470631: goto L24;
            case 472614934: goto L21;
            case 1159329357: goto L15;
            case 1455016274: goto L11;
            default: goto L36;
        };
    L11:
        if (r42.equals("--autofill") == false) goto L36;
    L13:
        r1 = true;
        goto L36
    L15:
        if (r42.equals("--contentcapture") == false) goto L36;
        if (Build.VERSION.SDK_INT < 29) goto L36;
    L21:
        if (r42.equals("--list-dumpables") == false) goto L36;
    L27:
        if (Build.VERSION.SDK_INT < 33) goto L36;
    L24:
        if (r42.equals("--dump-dumpable") == true) goto L27;
    L30:
        if (r42.equals("--translation") == false) goto L36;
        if (Build.VERSION.SDK_INT >= 31) goto L13;
    L36:
        return !r1;
    }

    @Override // p000.InterfaceC0974Wm
    public boolean superDispatchKeyEvent(KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }
}
