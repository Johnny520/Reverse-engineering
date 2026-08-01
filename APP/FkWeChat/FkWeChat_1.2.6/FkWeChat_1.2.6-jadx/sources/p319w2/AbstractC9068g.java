package p319w2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p030c3.AbstractC1314a;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.C5096o;
import p211o8.AbstractC5661b;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9068g {

    /* JADX INFO: renamed from: a */
    public static final C9058e f31111a = new C9058e(_UrlKt.FRAGMENT_ENCODE_SET, null, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: w2.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(Integer.valueOf(((C9058e.d) obj).m35193h()), Integer.valueOf(((C9058e.d) obj2).m35193h()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m35257a(C9058e.a aVar) {
        return !(aVar instanceof C9044b0);
    }

    /* JADX INFO: renamed from: e */
    public static final List m35261e(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((C9058e.d) list.get(i10));
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add((C9058e.d) list2.get(i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static final C9058e m35262f() {
        return f31111a;
    }

    /* JADX INFO: renamed from: g */
    public static final List m35263g(List list, int i10, int i11) {
        if (!(i10 <= i11)) {
            AbstractC1314a.m5291a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C9058e.d dVar = (C9058e.d) list.get(i12);
            if (m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                arrayList.add(new C9058e.d(dVar.m35192g(), Math.max(i10, dVar.m35193h()) - i10, Math.min(i11, dVar.m35191f()) - i10, dVar.m35194i()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final List m35264h(C9058e c9058e, int i10, int i11, InterfaceC0184l interfaceC0184l) {
        List listM35148c;
        if (i10 == i11 || (listM35148c = c9058e.m35148c()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c9058e.m35156k().length()) {
            ArrayList arrayList = new ArrayList(listM35148c.size());
            int size = listM35148c.size();
            for (int i12 = 0; i12 < size; i12++) {
                C9058e.d dVar = (C9058e.d) listM35148c.get(i12);
                if ((interfaceC0184l != null ? ((Boolean) interfaceC0184l.mo27m(dVar.m35192g())).booleanValue() : true) && m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                    arrayList.add(new C9058e.d((C9058e.a) dVar.m35192g(), AbstractC2368o.m8586m(dVar.m35193h(), i10, i11) - i10, AbstractC2368o.m8586m(dVar.m35191f(), i10, i11) - i10, dVar.m35194i()));
                }
            }
            return arrayList;
        }
        if (interfaceC0184l == null) {
            return listM35148c;
        }
        ArrayList arrayList2 = new ArrayList(listM35148c.size());
        int size2 = listM35148c.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = listM35148c.get(i13);
            if (((Boolean) interfaceC0184l.mo27m(((C9058e.d) obj).m35192g())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m35265i(C9058e c9058e, int i10, int i11, InterfaceC0184l interfaceC0184l, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            interfaceC0184l = null;
        }
        return m35264h(c9058e, i10, i11, interfaceC0184l);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m35266j(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }

    /* JADX INFO: renamed from: k */
    public static final List m35267k(C9058e c9058e, C9044b0 c9044b0) {
        List listM20800o;
        List listM35151f = c9058e.m35151f();
        if (listM35151f == null || (listM20800o = AbstractC5081g0.m20542N0(listM35151f, new a())) == null) {
            listM20800o = AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList();
        C5096o c5096o = new C5096o();
        int size = listM20800o.size();
        int iM35191f = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) listM20800o.get(i10);
            C9058e.d dVarM35186e = C9058e.d.m35186e(dVar, c9044b0.m35116l((C9044b0) dVar.m35192g()), 0, 0, null, 14, null);
            while (iM35191f < dVarM35186e.m35193h() && !c5096o.isEmpty()) {
                C9058e.d dVar2 = (C9058e.d) c5096o.last();
                if (dVarM35186e.m35193h() < dVar2.m35191f()) {
                    arrayList.add(new C9058e.d(dVar2.m35192g(), iM35191f, dVarM35186e.m35193h()));
                    iM35191f = dVarM35186e.m35193h();
                } else {
                    arrayList.add(new C9058e.d(dVar2.m35192g(), iM35191f, dVar2.m35191f()));
                    iM35191f = dVar2.m35191f();
                    while (!c5096o.isEmpty() && iM35191f == ((C9058e.d) c5096o.last()).m35191f()) {
                        c5096o.removeLast();
                    }
                }
            }
            if (iM35191f < dVarM35186e.m35193h()) {
                arrayList.add(new C9058e.d(c9044b0, iM35191f, dVarM35186e.m35193h()));
                iM35191f = dVarM35186e.m35193h();
            }
            C9058e.d dVar3 = (C9058e.d) c5096o.m20630s();
            if (dVar3 == null) {
                c5096o.add(new C9058e.d(dVarM35186e.m35192g(), dVarM35186e.m35193h(), dVarM35186e.m35191f()));
            } else if (dVar3.m35193h() == dVarM35186e.m35193h() && dVar3.m35191f() == dVarM35186e.m35191f()) {
                c5096o.removeLast();
                c5096o.add(new C9058e.d(((C9044b0) dVar3.m35192g()).m35116l((C9044b0) dVarM35186e.m35192g()), dVarM35186e.m35193h(), dVarM35186e.m35191f()));
            } else if (dVar3.m35193h() == dVar3.m35191f()) {
                arrayList.add(new C9058e.d(dVar3.m35192g(), dVar3.m35193h(), dVar3.m35191f()));
                c5096o.removeLast();
                c5096o.add(new C9058e.d(dVarM35186e.m35192g(), dVarM35186e.m35193h(), dVarM35186e.m35191f()));
            } else {
                if (dVar3.m35191f() < dVarM35186e.m35191f()) {
                    throw new IllegalArgumentException();
                }
                c5096o.add(new C9058e.d(((C9044b0) dVar3.m35192g()).m35116l((C9044b0) dVarM35186e.m35192g()), dVarM35186e.m35193h(), dVarM35186e.m35191f()));
            }
        }
        while (iM35191f <= c9058e.m35156k().length() && !c5096o.isEmpty()) {
            C9058e.d dVar4 = (C9058e.d) c5096o.last();
            arrayList.add(new C9058e.d(dVar4.m35192g(), iM35191f, dVar4.m35191f()));
            iM35191f = dVar4.m35191f();
            while (!c5096o.isEmpty() && iM35191f == ((C9058e.d) c5096o.last()).m35191f()) {
                c5096o.removeLast();
            }
        }
        if (iM35191f < c9058e.m35156k().length()) {
            arrayList.add(new C9058e.d(c9044b0, iM35191f, c9058e.m35156k().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C9058e.d(c9044b0, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static final C9058e m35268l(C9058e c9058e, int i10, int i11) {
        String strSubstring = i10 != i11 ? c9058e.m35156k().substring(i10, i11) : _UrlKt.FRAGMENT_ENCODE_SET;
        List listM35264h = m35264h(c9058e, i10, i11, new InterfaceC0184l() { // from class: w2.f
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC9068g.m35257a((C9058e.a) obj));
            }
        });
        if (listM35264h == null) {
            listM35264h = AbstractC5114x.m20800o();
        }
        return new C9058e(strSubstring, listM35264h);
    }
}
