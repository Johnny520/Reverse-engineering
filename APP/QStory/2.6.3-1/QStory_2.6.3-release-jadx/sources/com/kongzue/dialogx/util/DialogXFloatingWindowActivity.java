package com.kongzue.dialogx.util;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewOnTouchListenerC1026;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.C4573;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXFloatingWindowActivity extends AppCompatActivity {
    static WeakReference<DialogXFloatingWindowActivity> dialogXFloatingWindowActivity;
    WeakReference<Activity> fromActivity;
    int fromActivityHashCode;
    boolean isScreenshot;
    List<String> shownDialogXList = new ArrayList();

    public static DialogXFloatingWindowActivity getDialogXFloatingWindowActivity() {
        WeakReference<DialogXFloatingWindowActivity> weakReference = dialogXFloatingWindowActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void finish(String str) {
        this.shownDialogXList.remove(str);
        if (this.shownDialogXList.isEmpty()) {
            WeakReference<DialogXFloatingWindowActivity> weakReference = dialogXFloatingWindowActivity;
            if (weakReference != null) {
                weakReference.clear();
            }
            dialogXFloatingWindowActivity = null;
            super.finish();
            overridePendingTransition(0, 0);
        }
    }

    public Activity getFromActivity() {
        WeakReference<Activity> weakReference = this.fromActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getFromActivityHashCode() {
        return this.fromActivityHashCode;
    }

    public boolean isSameFrom(int i) {
        return i == this.fromActivityHashCode;
    }

    public boolean isScreenshot() {
        return this.isScreenshot;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        dialogXFloatingWindowActivity = new WeakReference<>(this);
        super.onCreate(bundle);
        setContentView(C0328R.layout.layout_dialogx_empty);
        int intExtra = getIntent().getIntExtra("fromActivityUiStatus", 0);
        if (intExtra == 0) {
            getWindow().getDecorView().setSystemUiVisibility(512);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(intExtra | 512);
        }
        setFromActivityHashCode(getIntent().getIntExtra("from", 0));
        String stringExtra = getIntent().getStringExtra("dialogXKey");
        C4573 c4573 = stringExtra == null ? null : (C4573) AbstractC4570.f11923.get(stringExtra);
        if (c4573 == null) {
            finish();
        } else {
            this.shownDialogXList.add(stringExtra);
            c4573.m8620(this);
        }
        getWindow().getDecorView().setOnTouchListener(new ViewOnTouchListenerC1026(this, 2));
    }

    public DialogXFloatingWindowActivity setFromActivity(Activity activity) {
        this.fromActivity = new WeakReference<>(activity);
        return this;
    }

    public DialogXFloatingWindowActivity setFromActivityHashCode(int i) {
        this.fromActivityHashCode = i;
        return this;
    }

    public DialogXFloatingWindowActivity setScreenshot(boolean z) {
        this.isScreenshot = z;
        return this;
    }

    public void showDialogX(String str) {
        C4573 c4573 = str == null ? null : (C4573) AbstractC4570.f11923.get(str);
        if (c4573 != null) {
            this.shownDialogXList.add(str);
            c4573.m8620(this);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        WeakReference<DialogXFloatingWindowActivity> weakReference = dialogXFloatingWindowActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        dialogXFloatingWindowActivity = null;
        super.finish();
        overridePendingTransition(0, 0);
    }
}
