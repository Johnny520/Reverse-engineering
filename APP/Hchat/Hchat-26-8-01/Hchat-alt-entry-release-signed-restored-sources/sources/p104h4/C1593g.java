package p104h4;

import bsh.C0353j;
import p060e4.C0824a;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: h4.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1593g extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final InterfaceC4685e f5265b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1593g(InterfaceC4685e interfaceC4685e) {
        super("Exceptions");
        try {
            if (interfaceC4685e.mo355e()) {
                throw new C0824a("exceptions.isMutable()", null);
            }
            this.f5265b = interfaceC4685e;
        } catch (NullPointerException unused) {
            C0353j.m1305c("exceptions == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return (this.f5265b.size() * 2) + 8;
    }
}
