package p038ce;

import java.util.Comparator;
import java.util.LinkedHashMap;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p215od.C3128a;
import p302ud.C4305a;

/* JADX INFO: renamed from: ce.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0549b implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1729g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1730h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0549b(Object obj, int i9) {
        this.f1729g = i9;
        this.f1730h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1729g) {
            case 0:
                C3128a c3128a = (C3128a) obj;
                C3128a c3128a2 = (C3128a) obj2;
                int iCompare = ((Comparator) this.f1730h).compare(c3128a.f10138g, c3128a2.f10138g);
                return iCompare == -2 ? c3128a.compareTo(c3128a2) : iCompare;
            case 1:
                return ((Number) ((InterfaceC1235p) this.f1730h).invoke(obj, obj2)).intValue();
            case 2:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1730h;
                C4305a c4305a = (C4305a) obj;
                C4305a c4305a2 = (C4305a) obj2;
                C4305a c4305a3 = (C4305a) linkedHashMap.get(c4305a);
                if (c4305a3 != null) {
                    if (c4305a2.equals(c4305a3)) {
                        return -1;
                    }
                } else if (c4305a.equals(linkedHashMap.get(c4305a2))) {
                    return 1;
                }
                return 0;
            default:
                for (InterfaceC1231l interfaceC1231l : (InterfaceC1231l[]) this.f1730h) {
                    int iM249m = AbstractC0018a.m249m((Comparable) interfaceC1231l.invoke(obj), (Comparable) interfaceC1231l.invoke(obj2));
                    if (iM249m != 0) {
                        return iM249m;
                    }
                }
                return 0;
        }
    }
}
