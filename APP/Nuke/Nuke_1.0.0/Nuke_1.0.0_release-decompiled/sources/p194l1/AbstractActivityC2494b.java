package p194l1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bumptech.glide.AbstractC1923e;
import p002A1.AbstractC0142o;
import p002A1.AbstractC0150w;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p002A1.FragmentC0153z;
import p002A1.InterfaceC0145r;
import p056K2.InterfaceC0875a;
import p117X2.AbstractC1665j;
import p186k.C2417N;
import p229r1.InterfaceC3077g;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2494b extends Activity implements InterfaceC0145r, InterfaceC3077g {
    private final C2417N extraDataMap = new C2417N(0);
    private final C0147t lifecycleRegistry = new C0147t(this, true);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p194l1.AbstractActivityC2494b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1665j.m2985e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        if (AbstractC1923e.m3483u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @InterfaceC0875a
    public <T extends AbstractC2493a> T getExtraData(Class<T> cls) {
        AbstractC1665j.m2985e(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC0142o getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i5 = FragmentC0153z.f550d;
        AbstractC0150w.m195b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1665j.m2985e(bundle, "outState");
        C0147t c0147t = this.lifecycleRegistry;
        c0147t.m188d("setCurrentState");
        c0147t.m190f(EnumC0141n.f533f);
        super.onSaveInstanceState(bundle);
    }

    @InterfaceC0875a
    public void putExtraData(AbstractC2493a abstractC2493a) {
        AbstractC1665j.m2985e(abstractC2493a, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L56
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L56
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L56
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L56
        L1b:
            r1 = r0
            goto L56
        L1d:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L26
            goto L56
        L26:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L56
            goto L1b
        L2d:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L56
            goto L1b
        L46:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L56
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L56
            goto L1b
        L56:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p194l1.AbstractActivityC2494b.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // p229r1.InterfaceC3077g
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1665j.m2985e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
