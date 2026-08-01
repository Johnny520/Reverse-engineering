package p185m8;

import java.util.Collection;
import java.util.Iterator;
import p172l8.C4718y;
import p172l8.C4719z;

/* JADX INFO: renamed from: m8.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5077e1 {
    /* JADX INFO: renamed from: a */
    public static byte[] m20519a(Collection collection) {
        collection.getClass();
        byte[] bArrM18824c = C4719z.m18824c(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            C4719z.m18834x(bArrM18824c, i10, ((C4718y) it.next()).m18822k());
            i10++;
        }
        return bArrM18824c;
    }
}
