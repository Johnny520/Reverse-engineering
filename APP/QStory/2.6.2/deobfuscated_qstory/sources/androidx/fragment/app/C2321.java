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
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import p124.C7412;
import p162.AbstractC7652;
import p170.AbstractC7721;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2321 extends AbstractC7721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6821;

    public /* synthetic */ C2321(int i) {
        this.f6821 = i;
    }

    @Override // p170.AbstractC7721
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo4408(Intent intent, int i) {
        switch (this.f6821) {
            case 0:
                return new ActivityResult(intent, i);
            case 1:
                if (i != -1) {
                    return AbstractC4338.m8781();
                }
                if (intent == null) {
                    return AbstractC4338.m8781();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return AbstractC4338.m8781();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return AbstractC4338.m8783(AbstractC4343.m8797(AbstractC4346.m8864(stringArrayExtra), arrayList));
            default:
                return new ActivityResult(intent, i);
        }
    }

    @Override // p170.AbstractC7721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7412 mo4409(Context context, Object obj) {
        switch (this.f6821) {
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new C7412(AbstractC4338.m8781());
                }
                for (String str : strArr) {
                    if (AbstractC7652.m12891(context, str) != 0) {
                        return null;
                    }
                }
                int iM8779 = AbstractC4338.m8779(strArr.length);
                if (iM8779 < 16) {
                    iM8779 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
                for (String str2 : strArr) {
                    Pair pair = new Pair(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new C7412(linkedHashMap);
            default:
                return super.mo4409(context, obj);
        }
    }

    @Override // p170.AbstractC7721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Intent mo4410(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f6821) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f26;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f28, null, intentSenderRequest.f27, intentSenderRequest.f25);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (AbstractC2313.m4352(2)) {
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
