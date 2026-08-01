package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import p140.C8242;
import p178.AbstractC8482;
import p186.AbstractC8551;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3154 extends AbstractC8551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7167;

    public /* synthetic */ C3154(int i) {
        this.f7167 = i;
    }

    @Override // p186.AbstractC8551
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo4978(Intent intent, int i) {
        switch (this.f7167) {
            case 0:
                return new ActivityResult(intent, i);
            case 1:
                if (i != -1) {
                    return AbstractC5171.m9335();
                }
                if (intent == null) {
                    return AbstractC5171.m9335();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return AbstractC5171.m9335();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return AbstractC5171.m9330(AbstractC5176.m9380(AbstractC5179.m9385(stringArrayExtra), arrayList));
            default:
                return new ActivityResult(intent, i);
        }
    }

    @Override // p186.AbstractC8551
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8242 mo4979(Context context, Object obj) {
        switch (this.f7167) {
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new C8242(AbstractC5171.m9335());
                }
                for (String str : strArr) {
                    if (AbstractC8482.m13479(context, str) != 0) {
                        return null;
                    }
                }
                int iM9331 = AbstractC5171.m9331(strArr.length);
                if (iM9331 < 16) {
                    iM9331 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
                for (String str2 : strArr) {
                    Pair pair = new Pair(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new C8242(linkedHashMap);
            default:
                return super.mo4979(context, obj);
        }
    }

    @Override // p186.AbstractC8551
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Intent mo4980(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f7167) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f371;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f373, null, intentSenderRequest.f372, intentSenderRequest.f370);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (AbstractC3146.m4922(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            default:
                Intent intent3 = (Intent) obj;
                intent3.getClass();
                return intent3;
        }
    }
}
