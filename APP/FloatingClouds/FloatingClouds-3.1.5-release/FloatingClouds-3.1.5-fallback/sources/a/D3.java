package a;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\"\u0010\u000bR.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"La/D3;", "Landroid/app/Activity;", "La/y9;", "La/t9;", "<init>", "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "La/D3$a;", "extraData", "La/Wf;", "putExtraData", "(La/D3$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)La/D3$a;", "Landroid/view/KeyEvent;", "event", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "La/ge;", "extraDataMap", "La/ge;", "getExtraDataMap$annotations", "Landroidx/lifecycle/h;", "lifecycleRegistry", "Landroidx/lifecycle/h;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/e;", "getLifecycle", "()Landroidx/lifecycle/e;", "lifecycle", "a", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class D3 extends android.app.Activity implements a.InterfaceC0479y9, a.InterfaceC0389t9 {
    private final a.C0162ge<java.lang.Class<? extends a.D3.a>, a.D3.a> extraDataMap;
    private final androidx.lifecycle.h lifecycleRegistry;

    public static class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public D3() {
            r1 = this;
            r1.<init>()
            a.ge r0 = new a.ge
            r0.<init>()
            r1.extraDataMap = r0
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r1)
            r1.lifecycleRegistry = r0
            return
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
            return
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
            return
    }

    private final boolean shouldSkipDump(java.lang.String[] r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L57
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L57
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L47;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1c;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L57
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L57
        L1b:
            return r2
        L1c:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L25
            goto L57
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L2c
            return r2
        L2c:
            return r0
        L2d:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L36:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L46
            return r2
        L46:
            return r0
        L47:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L50
            goto L57
        L50:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L57
            return r2
        L57:
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            a.C0193i9.e(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            a.C0193i9.d(r0, r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r3 = r2.superDispatchKeyEvent(r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            a.C0193i9.e(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            a.C0193i9.d(r0, r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r3 = super.dispatchKeyShortcutEvent(r3)
            return r3
    }

    public <T extends a.D3.a> T getExtraData(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "extraDataClass"
            a.C0193i9.e(r3, r0)
            a.ge<java.lang.Class<? extends a.D3$a>, a.D3$a> r0 = r2.extraDataMap
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            a.D3$a r3 = (a.D3.a) r3
            return r3
    }

    @Override // a.InterfaceC0479y9
    public androidx.lifecycle.e getLifecycle() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.lifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = androidx.lifecycle.l.b
            androidx.lifecycle.l.a.b(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            a.C0193i9.e(r3, r0)
            androidx.lifecycle.h r0 = r2.lifecycleRegistry
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.c
            r0.h(r1)
            super.onSaveInstanceState(r3)
            return
    }

    public void putExtraData(a.D3.a r3) {
            r2 = this;
            java.lang.String r0 = "extraData"
            a.C0193i9.e(r3, r0)
            a.ge<java.lang.Class<? extends a.D3$a>, a.D3$a> r0 = r2.extraDataMap
            java.lang.Class<a.D3$a> r1 = a.D3.a.class
            r0.put(r1, r3)
            return
    }

    public final boolean shouldDumpInternalState(java.lang.String[] r1) {
            r0 = this;
            boolean r1 = r0.shouldSkipDump(r1)
            r1 = r1 ^ 1
            return r1
    }

    @Override // a.InterfaceC0389t9
    public boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            java.lang.String r0 = "event"
            a.C0193i9.e(r2, r0)
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }
}
