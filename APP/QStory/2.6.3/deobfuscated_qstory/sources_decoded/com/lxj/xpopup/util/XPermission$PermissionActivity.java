package com.lxj.xpopup.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class XPermission$PermissionActivity extends Activity {
    private static final String TYPE = "TYPE";
    public static final int TYPE_DRAW_OVERLAYS = 3;
    public static final int TYPE_RUNTIME = 1;
    public static final int TYPE_WRITE_SETTINGS = 2;

    public static void start(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) XPermission$PermissionActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(TYPE, i);
        context.startActivity(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 || i == 3) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().addFlags(262672);
        getWindow().getAttributes().alpha = 0.0f;
        int intExtra = getIntent().getIntExtra(TYPE, 1);
        if (intExtra == 1) {
            super.onCreate(bundle);
            Log.e("XPermission", "request permissions failed");
            finish();
        } else {
            if (intExtra == 2) {
                super.onCreate(bundle);
                throw null;
            }
            if (intExtra != 3) {
                return;
            }
            super.onCreate(bundle);
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        throw null;
    }
}
