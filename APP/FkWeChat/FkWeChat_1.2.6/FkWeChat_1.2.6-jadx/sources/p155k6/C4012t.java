package p155k6;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8610a;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: k6.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4012t {

    /* JADX INFO: renamed from: a */
    public static final C4012t f11766a = new C4012t();

    /* JADX INFO: renamed from: a */
    public static boolean m15938a(String str) {
        str.getClass();
        return !AbstractC8621f0.m33156p0(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15939b(String str) {
        str.getClass();
        return C3609f.f10025a.m13523w().contains(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15940c(String str) {
        str.getClass();
        return C3609f.f10025a.m13516p().contains(str);
    }

    /* JADX INFO: renamed from: d */
    public static String m15941d(char c10) {
        return AbstractC8621f0.m33161r1(String.valueOf(c10)).toString();
    }

    /* JADX INFO: renamed from: e */
    public final Set m15942e(String str) {
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = AbstractC7294t.m28915y(AbstractC7294t.m28915y(AbstractC7294t.m28915y(AbstractC7294t.m28901I(AbstractC8625h0.m33175u1(str), new InterfaceC0184l() { // from class: k6.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C4012t.m15941d(((Character) obj).charValue());
            }
        }), new InterfaceC0184l() { // from class: k6.q
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C4012t.m15939b((String) obj));
            }
        }), new InterfaceC0184l() { // from class: k6.r
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C4012t.m15938a((String) obj));
            }
        }), new InterfaceC0184l() { // from class: k6.s
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C4012t.m15940c((String) obj));
            }
        }).iterator();
        while (it.hasNext()) {
            Iterator it2 = AbstractC3608e.m13495b(str, (String) it.next()).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (!AbstractC8610a.m33055c(str.charAt(iIntValue))) {
                    linkedHashSet.add(new C4676o(iIntValue, iIntValue + 1));
                }
            }
        }
        return AbstractC5081g0.m20564c1(linkedHashSet);
    }
}
