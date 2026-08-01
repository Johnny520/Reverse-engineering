package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p117i.AbstractC3071m;
import p121i3.C3185o;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0396l1 {
    /* JADX INFO: renamed from: b */
    public static final List m1272b(InterfaceC0401m2 interfaceC0401m2, int i10, int i11, List list, AbstractC3071m abstractC3071m, int i12, int i13, int i14, int i15, InterfaceC0184l interfaceC0184l) {
        InterfaceC0401m2 interfaceC0401m22 = interfaceC0401m2;
        if (interfaceC0401m22 == null || list.isEmpty() || abstractC3071m.f8151b == 0) {
            return AbstractC5114x.m20800o();
        }
        AbstractC3071m abstractC3071mMo1277a = interfaceC0401m22.mo1277a(i10, i11, abstractC3071m);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            if (abstractC3071m.m11415c(((InterfaceC0391k0) obj).getIndex())) {
                arrayList2.add(obj);
            }
        }
        int[] iArr = abstractC3071mMo1277a.f8150a;
        int i17 = abstractC3071mMo1277a.f8151b;
        int i18 = 0;
        while (i18 < i17) {
            int i19 = iArr[i18];
            Iterator it = list.iterator();
            int i20 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i20 = -1;
                    break;
                }
                if (((InterfaceC0391k0) it.next()).getIndex() == i19) {
                    break;
                }
                i20++;
            }
            InterfaceC0391k0 interfaceC0391k0 = i20 == -1 ? (InterfaceC0391k0) interfaceC0184l.mo27m(Integer.valueOf(i19)) : (InterfaceC0391k0) list.remove(i20);
            ArrayList arrayList3 = arrayList2;
            InterfaceC0391k0 interfaceC0391k02 = interfaceC0391k0;
            int iMo1278b = interfaceC0401m22.mo1278b(arrayList3, i19, interfaceC0391k0.mo1241d(), i20 == -1 ? Integer.MIN_VALUE : m1273c(interfaceC0391k0), i12, i13, i14, i15);
            interfaceC0391k02.mo1240c(true);
            interfaceC0391k02.mo1249n(iMo1278b, 0, i14, i15);
            arrayList.add(interfaceC0391k02);
            i18++;
            interfaceC0401m22 = interfaceC0401m2;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final int m1273c(InterfaceC0391k0 interfaceC0391k0) {
        long jMo1247j = interfaceC0391k0.mo1247j(0);
        return interfaceC0391k0.mo1246i() ? C3185o.m12050j(jMo1247j) : C3185o.m12049i(jMo1247j);
    }
}
