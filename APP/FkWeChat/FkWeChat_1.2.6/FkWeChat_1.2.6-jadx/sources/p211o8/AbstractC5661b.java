package p211o8;

import java.util.Comparator;
import p010a9.InterfaceC0184l;
import p376zd.C9987e;

/* JADX INFO: renamed from: o8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5661b {
    /* JADX INFO: renamed from: b */
    public static Comparator m22867b(final InterfaceC0184l... interfaceC0184lArr) {
        interfaceC0184lArr.getClass();
        if (interfaceC0184lArr.length > 0) {
            return new Comparator() { // from class: o8.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC5661b.m22868c(interfaceC0184lArr, obj, obj2);
                }
            };
        }
        C9987e.m38645a("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final int m22868c(InterfaceC0184l[] interfaceC0184lArr, Object obj, Object obj2) {
        return m22870e(obj, obj2, interfaceC0184lArr);
    }

    /* JADX INFO: renamed from: d */
    public static int m22869d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: e */
    public static final int m22870e(Object obj, Object obj2, InterfaceC0184l[] interfaceC0184lArr) {
        for (InterfaceC0184l interfaceC0184l : interfaceC0184lArr) {
            int iM22869d = m22869d((Comparable) interfaceC0184l.mo27m(obj), (Comparable) interfaceC0184l.mo27m(obj2));
            if (iM22869d != 0) {
                return iM22869d;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static Comparator m22871f() {
        C5663d c5663d = C5663d.f17790a;
        c5663d.getClass();
        return c5663d;
    }
}
