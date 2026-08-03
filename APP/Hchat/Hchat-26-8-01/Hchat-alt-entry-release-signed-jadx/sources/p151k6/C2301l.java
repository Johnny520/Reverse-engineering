package p151k6;

import java.util.concurrent.ConcurrentHashMap;
import p100h0.C1545q0;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p123i6.InterfaceC1989a;
import p134j6.AbstractC2070h;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2301l implements InterfaceC1623o {

    /* JADX INFO: renamed from: i */
    public static final C2299k f7622i;

    /* JADX INFO: renamed from: g */
    public final C1545q0 f7623g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f7624h = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 0;
        f7622i = new C2299k(i9);
        new C2299k(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2301l(C1545q0 c1545q0) {
        this.f7623g = c1545q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        InterfaceC1989a interfaceC1989a = (InterfaceC1989a) c2901a.f9368a.getAnnotation(InterfaceC1989a.class);
        if (interfaceC1989a == null) {
            return null;
        }
        return m5529b(this.f7623g, c1614f, c2901a, interfaceC1989a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC1622n m5529b(C1545q0 c1545q0, C1614f c1614f, C2901a c2901a, InterfaceC1989a interfaceC1989a, boolean z9) {
        AbstractC1622n abstractC1622nMo4137a;
        Object objMo4937d = c1545q0.m4042c(new C2901a(interfaceC1989a.value()), true).mo4937d();
        boolean zNullSafe = interfaceC1989a.nullSafe();
        if (objMo4937d instanceof AbstractC1622n) {
            abstractC1622nMo4137a = (AbstractC1622n) objMo4937d;
        } else {
            if (!(objMo4937d instanceof InterfaceC1623o)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo4937d.getClass().getName() + " as a @JsonAdapter for " + AbstractC2070h.m5131i(c2901a.f9369b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC1623o interfaceC1623o = (InterfaceC1623o) objMo4937d;
            if (z9) {
                InterfaceC1623o interfaceC1623o2 = (InterfaceC1623o) this.f7624h.putIfAbsent(c2901a.f9368a, interfaceC1623o);
                if (interfaceC1623o2 != null) {
                    interfaceC1623o = interfaceC1623o2;
                }
            }
            abstractC1622nMo4137a = interfaceC1623o.mo4137a(c1614f, c2901a);
        }
        return (abstractC1622nMo4137a == null || !zNullSafe) ? abstractC1622nMo4137a : abstractC1622nMo4137a.m4136a();
    }
}
