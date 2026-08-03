package p266s0;

import p005a5.C0016a;
import p117i0.AbstractC1869p1;
import p117i0.InterfaceC1870p2;
import p117i0.InterfaceC1880t;
import p223p0.C3274b;
import p223p0.C3282j;

/* JADX INFO: renamed from: s0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3878h extends C3274b implements InterfaceC1880t {

    /* JADX INFO: renamed from: j */
    public static final C3878h f12733j = new C3878h(C3282j.f10439e, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C3878h m8066c(AbstractC1869p1 abstractC1869p1, InterfaceC1870p2 interfaceC1870p2) {
        C0016a c0016aM6963u = this.f10424g.m6963u(abstractC1869p1.hashCode(), abstractC1869p1, interfaceC1870p2, 0);
        return c0016aM6963u == null ? this : new C3878h((C3282j) c0016aM6963u.f56i, this.f10425h + c0016aM6963u.f55h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223p0.C3274b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1869p1) {
            return super.containsKey((AbstractC1869p1) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223p0.C3274b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1870p2) {
            return super.containsValue((InterfaceC1870p2) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223p0.C3274b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1869p1) {
            return (InterfaceC1870p2) super.get((AbstractC1869p1) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1869p1) ? obj2 : (InterfaceC1870p2) super.getOrDefault((AbstractC1869p1) obj, (InterfaceC1870p2) obj2);
    }
}
