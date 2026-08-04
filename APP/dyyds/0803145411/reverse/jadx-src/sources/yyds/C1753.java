package yyds;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᛸᛴᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1753 implements InterfaceC2633, InterfaceC0306 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public List f8816;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f8817;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f8818;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC1410 f8819;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public File f8820;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C0800 f8821;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public volatile C1199 f8822;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final RunnableC1650 f8823;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8824 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1008 f8825;

    public C1753(C1008 c1008, RunnableC1650 runnableC1650) {
        this.f8825 = c1008;
        this.f8823 = runnableC1650;
    }

    @Override // yyds.InterfaceC2633
    public final void cancel() {
        C1199 c1199 = this.f8822;
        if (c1199 != null) {
            c1199.f5473.cancel();
        }
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo546(Object obj) {
        this.f8823.mo2883(this.f8819, obj, this.f8822.f5473, 4, this.f8821);
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo567(Exception exc) {
        this.f8823.mo2884(this.f8821, exc, this.f8822.f5473, 4);
    }

    @Override // yyds.InterfaceC2633
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1721() {
        List list;
        ArrayList arrayListM1569;
        ArrayList arrayListM2186 = this.f8825.m2186();
        boolean z = false;
        if (!arrayListM2186.isEmpty()) {
            C1008 c1008 = this.f8825;
            C1578 c1578M4645 = c1008.f4594.m4645();
            Class<?> cls = c1008.f4597.getClass();
            Class cls2 = c1008.f4590;
            Class cls3 = c1008.f4591;
            C2133 c2133 = c1578M4645.f8005;
            C1468 c1468 = (C1468) ((AtomicReference) c2133.f10555).getAndSet(null);
            if (c1468 == null) {
                c1468 = new C1468(cls, cls2, cls3);
            } else {
                c1468.f6980 = cls;
                c1468.f6981 = cls2;
                c1468.f6982 = cls3;
            }
            synchronized (((C1505) c2133.f10553)) {
                list = (List) ((C1505) c2133.f10553).get(c1468);
            }
            ((AtomicReference) c2133.f10555).set(c1468);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C2133 c21332 = c1578M4645.f8008;
                synchronized (c21332) {
                    arrayListM1569 = ((C0644) c21332.f10555).m1569(cls);
                }
                Iterator it = arrayListM1569.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c1578M4645.f8012.m557((Class) it.next(), cls2)) {
                        if (!c1578M4645.f8013.m4073(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C2133 c21333 = c1578M4645.f8005;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C1505) c21333.f10553)) {
                    ((C1505) c21333.f10553).put(new C1468(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f8816;
                    if (list3 != null && this.f8817 < list3.size()) {
                        this.f8822 = null;
                        while (!z && this.f8817 < this.f8816.size()) {
                            List list4 = this.f8816;
                            int i = this.f8817;
                            this.f8817 = i + 1;
                            InterfaceC0894 interfaceC0894 = (InterfaceC0894) list4.get(i);
                            File file = this.f8820;
                            C1008 c10082 = this.f8825;
                            this.f8822 = interfaceC0894.mo940(file, c10082.f4584, c10082.f4596, c10082.f4583);
                            if (this.f8822 != null && this.f8825.m2188(this.f8822.f5473.mo417()) != null) {
                                this.f8822.f5473.mo514(this.f8825.f4586, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f8824 + 1;
                    this.f8824 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f8818 + 1;
                        this.f8818 = i3;
                        if (i3 >= arrayListM2186.size()) {
                            break;
                        }
                        this.f8824 = 0;
                    }
                    InterfaceC1410 interfaceC1410 = (InterfaceC1410) arrayListM2186.get(this.f8818);
                    Class cls5 = (Class) list2.get(this.f8824);
                    InterfaceC0556 interfaceC0556M2185 = this.f8825.m2185(cls5);
                    C1008 c10083 = this.f8825;
                    this.f8821 = new C0800(c10083.f4594.f12664, interfaceC1410, c10083.f4580, c10083.f4584, c10083.f4596, interfaceC0556M2185, cls5, c10083.f4583);
                    File fileMo949 = c10083.f4581.m1635().mo949(this.f8821);
                    this.f8820 = fileMo949;
                    if (fileMo949 != null) {
                        this.f8819 = interfaceC1410;
                        this.f8816 = this.f8825.f4594.m4645().m3230(fileMo949);
                        this.f8817 = 0;
                    }
                }
            } else if (!File.class.equals(this.f8825.f4591)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.f8825.f4597.getClass());
                Class cls6 = this.f8825.f4591;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }
}
