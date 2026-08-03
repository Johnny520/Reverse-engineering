package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860U0 extends AbstractC0817T0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2720a;

    public /* synthetic */ C0860U0(int i) {
        this.f2720a = i;
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: a */
    public final Intent mo1620a(Object obj) {
        Bundle bundleExtra;
        switch (this.f2720a) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            default:
                C0372Il c0372Il = (C0372Il) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0372Il.f1297b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0372Il = new C0372Il(c0372Il.f1296a, null, c0372Il.f1298c, c0372Il.f1299d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0372Il);
                if (AbstractC2805zi.m5374G(2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: b */
    public C0774S0 mo1621b(AbstractActivityC2148ki abstractActivityC2148ki, Object obj) {
        switch (this.f2720a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new C0774S0(C0495Lf.f1620a);
                }
                for (String str : strArr) {
                    if (AbstractC0295Gu.m610c(abstractActivityC2148ki, str) != 0) {
                        return null;
                    }
                }
                int iM5109K = AbstractC2598uq.m5109K(strArr.length);
                if (iM5109K < 16) {
                    iM5109K = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM5109K);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0774S0(linkedHashMap);
            default:
                return super.mo1621b(abstractActivityC2148ki, obj);
        }
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: c */
    public final Object mo1622c(Intent intent, int i) {
        switch (this.f2720a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC2539ta.m5019d0(arrayList2, 10), AbstractC2539ta.m5019d0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new C0208Et(it.next(), it2.next()));
                        }
                    }
                }
                break;
        }
        return new C0689Q0(intent, i);
    }
}
