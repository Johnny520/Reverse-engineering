package p281t6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p211o8.AbstractC5661b;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t6.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8168u {

    /* JADX INFO: renamed from: t6.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(Double.valueOf(((C8156l) obj2).m31635c()), Double.valueOf(((C8156l) obj).m31635c()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m31659a() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m31660b() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m31661c(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';' || str.charAt(i11) == ',';
    }

    /* JADX INFO: renamed from: d */
    public static final List m31662d(String str) {
        return AbstractC5081g0.m20542N0(m31663e(str), new a());
    }

    /* JADX INFO: renamed from: e */
    public static final List m31663e(String str) {
        return m31664f(str, false);
    }

    /* JADX INFO: renamed from: f */
    public static final List m31664f(String str, boolean z10) {
        if (str == null) {
            return AbstractC5114x.m20800o();
        }
        InterfaceC4705l interfaceC4705lM18788b = AbstractC4706m.m18788b(EnumC4708o.f13923s, new InterfaceC0173a() { // from class: t6.s
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC8168u.m31659a();
            }
        });
        int iM31665g = 0;
        while (iM31665g <= AbstractC8621f0.m33140h0(str)) {
            iM31665g = m31665g(str, iM31665g, interfaceC4705lM18788b, z10);
        }
        return m31671m(interfaceC4705lM18788b);
    }

    /* JADX INFO: renamed from: g */
    public static final int m31665g(String str, int i10, InterfaceC4705l interfaceC4705l, boolean z10) {
        InterfaceC4705l interfaceC4705lM18788b = AbstractC4706m.m18788b(EnumC4708o.f13923s, new InterfaceC0173a() { // from class: t6.t
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC8168u.m31660b();
            }
        });
        Integer numValueOf = z10 ? Integer.valueOf(i10) : null;
        int iM31666h = i10;
        while (iM31666h <= AbstractC8621f0.m33140h0(str)) {
            char cCharAt = str.charAt(iM31666h);
            if (cCharAt == ',') {
                ((ArrayList) interfaceC4705l.getValue()).add(new C8156l(m31670l(str, i10, numValueOf != null ? numValueOf.intValue() : iM31666h), m31671m(interfaceC4705lM18788b)));
                return iM31666h + 1;
            }
            if (cCharAt != ';') {
                iM31666h = z10 ? m31666h(str, iM31666h, interfaceC4705lM18788b) : iM31666h + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(iM31666h);
                }
                iM31666h = m31666h(str, iM31666h + 1, interfaceC4705lM18788b);
            }
        }
        ((ArrayList) interfaceC4705l.getValue()).add(new C8156l(m31670l(str, i10, numValueOf != null ? numValueOf.intValue() : iM31666h), m31671m(interfaceC4705lM18788b)));
        return iM31666h;
    }

    /* JADX INFO: renamed from: h */
    public static final int m31666h(String str, int i10, InterfaceC4705l interfaceC4705l) {
        int i11 = i10;
        while (i11 <= AbstractC8621f0.m33140h0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                m31667i(interfaceC4705l, str, i10, i11, _UrlKt.FRAGMENT_ENCODE_SET);
                return i11;
            }
            if (cCharAt == '=') {
                C4711r c4711rM31668j = m31668j(str, i11 + 1);
                int iIntValue = ((Number) c4711rM31668j.m18792a()).intValue();
                m31667i(interfaceC4705l, str, i10, i11, (String) c4711rM31668j.m18793b());
                return iIntValue;
            }
            i11++;
        }
        m31667i(interfaceC4705l, str, i10, i11, _UrlKt.FRAGMENT_ENCODE_SET);
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public static final void m31667i(InterfaceC4705l interfaceC4705l, String str, int i10, int i11, String str2) {
        String strM31670l = m31670l(str, i10, i11);
        if (strM31670l.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC4705l.getValue()).add(new C8158m(strM31670l, str2));
    }

    /* JADX INFO: renamed from: j */
    public static final C4711r m31668j(String str, int i10) {
        if (str.length() == i10) {
            return AbstractC4717x.m18815a(Integer.valueOf(i10), _UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (str.charAt(i10) == '\"') {
            return m31669k(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= AbstractC8621f0.m33140h0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                return AbstractC4717x.m18815a(Integer.valueOf(i11), m31670l(str, i10, i11));
            }
            i11++;
        }
        return AbstractC4717x.m18815a(Integer.valueOf(i11), m31670l(str, i10, i11));
    }

    /* JADX INFO: renamed from: k */
    public static final C4711r m31669k(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= AbstractC8621f0.m33140h0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' && m31661c(str, i10)) {
                return AbstractC4717x.m18815a(Integer.valueOf(i10 + 1), sb2.toString());
            }
            if (cCharAt != '\\' || i10 >= AbstractC8621f0.m33140h0(str) - 2) {
                sb2.append(cCharAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        return AbstractC4717x.m18815a(Integer.valueOf(i10), "\"".concat(sb2.toString()));
    }

    /* JADX INFO: renamed from: l */
    public static final String m31670l(String str, int i10, int i11) {
        return AbstractC8621f0.m33161r1(str.substring(i10, i11)).toString();
    }

    /* JADX INFO: renamed from: m */
    public static final List m31671m(InterfaceC4705l interfaceC4705l) {
        return interfaceC4705l.mo18779a() ? (List) interfaceC4705l.getValue() : AbstractC5114x.m20800o();
    }
}
