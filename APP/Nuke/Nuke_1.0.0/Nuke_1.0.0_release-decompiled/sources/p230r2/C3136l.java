package p230r2;

import java.util.concurrent.ConcurrentHashMap;
import p154e2.C2029h;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p219p2.InterfaceC2890a;
import p224q2.AbstractC2917h;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3136l implements InterfaceC2771C {

    /* JADX INFO: renamed from: f */
    public static final C3135k f9873f;

    /* JADX INFO: renamed from: d */
    public final C2029h f9874d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f9875e = new ConcurrentHashMap();

    static {
        int i5 = 0;
        f9873f = new C3135k(i5);
        new C3135k(i5);
    }

    public C3136l(C2029h c2029h) {
        this.f9874d = c2029h;
    }

    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        InterfaceC2890a interfaceC2890a = (InterfaceC2890a) c3352a.f10417a.getAnnotation(InterfaceC2890a.class);
        if (interfaceC2890a == null) {
            return null;
        }
        return m5411b(this.f9874d, c2785n, c3352a, interfaceC2890a, true);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2770B m5411b(C2029h c2029h, C2785n c2785n, C3352a c3352a, InterfaceC2890a interfaceC2890a, boolean z5) {
        AbstractC2770B abstractC2770BMo4967a;
        Object objMo602c = c2029h.m3725c(new C3352a(interfaceC2890a.value()), true).mo602c();
        boolean zNullSafe = interfaceC2890a.nullSafe();
        if (objMo602c instanceof AbstractC2770B) {
            abstractC2770BMo4967a = (AbstractC2770B) objMo602c;
        } else {
            if (!(objMo602c instanceof InterfaceC2771C)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo602c.getClass().getName() + " as a @JsonAdapter for " + AbstractC2917h.m5119k(c3352a.f10418b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC2771C interfaceC2771C = (InterfaceC2771C) objMo602c;
            if (z5) {
                InterfaceC2771C interfaceC2771C2 = (InterfaceC2771C) this.f9875e.putIfAbsent(c3352a.f10417a, interfaceC2771C);
                if (interfaceC2771C2 != null) {
                    interfaceC2771C = interfaceC2771C2;
                }
            }
            abstractC2770BMo4967a = interfaceC2771C.mo4967a(c2785n, c3352a);
        }
        return (abstractC2770BMo4967a == null || !zNullSafe) ? abstractC2770BMo4967a : abstractC2770BMo4967a.m4966a();
    }
}
