package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: Qa */
/* JADX INFO: loaded from: classes.dex */
public final class C0705Qa extends AbstractC1242c1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC2148ki f2272h;

    public C0705Qa(AbstractActivityC2148ki r1) {
        this.f2272h = r1;
    }

    @Override // p000.AbstractC1242c1
    /* JADX INFO: renamed from: b */
    public final void mo1452b(int r9, AbstractC0817T0 r10, Object r11) {
        AbstractActivityC2148ki r0 = this.f2272h;
        C0774S0 r1 = r10.mo1621b(r0, r11);
        if (r1 == null) goto L6;
        new Handler(Looper.getMainLooper()).post(new RunnableC0662Pa(this, r1, r9, 0));
        return;
    L6:
        Intent r102 = r10.mo1620a(r11);
        if (r102.getExtras() == null) goto L12;
        if (r102.getExtras().getClassLoader() != null) goto L12;
        r102.setExtrasClassLoader(r0.getClassLoader());
    L12:
        if (r102.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE") == false) goto L15;
        Bundle r12 = r102.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        r102.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    L14:
        Bundle r7 = r12;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(r102.getAction()) == false) goto L52;
        String[] r103 = r102.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int r112 = 0;
        if (r103 != null) goto L21;
        r103 = new String[0];
    L21:
        HashSet r13 = new HashSet();
        int r2 = 0;
    L23:
        if (r2 >= r103.length) goto L34;
        if (TextUtils.isEmpty(r103[r2]) == true) goto L33;
        if (Build.VERSION.SDK_INT >= 33) goto L31;
        if (TextUtils.equals(r103[r2], "android.permission.POST_NOTIFICATIONS") == false) goto L31;
        r13.add(Integer.valueOf(r2));
    L31:
        r2 = r2 + 1;
        goto L23
    L33:
        throw new IllegalArgumentException(AbstractC0213Ey.m410h(new StringBuilder("Permission request for permissions "), Arrays.toString(r103), " must not contain null or empty values"));
    L34:
        int r22 = r13.size();
        if (r22 <= 0) goto L37;
        String[] r3 = new String[r103.length - r22];
    L38:
        if (r22 > 0) goto L40;
    L49:
        r0.validateRequestPermissionsRequestCode(r9);
        r0.requestPermissions(r103, r9);
        return;
    L40:
        if (r22 != r103.length) goto L42;
        return;
    L42:
        int r23 = 0;
    L44:
        if (r112 >= r103.length) goto L49;
        if (r13.contains(Integer.valueOf(r112)) == true) goto L48;
        r3[r23] = r103[r112];
        r23 = r23 + 1;
    L48:
        r112 = r112 + 1;
        goto L44
    L37:
        r3 = r103;
        goto L38
    L52:
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(r102.getAction()) == false) goto L64;
        C0372Il r104 = (C0372Il) r102.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        int r24 = r9;
        r0.startIntentSenderForResult(r104.f1296a, r24, r104.f1297b, r104.f1298c, r104.f1299d, 0, r7);     // Catch: IntentSender.SendIntentException -> L58
        return;
    L58:
        e = e;
    L62:
        new Handler(Looper.getMainLooper()).post(new RunnableC0662Pa(this, e, r24, 1));
        return;
    L60:
        e = e;
        r24 = r9;
        goto L62
    L64:
        r0.startActivityForResult(r102, r9, r7);
        return;
    L15:
        r12 = null;
        goto L14
    }
}
