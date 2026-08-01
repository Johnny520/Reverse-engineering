package p185m8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p080f9.C2363j;
import p211o8.AbstractC5661b;
import p299ub.C8613b0;

/* JADX INFO: renamed from: m8.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5114x extends AbstractC5112w {
    /* JADX INFO: renamed from: h */
    public static ArrayList m20793h(Object... objArr) {
        objArr.getClass();
        return objArr.length == 0 ? new ArrayList() : new ArrayList(m20794i(objArr, true));
    }

    /* JADX INFO: renamed from: i */
    public static final Collection m20794i(Object[] objArr, boolean z10) {
        objArr.getClass();
        return new C5094n(objArr, z10);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Collection m20795j(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m20794i(objArr, z10);
    }

    /* JADX INFO: renamed from: k */
    public static final int m20796k(List list, int i10, int i11, InterfaceC0184l interfaceC0184l) {
        list.getClass();
        interfaceC0184l.getClass();
        m20808w(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) interfaceC0184l.mo27m(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: l */
    public static final int m20797l(List list, Comparable comparable, int i10, int i11) {
        list.getClass();
        m20808w(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iM22869d = AbstractC5661b.m22869d((Comparable) list.get(i13), comparable);
            if (iM22869d < 0) {
                i10 = i13 + 1;
            } else {
                if (iM22869d <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m20798m(List list, int i10, int i11, InterfaceC0184l interfaceC0184l, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return m20796k(list, i10, i11, interfaceC0184l);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m20799n(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m20797l(list, comparable, i10, i11);
    }

    /* JADX INFO: renamed from: o */
    public static List m20800o() {
        return C5087j0.f15399q;
    }

    /* JADX INFO: renamed from: p */
    public static C2363j m20801p(Collection collection) {
        collection.getClass();
        return new C2363j(0, collection.size() - 1);
    }

    /* JADX INFO: renamed from: q */
    public static int m20802q(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: r */
    public static List m20803r(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? AbstractC5102r.m20652d(objArr) : m20800o();
    }

    /* JADX INFO: renamed from: s */
    public static List m20804s(Object obj) {
        return obj != null ? AbstractC5112w.m20789e(obj) : m20800o();
    }

    /* JADX INFO: renamed from: t */
    public static List m20805t(Object... objArr) {
        objArr.getClass();
        return AbstractC5106t.m20710U(objArr);
    }

    /* JADX INFO: renamed from: u */
    public static List m20806u(Object... objArr) {
        objArr.getClass();
        return objArr.length == 0 ? new ArrayList() : new ArrayList(m20794i(objArr, true));
    }

    /* JADX INFO: renamed from: v */
    public static final List m20807v(List list) {
        list.getClass();
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC5112w.m20789e(list.get(0)) : m20800o();
    }

    /* JADX INFO: renamed from: w */
    public static final void m20808w(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 >= 0) {
            if (i12 <= i10) {
                return;
            }
            C8613b0.m33082a("toIndex (", i12, ") is greater than size (", i10);
        } else {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m20809x() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: y */
    public static void m20810y() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
