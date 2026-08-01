package p088R1;

import com.bumptech.glide.C1927i;
import com.bumptech.glide.C1929k;
import com.bumptech.glide.C1930l;
import com.bumptech.glide.EnumC1928j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p078P1.C1147i;
import p078P1.InterfaceC1140b;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1151m;
import p107V1.C1517p;
import p107V1.InterfaceC1518q;
import p116X1.C1655d;
import p118X3.C1706p;
import p148d2.C1971b;
import p148d2.C1972c;
import p148d2.InterfaceC1970a;
import p154e2.C2023b;
import p165g2.C2180a;
import p165g2.C2181b;
import p165g2.C2182c;
import p195l2.C2509m;

/* JADX INFO: renamed from: R1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1207h {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3960a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f3961b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C1927i f3962c;

    /* JADX INFO: renamed from: d */
    public Object f3963d;

    /* JADX INFO: renamed from: e */
    public int f3964e;

    /* JADX INFO: renamed from: f */
    public int f3965f;

    /* JADX INFO: renamed from: g */
    public Class f3966g;

    /* JADX INFO: renamed from: h */
    public C1213n f3967h;

    /* JADX INFO: renamed from: i */
    public C1147i f3968i;

    /* JADX INFO: renamed from: j */
    public Map f3969j;

    /* JADX INFO: renamed from: k */
    public Class f3970k;

    /* JADX INFO: renamed from: l */
    public boolean f3971l;

    /* JADX INFO: renamed from: m */
    public boolean f3972m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1144f f3973n;

    /* JADX INFO: renamed from: o */
    public EnumC1928j f3974o;

    /* JADX INFO: renamed from: p */
    public C1211l f3975p;

    /* JADX INFO: renamed from: q */
    public boolean f3976q;

    /* JADX INFO: renamed from: r */
    public boolean f3977r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m2266a() {
        boolean z5 = this.f3972m;
        ArrayList arrayList = this.f3961b;
        if (!z5) {
            this.f3972m = true;
            arrayList.clear();
            ArrayList arrayListM2267b = m2267b();
            int size = arrayListM2267b.size();
            for (int i5 = 0; i5 < size; i5++) {
                C1517p c1517p = (C1517p) arrayListM2267b.get(i5);
                InterfaceC1144f interfaceC1144f = c1517p.f5269a;
                List list = c1517p.f5270b;
                if (!arrayList.contains(interfaceC1144f)) {
                    arrayList.add(c1517p.f5269a);
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    if (!arrayList.contains(list.get(i6))) {
                        arrayList.add((InterfaceC1144f) list.get(i6));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ArrayList m2267b() {
        boolean z5 = this.f3971l;
        ArrayList arrayList = this.f3960a;
        if (!z5) {
            this.f3971l = true;
            arrayList.clear();
            List listM3592f = this.f3962c.m3586a().m3592f(this.f3963d);
            int size = listM3592f.size();
            for (int i5 = 0; i5 < size; i5++) {
                C1517p c1517pMo2774b = ((InterfaceC1518q) listM3592f.get(i5)).mo2774b(this.f3963d, this.f3964e, this.f3965f, this.f3968i);
                if (c1517pMo2774b != null) {
                    arrayList.add(c1517pMo2774b);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final C1192B m2268c(Class cls) {
        C1192B c1192b;
        Class cls2;
        Class cls3;
        Class cls4;
        C1192B c1192b2;
        ArrayList arrayList;
        InterfaceC1970a interfaceC1970a;
        Class cls5 = cls;
        C1930l c1930lM3586a = this.f3962c.m3586a();
        Class cls6 = this.f3966g;
        Class cls7 = this.f3970k;
        C2181b c2181b = c1930lM3586a.f6560i;
        C2509m c2509m = (C2509m) c2181b.f7142b.getAndSet(null);
        if (c2509m == null) {
            c2509m = new C2509m();
        }
        c2509m.f8025a = cls5;
        c2509m.f8026b = cls6;
        c2509m.f8027c = cls7;
        synchronized (c2181b.f7141a) {
            c1192b = (C1192B) c2181b.f7141a.get(c2509m);
        }
        c2181b.f7142b.set(c2509m);
        c1930lM3586a.f6560i.getClass();
        if (C2181b.f7140c.equals(c1192b)) {
            return null;
        }
        if (c1192b != null) {
            return c1192b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c1930lM3586a.f6554c.m3720b(cls5, cls6)) {
            for (Class cls9 : c1930lM3586a.f6557f.m3029h(cls8, cls7)) {
                C2023b c2023b = c1930lM3586a.f6554c;
                synchronized (c2023b) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c2023b.f6752e).iterator();
                    while (it.hasNext()) {
                        List<C2182c> list = (List) ((HashMap) c2023b.f6753f).get((String) it.next());
                        if (list != null) {
                            for (C2182c c2182c : list) {
                                if (c2182c.f7143a.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2182c.f7144b)) {
                                    arrayList.add(c2182c.f7145c);
                                }
                            }
                        }
                    }
                }
                C1706p c1706p = c1930lM3586a.f6557f;
                synchronized (c1706p) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C1971b c1971b : c1706p.f5857a) {
                            if (c1971b.f6657a.isAssignableFrom(cls8) && cls9.isAssignableFrom(c1971b.f6658b)) {
                                interfaceC1970a = c1971b.f6659c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC1970a = C1972c.f6660e;
                }
                arrayList2.add(new C1210k(cls5, cls8, cls9, arrayList, interfaceC1970a, c1930lM3586a.f6561j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1192b2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c1192b2 = new C1192B(cls2, cls3, cls4, arrayList2, c1930lM3586a.f6561j);
        }
        C2181b c2181b2 = c1930lM3586a.f6560i;
        synchronized (c2181b2.f7141a) {
            c2181b2.f7141a.put(new C2509m(cls2, cls3, cls4), c1192b2 != null ? c1192b2 : C2181b.f7140c);
        }
        return c1192b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f7139b;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1140b m2269d(Object obj) {
        InterfaceC1140b interfaceC1140b;
        C1706p c1706p = this.f3962c.m3586a().f6553b;
        Class<?> cls = obj.getClass();
        synchronized (c1706p) {
            Iterator it = c1706p.f5857a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC1140b = null;
                    break;
                }
                C2180a c2180a = (C2180a) it.next();
                if (c2180a.f7138a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC1140b != null) {
            return interfaceC1140b;
        }
        throw new C1929k("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final InterfaceC1151m m2270e(Class cls) {
        InterfaceC1151m interfaceC1151m = (InterfaceC1151m) this.f3969j.get(cls);
        if (interfaceC1151m == null) {
            Iterator it = this.f3969j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC1151m = (InterfaceC1151m) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC1151m != null) {
            return interfaceC1151m;
        }
        if (!this.f3969j.isEmpty() || !this.f3976q) {
            return C1655d.f5683b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
