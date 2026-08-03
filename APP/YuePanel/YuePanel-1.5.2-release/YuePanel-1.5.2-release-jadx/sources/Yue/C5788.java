package Yue;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(24)
public final class C5788 {
    /* JADX INFO: renamed from: ۥ */
    public static C5782 m2461(C5782 c5782, C5782 c57822) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < c5782.m17913() + c57822.m17913()) {
            Locale localeM17909 = i < c5782.m17913() ? c5782.m17909(i) : c57822.m17909(i - c5782.m17913());
            if (localeM17909 != null) {
                linkedHashSet.add(localeM17909);
            }
            i++;
        }
        return C5782.m2446((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C5782 m2462(C5782 c5782, C5782 c57822) {
        return (c5782 == null || c5782.m17912()) ? C5782.m17905() : m2461(c5782, c57822);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C5782 m17929(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? C5782.m17905() : m2461(C5782.m17907(localeList), C5782.m17907(localeList2));
    }
}
