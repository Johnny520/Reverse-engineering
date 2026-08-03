package p117i0;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: i0.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1869p1 {

    /* JADX INFO: renamed from: a */
    public final C1878s0 f6198a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1869p1(InterfaceC1220a interfaceC1220a) {
        this.f6198a = new C1878s0(interfaceC1220a);
    }

    /* JADX INFO: renamed from: a */
    public abstract C1873q1 mo4582a(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public InterfaceC1870p2 mo4585b() {
        return this.f6198a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC1870p2 m4586c(C1873q1 c1873q1, InterfaceC1870p2 interfaceC1870p2) {
        InterfaceC1870p2 interfaceC1870p22 = null;
        interfaceC1870p22 = null;
        interfaceC1870p22 = null;
        interfaceC1870p22 = null;
        interfaceC1870p22 = null;
        interfaceC1870p22 = null;
        if (interfaceC1870p2 instanceof C1812b0) {
            if (c1873q1.f6228d) {
                C1812b0 c1812b0 = (C1812b0) interfaceC1870p2;
                c1812b0.f6031a.setValue(c1873q1.m4614a());
                interfaceC1870p22 = c1812b0;
            }
        } else if (interfaceC1870p2 instanceof C1862n2) {
            if ((c1873q1.f6226b || c1873q1.f6229e != null) && !c1873q1.f6228d) {
                C1862n2 c1862n2 = (C1862n2) interfaceC1870p2;
                if (AbstractC1416l.m3825a(c1873q1.m4614a(), c1862n2.f6187a)) {
                    interfaceC1870p22 = c1862n2;
                }
            }
        } else if (interfaceC1870p2 instanceof C1886v) {
            c1873q1.getClass();
        }
        if (interfaceC1870p22 != null) {
            return interfaceC1870p22;
        }
        if (!c1873q1.f6228d) {
            return new C1862n2(c1873q1.m4614a());
        }
        Object obj = c1873q1.f6229e;
        C1823e c1823e = c1873q1.f6227c;
        if (c1823e == null) {
            c1823e = C1823e.f6052m;
        }
        return new C1812b0(new C1845j1(obj, c1823e));
    }
}
