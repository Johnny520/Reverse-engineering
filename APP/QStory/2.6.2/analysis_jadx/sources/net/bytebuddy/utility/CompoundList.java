package net.bytebuddy.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CompoundList {
    private CompoundList() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static <S> List<S> of(S s, List<? extends S> list) {
        if (list.isEmpty()) {
            return Collections.singletonList(s);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(s);
        arrayList.addAll(list);
        return arrayList;
    }

    public static <S> List<S> of(List<? extends S> list, S s) {
        if (list.isEmpty()) {
            return Collections.singletonList(s);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(s);
        return arrayList;
    }

    public static <S> List<S> of(List<? extends S> list, List<? extends S> list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static <S> List<S> of(List<? extends S> list, List<? extends S> list2, List<? extends S> list3) {
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }
}
