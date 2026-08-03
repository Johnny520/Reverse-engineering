package p000a;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: a.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0502bd {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Integer> f1847a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static int m1247a(String str) {
        Context context = C0889w1.f3488p;
        C0631i9.m1479b(context);
        String packageName = context.getPackageName();
        String strConcat = "@id/".concat(str);
        HashMap<String, Integer> map = f1847a;
        Integer numValueOf = map.get(strConcat);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(context.getResources().getIdentifier(str, "id", packageName));
            map.put(strConcat, numValueOf);
        }
        return numValueOf.intValue();
    }
}
