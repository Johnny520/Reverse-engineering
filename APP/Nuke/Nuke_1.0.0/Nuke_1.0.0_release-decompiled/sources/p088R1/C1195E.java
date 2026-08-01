package p088R1;

import com.bumptech.glide.C1930l;
import com.bumptech.glide.load.data.InterfaceC1933c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1151m;
import p107V1.C1517p;
import p107V1.C1521t;
import p107V1.InterfaceC1518q;
import p154e2.C2023b;
import p186k.C2423e;
import p195l2.C2509m;

/* JADX INFO: renamed from: R1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1195E implements InterfaceC1206g, InterfaceC1933c {

    /* JADX INFO: renamed from: d */
    public final RunnableC1209j f3918d;

    /* JADX INFO: renamed from: e */
    public final C1207h f3919e;

    /* JADX INFO: renamed from: f */
    public int f3920f;

    /* JADX INFO: renamed from: g */
    public int f3921g = -1;

    /* JADX INFO: renamed from: h */
    public InterfaceC1144f f3922h;

    /* JADX INFO: renamed from: i */
    public List f3923i;

    /* JADX INFO: renamed from: j */
    public int f3924j;

    /* JADX INFO: renamed from: k */
    public volatile C1517p f3925k;

    /* JADX INFO: renamed from: l */
    public File f3926l;

    /* JADX INFO: renamed from: m */
    public C1196F f3927m;

    public C1195E(C1207h c1207h, RunnableC1209j runnableC1209j) {
        this.f3919e = c1207h;
        this.f3918d = runnableC1209j;
    }

    @Override // p088R1.InterfaceC1206g
    /* JADX INFO: renamed from: b */
    public final boolean mo2257b() {
        List list;
        ArrayList arrayListM2791c;
        ArrayList arrayListM2266a = this.f3919e.m2266a();
        boolean z5 = false;
        if (!arrayListM2266a.isEmpty()) {
            C1207h c1207h = this.f3919e;
            C1930l c1930lM3586a = c1207h.f3962c.m3586a();
            Class<?> cls = c1207h.f3963d.getClass();
            Class cls2 = c1207h.f3966g;
            Class cls3 = c1207h.f3970k;
            C2023b c2023b = c1930lM3586a.f6559h;
            C2509m c2509m = (C2509m) ((AtomicReference) c2023b.f6752e).getAndSet(null);
            if (c2509m == null) {
                c2509m = new C2509m(cls, cls2, cls3);
            } else {
                c2509m.f8025a = cls;
                c2509m.f8026b = cls2;
                c2509m.f8027c = cls3;
            }
            synchronized (((C2423e) c2023b.f6753f)) {
                list = (List) ((C2423e) c2023b.f6753f).get(c2509m);
            }
            ((AtomicReference) c2023b.f6752e).set(c2509m);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C1521t c1521t = c1930lM3586a.f6552a;
                synchronized (c1521t) {
                    arrayListM2791c = c1521t.f5273a.m2791c(cls);
                }
                Iterator it = arrayListM2791c.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c1930lM3586a.f6554c.m3720b((Class) it.next(), cls2)) {
                        if (!c1930lM3586a.f6557f.m3029h(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C2023b c2023b2 = c1930lM3586a.f6559h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C2423e) c2023b2.f6753f)) {
                    ((C2423e) c2023b2.f6753f).put(new C2509m(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f3923i;
                    if (list3 != null && this.f3924j < list3.size()) {
                        this.f3925k = null;
                        while (!z5 && this.f3924j < this.f3923i.size()) {
                            List list4 = this.f3923i;
                            int i5 = this.f3924j;
                            this.f3924j = i5 + 1;
                            InterfaceC1518q interfaceC1518q = (InterfaceC1518q) list4.get(i5);
                            File file = this.f3926l;
                            C1207h c1207h2 = this.f3919e;
                            this.f3925k = interfaceC1518q.mo2774b(file, c1207h2.f3964e, c1207h2.f3965f, c1207h2.f3968i);
                            if (this.f3925k != null && this.f3919e.m2268c(this.f3925k.f5271c.mo2222a()) != null) {
                                this.f3925k.f5271c.mo2225d(this.f3919e.f3974o, this);
                                z5 = true;
                            }
                        }
                        return z5;
                    }
                    int i6 = this.f3921g + 1;
                    this.f3921g = i6;
                    if (i6 >= list2.size()) {
                        int i7 = this.f3920f + 1;
                        this.f3920f = i7;
                        if (i7 >= arrayListM2266a.size()) {
                            break;
                        }
                        this.f3921g = 0;
                    }
                    InterfaceC1144f interfaceC1144f = (InterfaceC1144f) arrayListM2266a.get(this.f3920f);
                    Class cls5 = (Class) list2.get(this.f3921g);
                    InterfaceC1151m interfaceC1151mM2270e = this.f3919e.m2270e(cls5);
                    C1207h c1207h3 = this.f3919e;
                    this.f3927m = new C1196F(c1207h3.f3962c.f6537a, interfaceC1144f, c1207h3.f3973n, c1207h3.f3964e, c1207h3.f3965f, interfaceC1151mM2270e, cls5, c1207h3.f3968i);
                    File fileMo152c = c1207h3.f3967h.m2288a().mo152c(this.f3927m);
                    this.f3926l = fileMo152c;
                    if (fileMo152c != null) {
                        this.f3922h = interfaceC1144f;
                        this.f3923i = this.f3919e.f3962c.m3586a().m3592f(fileMo152c);
                        this.f3924j = 0;
                    }
                }
            } else if (!File.class.equals(this.f3919e.f3970k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f3919e.f3963d.getClass() + " to " + this.f3919e.f3970k);
            }
        }
        return false;
    }

    @Override // p088R1.InterfaceC1206g
    public final void cancel() {
        C1517p c1517p = this.f3925k;
        if (c1517p != null) {
            c1517p.f5271c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: e */
    public final void mo36e(Exception exc) {
        this.f3918d.mo2263a(this.f3927m, exc, this.f3925k.f5271c, 4);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: l */
    public final void mo43l(Object obj) {
        this.f3918d.mo2264c(this.f3922h, obj, this.f3925k.f5271c, 4, this.f3927m);
    }
}
