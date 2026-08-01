package ga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: ga.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2586f1 {

    /* JADX INFO: renamed from: a */
    public final C2619q1 f6867a;

    /* JADX INFO: renamed from: b */
    public final List f6868b;

    /* JADX INFO: renamed from: c */
    public final String f6869c;

    /* JADX INFO: renamed from: d */
    public final C2586f1 f6870d;

    public C2586f1(C2619q1 c2619q1, List list, String str) {
        list.getClass();
        this.f6867a = c2619q1;
        this.f6868b = list;
        this.f6869c = str;
        C2586f1 c2586f1 = null;
        if (str != null) {
            C2619q1 c2619q1M9307a = c2619q1 != null ? c2619q1.m9307a() : null;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2619q1 c2619q12 = (C2619q1) it.next();
                arrayList.add(c2619q12 != null ? c2619q12.m9307a() : null);
            }
            c2586f1 = new C2586f1(c2619q1M9307a, arrayList, null);
        }
        this.f6870d = c2586f1;
    }

    /* JADX INFO: renamed from: a */
    public final String m9233a() {
        return this.f6869c;
    }

    /* JADX INFO: renamed from: b */
    public final List m9234b() {
        return this.f6868b;
    }

    /* JADX INFO: renamed from: c */
    public final C2619q1 m9235c() {
        return this.f6867a;
    }

    /* JADX INFO: renamed from: d */
    public final C2586f1 m9236d() {
        return this.f6870d;
    }
}
