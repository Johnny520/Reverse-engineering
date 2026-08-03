package p000a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000a.AbstractC0433Y;
import p000a.C0284Pb;

/* JADX INFO: renamed from: a.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0451Z extends AbstractC0433Y<String[], Map<String, Boolean>> {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.os.Parcelable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.AbstractC0433Y
    /* JADX INFO: renamed from: a */
    public final Intent mo1077a(Context context, Parcelable parcelable) {
        String[] strArr = (String[]) parcelable;
        C0631i9.m1482e(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C0631i9.m1481d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.os.Parcelable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.AbstractC0433Y
    /* JADX INFO: renamed from: b */
    public final AbstractC0433Y.a mo1078b(Context context, Parcelable parcelable) {
        String[] strArr = (String[]) parcelable;
        C0631i9.m1482e(strArr, "input");
        if (strArr.length == 0) {
            return new AbstractC0433Y.a(C0457Z5.f1721a);
        }
        for (String str : strArr) {
            if (str == null) {
                throw new NullPointerException("permission must be non-null");
            }
            if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C0284Pb.a.m775a(new C0284Pb(context).f978a) ? 0 : -1) != 0) {
                return null;
            }
        }
        int iM1169C = C0480aa.m1169C(strArr.length);
        if (iM1169C < 16) {
            iM1169C = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1169C);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC0433Y.a(linkedHashMap);
    }

    @Override // p000a.AbstractC0433Y
    /* JADX INFO: renamed from: c */
    public final Object mo1079c(Intent intent, int i) {
        C0457Z5 c0457z5 = C0457Z5.f1721a;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayListM629c0 = C0238N1.m629c0(stringArrayExtra);
                Iterator it = arrayListM629c0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(C0758p3.m1800g0(arrayListM629c0, 10), C0758p3.m1800g0(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C0710mc(it.next(), it2.next()));
                }
                return C0499ba.m1231G(arrayList2);
            }
        }
        return c0457z5;
    }
}
