package p230r2;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p042H1.AbstractC0636d;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.EnumC2797z;
import p224q2.C2923n;
import p237s4.AbstractC3202a;
import p252v2.C3352a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3141q extends AbstractC2770B {

    /* JADX INFO: renamed from: c */
    public static final C3139o f9885c = new C3139o(1, EnumC2797z.f8820d);

    /* JADX INFO: renamed from: a */
    public final C2785n f9886a;

    /* JADX INFO: renamed from: b */
    public final EnumC2797z f9887b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3141q(C2785n c2785n, EnumC2797z enumC2797z) {
        this.f9886a = c2785n;
        this.f9887b = enumC2797z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        Object arrayList;
        Serializable arrayList2;
        int iM5630J = c3390a.m5630J();
        int iM1088a = AbstractC0636d.m1088a(iM5630J);
        if (iM1088a == 0) {
            c3390a.m5639b();
            arrayList = new ArrayList();
        } else if (iM1088a != 2) {
            arrayList = null;
        } else {
            c3390a.m5640c();
            arrayList = new C2923n(true);
        }
        if (arrayList == null) {
            return m5414d(c3390a, iM5630J);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3390a.m5647n()) {
                String strM5624D = arrayList instanceof Map ? c3390a.m5624D() : null;
                int iM5630J2 = c3390a.m5630J();
                int iM1088a2 = AbstractC0636d.m1088a(iM5630J2);
                if (iM1088a2 == 0) {
                    c3390a.m5639b();
                    arrayList2 = new ArrayList();
                } else if (iM1088a2 != 2) {
                    arrayList2 = null;
                } else {
                    c3390a.m5640c();
                    arrayList2 = new C2923n(true);
                }
                boolean z5 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m5414d(c3390a, iM5630J2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM5624D, arrayList2);
                }
                if (z5) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c3390a.m5643h();
                } else {
                    c3390a.m5644j();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (obj == null) {
            c3391b.m5666n();
            return;
        }
        Class<?> cls = obj.getClass();
        C2785n c2785n = this.f9886a;
        c2785n.getClass();
        AbstractC2770B abstractC2770BM4973b = c2785n.m4973b(new C3352a(cls));
        if (!(abstractC2770BM4973b instanceof C3141q)) {
            abstractC2770BM4973b.mo4965c(c3391b, obj);
        } else {
            c3391b.m5660d();
            c3391b.m5663j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Serializable m5414d(C3390a c3390a, int i5) {
        int iM1088a = AbstractC0636d.m1088a(i5);
        if (iM1088a == 5) {
            return c3390a.m5628H();
        }
        if (iM1088a == 6) {
            return this.f9887b.mo4984a(c3390a);
        }
        if (iM1088a == 7) {
            return Boolean.valueOf(c3390a.m5650w());
        }
        if (iM1088a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC3202a.m5469d(i5)));
        }
        c3390a.m5626F();
        return null;
    }
}
