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
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import p124.C7413;
import p162.AbstractC7653;
import p170.AbstractC7722;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2321 extends AbstractC7722 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6822;

    public /* synthetic */ C2321(int i) {
        this.f6822 = i;
    }

    @Override // p170.AbstractC7722
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo4418(Intent intent, int i) {
        switch (this.f6822) {
            case 0:
                return new ActivityResult(intent, i);
            case 1:
                if (i != -1) {
                    return AbstractC4339.m8776();
                }
                if (intent == null) {
                    return AbstractC4339.m8776();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return AbstractC4339.m8776();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return AbstractC4339.m8771(AbstractC4344.m8821(AbstractC4347.m8826(stringArrayExtra), arrayList));
            default:
                return new ActivityResult(intent, i);
        }
    }

    @Override // p170.AbstractC7722
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7413 mo4419(Context context, Object obj) {
        switch (this.f6822) {
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new C7413(AbstractC4339.m8776());
                }
                for (String str : strArr) {
                    if (AbstractC7653.m12920(context, str) != 0) {
                        return null;
                    }
                }
                int iM8772 = AbstractC4339.m8772(strArr.length);
                if (iM8772 < 16) {
                    iM8772 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
                for (String str2 : strArr) {
                    Pair pair = new Pair(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new C7413(linkedHashMap);
            default:
                return super.mo4419(context, obj);
        }
    }

    @Override // p170.AbstractC7722
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Intent mo4420(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f6822) {
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
                if (AbstractC2313.m4362(2)) {
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
