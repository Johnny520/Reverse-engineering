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

    public C0705Qa(AbstractActivityC2148ki abstractActivityC2148ki) {
        this.f2272h = abstractActivityC2148ki;
    }

    @Override // p000.AbstractC1242c1
    /* JADX INFO: renamed from: b */
    public final void mo1452b(int i, AbstractC0817T0 abstractC0817T0, Object obj) {
        Bundle bundleExtra;
        int i2;
        AbstractActivityC2148ki abstractActivityC2148ki = this.f2272h;
        C0774S0 c0774s0Mo1621b = abstractC0817T0.mo1621b(abstractActivityC2148ki, obj);
        if (c0774s0Mo1621b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0662Pa(this, c0774s0Mo1621b, i, 0));
            return;
        }
        Intent intentMo1620a = abstractC0817T0.mo1620a(obj);
        if (intentMo1620a.getExtras() != null && intentMo1620a.getExtras().getClassLoader() == null) {
            intentMo1620a.setExtrasClassLoader(abstractActivityC2148ki.getClassLoader());
        }
        if (intentMo1620a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo1620a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo1620a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo1620a.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo1620a.getAction())) {
                abstractActivityC2148ki.startActivityForResult(intentMo1620a, i, bundle);
                return;
            }
            C0372Il c0372Il = (C0372Il) intentMo1620a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                abstractActivityC2148ki.startIntentSenderForResult(c0372Il.f1296a, i2, c0372Il.f1297b, c0372Il.f1298c, c0372Il.f1299d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new RunnableC0662Pa(this, e, i2, 1));
                return;
            }
        }
        String[] stringArrayExtra = intentMo1620a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException(AbstractC0213Ey.m410h(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        abstractActivityC2148ki.validateRequestPermissionsRequestCode(i);
        abstractActivityC2148ki.requestPermissions(stringArrayExtra, i);
    }
}
