package p102h1;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;

/* JADX INFO: renamed from: h1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2820b {
    /* JADX INFO: renamed from: a */
    public static Object m10039a(InterfaceC0188p interfaceC0188p, InterfaceC2821b0 interfaceC2821b0, Object obj) {
        List list = (List) interfaceC0188p.invoke(interfaceC2821b0, obj);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            if (obj2 != null && !interfaceC2821b0.mo10041a(obj2)) {
                throw new IllegalArgumentException(("item at index " + i10 + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2843x m10040b(final InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l) {
        InterfaceC0188p interfaceC0188p2 = new InterfaceC0188p() { // from class: h1.a
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC2820b.m10039a(interfaceC0188p, (InterfaceC2821b0) obj, obj2);
            }
        };
        interfaceC0184l.getClass();
        return AbstractC2819a0.m10035c(interfaceC0188p2, (InterfaceC0184l) AbstractC1064u0.m3858f(interfaceC0184l, 1));
    }
}
