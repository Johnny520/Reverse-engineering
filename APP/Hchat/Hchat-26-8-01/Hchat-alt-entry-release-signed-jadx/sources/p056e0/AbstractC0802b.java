package p056e0;

import p085fg.InterfaceC1220a;
import p267s1.C3892e0;
import p339x1.C5621l;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0802b {

    /* JADX INFO: renamed from: a */
    public static final C5621l f2399a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f3 = 40;
        float f10 = 10;
        f2399a = new C5621l(f10, f3, f10, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5853o m2033a(boolean z9, boolean z10, InterfaceC1220a interfaceC1220a) {
        InterfaceC5853o c3892e0 = C5850l.f23787a;
        if (!z9 || !AbstractC0805e.f2409a) {
            return c3892e0;
        }
        if (z10) {
            c3892e0 = new C3892e0(f2399a);
        }
        return c3892e0.mo10549d(new C0801a(interfaceC1220a));
    }
}
