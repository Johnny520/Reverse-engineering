package p111ha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: ha.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2915f0 {

    /* JADX INFO: renamed from: a */
    public static final C2915f0 f7680a = new C2915f0();

    /* JADX INFO: renamed from: l */
    public static final CharSequence m10607l(String str) {
        str.getClass();
        return f7680a.m10609c(str);
    }

    /* JADX INFO: renamed from: b */
    public final String[] m10608b(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public final String m10609c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }

    /* JADX INFO: renamed from: d */
    public final Set m10610d(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: e */
    public final Set m10611e(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return m10610d(m10614h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: f */
    public final Set m10612f(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return m10610d(m10615i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: g */
    public final String m10613g(String str) {
        str.getClass();
        return "java/util/function/" + str;
    }

    /* JADX INFO: renamed from: h */
    public final String m10614h(String str) {
        str.getClass();
        return "java/lang/" + str;
    }

    /* JADX INFO: renamed from: i */
    public final String m10615i(String str) {
        str.getClass();
        return "java/util/" + str;
    }

    /* JADX INFO: renamed from: j */
    public final String m10616j(String str) {
        str.getClass();
        return "java/util/concurrent/atomic/" + str;
    }

    /* JADX INFO: renamed from: k */
    public final String m10617k(String str, List list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + AbstractC5081g0.m20585s0(list, _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, C2913e0.f7679q, 30, null) + ')' + m10609c(str2);
    }

    /* JADX INFO: renamed from: m */
    public final String m10618m(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
