package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399m0 {

    /* JADX INFO: renamed from: a */
    public static final Comparator f1141a = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.l0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC0399m0.m1275a((InterfaceC0391k0) obj, (InterfaceC0391k0) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public static int m1275a(InterfaceC0391k0 interfaceC0391k0, InterfaceC0391k0 interfaceC0391k02) {
        return AbstractC1061t.m3843d(interfaceC0391k0.getIndex(), interfaceC0391k02.getIndex());
    }

    /* JADX INFO: renamed from: b */
    public static final List m1276b(int i10, int i11, List list, List list2) {
        if (list.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        List listM20560a1 = AbstractC5081g0.m20560a1(list2);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC0391k0 interfaceC0391k0 = (InterfaceC0391k0) list.get(i12);
            int index = interfaceC0391k0.getIndex();
            if (i10 <= index && index <= i11) {
                listM20560a1.add(interfaceC0391k0);
            }
        }
        AbstractC5067b0.m20482D(listM20560a1, f1141a);
        return listM20560a1;
    }
}
