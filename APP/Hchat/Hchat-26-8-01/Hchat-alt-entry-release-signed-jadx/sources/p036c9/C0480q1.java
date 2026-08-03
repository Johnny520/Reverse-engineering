package p036c9;

import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import p014b.C0126e;
import p106h8.C1625b;
import p167l8.C2526a;
import p167l8.C2527b;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: c9.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0480q1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3742g f1422a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.f.invoke():java.lang.Object] */
    public /* synthetic */ C0480q1(C3742g c3742g) {
        this.f1422a = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1510a(C0126e c0126e) {
        String[] strArr;
        C3742g c3742g = this.f1422a;
        List listM1485i = AbstractC0473o2.m1485i(c3742g.f12143a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2527b c2527b = (C2527b) c0126e.f333i;
        if (c2527b != null) {
            String str = c2527b.f8167a;
            if (!TextUtils.isEmpty(str)) {
                linkedHashSet.add(str);
            }
        }
        C2526a c2526a = (C2526a) c0126e.f332h;
        String strM4150b = C1625b.m4150b(c2526a.f8164d, "username");
        if (!TextUtils.isEmpty(strM4150b)) {
            linkedHashSet.add(strM4150b);
        }
        String str2 = c2526a.f8165e;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.US).contains("username") && (strArr = c2526a.f8166f) != null) {
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    linkedHashSet.add(str3);
                }
            }
        }
        String[] strArr2 = (String[]) linkedHashSet.toArray(new String[0]);
        List<String> listM8375L0 = strArr2 != null ? AbstractC4165l.m8375L0(strArr2) : null;
        if (listM8375L0 == null) {
            listM8375L0 = C4173t.f13710g;
        }
        if (listM8375L0.isEmpty()) {
            return;
        }
        for (String str4 : listM8375L0) {
            str4.getClass();
            if (!AbstractC3149m.m6721t0(str4) && AbstractC0473o2.m1480d(str4, listM1485i) != null) {
                C0429d2.m1445y(c3742g.f12143a);
                return;
            }
        }
    }
}
