package na;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.AbstractC5140a;

/* JADX INFO: renamed from: na.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5532g {
    /* JADX INFO: renamed from: a */
    public static final List m22542a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5140a.e.c cVar = (AbstractC5140a.e.c) it.next();
            int iM21115F = cVar.m21115F();
            for (int i10 = 0; i10 < iM21115F; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
