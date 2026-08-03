package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Pv */
/* JADX INFO: loaded from: classes.dex */
public final class C0683Pv {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f2182a;

    /* JADX INFO: renamed from: b */
    public final C0752Rf f2183b;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f2184c;

    /* JADX INFO: renamed from: d */
    public final C0752Rf f2185d;

    /* JADX INFO: renamed from: e */
    public final C2756yc f2186e;

    /* JADX INFO: renamed from: f */
    public final C0752Rf f2187f;

    /* JADX INFO: renamed from: g */
    public final C0752Rf f2188g;

    /* JADX INFO: renamed from: h */
    public final C0649P3 f2189h = new C0649P3(25);

    /* JADX INFO: renamed from: i */
    public final C0633Oo f2190i = new C0633Oo();

    /* JADX INFO: renamed from: j */
    public final C2656w4 f2191j;

    public C0683Pv() {
        C2656w4 c2656w4 = new C2656w4(new C1110Zt(20), new C0668Pg(3), new C0668Pg(4));
        this.f2191j = c2656w4;
        this.f2182a = new C0649P3(c2656w4);
        this.f2183b = new C0752Rf(0);
        this.f2184c = new C0649P3(28);
        this.f2185d = new C0752Rf(2);
        this.f2186e = new C2756yc(0);
        this.f2187f = new C0752Rf(3);
        this.f2188g = new C0752Rf(1);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0649P3 c0649p3 = this.f2184c;
        synchronized (c0649p3) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c0649p3.f2089b);
                ((ArrayList) c0649p3.f2089b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c0649p3.f2089b).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0649p3.f2089b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1373a(Class cls, InterfaceC0667Pf interfaceC0667Pf) {
        C0752Rf c0752Rf = this.f2183b;
        synchronized (c0752Rf) {
            c0752Rf.f2389a.add(new C0710Qf(cls, interfaceC0667Pf));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1374b(Class cls, InterfaceC2647vw interfaceC2647vw) {
        C0752Rf c0752Rf = this.f2185d;
        synchronized (c0752Rf) {
            c0752Rf.f2389a.add(new C2690ww(cls, interfaceC2647vw));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1375c(Class cls, Class cls2, InterfaceC1233bs interfaceC1233bs) {
        C0649P3 c0649p3 = this.f2182a;
        synchronized (c0649p3) {
            C2428qs c2428qs = (C2428qs) c0649p3.f2089b;
            synchronized (c2428qs) {
                try {
                    C2385ps c2385ps = new C2385ps(cls, cls2, interfaceC1233bs);
                    ArrayList arrayList = (ArrayList) c2428qs.f8520a;
                    arrayList.add(arrayList.size(), c2385ps);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C2756yc) c0649p3.f2090c).f9385a.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1376d(String str, Class cls, Class cls2, InterfaceC2518sw interfaceC2518sw) {
        C0649P3 c0649p3 = this.f2184c;
        synchronized (c0649p3) {
            c0649p3.m1274D(str).add(new C2561tw(cls, cls2, interfaceC2518sw));
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m1377e() {
        ArrayList arrayList;
        C0752Rf c0752Rf = this.f2188g;
        synchronized (c0752Rf) {
            arrayList = c0752Rf.f2389a;
        }
        if (arrayList.isEmpty()) {
            throw new C0597Nv("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m1378f(Object obj) {
        List listUnmodifiableList;
        C0649P3 c0649p3 = this.f2182a;
        c0649p3.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0649p3) {
            C1294cs c1294cs = (C1294cs) ((C2756yc) c0649p3.f2090c).f9385a.get(cls);
            listUnmodifiableList = c1294cs == null ? null : c1294cs.f4730a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C2428qs) c0649p3.f2089b).m4873k(cls));
                if (((C1294cs) ((C2756yc) c0649p3.f2090c).f9385a.put(cls, new C1294cs(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C0597Nv("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC1189as interfaceC1189as = (InterfaceC1189as) listUnmodifiableList.get(i);
            if (interfaceC1189as.mo994a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC1189as);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C0597Nv("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2713xc m1379g(Object obj) {
        InterfaceC2713xc interfaceC2713xcMo4772b;
        C2756yc c2756yc = this.f2186e;
        synchronized (c2756yc) {
            try {
                AbstractC0714Qj.m1487i(obj);
                InterfaceC2670wc interfaceC2670wc = (InterfaceC2670wc) c2756yc.f9385a.get(obj.getClass());
                if (interfaceC2670wc == null) {
                    Iterator it = c2756yc.f9385a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC2670wc interfaceC2670wc2 = (InterfaceC2670wc) it.next();
                        if (interfaceC2670wc2.mo4771a().isAssignableFrom(obj.getClass())) {
                            interfaceC2670wc = interfaceC2670wc2;
                            break;
                        }
                    }
                }
                if (interfaceC2670wc == null) {
                    interfaceC2670wc = C2756yc.f9384b;
                }
                interfaceC2713xcMo4772b = interfaceC2670wc.mo4772b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2713xcMo4772b;
    }

    /* JADX INFO: renamed from: h */
    public final void m1380h(InterfaceC2670wc interfaceC2670wc) {
        C2756yc c2756yc = this.f2186e;
        synchronized (c2756yc) {
            c2756yc.f9385a.put(interfaceC2670wc.mo4771a(), interfaceC2670wc);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1381i(Class cls, Class cls2, InterfaceC2819zw interfaceC2819zw) {
        C0752Rf c0752Rf = this.f2187f;
        synchronized (c0752Rf) {
            c0752Rf.f2389a.add(new C0055BB(cls, cls2, interfaceC2819zw));
        }
    }
}
