package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛵᛱᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1008 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public InterfaceC1410 f4580;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0716 f4581;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f4582;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0822 f4583;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4584;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public EnumC0296 f4586;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f4587;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f4589;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Class f4590;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Class f4591;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f4592;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0410 f4593;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2572 f4594;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C2340 f4595;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f4596;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f4597;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f4585 = new ArrayList();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f4588 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC0556 m2185(Class cls) {
        InterfaceC0556 interfaceC0556 = (InterfaceC0556) this.f4593.get(cls);
        if (interfaceC0556 == null) {
            Iterator it = ((C0628) this.f4593.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC0556 = (InterfaceC0556) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC0556 != null) {
            return interfaceC0556;
        }
        if (!this.f4593.isEmpty() || !this.f4589) {
            return C1850.f9322;
        }
        C1693.m3444(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList m2186() {
        boolean z = this.f4582;
        ArrayList arrayList = this.f4588;
        if (!z) {
            this.f4582 = true;
            arrayList.clear();
            ArrayList arrayListM2187 = m2187();
            int size = arrayListM2187.size();
            for (int i = 0; i < size; i++) {
                C1199 c1199 = (C1199) arrayListM2187.get(i);
                InterfaceC1410 interfaceC1410 = c1199.f5472;
                List list = Collections.EMPTY_LIST;
                if (!arrayList.contains(interfaceC1410)) {
                    arrayList.add(c1199.f5472);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC1410) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList m2187() {
        boolean z = this.f4592;
        ArrayList arrayList = this.f4585;
        if (!z) {
            this.f4592 = true;
            arrayList.clear();
            List listM3230 = this.f4594.m4645().m3230(this.f4597);
            int size = listM3230.size();
            for (int i = 0; i < size; i++) {
                C1199 c1199Mo940 = ((InterfaceC0894) listM3230.get(i)).mo940(this.f4597, this.f4584, this.f4596, this.f4583);
                if (c1199Mo940 != null) {
                    arrayList.add(c1199Mo940);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1362 m2188(Class cls) {
        C1362 c1362;
        Class cls2;
        Class cls3;
        Class cls4;
        C1362 c13622;
        ArrayList arrayList;
        InterfaceC1826 interfaceC1826;
        Class cls5 = cls;
        C1578 c1578M4645 = this.f4594.m4645();
        Class cls6 = this.f4590;
        Class cls7 = this.f4591;
        C1740 c1740 = c1578M4645.f8006;
        C1468 c1468 = (C1468) c1740.f8791.getAndSet(null);
        if (c1468 == null) {
            c1468 = new C1468();
        }
        c1468.f6980 = cls5;
        c1468.f6981 = cls6;
        c1468.f6982 = cls7;
        synchronized (c1740.f8790) {
            c1362 = (C1362) c1740.f8790.get(c1468);
        }
        c1740.f8791.set(c1468);
        c1578M4645.f8006.getClass();
        if (C1740.f8789.equals(c1362)) {
            return null;
        }
        if (c1362 != null) {
            return c1362;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c1578M4645.f8012.m557(cls5, cls6)) {
            for (Class cls9 : c1578M4645.f8013.m4073(cls8, cls7)) {
                C0119 c0119 = c1578M4645.f8012;
                synchronized (c0119) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c0119.f812).iterator();
                    while (it.hasNext()) {
                        List<C2430> list = (List) ((HashMap) c0119.f810).get((String) it.next());
                        if (list != null) {
                            for (C2430 c2430 : list) {
                                if (c2430.f11986.isAssignableFrom(cls5) && cls8.isAssignableFrom(c2430.f11987)) {
                                    arrayList.add(c2430.f11988);
                                }
                            }
                        }
                    }
                }
                C2135 c2135 = c1578M4645.f8013;
                synchronized (c2135) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C1210 c1210 : c2135.f10556) {
                            if (c1210.f5505.isAssignableFrom(cls8) && cls9.isAssignableFrom(c1210.f5506)) {
                                interfaceC1826 = c1210.f5507;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC1826 = C1985.f9940;
                }
                arrayList2.add(new C0961(cls5, cls8, cls9, arrayList, interfaceC1826, c1578M4645.f8011));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c13622 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c13622 = new C1362(cls2, cls3, cls4, arrayList2, c1578M4645.f8011);
        }
        C1740 c17402 = c1578M4645.f8006;
        synchronized (c17402.f8790) {
            c17402.f8790.put(new C1468(cls2, cls3, cls4), c13622 != null ? c13622 : C1740.f8789);
        }
        return c13622;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.f1698;
     */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1081 m2189(Object obj) {
        InterfaceC1081 interfaceC1081;
        C2135 c2135 = this.f4594.m4645().f8009;
        Class<?> cls = obj.getClass();
        synchronized (c2135) {
            Iterator it = c2135.f10556.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC1081 = null;
                    break;
                }
                C0322 c0322 = (C0322) it.next();
                if (c0322.f1697.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC1081 != null) {
            return interfaceC1081;
        }
        throw new C2566("Failed to find source encoder for data class: " + obj.getClass());
    }
}
