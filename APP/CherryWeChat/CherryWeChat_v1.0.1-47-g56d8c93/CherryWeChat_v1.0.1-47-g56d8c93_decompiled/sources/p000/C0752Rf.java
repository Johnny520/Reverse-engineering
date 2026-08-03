package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rf */
/* JADX INFO: loaded from: classes.dex */
public final class C0752Rf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2389a;

    public C0752Rf(int i) {
        switch (i) {
            case 1:
                this.f2389a = new ArrayList();
                break;
            case 2:
                this.f2389a = new ArrayList();
                break;
            case 3:
                this.f2389a = new ArrayList();
                break;
            default:
                this.f2389a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC2647vw m1540a(Class cls) {
        int size = this.f2389a.size();
        for (int i = 0; i < size; i++) {
            C2690ww c2690ww = (C2690ww) this.f2389a.get(i);
            if (c2690ww.f9259a.isAssignableFrom(cls)) {
                return c2690ww.f9260b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public synchronized ArrayList m1541b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C0055BB c0055bb : this.f2389a) {
            if ((c0055bb.f127a.isAssignableFrom(cls) && cls2.isAssignableFrom(c0055bb.f128b)) && !arrayList.contains(c0055bb.f128b)) {
                arrayList.add(c0055bb.f128b);
            }
        }
        return arrayList;
    }
}
