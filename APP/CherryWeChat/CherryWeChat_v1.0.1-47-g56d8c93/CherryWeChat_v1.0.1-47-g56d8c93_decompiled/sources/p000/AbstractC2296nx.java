package p000;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: nx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2296nx {

    /* JADX INFO: renamed from: a */
    public static final Class f8047a;

    /* JADX INFO: renamed from: b */
    public static final C1044YC f8048b;

    /* JADX INFO: renamed from: c */
    public static final C1044YC f8049c;

    /* JADX INFO: renamed from: d */
    public static final C1044YC f8050d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f8047a = cls;
        f8048b = m4668v(false);
        f8049c = m4668v(true);
        f8050d = new C1044YC();
    }

    /* JADX INFO: renamed from: A */
    public static void m4631A(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c2230ma.getClass();
                c2230ma.m4531X(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 8;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4532Y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m4632B(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c2230ma.m4534a0(i, 0);
                c2230ma.m4533Z(iIntValue);
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4522O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4522O += C2230ma.m4522O(((Integer) list.get(i3)).intValue());
        }
        c2230ma.m4535b0(iM4522O);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c2230ma.m4533Z(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m4633C(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4529V(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 4;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4530W(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m4634D(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4531X(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 8;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4532Y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m4635E(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c2230ma.getClass();
                c2230ma.m4529V(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 4;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4530W(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m4636F(int i, List list, C0132D2 c0132d2, InterfaceC2253mx interfaceC2253mx) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0132d2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0132d2.m251z(i, list.get(i2), interfaceC2253mx);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m4637G(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c2230ma.m4534a0(i, 0);
                c2230ma.m4533Z(iIntValue);
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4522O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4522O += C2230ma.m4522O(((Integer) list.get(i3)).intValue());
        }
        c2230ma.m4535b0(iM4522O);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c2230ma.m4533Z(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m4638H(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4536c0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4526S = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4526S += C2230ma.m4526S(((Long) list.get(i3)).longValue());
        }
        c2230ma.m4535b0(iM4526S);
        while (i2 < list.size()) {
            c2230ma.m4537d0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m4639I(int i, List list, C0132D2 c0132d2, InterfaceC2253mx interfaceC2253mx) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0132d2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0132d2.m230A(i, list.get(i2), interfaceC2253mx);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m4640J(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4529V(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 4;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4530W(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m4641K(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4531X(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3 += 8;
        }
        c2230ma.m4535b0(i3);
        while (i2 < list.size()) {
            c2230ma.m4532Y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m4642L(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c2230ma.m4534a0(i, 0);
                c2230ma.m4535b0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4525R = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM4525R += C2230ma.m4525R((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c2230ma.m4535b0(iM4525R);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c2230ma.m4535b0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m4643M(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c2230ma.m4536c0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4526S = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM4526S += C2230ma.m4526S((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c2230ma.m4535b0(iM4526S);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c2230ma.m4537d0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m4644N(int i, List list, C0132D2 c0132d2) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!(list instanceof InterfaceC0374In)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c2230ma.m4534a0(i, 2);
                int i3 = c2230ma.f7801h;
                byte[] bArr = c2230ma.f7800g;
                int i4 = c2230ma.f7802i;
                try {
                    int iM4525R = C2230ma.m4525R(str.length() * 3);
                    int iM4525R2 = C2230ma.m4525R(str.length());
                    if (iM4525R2 == iM4525R) {
                        int i5 = i4 + iM4525R2;
                        c2230ma.f7802i = i5;
                        int iMo1361j = AbstractC2536tD.f8842a.mo1361j(str, bArr, i5, i3 - i5);
                        c2230ma.f7802i = i4;
                        c2230ma.m4535b0((iMo1361j - i4) - iM4525R2);
                        c2230ma.f7802i = iMo1361j;
                    } else {
                        c2230ma.m4535b0(AbstractC2536tD.m5016b(str));
                        int i6 = c2230ma.f7802i;
                        c2230ma.f7802i = AbstractC2536tD.f8842a.mo1361j(str, bArr, i6, i3 - i6);
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new C2273na(e);
                } catch (C2493sD e2) {
                    c2230ma.f7802i = i4;
                    C2230ma.f7797j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(AbstractC0501Ll.f1637a);
                    try {
                        c2230ma.m4535b0(bytes.length);
                        c2230ma.m4528U(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new C2273na(e3);
                    }
                }
            }
            return;
        }
        InterfaceC0374In interfaceC0374In = (InterfaceC0374In) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object objMo718m = interfaceC0374In.mo718m(i7);
            if (objMo718m instanceof String) {
                String str2 = (String) objMo718m;
                c2230ma.m4534a0(i, 2);
                int i8 = c2230ma.f7801h;
                byte[] bArr2 = c2230ma.f7800g;
                int i9 = c2230ma.f7802i;
                try {
                    int iM4525R3 = C2230ma.m4525R(str2.length() * 3);
                    int iM4525R4 = C2230ma.m4525R(str2.length());
                    if (iM4525R4 == iM4525R3) {
                        int i10 = i9 + iM4525R4;
                        c2230ma.f7802i = i10;
                        int iMo1361j2 = AbstractC2536tD.f8842a.mo1361j(str2, bArr2, i10, i8 - i10);
                        c2230ma.f7802i = i9;
                        c2230ma.m4535b0((iMo1361j2 - i9) - iM4525R4);
                        c2230ma.f7802i = iMo1361j2;
                    } else {
                        c2230ma.m4535b0(AbstractC2536tD.m5016b(str2));
                        int i11 = c2230ma.f7802i;
                        c2230ma.f7802i = AbstractC2536tD.f8842a.mo1361j(str2, bArr2, i11, i8 - i11);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new C2273na(e4);
                } catch (C2493sD e5) {
                    c2230ma.f7802i = i9;
                    C2230ma.f7797j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(AbstractC0501Ll.f1637a);
                    try {
                        c2230ma.m4535b0(bytes2.length);
                        c2230ma.m4528U(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new C2273na(e6);
                    }
                }
            } else {
                AbstractC2744y6 abstractC2744y6 = (AbstractC2744y6) objMo718m;
                c2230ma.m4534a0(i, 2);
                c2230ma.m4535b0(abstractC2744y6.size());
                C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
                c2230ma.m4528U(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size());
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m4645O(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c2230ma.m4534a0(i, 0);
                c2230ma.m4535b0(iIntValue);
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4525R = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4525R += C2230ma.m4525R(((Integer) list.get(i3)).intValue());
        }
        c2230ma.m4535b0(iM4525R);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c2230ma.m4535b0(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m4646P(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2230ma.m4536c0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int iM4526S = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4526S += C2230ma.m4526S(((Long) list.get(i3)).longValue());
        }
        c2230ma.m4535b0(iM4526S);
        while (i2 < list.size()) {
            c2230ma.m4537d0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4647a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4524Q = C2230ma.m4524Q(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM4524Q += C2230ma.m4518K((AbstractC2744y6) list.get(i2));
        }
        return iM4524Q;
    }

    /* JADX INFO: renamed from: b */
    public static int m4648b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4649c(list);
    }

    /* JADX INFO: renamed from: c */
    public static int m4649c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071Bl) {
            AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0071Bl.m120c(0);
            throw null;
        }
        int iM4522O = 0;
        for (int i = 0; i < size; i++) {
            iM4522O += C2230ma.m4522O(((Integer) list.get(i)).intValue());
        }
        return iM4522O;
    }

    /* JADX INFO: renamed from: d */
    public static int m4650d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C2230ma.m4519L(i) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m4651e(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m4652f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C2230ma.m4520M(i) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m4653g(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m4654h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4655i(list);
    }

    /* JADX INFO: renamed from: i */
    public static int m4655i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071Bl) {
            AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0071Bl.m120c(0);
            throw null;
        }
        int iM4522O = 0;
        for (int i = 0; i < size; i++) {
            iM4522O += C2230ma.m4522O(((Integer) list.get(i)).intValue());
        }
        return iM4522O;
    }

    /* JADX INFO: renamed from: j */
    public static int m4656j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * list.size()) + m4657k(list);
    }

    /* JADX INFO: renamed from: k */
    public static int m4657k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2382pp) {
            AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
            if (size <= 0) {
                return 0;
            }
            abstractC2382pp.m4822c(0);
            throw null;
        }
        int iM4526S = 0;
        for (int i = 0; i < size; i++) {
            iM4526S += C2230ma.m4526S(((Long) list.get(i)).longValue());
        }
        return iM4526S;
    }

    /* JADX INFO: renamed from: l */
    public static int m4658l(int i, List list, InterfaceC2253mx interfaceC2253mx) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4524Q = C2230ma.m4524Q(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo63b = ((AbstractC0043B) list.get(i2)).mo63b(interfaceC2253mx);
            iM4524Q += C2230ma.m4525R(iMo63b) + iMo63b;
        }
        return iM4524Q;
    }

    /* JADX INFO: renamed from: m */
    public static int m4659m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4660n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m4660n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071Bl) {
            AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0071Bl.m120c(0);
            throw null;
        }
        int iM4525R = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM4525R += C2230ma.m4525R((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM4525R;
    }

    /* JADX INFO: renamed from: o */
    public static int m4661o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4662p(list);
    }

    /* JADX INFO: renamed from: p */
    public static int m4662p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2382pp) {
            AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
            if (size <= 0) {
                return 0;
            }
            abstractC2382pp.m4822c(0);
            throw null;
        }
        int iM4526S = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM4526S += C2230ma.m4526S((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM4526S;
    }

    /* JADX INFO: renamed from: q */
    public static int m4663q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM4524Q = C2230ma.m4524Q(i) * size;
        if (!(list instanceof InterfaceC0374In)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC2744y6) {
                    int size2 = ((AbstractC2744y6) obj).size();
                    iM4524Q = C2230ma.m4525R(size2) + size2 + iM4524Q;
                } else {
                    iM4524Q = C2230ma.m4523P((String) obj) + iM4524Q;
                }
                i2++;
            }
            return iM4524Q;
        }
        InterfaceC0374In interfaceC0374In = (InterfaceC0374In) list;
        while (i2 < size) {
            Object objMo718m = interfaceC0374In.mo718m(i2);
            if (objMo718m instanceof AbstractC2744y6) {
                int size3 = ((AbstractC2744y6) objMo718m).size();
                iM4524Q = C2230ma.m4525R(size3) + size3 + iM4524Q;
            } else {
                iM4524Q = C2230ma.m4523P((String) objMo718m) + iM4524Q;
            }
            i2++;
        }
        return iM4524Q;
    }

    /* JADX INFO: renamed from: r */
    public static int m4664r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4665s(list);
    }

    /* JADX INFO: renamed from: s */
    public static int m4665s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071Bl) {
            AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0071Bl.m120c(0);
            throw null;
        }
        int iM4525R = 0;
        for (int i = 0; i < size; i++) {
            iM4525R += C2230ma.m4525R(((Integer) list.get(i)).intValue());
        }
        return iM4525R;
    }

    /* JADX INFO: renamed from: t */
    public static int m4666t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2230ma.m4524Q(i) * size) + m4667u(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m4667u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC2382pp) {
            AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
            if (size <= 0) {
                return 0;
            }
            abstractC2382pp.m4822c(0);
            throw null;
        }
        int iM4526S = 0;
        for (int i = 0; i < size; i++) {
            iM4526S += C2230ma.m4526S(((Long) list.get(i)).longValue());
        }
        return iM4526S;
    }

    /* JADX INFO: renamed from: v */
    public static C1044YC m4668v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (C1044YC) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public static void m4669w(C1044YC c1044yc, Object obj, Object obj2) {
        c1044yc.getClass();
        AbstractC2634vj abstractC2634vj = (AbstractC2634vj) obj;
        C1001XC c1001xc = abstractC2634vj.unknownFields;
        C1001XC c1001xc2 = ((AbstractC2634vj) obj2).unknownFields;
        C1001XC c1001xc3 = C1001XC.f3195f;
        if (!c1001xc3.equals(c1001xc2)) {
            if (c1001xc3.equals(c1001xc)) {
                int i = c1001xc.f3196a + c1001xc2.f3196a;
                int[] iArrCopyOf = Arrays.copyOf(c1001xc.f3197b, i);
                System.arraycopy(c1001xc2.f3197b, 0, iArrCopyOf, c1001xc.f3196a, c1001xc2.f3196a);
                Object[] objArrCopyOf = Arrays.copyOf(c1001xc.f3198c, i);
                System.arraycopy(c1001xc2.f3198c, 0, objArrCopyOf, c1001xc.f3196a, c1001xc2.f3196a);
                c1001xc = new C1001XC(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1001xc.getClass();
                if (!c1001xc2.equals(c1001xc3)) {
                    if (!c1001xc.f3200e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c1001xc.f3196a + c1001xc2.f3196a;
                    c1001xc.m1892a(i2);
                    System.arraycopy(c1001xc2.f3197b, 0, c1001xc.f3197b, c1001xc.f3196a, c1001xc2.f3196a);
                    System.arraycopy(c1001xc2.f3198c, 0, c1001xc.f3198c, c1001xc.f3196a, c1001xc2.f3196a);
                    c1001xc.f3196a = i2;
                }
            }
        }
        abstractC2634vj.unknownFields = c1001xc;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4670x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static void m4671y(int i, List list, C0132D2 c0132d2, boolean z) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c2230ma.m4534a0(i, 0);
                c2230ma.m4527T(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c2230ma.m4534a0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C2230ma.f7797j;
            i3++;
        }
        c2230ma.m4535b0(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c2230ma.m4527T(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m4672z(int i, List list, C0132D2 c0132d2) throws C2273na {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0132d2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C2230ma c2230ma = (C2230ma) c0132d2.f328b;
            AbstractC2744y6 abstractC2744y6 = (AbstractC2744y6) list.get(i2);
            c2230ma.m4534a0(i, 2);
            c2230ma.m4535b0(abstractC2744y6.size());
            C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
            c2230ma.m4528U(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size());
        }
    }
}
