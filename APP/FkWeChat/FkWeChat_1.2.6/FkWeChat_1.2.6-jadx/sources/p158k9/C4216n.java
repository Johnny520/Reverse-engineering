package p158k9;

import gb.AbstractC2659e2;
import gb.AbstractC2706r0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p080f9.C2363j;
import p142j9.AbstractC3672e1;
import p142j9.AbstractC3714m3;
import p158k9.AbstractC4211i;
import p158k9.InterfaceC4210h;
import p172l8.C4711r;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6047v0;
import p229p9.InterfaceC6056z;
import p242q8.AbstractC6325c;
import p299ub.AbstractC8621f0;
import p313v9.AbstractC8865f;
import sa.AbstractC7261k;

/* JADX INFO: renamed from: k9.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4216n implements InterfaceC4210h {

    /* JADX INFO: renamed from: a */
    public final boolean f12381a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4210h f12382b;

    /* JADX INFO: renamed from: c */
    public final Member f12383c;

    /* JADX INFO: renamed from: d */
    public final a f12384d;

    /* JADX INFO: renamed from: e */
    public final C2363j[] f12385e;

    /* JADX INFO: renamed from: f */
    public final boolean f12386f;

    /* JADX INFO: renamed from: k9.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C2363j f12387a;

        /* JADX INFO: renamed from: b */
        public final List[] f12388b;

        /* JADX INFO: renamed from: c */
        public final Method f12389c;

        public a(C2363j c2363j, List[] listArr, Method method) {
            c2363j.getClass();
            listArr.getClass();
            this.f12387a = c2363j;
            this.f12388b = listArr;
            this.f12389c = method;
        }

        /* JADX INFO: renamed from: a */
        public final C2363j m16681a() {
            return this.f12387a;
        }

        /* JADX INFO: renamed from: b */
        public final Method m16682b() {
            return this.f12389c;
        }

        /* JADX INFO: renamed from: c */
        public final List[] m16683c() {
            return this.f12388b;
        }
    }

    /* JADX INFO: renamed from: k9.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC4210h {

        /* JADX INFO: renamed from: a */
        public final Method f12390a;

        /* JADX INFO: renamed from: b */
        public final Method f12391b;

        /* JADX INFO: renamed from: c */
        public final List f12392c;

        /* JADX INFO: renamed from: d */
        public final List f12393d;

        /* JADX INFO: renamed from: e */
        public final List f12394e;

        public b(InterfaceC6056z interfaceC6056z, AbstractC3672e1 abstractC3672e1, String str, List list) {
            Collection collectionM20789e;
            interfaceC6056z.getClass();
            abstractC3672e1.getClass();
            str.getClass();
            list.getClass();
            Method methodM13686o = abstractC3672e1.m13686o("constructor-impl", str);
            methodM13686o.getClass();
            this.f12390a = methodM13686o;
            Method methodM13686o2 = abstractC3672e1.m13686o("box-impl", AbstractC8621f0.m33103J0(str, "V") + AbstractC8865f.m34030f(abstractC3672e1.mo3775b()));
            methodM13686o2.getClass();
            this.f12391b = methodM13686o2;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC2706r0 type = ((InterfaceC6047v0) it.next()).getType();
                type.getClass();
                arrayList.add(AbstractC4217o.m16701p(AbstractC2659e2.m9366a(type), interfaceC6056z));
            }
            this.f12392c = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC5114x.m20810y();
                }
                InterfaceC6004h interfaceC6004hMo5602u = ((InterfaceC6047v0) obj).getType().mo9332T0().mo5602u();
                interfaceC6004hMo5602u.getClass();
                InterfaceC5995e interfaceC5995e = (InterfaceC5995e) interfaceC6004hMo5602u;
                List list2 = (List) this.f12392c.get(i10);
                if (list2 != null) {
                    collectionM20789e = new ArrayList(AbstractC5116y.m20814z(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        collectionM20789e.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsM13821r = AbstractC3714m3.m13821r(interfaceC5995e);
                    clsM13821r.getClass();
                    collectionM20789e = AbstractC5112w.m20789e(clsM13821r);
                }
                arrayList2.add(collectionM20789e);
                i10 = i11;
            }
            this.f12393d = arrayList2;
            this.f12394e = AbstractC5116y.m20813B(arrayList2);
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: a */
        public List mo16637a() {
            return this.f12394e;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Member mo16638b() {
            return (Member) m16684d();
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: c */
        public boolean mo16639c() {
            return InterfaceC4210h.a.m16664b(this);
        }

        /* JADX INFO: renamed from: d */
        public Void m16684d() {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final List m16685e() {
            return this.f12393d;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: f */
        public Type mo16642f() {
            Class<?> returnType = this.f12391b.getReturnType();
            returnType.getClass();
            return returnType;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            Collection collectionM20789e;
            objArr.getClass();
            List<C4711r> listM20743k1 = AbstractC5106t.m20743k1(objArr, this.f12392c);
            ArrayList arrayList = new ArrayList();
            for (C4711r c4711r : listM20743k1) {
                Object objM18792a = c4711r.m18792a();
                List list = (List) c4711r.m18793b();
                if (list != null) {
                    collectionM20789e = new ArrayList(AbstractC5116y.m20814z(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionM20789e.add(((Method) it.next()).invoke(objM18792a, null));
                    }
                } else {
                    collectionM20789e = AbstractC5112w.m20789e(objM18792a);
                }
                AbstractC5070c0.m20492E(arrayList, collectionM20789e);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f12390a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f12391b.invoke(null, Arrays.copyOf(array, array.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[LOOP:1: B:25:0x006d->B:27:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4216n(p229p9.InterfaceC5986b r11, p158k9.InterfaceC4210h r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158k9.C4216n.<init>(p9.b, k9.h, boolean):void");
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m16679e(InterfaceC5995e interfaceC5995e) {
        interfaceC5995e.getClass();
        return AbstractC7261k.m28782g(interfaceC5995e);
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: a */
    public List mo16637a() {
        return this.f12382b.mo16637a();
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: b */
    public Member mo16638b() {
        return this.f12383c;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: c */
    public boolean mo16639c() {
        return this.f12382b instanceof AbstractC4211i.h.a;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: f */
    public Type mo16642f() {
        return this.f12382b.mo16642f();
    }

    /* JADX INFO: renamed from: g */
    public final C2363j m16680g(int i10) {
        if (i10 >= 0) {
            C2363j[] c2363jArr = this.f12385e;
            if (i10 < c2363jArr.length) {
                return c2363jArr[i10];
            }
        }
        C2363j[] c2363jArr2 = this.f12385e;
        if (c2363jArr2.length == 0) {
            return new C2363j(i10, i10);
        }
        int length = (i10 - c2363jArr2.length) + ((C2363j) AbstractC5106t.m20755v0(c2363jArr2)).m8561p() + 1;
        return new C2363j(length, length);
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: o */
    public Object mo16643o(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objM13810g;
        Object objM13810g2;
        objArr.getClass();
        C2363j c2363jM16681a = this.f12384d.m16681a();
        List[] listArrM16683c = this.f12384d.m16683c();
        Method methodM16682b = this.f12384d.m16682b();
        if (!c2363jM16681a.isEmpty()) {
            if (this.f12386f) {
                List listM20788d = AbstractC5112w.m20788d(objArr.length);
                int iM8560o = c2363jM16681a.m8560o();
                for (int i10 = 0; i10 < iM8560o; i10++) {
                    listM20788d.add(objArr[i10]);
                }
                int iM8560o2 = c2363jM16681a.m8560o();
                int iM8561p = c2363jM16681a.m8561p();
                if (iM8560o2 <= iM8561p) {
                    while (true) {
                        List<Method> list = listArrM16683c[iM8560o2];
                        Object obj = objArr[iM8560o2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objM13810g2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    returnType.getClass();
                                    objM13810g2 = AbstractC3714m3.m13810g(returnType);
                                }
                                listM20788d.add(objM13810g2);
                            }
                        } else {
                            listM20788d.add(obj);
                        }
                        if (iM8560o2 == iM8561p) {
                            break;
                        }
                        iM8560o2++;
                    }
                }
                int iM8561p2 = c2363jM16681a.m8561p() + 1;
                int iM20732f0 = AbstractC5106t.m20732f0(objArr);
                if (iM8561p2 <= iM20732f0) {
                    while (true) {
                        listM20788d.add(objArr[iM8561p2]);
                        if (iM8561p2 == iM20732f0) {
                            break;
                        }
                        iM8561p2++;
                    }
                }
                objArr = AbstractC5112w.m20785a(listM20788d).toArray(new Object[0]);
            } else {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int iM8560o3 = c2363jM16681a.m8560o();
                    if (i11 > c2363jM16681a.m8561p() || iM8560o3 > i11) {
                        objM13810g = objArr[i11];
                    } else {
                        List list2 = listArrM16683c[i11];
                        Method method2 = list2 != null ? (Method) AbstractC5081g0.m20537I0(list2) : null;
                        objM13810g = objArr[i11];
                        if (method2 != null) {
                            if (objM13810g != null) {
                                objM13810g = method2.invoke(objM13810g, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                returnType2.getClass();
                                objM13810g = AbstractC3714m3.m13810g(returnType2);
                            }
                        }
                    }
                    objArr2[i11] = objM13810g;
                }
                objArr = objArr2;
            }
        }
        Object objMo16643o = this.f12382b.mo16643o(objArr);
        return (objMo16643o == AbstractC6325c.m24992g() || methodM16682b == null || (objInvoke = methodM16682b.invoke(null, objMo16643o)) == null) ? objMo16643o : objInvoke;
    }
}
