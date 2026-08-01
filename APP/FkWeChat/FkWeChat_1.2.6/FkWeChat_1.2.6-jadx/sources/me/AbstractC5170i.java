package me;

import be.C1116d;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5162a;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p038ce.C1520b;
import p038ce.InterfaceC1519a;
import p172l8.C4711r;
import p175le.C4752a;
import p175le.C4755d;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5081g0;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: me.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5170i {

    /* JADX INFO: renamed from: a */
    public final C1520b f15789a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5162a f15790b;

    /* JADX INFO: renamed from: me.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1519a f15791a;

        /* JADX INFO: renamed from: b */
        public final int f15792b;

        /* JADX INFO: renamed from: c */
        public final int f15793c;

        public a(InterfaceC1519a interfaceC1519a, int i10, int i11) {
            interfaceC1519a.getClass();
            this.f15791a = interfaceC1519a;
            this.f15792b = i10;
            this.f15793c = i11;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC1519a m21232a() {
            return this.f15791a;
        }

        /* JADX INFO: renamed from: b */
        public final int m21233b() {
            return this.f15793c;
        }

        /* JADX INFO: renamed from: c */
        public final int m21234c() {
            return this.f15792b;
        }
    }

    /* JADX INFO: renamed from: me.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements Comparable {

        /* JADX INFO: renamed from: q */
        public final int f15794q;

        /* JADX INFO: renamed from: r */
        public final int f15795r;

        /* JADX INFO: renamed from: s */
        public final InterfaceC6627f.a f15796s;

        public b(int i10, int i11, InterfaceC6627f.a aVar) {
            aVar.getClass();
            this.f15794q = i10;
            this.f15795r = i11;
            this.f15796s = aVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            bVar.getClass();
            int i10 = this.f15794q;
            int i11 = bVar.f15794q;
            if (i10 != i11) {
                return i10 - i11;
            }
            if (m21239i() != bVar.m21239i()) {
                return m21239i() ? 1 : -1;
            }
            int iM8560o = (this.f15796s.m26255a().m8560o() + this.f15796s.m26255a().m8561p()) - (bVar.f15796s.m26255a().m8560o() + bVar.f15796s.m26255a().m8561p());
            if (iM8560o != 0) {
                return (m21238h() || bVar.m21238h()) ? iM8560o : -iM8560o;
            }
            int i12 = this.f15795r - bVar.f15795r;
            return m21239i() ? -i12 : i12;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC6627f.a m21236c() {
            return this.f15796s;
        }

        /* JADX INFO: renamed from: g */
        public final int m21237g() {
            return this.f15794q;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m21238h() {
            return this.f15796s.m26255a().m8560o() == this.f15796s.m26255a().m8561p();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m21239i() {
            return this.f15796s.m26255a().m8561p() != this.f15794q;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m21239i() ? "Open" : "Close");
            sb2.append(": ");
            sb2.append(this.f15794q);
            sb2.append(" (");
            sb2.append(this.f15796s);
            sb2.append(')');
            return sb2.toString();
        }
    }

    public AbstractC5170i(C1520b c1520b, InterfaceC5162a interfaceC5162a) {
        c1520b.getClass();
        interfaceC5162a.getClass();
        this.f15789a = c1520b;
        this.f15790b = interfaceC5162a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1519a m21229a(List list) {
        List arrayList;
        list.getClass();
        List listM21230b = m21230b(list);
        C4755d c4755d = new C4755d();
        C4752a c4752a = C4752a.f14072a;
        if (listM21230b.isEmpty()) {
            throw new C1116d("nonsense");
        }
        if (!AbstractC1061t.m3842c(((b) AbstractC5081g0.m20576j0(listM21230b)).m21236c(), ((b) AbstractC5081g0.m20587u0(listM21230b)).m21236c())) {
            StringBuilder sb2 = new StringBuilder("more than one root?\nfirst: ");
            sb2.append(((b) AbstractC5081g0.m20576j0(listM21230b)).m21236c());
            InterfaceC6627f.a aVarM21236c = ((b) AbstractC5081g0.m20587u0(listM21230b)).m21236c();
            sb2.append("\nlast: ");
            sb2.append(aVarM21236c);
            throw new C1116d(sb2.toString());
        }
        int size = listM21230b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15790b.mo21175a();
            b bVar = (b) listM21230b.get(i10);
            mo21177d(bVar, c4755d.isEmpty() ? null : (List) ((C4711r) c4755d.peek()).m18796f());
            if (bVar.m21239i()) {
                c4755d.push(new C4711r(bVar, new ArrayList()));
            } else {
                if (bVar.m21238h()) {
                    arrayList = new ArrayList();
                } else {
                    C4711r c4711r = (C4711r) c4755d.pop();
                    C4752a c4752a2 = C4752a.f14072a;
                    if (!AbstractC1061t.m3842c(((b) c4711r.m18795e()).m21236c(), bVar.m21236c())) {
                        StringBuilder sb3 = new StringBuilder("Intersecting parsed nodes detected: ");
                        sb3.append(((b) c4711r.m18795e()).m21236c());
                        InterfaceC6627f.a aVarM21236c2 = bVar.m21236c();
                        sb3.append(" vs ");
                        sb3.append(aVarM21236c2);
                        throw new C1116d(sb3.toString());
                    }
                    arrayList = (List) c4711r.m18796f();
                }
                boolean zIsEmpty = c4755d.isEmpty();
                a aVarMo21176c = mo21176c(bVar, arrayList, zIsEmpty);
                if (zIsEmpty) {
                    C4752a c4752a3 = C4752a.f14072a;
                    if (i10 + 1 == listM21230b.size()) {
                        return aVarMo21176c.m21232a();
                    }
                    throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
                }
                ((List) ((C4711r) c4755d.peek()).m18796f()).add(aVarMo21176c);
            }
        }
        throw new AssertionError("markers stack should close some time thus would not be here!");
    }

    /* JADX INFO: renamed from: b */
    public final List m21230b(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15790b.mo21175a();
            InterfaceC6627f.a aVar = (InterfaceC6627f.a) list.get(i10);
            int iM8560o = aVar.m26255a().m8560o();
            int iM8561p = aVar.m26255a().m8561p();
            arrayList.add(new b(iM8560o, i10, aVar));
            if (iM8561p != iM8560o) {
                arrayList.add(new b(iM8561p, i10, aVar));
            }
        }
        AbstractC5067b0.m20481C(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public abstract a mo21176c(b bVar, List list, boolean z10);

    /* JADX INFO: renamed from: d */
    public abstract void mo21177d(b bVar, List list);

    /* JADX INFO: renamed from: e */
    public final C1520b m21231e() {
        return this.f15789a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5170i(C1520b c1520b) {
        this(c1520b, InterfaceC5162a.a.f15759a);
        c1520b.getClass();
    }
}
