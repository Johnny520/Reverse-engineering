package com.kongzue.dialogx.util;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXFloatingWindowActivity extends androidx.appcompat.app.AppCompatActivity {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference f385;

    @Override // android.app.Activity
    public final void finish() {
            r1 = this;
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.f385
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity.f385 = r0
            super.finish()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r1) {
            r0 = this;
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity.f385 = r1
            r0 = 0
            throw r0
    }
}
