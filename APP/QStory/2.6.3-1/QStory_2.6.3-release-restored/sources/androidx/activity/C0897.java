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
import p140.C8242;
import p186.AbstractC8551;
import p187.AbstractC8558;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0897 extends AbstractC8558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f449;

    public C0897(ComponentActivity componentActivity) {
        this.f449 = componentActivity;
    }

    @Override // p187.AbstractC8558
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo695(int i, AbstractC8551 abstractC8551, Object obj) {
        Bundle bundleExtra;
        int i2;
        ComponentActivity componentActivity = this.f449;
        C8242 c8242Mo4979 = abstractC8551.mo4979(componentActivity, obj);
        if (c8242Mo4979 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0899(i, 0, this, c8242Mo4979));
            return;
        }
        Intent intentMo4980 = abstractC8551.mo4980(componentActivity, obj);
        if (intentMo4980.getExtras() != null) {
            Bundle extras = intentMo4980.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentMo4980.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentMo4980.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo4980.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo4980.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo4980.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo4980.getAction())) {
                componentActivity.startActivityForResult(intentMo4980, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo4980.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(intentSenderRequest.f373, i2, intentSenderRequest.f371, intentSenderRequest.f372, intentSenderRequest.f370, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new RunnableC0899(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentMo4980.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                C6755.m11869(AbstractC0900.m711(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
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
