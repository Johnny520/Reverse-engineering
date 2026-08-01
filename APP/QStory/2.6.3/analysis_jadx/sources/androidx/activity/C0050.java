package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentActivity;
import java.util.Arrays;
import java.util.HashSet;
import p124.C7413;
import p170.AbstractC7722;
import p171.AbstractC7729;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0050 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f104;

    public C0050(ComponentActivity componentActivity) {
        this.f104 = componentActivity;
    }

    @Override // p171.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo135(int i, AbstractC7722 abstractC7722, Object obj) {
        Bundle bundleExtra;
        int i2;
        ComponentActivity componentActivity = this.f104;
        C7413 c7413Mo4419 = abstractC7722.mo4419(componentActivity, obj);
        if (c7413Mo4419 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0052(i, 0, this, c7413Mo4419));
            return;
        }
        Intent intentMo4420 = abstractC7722.mo4420(componentActivity, obj);
        if (intentMo4420.getExtras() != null) {
            Bundle extras = intentMo4420.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentMo4420.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentMo4420.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo4420.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo4420.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo4420.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo4420.getAction())) {
                componentActivity.startActivityForResult(intentMo4420, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo4420.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(intentSenderRequest.f28, i2, intentSenderRequest.f26, intentSenderRequest.f27, intentSenderRequest.f25, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new RunnableC0052(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentMo4420.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                C5925.m11310(AbstractC0053.m151(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
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
        if (componentActivity instanceof FragmentActivity) {
            ((FragmentActivity) componentActivity).validateRequestPermissionsRequestCode(i);
        }
        componentActivity.requestPermissions(stringArrayExtra, i);
    }
}
