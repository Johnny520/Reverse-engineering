package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes.dex */
public final class C2432qw implements InterfaceC2627vc, InterfaceC2498sc {

    /* JADX INFO: renamed from: a */
    public final RunnableC0320Hc f8530a;

    /* JADX INFO: renamed from: b */
    public final C0234Fc f8531b;

    /* JADX INFO: renamed from: c */
    public int f8532c;

    /* JADX INFO: renamed from: d */
    public int f8533d = -1;

    /* JADX INFO: renamed from: e */
    public InterfaceC0802Sm f8534e;

    /* JADX INFO: renamed from: f */
    public List f8535f;

    /* JADX INFO: renamed from: g */
    public int f8536g;

    /* JADX INFO: renamed from: h */
    public volatile C1108Zr f8537h;

    /* JADX INFO: renamed from: i */
    public File f8538i;

    /* JADX INFO: renamed from: j */
    public C2475rw f8539j;

    public C2432qw(C0234Fc c0234Fc, RunnableC0320Hc runnableC0320Hc) {
        this.f8531b = c0234Fc;
        this.f8530a = runnableC0320Hc;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception exc) {
        this.f8530a.mo670a(this.f8539j, exc, this.f8537h.f3503c, 4);
    }

    @Override // p000.InterfaceC2627vc
    /* JADX INFO: renamed from: c */
    public final boolean mo727c() {
        List list;
        ArrayList arrayListM4881s;
        ArrayList arrayListM473a = this.f8531b.m473a();
        boolean z = false;
        if (!arrayListM473a.isEmpty()) {
            C0234Fc c0234Fc = this.f8531b;
            C0683Pv c0683PvM1544a = c0234Fc.f735c.m1544a();
            Class<?> cls = c0234Fc.f736d.getClass();
            Class cls2 = c0234Fc.f739g;
            Class cls3 = c0234Fc.f743k;
            C0649P3 c0649p3 = c0683PvM1544a.f2189h;
            C2291ns c2291ns = (C2291ns) ((AtomicReference) c0649p3.f2089b).getAndSet(null);
            if (c2291ns == null) {
                c2291ns = new C2291ns(cls, cls2, cls3);
            } else {
                c2291ns.f8041a = cls;
                c2291ns.f8042b = cls2;
                c2291ns.f8043c = cls3;
            }
            synchronized (((C0521M4) c0649p3.f2090c)) {
                list = (List) ((C0521M4) c0649p3.f2090c).get(c2291ns);
            }
            ((AtomicReference) c0649p3.f2089b).set(c2291ns);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C0649P3 c0649p32 = c0683PvM1544a.f2182a;
                synchronized (c0649p32) {
                    arrayListM4881s = ((C2428qs) c0649p32.f2089b).m4881s(cls);
                }
                Iterator it = arrayListM4881s.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c0683PvM1544a.f2184c.m1276F((Class) it.next(), cls2)) {
                        if (!c0683PvM1544a.f2187f.m1541b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C0649P3 c0649p33 = c0683PvM1544a.f2189h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0521M4) c0649p33.f2090c)) {
                    ((C0521M4) c0649p33.f2090c).put(new C2291ns(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f8535f;
                    if (list3 != null && this.f8536g < list3.size()) {
                        this.f8537h = null;
                        while (!z && this.f8536g < this.f8535f.size()) {
                            List list4 = this.f8535f;
                            int i = this.f8536g;
                            this.f8536g = i + 1;
                            InterfaceC1189as interfaceC1189as = (InterfaceC1189as) list4.get(i);
                            File file = this.f8538i;
                            C0234Fc c0234Fc2 = this.f8531b;
                            this.f8537h = interfaceC1189as.mo995b(file, c0234Fc2.f737e, c0234Fc2.f738f, c0234Fc2.f741i);
                            if (this.f8537h != null && this.f8531b.m475c(this.f8537h.f3503c.mo912a()) != null) {
                                this.f8537h.f3503c.mo915d(this.f8531b.f747o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f8533d + 1;
                    this.f8533d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f8532c + 1;
                        this.f8532c = i3;
                        if (i3 >= arrayListM473a.size()) {
                            break;
                        }
                        this.f8533d = 0;
                    }
                    InterfaceC0802Sm interfaceC0802Sm = (InterfaceC0802Sm) arrayListM473a.get(this.f8532c);
                    Class cls5 = (Class) list2.get(this.f8533d);
                    InterfaceC0098CB interfaceC0098CBM477e = this.f8531b.m477e(cls5);
                    C0234Fc c0234Fc3 = this.f8531b;
                    this.f8539j = new C2475rw(c0234Fc3.f735c.f2396a, interfaceC0802Sm, c0234Fc3.f746n, c0234Fc3.f737e, c0234Fc3.f738f, interfaceC0098CBM477e, cls5, c0234Fc3.f741i);
                    File fileMo1725b = c0234Fc3.f740h.m96a().mo1725b(this.f8539j);
                    this.f8538i = fileMo1725b;
                    if (fileMo1725b != null) {
                        this.f8534e = interfaceC0802Sm;
                        this.f8535f = this.f8531b.f735c.m1544a().m1378f(fileMo1725b);
                        this.f8536g = 0;
                    }
                }
            } else if (!File.class.equals(this.f8531b.f743k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f8531b.f736d.getClass() + " to " + this.f8531b.f743k);
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2627vc
    public final void cancel() {
        C1108Zr c1108Zr = this.f8537h;
        if (c1108Zr != null) {
            c1108Zr.f3503c.cancel();
        }
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object obj) {
        this.f8530a.mo671b(this.f8534e, obj, this.f8537h.f3503c, 4, this.f8539j);
    }
}
