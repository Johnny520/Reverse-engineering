package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Fc */
/* JADX INFO: loaded from: classes.dex */
public final class C0234Fc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f733a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f734b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C0756Rj f735c;

    /* JADX INFO: renamed from: d */
    public Object f736d;

    /* JADX INFO: renamed from: e */
    public int f737e;

    /* JADX INFO: renamed from: f */
    public int f738f;

    /* JADX INFO: renamed from: g */
    public Class f739g;

    /* JADX INFO: renamed from: h */
    public C0061Bb f740h;

    /* JADX INFO: renamed from: i */
    public C2644vt f741i;

    /* JADX INFO: renamed from: j */
    public Map f742j;

    /* JADX INFO: renamed from: k */
    public Class f743k;

    /* JADX INFO: renamed from: l */
    public boolean f744l;

    /* JADX INFO: renamed from: m */
    public boolean f745m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0802Sm f746n;

    /* JADX INFO: renamed from: o */
    public EnumC2688wu f747o;

    /* JADX INFO: renamed from: p */
    public C0922Vd f748p;

    /* JADX INFO: renamed from: q */
    public boolean f749q;

    /* JADX INFO: renamed from: r */
    public boolean f750r;

    /* JADX INFO: renamed from: a */
    public final ArrayList m473a() {
        boolean z = this.f745m;
        ArrayList arrayList = this.f734b;
        if (!z) {
            this.f745m = true;
            arrayList.clear();
            ArrayList arrayListM474b = m474b();
            int size = arrayListM474b.size();
            for (int i = 0; i < size; i++) {
                C1108Zr c1108Zr = (C1108Zr) arrayListM474b.get(i);
                InterfaceC0802Sm interfaceC0802Sm = c1108Zr.f3501a;
                List list = c1108Zr.f3502b;
                if (!arrayList.contains(interfaceC0802Sm)) {
                    arrayList.add(c1108Zr.f3501a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC0802Sm) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m474b() {
        boolean z = this.f744l;
        ArrayList arrayList = this.f733a;
        if (!z) {
            this.f744l = true;
            arrayList.clear();
            List listM1378f = this.f735c.m1544a().m1378f(this.f736d);
            int size = listM1378f.size();
            for (int i = 0; i < size; i++) {
                C1108Zr c1108ZrMo995b = ((InterfaceC1189as) listM1378f.get(i)).mo995b(this.f736d, this.f737e, this.f738f, this.f741i);
                if (c1108ZrMo995b != null) {
                    arrayList.add(c1108ZrMo995b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final C0590No m475c(Class cls) {
        C0590No c0590No;
        Class cls2;
        Class cls3;
        Class cls4;
        C0590No c0590No2;
        ArrayList arrayList;
        InterfaceC2819zw interfaceC2819zw;
        Class cls5 = cls;
        C0683Pv c0683PvM1544a = this.f735c.m1544a();
        Class cls6 = this.f739g;
        Class cls7 = this.f743k;
        C0633Oo c0633Oo = c0683PvM1544a.f2190i;
        C2291ns c2291ns = (C2291ns) c0633Oo.f2028b.getAndSet(null);
        if (c2291ns == null) {
            c2291ns = new C2291ns();
        }
        c2291ns.f8041a = cls5;
        c2291ns.f8042b = cls6;
        c2291ns.f8043c = cls7;
        synchronized (c0633Oo.f2027a) {
            c0590No = (C0590No) c0633Oo.f2027a.get(c2291ns);
        }
        c0633Oo.f2028b.set(c2291ns);
        c0683PvM1544a.f2190i.getClass();
        if (C0633Oo.f2026c.equals(c0590No)) {
            return null;
        }
        if (c0590No != null) {
            return c0590No;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c0683PvM1544a.f2184c.m1276F(cls5, cls6)) {
            for (Class cls9 : c0683PvM1544a.f2187f.m1541b(cls8, cls7)) {
                C0649P3 c0649p3 = c0683PvM1544a.f2184c;
                synchronized (c0649p3) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c0649p3.f2089b).iterator();
                    while (it.hasNext()) {
                        List<C2561tw> list = (List) ((HashMap) c0649p3.f2090c).get((String) it.next());
                        if (list != null) {
                            for (C2561tw c2561tw : list) {
                                if (c2561tw.f8880a.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2561tw.f8881b)) {
                                    arrayList.add(c2561tw.f8882c);
                                }
                            }
                        }
                    }
                }
                C0752Rf c0752Rf = c0683PvM1544a.f2187f;
                synchronized (c0752Rf) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C0055BB c0055bb : c0752Rf.f2389a) {
                            if (c0055bb.f127a.isAssignableFrom(cls8) && cls9.isAssignableFrom(c0055bb.f128b)) {
                                interfaceC2819zw = c0055bb.f129c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC2819zw = C1456gf.f5168l;
                }
                arrayList2.add(new C0363Ic(cls5, cls8, cls9, arrayList, interfaceC2819zw, c0683PvM1544a.f2191j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0590No2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0590No2 = new C0590No(cls2, cls3, cls4, arrayList2, c0683PvM1544a.f2191j);
        }
        C0633Oo c0633Oo2 = c0683PvM1544a.f2190i;
        synchronized (c0633Oo2.f2027a) {
            c0633Oo2.f2027a.put(new C2291ns(cls2, cls3, cls4), c0590No2 != null ? c0590No2 : C0633Oo.f2026c);
        }
        return c0590No2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f2284b;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0667Pf m476d(Object obj) {
        InterfaceC0667Pf interfaceC0667Pf;
        C0752Rf c0752Rf = this.f735c.m1544a().f2183b;
        Class<?> cls = obj.getClass();
        synchronized (c0752Rf) {
            Iterator it = c0752Rf.f2389a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC0667Pf = null;
                    break;
                }
                C0710Qf c0710Qf = (C0710Qf) it.next();
                if (c0710Qf.f2283a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC0667Pf != null) {
            return interfaceC0667Pf;
        }
        throw new C0597Nv("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0098CB m477e(Class cls) {
        InterfaceC0098CB interfaceC0098CB = (InterfaceC0098CB) this.f742j.get(cls);
        if (interfaceC0098CB == null) {
            Iterator it = this.f742j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC0098CB = (InterfaceC0098CB) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC0098CB != null) {
            return interfaceC0098CB;
        }
        if (!this.f742j.isEmpty() || !this.f749q) {
            return C0958WC.f2994b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
