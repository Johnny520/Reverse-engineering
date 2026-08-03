package p119i2;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p088g0.C1271o;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: i2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1928h {

    /* JADX INFO: renamed from: a */
    public static final C1926g f6536a = new C1926g(HttpUrl.FRAGMENT_ENCODE_SET);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final List m4797a(C1926g c1926g, int i9, int i10, C1271o c1271o) {
        List list;
        if (i9 == i10 || (list = c1926g.f6528g) == null) {
            return null;
        }
        if (i9 != 0 || i10 < c1926g.f6529h.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C1922e c1922e = (C1922e) list.get(i11);
                if ((c1271o != null ? ((Boolean) c1271o.invoke(c1922e.f6503a)).booleanValue() : true) && m4798b(i9, i10, c1922e.f6504b, c1922e.f6505c)) {
                    arrayList.add(new C1922e(c1922e.f6506d, AbstractC3754e0.m7909r(c1922e.f6504b, i9, i10) - i9, AbstractC3754e0.m7909r(c1922e.f6505c, i9, i10) - i9, (InterfaceC1916b) c1922e.f6503a));
                }
            }
            return arrayList;
        }
        if (c1271o == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj = list.get(i12);
            if (((Boolean) c1271o.invoke(((C1922e) obj).f6503a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m4798b(int i9, int i10, int i11, int i12) {
        return ((i9 < i12) & (i11 < i10)) | (((i9 == i10) | (i11 == i12)) & (i9 == i11));
    }
}
