package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᲇᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0480 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0480 f2391;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Map f2392;

    static {
        AbstractC2328.m4341(-543420309996398L);
        AbstractC2328.m4341(-543480439538542L);
        f2391 = new C0480();
        f2392 = AbstractC2366.m4385(new Pair(AbstractC2328.m4341(-543574928819054L), AbstractC0068.m441(AbstractC2328.m4341(-543682303001454L), AbstractC2328.m4341(-543789677183854L))), new Pair(AbstractC2328.m4341(-543901346333550L), AbstractC0068.m441(AbstractC2328.m4341(-544013015483246L), AbstractC2328.m4341(-544124684632942L))));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m1336(C2578 c2578, LinkedHashSet linkedHashSet) {
        AbstractC2328.m4341(-543050942808942L);
        AbstractC2328.m4341(-543102482416494L);
        if (!linkedHashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = c2578.listIterator(0);
            while (true) {
                C0368 c0368 = (C0368) listIterator;
                if (!c0368.hasNext()) {
                    break;
                }
                String str = (String) c0368.next();
                if (str == null || AbstractC0473.m1313(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            Set<String> setM3267 = AbstractC1595.m3267(arrayList);
            if (!setM3267.isEmpty()) {
                C1119 c1119 = new C1119(AbstractC1529.m3157(new C0558(1, linkedHashSet), new C0514(13)));
                loop1: while (true) {
                    if (c1119.hasNext()) {
                        String str2 = (String) c1119.next();
                        Set<String> setSingleton = (Set) f2392.get(str2);
                        if (setSingleton == null) {
                            setSingleton = Collections.singleton(str2);
                        }
                        if (!setM3267.isEmpty()) {
                            for (String str3 : setM3267) {
                                if (!setSingleton.isEmpty()) {
                                    for (String str4 : setSingleton) {
                                        if (AbstractC1544.m3188(str3, str4)) {
                                            break loop1;
                                        }
                                        if (str3.startsWith(str4 + '.')) {
                                            break loop1;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!linkedHashSet.contains(AbstractC2328.m4341(-543179791827822L)) || !setM3267.contains(AbstractC2328.m4341(-543252806271854L))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
