package p319w2;

import java.util.List;
import p010a9.InterfaceC0184l;
import p030c3.AbstractC1314a;
import p152k3.AbstractC3949c;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: w2.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9133t {
    /* JADX INFO: renamed from: b */
    public static final int m35415b(List list, int i10) {
        int i11;
        int iM35580b = ((C9148w) AbstractC5081g0.m20587u0(list)).m35580b();
        boolean z10 = false;
        if (!(i10 <= ((C9148w) AbstractC5081g0.m20587u0(list)).m35580b())) {
            AbstractC1314a.m5291a("Index " + i10 + " should be less or equal than last line's end " + iM35580b);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i11 = -(i12 + 1);
                break;
            }
            i11 = (i12 + size) >>> 1;
            C9148w c9148w = (C9148w) list.get(i11);
            byte b10 = c9148w.m35584f() > i10 ? (byte) 1 : c9148w.m35580b() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i12 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z10 = true;
        }
        if (!z10) {
            AbstractC1314a.m5291a("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + AbstractC3949c.m15656d(list, null, null, null, 0, null, new InterfaceC0184l() { // from class: w2.s
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC9133t.m35416c((C9148w) obj);
                }
            }, 31, null) + ']');
        }
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m35416c(C9148w c9148w) {
        return "[" + c9148w.m35584f() + ", " + c9148w.m35580b() + ')';
    }

    /* JADX INFO: renamed from: d */
    public static final int m35417d(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C9148w c9148w = (C9148w) list.get(i12);
            byte b10 = c9148w.m35585g() > i10 ? (byte) 1 : c9148w.m35581c() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m35418e(List list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C9148w) AbstractC5081g0.m20587u0(list)).m35579a()) {
            return AbstractC5114x.m20802q(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C9148w c9148w = (C9148w) list.get(i11);
            byte b10 = c9148w.m35586h() > f10 ? (byte) 1 : c9148w.m35579a() <= f10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m35419f(List list, long j10, InterfaceC0184l interfaceC0184l) {
        int size = list.size();
        for (int iM35415b = m35415b(list, C9137t3.m35521l(j10)); iM35415b < size; iM35415b++) {
            C9148w c9148w = (C9148w) list.get(iM35415b);
            if (c9148w.m35584f() >= C9137t3.m35520k(j10)) {
                return;
            }
            if (c9148w.m35584f() != c9148w.m35580b()) {
                interfaceC0184l.mo27m(c9148w);
            }
        }
    }
}
