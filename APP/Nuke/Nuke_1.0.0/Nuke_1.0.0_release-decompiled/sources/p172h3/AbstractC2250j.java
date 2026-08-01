package p172h3;

/* JADX INFO: renamed from: h3.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2250j {

    /* JADX INFO: renamed from: a */
    public static final C2249i f7392a = new C2249i();

    /* JADX INFO: renamed from: a */
    public static C2243c m4101a(int i5, int i6, EnumC2241a enumC2241a) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        int i7 = i6 & 2;
        EnumC2241a enumC2241a2 = EnumC2241a.f7351d;
        if (i7 != 0) {
            enumC2241a = enumC2241a2;
        }
        if (i5 == -2) {
            if (enumC2241a != enumC2241a2) {
                return new C2254n(1, enumC2241a);
            }
            InterfaceC2247g.f7390c.getClass();
            return new C2243c(C2246f.f7389b);
        }
        if (i5 != -1) {
            return i5 != 0 ? i5 != Integer.MAX_VALUE ? enumC2241a == enumC2241a2 ? new C2243c(i5) : new C2254n(i5, enumC2241a) : new C2243c(Integer.MAX_VALUE) : enumC2241a == enumC2241a2 ? new C2243c(0) : new C2254n(1, enumC2241a);
        }
        if (enumC2241a == enumC2241a2) {
            return new C2254n(1, EnumC2241a.f7352e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
