package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXFloatingWindowActivity extends androidx.appcompat.app.AppCompatActivity {
    static java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> dialogXFloatingWindowActivity;
    java.lang.ref.WeakReference<android.app.Activity> fromActivity;
    int fromActivityHashCode;
    boolean isScreenshot;
    java.util.List<java.lang.String> shownDialogXList;


    public DialogXFloatingWindowActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.shownDialogXList = r0
            return
    }

    public static com.kongzue.dialogx.util.DialogXFloatingWindowActivity getDialogXFloatingWindowActivity() {
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r0 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r0 = (com.kongzue.dialogx.util.DialogXFloatingWindowActivity) r0
            return r0
    }

    @Override // android.app.Activity
    public void finish() {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r0 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity = r0
            super.finish()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
    }

    public void finish(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.shownDialogXList
            r0.remove(r2)
            java.util.List<java.lang.String> r2 = r1.shownDialogXList
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1e
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r2 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity
            if (r2 == 0) goto L14
            r2.clear()
        L14:
            r2 = 0
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity = r2
            super.finish()
            r2 = 0
            r1.overridePendingTransition(r2, r2)
        L1e:
            return
    }

    public android.app.Activity getFromActivity() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.fromActivity
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
        Lc:
            return r0
    }

    public int getFromActivityHashCode() {
            r1 = this;
            int r0 = r1.fromActivityHashCode
            return r0
    }

    public boolean isSameFrom(int r2) {
            r1 = this;
            int r0 = r1.fromActivityHashCode
            if (r2 != r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    public boolean isScreenshot() {
            r1 = this;
            boolean r0 = r1.isScreenshot
            return r0
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Yue.InterfaceC4544 android.os.Bundle r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity.dialogXFloatingWindowActivity = r0
            super.onCreate(r4)
            int r4 = com.kongzue.dialogx.R.layout.layout_dialogx_empty
            r3.setContentView(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "fromActivityUiStatus"
            r1 = 0
            int r4 = r4.getIntExtra(r0, r1)
            r0 = 512(0x200, float:7.17E-43)
            if (r4 != 0) goto L2a
            android.view.Window r4 = r3.getWindow()
            android.view.View r4 = r4.getDecorView()
            r4.setSystemUiVisibility(r0)
            goto L36
        L2a:
            android.view.Window r2 = r3.getWindow()
            android.view.View r2 = r2.getDecorView()
            r4 = r4 | r0
            r2.setSystemUiVisibility(r4)
        L36:
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "from"
            int r4 = r4.getIntExtra(r0, r1)
            r3.setFromActivityHashCode(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "dialogXKey"
            java.lang.String r4 = r4.getStringExtra(r0)
            com.kongzue.dialogx.util.ActivityRunnable r0 = com.kongzue.dialogx.interfaces.BaseDialog.getActivityRunnable(r4)
            if (r0 != 0) goto L57
            r3.finish()
            goto L5f
        L57:
            java.util.List<java.lang.String> r1 = r3.shownDialogXList
            r1.add(r4)
            r0.run(r3)
        L5f:
            android.view.Window r4 = r3.getWindow()
            android.view.View r4 = r4.getDecorView()
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity$1 r0 = new com.kongzue.dialogx.util.DialogXFloatingWindowActivity$1
            r0.<init>(r3)
            r4.setOnTouchListener(r0)
            return
    }

    public com.kongzue.dialogx.util.DialogXFloatingWindowActivity setFromActivity(android.app.Activity r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.fromActivity = r0
            return r1
    }

    public com.kongzue.dialogx.util.DialogXFloatingWindowActivity setFromActivityHashCode(int r1) {
            r0 = this;
            r0.fromActivityHashCode = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXFloatingWindowActivity setScreenshot(boolean r1) {
            r0 = this;
            r0.isScreenshot = r1
            return r0
    }

    public void showDialogX(java.lang.String r3) {
            r2 = this;
            com.kongzue.dialogx.util.ActivityRunnable r0 = com.kongzue.dialogx.interfaces.BaseDialog.getActivityRunnable(r3)
            if (r0 == 0) goto Le
            java.util.List<java.lang.String> r1 = r2.shownDialogXList
            r1.add(r3)
            r0.run(r2)
        Le:
            return
    }
}
