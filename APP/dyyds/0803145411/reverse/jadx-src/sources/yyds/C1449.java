package yyds;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛶᲇᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1449 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0644 f6866;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final CallableC0122 f6867 = new CallableC0122(1, f6866);

    static {
        C0644 c0644 = new C0644(21);
        f6866 = c0644;
        C0644 c06442 = null;
        c0644.m1570(Long.class, new C0721(c06442, 9));
        c0644.m1570(Long.TYPE, new C0721(c06442, 9));
        c0644.m1570(Integer.class, new C0721(c06442, 8));
        c0644.m1570(Integer.TYPE, new C0721(c06442, 8));
        c0644.m1570(Double.class, new C0721(c06442, 6));
        c0644.m1570(Double.TYPE, new C0721(c06442, 6));
        c0644.m1570(Float.class, new C0721(c06442, 7));
        c0644.m1570(Float.TYPE, new C0721(c06442, 7));
        c0644.m1570(BigDecimal.class, new C0721(c06442, 2));
        c0644.m1570(String.class, new C0721(c06442, 10));
        c0644.m1570(Date.class, new C0721(c06442, 5));
        c0644.m1570(BigInteger.class, new C0721(c06442, 3));
        c0644.m1570(Boolean.TYPE, new C0721(c06442, 4));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m2948(Object obj, Class cls, C0989 c0989) {
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        try {
            C0052 c0052 = c0989.f4503;
            c0052.getClass();
            if (!(obj instanceof Map)) {
                c0052.getClass();
                if (!(obj instanceof List)) {
                    return ((C0644) this.f6867.f815).m1558(cls).mo1661(obj);
                }
            }
            String strM402 = c0052.m402(obj);
            C1083 c1083 = AbstractC2084.f10334;
            try {
                int i = C1342.f6222;
                C1342 c1342 = new C1342(i);
                AbstractC1183 abstractC1183M1558 = AbstractC2084.f10336.m1558(cls);
                C2072 c2072 = c1342.f6223;
                if (c2072 == null) {
                    c2072 = new C2072(i);
                    c1342.f6223 = c2072;
                }
                return c2072.m3979(strM402, abstractC1183M1558);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception e) {
            throw new C1292(e);
        }
    }
}
