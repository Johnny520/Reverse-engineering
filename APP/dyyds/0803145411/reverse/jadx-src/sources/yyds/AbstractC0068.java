package yyds;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛱᛱᲁᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068 extends AbstractC1917 {
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static Set m441(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C1422.f6715;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2366.m4382(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static Set m442(LinkedHashSet linkedHashSet, Set set) {
        if (set.isEmpty()) {
            return AbstractC1595.m3267(linkedHashSet);
        }
        if (!(set instanceof Set)) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
            linkedHashSet2.removeAll(set);
            return linkedHashSet2;
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (Object obj : linkedHashSet) {
            if (!set.contains(obj)) {
                linkedHashSet3.add(obj);
            }
        }
        return linkedHashSet3;
    }
}
