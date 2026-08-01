package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> mExtraDataMap;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;

    @java.lang.Deprecated
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mExtraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            return
    }

    private static boolean shouldSkipDump(java.lang.String[] r4) {
            r0 = 0
            if (r4 == 0) goto L61
            int r1 = r4.length
            if (r1 <= 0) goto L61
            r1 = r4[r0]
            int r2 = r1.hashCode()
            r3 = 1
            switch(r2) {
                case -645125871: goto L39;
                case 100470631: goto L2f;
                case 472614934: goto L25;
                case 1159329357: goto L1b;
                case 1455016274: goto L11;
                default: goto L10;
            }
        L10:
            goto L43
        L11:
            java.lang.String r2 = "--autofill"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            r1 = r0
            goto L44
        L1b:
            java.lang.String r2 = "--contentcapture"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            r1 = r3
            goto L44
        L25:
            java.lang.String r2 = "--list-dumpables"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            r1 = 3
            goto L44
        L2f:
            java.lang.String r2 = "--dump-dumpable"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            r1 = 4
            goto L44
        L39:
            java.lang.String r2 = "--translation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            r1 = 2
            goto L44
        L43:
            r1 = -1
        L44:
            switch(r1) {
                case 0: goto L60;
                case 1: goto L58;
                case 2: goto L50;
                case 3: goto L48;
                case 4: goto L48;
                default: goto L47;
            }
        L47:
            goto L61
        L48:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            r0 = r3
        L4f:
            return r0
        L50:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L57
            r0 = r3
        L57:
            return r0
        L58:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L5f
            r0 = r3
        L5f:
            return r0
        L60:
            return r3
        L61:
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r2, r0, r2, r3)
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            boolean r1 = super.dispatchKeyShortcutEvent(r3)
            return r1
    }

    @java.lang.Deprecated
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.mExtraDataMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r0 = (androidx.core.app.ComponentActivity.ExtraData) r0
            return r0
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.markState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @java.lang.Deprecated
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.mExtraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    protected final boolean shouldDumpInternalState(java.lang.String[] r2) {
            r1 = this;
            boolean r0 = shouldSkipDump(r2)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            return r0
    }
}
