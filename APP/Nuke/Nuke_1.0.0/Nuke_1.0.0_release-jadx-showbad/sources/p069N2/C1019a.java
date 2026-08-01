package p069N2;

import java.util.Comparator;
import p049I2.AbstractC0797o;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: N2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1019a implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3161b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1019a(int i5, Object obj) {
        this.f3160a = i5;
        this.f3161b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3160a) {
            case 0:
                for (InterfaceC1601c interfaceC1601c : (InterfaceC1601c[]) this.f3161b) {
                    int iM1386k = AbstractC0797o.m1386k((Comparable) interfaceC1601c.mo1h(obj), (Comparable) interfaceC1601c.mo1h(obj2));
                    if (iM1386k != 0) {
                        return iM1386k;
                    }
                }
                return 0;
            default:
                return ((Number) ((InterfaceC1603e) this.f3161b).mo0g(obj, obj2)).intValue();
        }
    }
}
