package com.p055lu.magic.util.permission;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p034R0.C0244c;
import p072j0.AbstractC0734a;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionActivity extends Activity {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PERMISSION_LIST");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            finish();
        } else {
            AbstractC0734a.f2489a.get(getIntent().getIntExtra("KEY_REQUEST_ID", 0)).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        AbstractC0223g.m418e(strArr, "permissions");
        AbstractC0223g.m418e(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        C0244c c0244cM256d0 = AbstractC0120h.m256d0(strArr);
        int iM294Y = AbstractC0134v.m294Y(AbstractC0125m.m289c0(c0244cM256d0));
        if (iM294Y < 16) {
            iM294Y = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM294Y);
        Iterator it = c0244cM256d0.iterator();
        while (((C0243b) it).f588c) {
            int iM458a = ((C0243b) it).m458a();
            linkedHashMap.put(strArr[iM458a], Integer.valueOf(iArr[iM458a]));
        }
        AbstractC0223g.m420g("callBack");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }
}
