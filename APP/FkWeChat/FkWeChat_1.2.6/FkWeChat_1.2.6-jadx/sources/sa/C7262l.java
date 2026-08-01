package sa;

import java.util.Comparator;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;

/* JADX INFO: renamed from: sa.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7262l implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C7262l f24141a = new C7262l();

    /* JADX INFO: renamed from: b */
    public static Integer m28787b(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        int iM28788c = m28788c(interfaceC6019m2) - m28788c(interfaceC6019m);
        if (iM28788c != 0) {
            return Integer.valueOf(iM28788c);
        }
        if (AbstractC7259i.m28736B(interfaceC6019m) && AbstractC7259i.m28736B(interfaceC6019m2)) {
            return 0;
        }
        int iCompareTo = interfaceC6019m.getName().compareTo(interfaceC6019m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m28788c(InterfaceC6019m interfaceC6019m) {
        if (AbstractC7259i.m28736B(interfaceC6019m)) {
            return 8;
        }
        if (interfaceC6019m instanceof InterfaceC6016l) {
            return 7;
        }
        if (interfaceC6019m instanceof InterfaceC6055y0) {
            return ((InterfaceC6055y0) interfaceC6019m).mo12682q0() == null ? 6 : 5;
        }
        if (interfaceC6019m instanceof InterfaceC6056z) {
            return ((InterfaceC6056z) interfaceC6019m).mo12682q0() == null ? 4 : 3;
        }
        if (interfaceC6019m instanceof InterfaceC5995e) {
            return 2;
        }
        return interfaceC6019m instanceof InterfaceC6015k1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        Integer numM28787b = m28787b(interfaceC6019m, interfaceC6019m2);
        if (numM28787b != null) {
            return numM28787b.intValue();
        }
        return 0;
    }
}
