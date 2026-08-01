package na;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import la.AbstractC4722b;
import la.AbstractC4726f;
import la.AbstractC4727g;
import la.C4728h;
import la.InterfaceC4724d;
import ma.AbstractC5140a;
import na.AbstractC5529d;
import okhttp3.internal.url._UrlKt;
import p143ja.C3770c;
import p143ja.C3772e;
import p143ja.C3777j;
import p143ja.C3780m;
import p143ja.C3782o;
import p143ja.C3785r;
import p143ja.C3789v;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import qa.AbstractC6353j;
import qa.C6351h;

/* JADX INFO: renamed from: na.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5533h {

    /* JADX INFO: renamed from: a */
    public static final C5533h f17305a = new C5533h();

    /* JADX INFO: renamed from: b */
    public static final C6351h f17306b;

    static {
        C6351h c6351hM25182d = C6351h.m25182d();
        AbstractC5140a.m20985a(c6351hM25182d);
        c6351hM25182d.getClass();
        f17306b = c6351hM25182d;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC5529d.a m22543d(C5533h c5533h, C3782o c3782o, InterfaceC4724d interfaceC4724d, C4728h c4728h, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return c5533h.m22552c(c3782o, interfaceC4724d, c4728h, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m22544f(C3782o c3782o) {
        c3782o.getClass();
        AbstractC4722b.b bVarM22532a = C5528c.f17288a.m22532a();
        Object objM25234u = c3782o.m25234u(AbstractC5140a.f15653e);
        objM25234u.getClass();
        Boolean boolMo18852d = bVarM22532a.mo18852d(((Number) objM25234u).intValue());
        boolMo18852d.getClass();
        return boolMo18852d.booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static final C4711r m22545h(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C4711r(f17305a.m22555k(byteArrayInputStream, strArr), C3770c.m14106A1(byteArrayInputStream, f17306b));
    }

    /* JADX INFO: renamed from: i */
    public static final C4711r m22546i(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] bArrM22528e = AbstractC5526a.m22528e(strArr);
        bArrM22528e.getClass();
        return m22545h(bArrM22528e, strArr2);
    }

    /* JADX INFO: renamed from: j */
    public static final C4711r m22547j(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC5526a.m22528e(strArr));
        return new C4711r(f17305a.m22555k(byteArrayInputStream, strArr2), C3777j.m14452I0(byteArrayInputStream, f17306b));
    }

    /* JADX INFO: renamed from: l */
    public static final C4711r m22548l(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C4711r(f17305a.m22555k(byteArrayInputStream, strArr), C3780m.m14544d0(byteArrayInputStream, f17306b));
    }

    /* JADX INFO: renamed from: m */
    public static final C4711r m22549m(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] bArrM22528e = AbstractC5526a.m22528e(strArr);
        bArrM22528e.getClass();
        return m22548l(bArrM22528e, strArr2);
    }

    /* JADX INFO: renamed from: a */
    public final C6351h m22550a() {
        return f17306b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5529d.b m22551b(C3772e c3772e, InterfaceC4724d interfaceC4724d, C4728h c4728h) {
        String strM20585s0;
        c3772e.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        AbstractC6353j.f fVar = AbstractC5140a.f15649a;
        fVar.getClass();
        AbstractC5140a.c cVar = (AbstractC5140a.c) AbstractC4726f.m18872a(c3772e, fVar);
        String string = (cVar == null || !cVar.m21024z()) ? "<init>" : interfaceC4724d.getString(cVar.m21022x());
        if (cVar == null || !cVar.m21023y()) {
            List<C3789v> listM14292Q = c3772e.m14292Q();
            listM14292Q.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM14292Q, 10));
            for (C3789v c3789v : listM14292Q) {
                C5533h c5533h = f17305a;
                c3789v.getClass();
                String strM22554g = c5533h.m22554g(AbstractC4727g.m18890q(c3789v, c4728h), interfaceC4724d);
                if (strM22554g == null) {
                    return null;
                }
                arrayList.add(strM22554g);
            }
            strM20585s0 = AbstractC5081g0.m20585s0(arrayList, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")V", 0, null, null, 56, null);
        } else {
            strM20585s0 = interfaceC4724d.getString(cVar.m21021w());
        }
        return new AbstractC5529d.b(string, strM20585s0);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5529d.a m22552c(C3782o c3782o, InterfaceC4724d interfaceC4724d, C4728h c4728h, boolean z10) {
        String strM22554g;
        c3782o.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        AbstractC6353j.f fVar = AbstractC5140a.f15652d;
        fVar.getClass();
        AbstractC5140a.d dVar = (AbstractC5140a.d) AbstractC4726f.m18872a(c3782o, fVar);
        if (dVar == null) {
            return null;
        }
        AbstractC5140a.b bVarM21047A = dVar.m21052F() ? dVar.m21047A() : null;
        if (bVarM21047A == null && z10) {
            return null;
        }
        int iM14651g0 = (bVarM21047A == null || !bVarM21047A.m20999z()) ? c3782o.m14651g0() : bVarM21047A.m20997x();
        if (bVarM21047A == null || !bVarM21047A.m20998y()) {
            strM22554g = m22554g(AbstractC4727g.m18887n(c3782o, c4728h), interfaceC4724d);
            if (strM22554g == null) {
                return null;
            }
        } else {
            strM22554g = interfaceC4724d.getString(bVarM21047A.m20996w());
        }
        return new AbstractC5529d.a(interfaceC4724d.getString(iM14651g0), strM22554g);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC5529d.b m22553e(C3777j c3777j, InterfaceC4724d interfaceC4724d, C4728h c4728h) {
        String string;
        c3777j.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        AbstractC6353j.f fVar = AbstractC5140a.f15650b;
        fVar.getClass();
        AbstractC5140a.c cVar = (AbstractC5140a.c) AbstractC4726f.m18872a(c3777j, fVar);
        int iM14483h0 = (cVar == null || !cVar.m21024z()) ? c3777j.m14483h0() : cVar.m21022x();
        if (cVar == null || !cVar.m21023y()) {
            List listM20804s = AbstractC5114x.m20804s(AbstractC4727g.m18884k(c3777j, c4728h));
            List<C3789v> listM14495t0 = c3777j.m14495t0();
            listM14495t0.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM14495t0, 10));
            for (C3789v c3789v : listM14495t0) {
                c3789v.getClass();
                arrayList.add(AbstractC4727g.m18890q(c3789v, c4728h));
            }
            List listM20533E0 = AbstractC5081g0.m20533E0(listM20804s, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listM20533E0, 10));
            Iterator it = listM20533E0.iterator();
            while (it.hasNext()) {
                String strM22554g = f17305a.m22554g((C3785r) it.next(), interfaceC4724d);
                if (strM22554g == null) {
                    return null;
                }
                arrayList2.add(strM22554g);
            }
            String strM22554g2 = m22554g(AbstractC4727g.m18886m(c3777j, c4728h), interfaceC4724d);
            if (strM22554g2 == null) {
                return null;
            }
            string = AbstractC5081g0.m20585s0(arrayList2, _UrlKt.FRAGMENT_ENCODE_SET, "(", ")", 0, null, null, 56, null) + strM22554g2;
        } else {
            string = interfaceC4724d.getString(cVar.m21021w());
        }
        return new AbstractC5529d.b(interfaceC4724d.getString(iM14483h0), string);
    }

    /* JADX INFO: renamed from: g */
    public final String m22554g(C3785r c3785r, InterfaceC4724d interfaceC4724d) {
        if (c3785r.m14809l0()) {
            return C5527b.m22531b(interfaceC4724d.mo18869a(c3785r.m14795W()));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C5530e m22555k(InputStream inputStream, String[] strArr) {
        AbstractC5140a.e eVarM21075D = AbstractC5140a.e.m21075D(inputStream, f17306b);
        eVarM21075D.getClass();
        return new C5530e(eVarM21075D, strArr);
    }
}
