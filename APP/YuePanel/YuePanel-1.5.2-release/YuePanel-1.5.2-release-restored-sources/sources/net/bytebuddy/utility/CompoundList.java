package net.bytebuddy.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompoundList {
    private CompoundList() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <S> List<S> m5412of(S s, List<? extends S> list) {
        if (list.isEmpty()) {
            return Collections.singletonList(s);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(s);
        arrayList.addAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: of */
    public static <S> List<S> m5413of(List<? extends S> list, S s) {
        if (list.isEmpty()) {
            return Collections.singletonList(s);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(s);
        return arrayList;
    }

    /* JADX INFO: renamed from: of */
    public static <S> List<S> m5414of(List<? extends S> list, List<? extends S> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    /* JADX INFO: renamed from: of */
    public static <S> List<S> m5415of(List<? extends S> list, List<? extends S> list2, List<? extends S> list3) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }
}
