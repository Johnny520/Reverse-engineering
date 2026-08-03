package sg;

import p136j8.C2104o;

/* JADX INFO: renamed from: sg.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3978j {

    /* JADX INFO: renamed from: a */
    public static final C3977i f13020a = new C3977i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3971c m8218a(int i9, int i10, EnumC3969a enumC3969a) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        int i11 = i10 & 2;
        EnumC3969a enumC3969a2 = EnumC3969a.f12979g;
        if (i11 != 0) {
            enumC3969a = enumC3969a2;
        }
        if (i9 == -2) {
            if (enumC3969a != enumC3969a2) {
                return new C3982n(1, enumC3969a);
            }
            InterfaceC3975g.f13018e.getClass();
            return new C3971c(C3974f.f13017b);
        }
        if (i9 != -1) {
            return i9 != 0 ? i9 != Integer.MAX_VALUE ? enumC3969a == enumC3969a2 ? new C3971c(i9) : new C3982n(i9, enumC3969a) : new C3971c(Integer.MAX_VALUE) : enumC3969a == enumC3969a2 ? new C3971c(0) : new C3982n(1, enumC3969a);
        }
        if (enumC3969a == enumC3969a2) {
            return new C3982n(1, EnumC3969a.f12980h);
        }
        C2104o.m5294t("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
