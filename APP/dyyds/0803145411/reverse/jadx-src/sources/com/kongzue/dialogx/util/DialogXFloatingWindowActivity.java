package com.kongzue.dialogx.util;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXFloatingWindowActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static WeakReference f414;

    @Override // android.app.Activity
    public final void finish() {
        WeakReference weakReference = f414;
        if (weakReference != null) {
            weakReference.clear();
        }
        f414 = null;
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f414 = new WeakReference(this);
        throw null;
    }
}
