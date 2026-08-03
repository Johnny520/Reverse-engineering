package p104h4;

import bsh.C0353j;
import p060e4.C0824a;

/* JADX INFO: renamed from: h4.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1594h extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final C1607u f5266b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1594h(C1607u c1607u) {
        super("InnerClasses");
        try {
            if (c1607u.f24613g) {
                throw new C0824a("innerClasses.isMutable()", null);
            }
            this.f5266b = c1607u;
        } catch (NullPointerException unused) {
            C0353j.m1305c("innerClasses == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return (this.f5266b.f24601h.length * 8) + 8;
    }
}
