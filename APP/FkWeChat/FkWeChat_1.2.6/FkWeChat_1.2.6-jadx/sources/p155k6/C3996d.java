package p155k6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8621f0;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: k6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3996d {

    /* JADX INFO: renamed from: a */
    public static final C3996d f11755a = new C3996d();

    /* JADX INFO: renamed from: a */
    public static boolean m15916a(List list, String str) {
        str.getClass();
        return !list.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15917b(String str) {
        str.getClass();
        return AbstractC8621f0.m33124Z(str, '@', false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15918c(String str) {
        str.getClass();
        return str.length() > 0;
    }

    /* JADX INFO: renamed from: d */
    public final Set m15919d(String str) {
        str.getClass();
        final List listM20800o = AbstractC5114x.m20800o();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = (String[]) C3609f.f10025a.m13523w().toArray(new String[0]);
        for (String str2 : AbstractC7294t.m28915y(AbstractC7294t.m28915y(AbstractC7294t.m28915y(AbstractC5081g0.m20555Y(AbstractC8621f0.m33112S0(str, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null)), new InterfaceC0184l() { // from class: k6.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C3996d.m15918c((String) obj));
            }
        }), new InterfaceC0184l() { // from class: k6.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C3996d.m15916a(listM20800o, (String) obj));
            }
        }), new InterfaceC0184l() { // from class: k6.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C3996d.m15917b((String) obj));
            }
        })) {
            Iterator it = AbstractC3608e.m13495b(str, str2).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                int iM33150m0 = AbstractC8621f0.m33150m0(str2, '@', 0, false, 6, null);
                int i10 = iIntValue + iM33150m0;
                linkedHashSet.add(new C4676o(i10, (str2.length() + i10) - iM33150m0));
            }
        }
        return AbstractC5081g0.m20564c1(linkedHashSet);
    }
}
