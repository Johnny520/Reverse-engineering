package p190n0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0537m;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0603u5;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0559p0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4541g;
import p172l8.C4700i0;
import p190n0.AbstractC5416q3;

/* JADX INFO: renamed from: n0.q3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5416q3 {

    /* JADX INFO: renamed from: n0.q3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3555o0 {

        /* JADX INFO: renamed from: a */
        public static final a f16712a = new a();

        /* JADX INFO: renamed from: a */
        public static C4700i0 m22110a(List list, AbstractC3545l1.a aVar) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3545l1.a.m13281x(aVar, (AbstractC3545l1) list.get(i10), 0, 0, 0.0f, 4, null);
            }
            return C4700i0.f13910a;
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: c */
        public final InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iMax = 0;
            int iMax2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3545l1 abstractC3545l1Mo13148X = ((InterfaceC3552n0) list.get(i10)).mo13148X(j10);
                iMax = Math.max(iMax, abstractC3545l1Mo13148X.m13264M0());
                iMax2 = Math.max(iMax2, abstractC3545l1Mo13148X.m13259G0());
                arrayList.add(abstractC3545l1Mo13148X);
            }
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, iMax, iMax2, null, new InterfaceC0184l() { // from class: n0.p3
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC5416q3.a.m22110a(arrayList, (AbstractC3545l1.a) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m22108a(InterfaceC4507m interfaceC4507m, InterfaceC0188p interfaceC0188p, int i10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m22109b(interfaceC4507m, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1), i11);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m22109b(final InterfaceC4507m interfaceC4507m, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10, final int i11) {
        int i12;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-1854833411);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2162U(interfaceC4507m) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2175k(interfaceC0188p) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                interfaceC4507m = InterfaceC4507m.f13080a;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1854833411, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
            }
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = a.f16712a;
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            InterfaceC3555o0 interfaceC3555o0 = (InterfaceC3555o0) objMo2170f;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & Opcodes.IREM);
            int iHashCode = Long.hashCode(AbstractC0537m.m1915b(interfaceC0572rMo2181q, 0));
            InterfaceC0559p0 interfaceC0559p0Mo2147F = interfaceC0572rMo2181q.mo2147F();
            InterfaceC4507m interfaceC4507mM17439e = AbstractC4505k.m17439e(interfaceC0572rMo2181q, interfaceC4507m);
            InterfaceC4541g.a aVar = InterfaceC4541g.f13305j;
            InterfaceC0173a interfaceC0173aM17772b = aVar.m17772b();
            int i15 = ((i14 << 6) & 896) | 6;
            if (interfaceC0572rMo2181q.mo2186v() == null) {
                AbstractC0537m.m1917d();
            }
            interfaceC0572rMo2181q.mo2183s();
            if (interfaceC0572rMo2181q.mo2177m()) {
                interfaceC0572rMo2181q.mo2160S(interfaceC0173aM17772b);
            } else {
                interfaceC0572rMo2181q.mo2149H();
            }
            InterfaceC0572r interfaceC0572rM2231b = AbstractC0603u5.m2231b(interfaceC0572rMo2181q);
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC3555o0, aVar.m17774d());
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC0559p0Mo2147F, aVar.m17776f());
            InterfaceC0188p interfaceC0188pM17773c = aVar.m17773c();
            if (interfaceC0572rM2231b.mo2177m() || !AbstractC1061t.m3842c(interfaceC0572rM2231b.mo2170f(), Integer.valueOf(iHashCode))) {
                interfaceC0572rM2231b.mo2153L(Integer.valueOf(iHashCode));
                interfaceC0572rM2231b.mo2151J(Integer.valueOf(iHashCode), interfaceC0188pM17773c);
            }
            AbstractC0603u5.m2234e(interfaceC0572rM2231b, interfaceC4507mM17439e, aVar.m17775e());
            interfaceC0188p.invoke(interfaceC0572rMo2181q, Integer.valueOf((i15 >> 6) & 14));
            interfaceC0572rMo2181q.mo2159R();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: n0.o3
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5416q3.m22108a(interfaceC4507m, interfaceC0188p, i10, i11, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
