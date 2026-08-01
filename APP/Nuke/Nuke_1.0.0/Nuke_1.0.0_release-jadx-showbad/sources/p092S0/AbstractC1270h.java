package p092S0;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.List;
import p081Q.C1160c;

/* JADX INFO: renamed from: S0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1270h {

    /* JADX INFO: renamed from: a */
    public static final C1269g f4566a = new C1269g("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final List m2356a(C1269g c1269g, int i5, int i6, C1160c c1160c) {
        List list;
        if (i5 == i6 || (list = c1269g.f4562d) == null) {
            return null;
        }
        if (i5 != 0 || i6 < c1269g.f4563e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1267e c1267e = (C1267e) list.get(i7);
                if ((c1160c != null ? ((Boolean) c1160c.mo1h(c1267e.f4557a)).booleanValue() : true) && m2357b(i5, i6, c1267e.f4558b, c1267e.f4559c)) {
                    arrayList.add(new C1267e((InterfaceC1264b) c1267e.f4557a, AbstractC1926h.m3568k(c1267e.f4558b, i5, i6) - i5, AbstractC1926h.m3568k(c1267e.f4559c, i5, i6) - i5, c1267e.f4560d));
                }
            }
            return arrayList;
        }
        if (c1160c == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Object obj = list.get(i8);
            if (((Boolean) c1160c.mo1h(((C1267e) obj).f4557a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m2357b(int i5, int i6, int i7, int i8) {
        return ((i5 < i8) & (i7 < i6)) | (((i5 == i6) | (i7 == i8)) & (i5 == i7));
    }
}
