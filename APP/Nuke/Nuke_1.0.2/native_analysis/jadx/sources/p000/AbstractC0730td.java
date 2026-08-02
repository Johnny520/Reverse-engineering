package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: td */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0730td {

    /* JADX INFO: renamed from: a */
    public static final C0690sd f10680a = new C0690sd("");

    /* JADX INFO: renamed from: a */
    public static final List m5162a(C0690sd c0690sd, int i, int i2, C0829w c0829w) {
        List list;
        if (i == i2 || (list = c0690sd.f10050h) == null) {
            return null;
        }
        if (i != 0 || i2 < c0690sd.f10051i.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0652rd c0652rd = (C0652rd) list.get(i3);
                if ((c0829w != null ? ((Boolean) c0829w.mo5j(c0652rd.f9514a)).booleanValue() : true) && m5163b(i, i2, c0652rd.f9515b, c0652rd.f9516c)) {
                    arrayList.add(new C0652rd(ci0.m779D(c0652rd.f9515b, i, i2) - i, ci0.m779D(c0652rd.f9516c, i, i2) - i, (InterfaceC0539od) c0652rd.f9514a, c0652rd.f9517d));
                }
            }
            return arrayList;
        }
        if (c0829w == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) c0829w.mo5j(((C0652rd) obj).f9514a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5163b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
