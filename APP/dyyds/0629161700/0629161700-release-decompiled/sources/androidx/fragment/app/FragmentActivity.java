package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity {
    @Override // android.app.Activity
    public final void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            super.dump(r1, r2, r3, r4)
            if (r4 == 0) goto L4c
            int r2 = r4.length
            if (r2 == 0) goto L4c
            r2 = 0
            r2 = r4[r2]
            int r4 = r2.hashCode()
            switch(r4) {
                case -645125871: goto L3d;
                case 100470631: goto L2e;
                case 472614934: goto L25;
                case 1159329357: goto L1c;
                case 1455016274: goto L13;
                default: goto L12;
            }
        L12:
            goto L4c
        L13:
            java.lang.String r4 = "--autofill"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4c
            goto L4b
        L1c:
            java.lang.String r4 = "--contentcapture"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4c
            goto L4b
        L25:
            java.lang.String r4 = "--list-dumpables"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4c
            goto L36
        L2e:
            java.lang.String r4 = "--dump-dumpable"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4c
        L36:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r2 < r4) goto L4c
            goto L4b
        L3d:
            java.lang.String r4 = "--translation"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4c
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 < r4) goto L4c
        L4b:
            return
        L4c:
            r3.print(r1)
            java.lang.String r2 = "Local FragmentActivity "
            r3.print(r2)
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r3.print(r0)
            java.lang.String r0 = " State:"
            r3.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.print(r0)
            java.lang.String r0 = "mCreated="
            r3.print(r0)
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r1, android.content.Context r2, android.util.AttributeSet r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r0 = super.onMenuItemSelected(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 6
            if (r1 == r0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onPause() {
            r0 = this;
            super.onPause()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r0 = this;
            super.onPostResume()
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onResume() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onStart() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public void onStop() {
            r0 = this;
            super.onStop()
            r0 = 0
            throw r0
    }
}
