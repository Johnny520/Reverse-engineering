package yyds;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᲇᛳᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2422 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap f11958 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m4469(String str) {
        Integer num;
        if (str == null) {
            return false;
        }
        if (AbstractC0473.m1313(str)) {
            str = null;
        }
        return (str == null || (num = (Integer) f11958.get(str)) == null || num.intValue() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4470(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C2701 c2701 = C2701.f13261;
        String strM4341 = AbstractC2328.m4341(-549815516300142L);
        c2701.getClass();
        String str = (String) C2701.m4806(aweme, strM4341);
        String strM43412 = AbstractC2328.m4341(-549854171005806L);
        c2701.getClass();
        Number number = (Number) C2701.m4806(aweme, strM43412);
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf == null || str == null) {
            return;
        }
        if (AbstractC0473.m1313(str)) {
            str = null;
        }
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = f11958;
        if (concurrentHashMap.size() >= 1000 && !concurrentHashMap.containsKey(str)) {
            concurrentHashMap.clear();
        }
        concurrentHashMap.put(str, numValueOf);
    }
}
