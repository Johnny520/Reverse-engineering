package com.bumptech.glide;

import com.bumptech.glide.load.data.C1937g;
import com.bumptech.glide.load.data.InterfaceC1935e;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000A.C0072l0;
import p049I2.C0793k;
import p078P1.InterfaceC1140b;
import p078P1.InterfaceC1149k;
import p078P1.InterfaceC1150l;
import p107V1.C1520s;
import p107V1.C1521t;
import p107V1.C1523v;
import p107V1.C1524w;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p118X3.C1706p;
import p148d2.C1971b;
import p148d2.InterfaceC1970a;
import p154e2.C2023b;
import p165g2.C2180a;
import p165g2.C2181b;
import p165g2.C2182c;
import p165g2.C2183d;
import p191k4.C2475a;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: com.bumptech.glide.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1930l {

    /* JADX INFO: renamed from: a */
    public final C1521t f6552a;

    /* JADX INFO: renamed from: b */
    public final C1706p f6553b;

    /* JADX INFO: renamed from: c */
    public final C2023b f6554c;

    /* JADX INFO: renamed from: d */
    public final C1706p f6555d;

    /* JADX INFO: renamed from: e */
    public final C1937g f6556e;

    /* JADX INFO: renamed from: f */
    public final C1706p f6557f;

    /* JADX INFO: renamed from: g */
    public final C1706p f6558g;

    /* JADX INFO: renamed from: h */
    public final C2023b f6559h = new C2023b(1);

    /* JADX INFO: renamed from: i */
    public final C2181b f6560i = new C2181b();

    /* JADX INFO: renamed from: j */
    public final C0072l0 f6561j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1930l() {
        C0072l0 c0072l0 = new C0072l0(new C0793k(20, 6), new C2475a(6), new C2475a(7));
        this.f6561j = c0072l0;
        this.f6552a = new C1521t(c0072l0);
        this.f6553b = new C1706p(2);
        this.f6554c = new C2023b(2);
        this.f6555d = new C1706p(4);
        this.f6556e = new C1937g();
        this.f6557f = new C1706p(1);
        this.f6558g = new C1706p(3);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C2023b c2023b = this.f6554c;
        synchronized (c2023b) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c2023b.f6752e);
                ((ArrayList) c2023b.f6752e).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c2023b.f6752e).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c2023b.f6752e).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3587a(Class cls, InterfaceC1140b interfaceC1140b) {
        C1706p c1706p = this.f6553b;
        synchronized (c1706p) {
            c1706p.f5857a.add(new C2180a(cls, interfaceC1140b));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3588b(Class cls, InterfaceC1150l interfaceC1150l) {
        C1706p c1706p = this.f6555d;
        synchronized (c1706p) {
            c1706p.f5857a.add(new C2183d(cls, interfaceC1150l));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3589c(Class cls, Class cls2, InterfaceC1519r interfaceC1519r) {
        C1521t c1521t = this.f6552a;
        synchronized (c1521t) {
            C1524w c1524w = c1521t.f5273a;
            synchronized (c1524w) {
                try {
                    C1523v c1523v = new C1523v(cls, cls2, interfaceC1519r);
                    ArrayList arrayList = c1524w.f5287a;
                    arrayList.add(arrayList.size(), c1523v);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1521t.f5274b.f3909a.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3590d(String str, Class cls, Class cls2, InterfaceC1149k interfaceC1149k) {
        C2023b c2023b = this.f6554c;
        synchronized (c2023b) {
            c2023b.m3719a(str).add(new C2182c(cls, cls2, interfaceC1149k));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final ArrayList m3591e() {
        ArrayList arrayList;
        C1706p c1706p = this.f6558g;
        synchronized (c1706p) {
            arrayList = c1706p.f5857a;
        }
        if (arrayList.isEmpty()) {
            throw new C1929k("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final List m3592f(Object obj) {
        List listUnmodifiableList;
        C1521t c1521t = this.f6552a;
        c1521t.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c1521t) {
            C1520s c1520s = (C1520s) c1521t.f5274b.f3909a.get(cls);
            listUnmodifiableList = c1520s == null ? null : c1520s.f5272a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c1521t.f5273a.m2790b(cls));
                if (((C1520s) c1521t.f5274b.f3909a.put(cls, new C1520s(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C1929k("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z5 = true;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC1518q interfaceC1518q = (InterfaceC1518q) listUnmodifiableList.get(i5);
            if (interfaceC1518q.mo2773a(obj)) {
                if (z5) {
                    arrayList = new ArrayList(size - i5);
                    z5 = false;
                }
                arrayList.add(interfaceC1518q);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C1929k("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC1936f m3593g(Object obj) {
        InterfaceC1936f interfaceC1936fMo3186b;
        C1937g c1937g = this.f6556e;
        synchronized (c1937g) {
            try {
                AbstractC2503g.m4444b(obj);
                InterfaceC1935e interfaceC1935e = (InterfaceC1935e) ((HashMap) c1937g.f6571e).get(obj.getClass());
                if (interfaceC1935e == null) {
                    Iterator it = ((HashMap) c1937g.f6571e).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC1935e interfaceC1935e2 = (InterfaceC1935e) it.next();
                        if (interfaceC1935e2.mo3185a().isAssignableFrom(obj.getClass())) {
                            interfaceC1935e = interfaceC1935e2;
                            break;
                        }
                    }
                }
                if (interfaceC1935e == null) {
                    interfaceC1935e = C1937g.f6569f;
                }
                interfaceC1936fMo3186b = interfaceC1935e.mo3186b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1936fMo3186b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3594h(InterfaceC1935e interfaceC1935e) {
        C1937g c1937g = this.f6556e;
        synchronized (c1937g) {
            ((HashMap) c1937g.f6571e).put(interfaceC1935e.mo3185a(), interfaceC1935e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3595i(Class cls, Class cls2, InterfaceC1970a interfaceC1970a) {
        C1706p c1706p = this.f6557f;
        synchronized (c1706p) {
            c1706p.f5857a.add(new C1971b(cls, cls2, interfaceC1970a));
        }
    }
}
