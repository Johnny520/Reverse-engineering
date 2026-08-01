package p281t6;

import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5109u0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8622g;
import p299ub.C8632n;
import p299ub.InterfaceC8626i;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: t6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8150i {

    /* JADX INFO: renamed from: a */
    public static final Set f27271a = AbstractC5068b1.m20487i("max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc");

    /* JADX INFO: renamed from: b */
    public static final C8632n f27272b = new C8632n("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* JADX INFO: renamed from: c */
    public static final Set f27273c = AbstractC5068b1.m20487i(';', ',', '\"');

    /* JADX INFO: renamed from: a */
    public static C4711r m31622a(C4711r c4711r) {
        c4711r.getClass();
        return (AbstractC8611a0.m33075T((String) c4711r.m18796f(), "\"", false, 2, null) && AbstractC8611a0.m33060E((String) c4711r.m18796f(), "\"", false, 2, null)) ? C4711r.m18791d(c4711r, null, AbstractC8621f0.m33104K0((String) c4711r.m18796f(), "\""), 1, null) : c4711r;
    }

    /* JADX INFO: renamed from: b */
    public static C4711r m31623b(InterfaceC8626i interfaceC8626i) {
        String strM33172a;
        String strM33172a2;
        interfaceC8626i.getClass();
        C8622g c8622g = interfaceC8626i.mo33183c().get(2);
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        if (c8622g == null || (strM33172a = c8622g.m33172a()) == null) {
            strM33172a = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        C8622g c8622g2 = interfaceC8626i.mo33183c().get(4);
        if (c8622g2 != null && (strM33172a2 = c8622g2.m33172a()) != null) {
            str = strM33172a2;
        }
        return AbstractC4717x.m18815a(strM33172a, str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m31624c(boolean z10, C4711r c4711r) {
        c4711r.getClass();
        return (z10 && AbstractC8611a0.m33075T((String) c4711r.m18795e(), "$", false, 2, null)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static final Map m31625d(String str, final boolean z10) {
        str.getClass();
        return AbstractC5109u0.m20781v(AbstractC7294t.m28901I(AbstractC7294t.m28915y(AbstractC7294t.m28901I(C8632n.m33211e(f27272b, str, 0, 2, null), new InterfaceC0184l() { // from class: t6.f
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC8150i.m31623b((InterfaceC8626i) obj);
            }
        }), new InterfaceC0184l() { // from class: t6.g
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC8150i.m31624c(z10, (C4711r) obj));
            }
        }), new InterfaceC0184l() { // from class: t6.h
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC8150i.m31622a((C4711r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Map m31626e(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m31625d(str, z10);
    }
}
