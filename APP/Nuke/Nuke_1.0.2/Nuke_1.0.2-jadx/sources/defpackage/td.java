package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td {
    public static final sd a = new sd("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List a(sd sdVar, int i, int i2, w wVar) {
        List list;
        if (i == i2 || (list = sdVar.h) == null) {
            return null;
        }
        if (i != 0 || i2 < sdVar.i.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                rd rdVar = (rd) list.get(i3);
                if ((wVar != null ? ((Boolean) wVar.j(rdVar.a)).booleanValue() : true) && b(i, i2, rdVar.b, rdVar.c)) {
                    arrayList.add(new rd(ci0.D(rdVar.b, i, i2) - i, ci0.D(rdVar.c, i, i2) - i, (od) rdVar.a, rdVar.d));
                }
            }
            return arrayList;
        }
        if (wVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) wVar.j(((rd) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
