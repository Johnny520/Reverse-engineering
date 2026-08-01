package p185m8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m8.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5116y extends AbstractC5114x {
    /* JADX INFO: renamed from: A */
    public static final Integer m20812A(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static List m20813B(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC5070c0.m20492E(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static int m20814z(Iterable iterable, int i10) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
