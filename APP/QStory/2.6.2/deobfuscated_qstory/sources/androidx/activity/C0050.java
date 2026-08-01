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
import p124.C7412;
import p170.AbstractC7721;
import p171.AbstractC7728;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0050 extends AbstractC7728 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f104;

    public C0050(ComponentActivity componentActivity) {
        this.f104 = componentActivity;
    }

    @Override // p171.AbstractC7728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo135(int i, AbstractC7721 abstractC7721, Object obj) {
        Bundle bundleExtra;
        int i2;
        ComponentActivity componentActivity = this.f104;
        C7412 c7412Mo4409 = abstractC7721.mo4409(componentActivity, obj);
        if (c7412Mo4409 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0052(i, 0, this, c7412Mo4409));
            return;
        }
        Intent intentMo4410 = abstractC7721.mo4410(componentActivity, obj);
        if (intentMo4410.getExtras() != null) {
            Bundle extras = intentMo4410.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentMo4410.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentMo4410.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo4410.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo4410.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo4410.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo4410.getAction())) {
                componentActivity.startActivityForResult(intentMo4410, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo4410.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
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
        String[] stringArrayExtra = intentMo4410.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                C5919.m11249(AbstractC0053.m146(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
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
