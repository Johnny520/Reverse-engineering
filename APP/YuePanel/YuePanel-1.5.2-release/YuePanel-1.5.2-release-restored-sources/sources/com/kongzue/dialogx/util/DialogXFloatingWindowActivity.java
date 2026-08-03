package com.kongzue.dialogx.util;

import Yue.InterfaceC6490;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.interfaces.BaseDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        dialogXFloatingWindowActivity = new WeakReference<>(this);
        super.onCreate(bundle);
        setContentView(C2413R.layout.layout_dialogx_empty);
        int intExtra = getIntent().getIntExtra("fromActivityUiStatus", 0);
        if (intExtra == 0) {
            getWindow().getDecorView().setSystemUiVisibility(512);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(intExtra | 512);
        }
        setFromActivityHashCode(getIntent().getIntExtra("from", 0));
        String stringExtra = getIntent().getStringExtra("dialogXKey");
        ActivityRunnable activityRunnable = BaseDialog.getActivityRunnable(stringExtra);
        if (activityRunnable == null) {
            finish();
        } else {
            this.shownDialogXList.add(stringExtra);
            activityRunnable.run(this);
        }
        getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.util.DialogXFloatingWindowActivity.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 3 || DialogXFloatingWindowActivity.this.getFromActivity() == null || DialogXFloatingWindowActivity.this.getFromActivity() == null || (DialogXFloatingWindowActivity.this.getFromActivity() instanceof DialogXFloatingWindowActivity)) {
                    return false;
                }
                return DialogXFloatingWindowActivity.this.getFromActivity().dispatchTouchEvent(motionEvent);
            }
        });
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
        ActivityRunnable activityRunnable = BaseDialog.getActivityRunnable(str);
        if (activityRunnable != null) {
            this.shownDialogXList.add(str);
            activityRunnable.run(this);
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
