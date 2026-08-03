package p104h4;

import bsh.C0353j;
import p060e4.C0824a;
import p121i4.C1975p;

/* JADX INFO: renamed from: h4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595i extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final C1975p f5267b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1595i(C1975p c1975p) {
        super("LineNumberTable");
        try {
            if (c1975p.f24613g) {
                throw new C0824a("lineNumbers.isMutable()", null);
            }
            this.f5267b = c1975p;
        } catch (NullPointerException unused) {
            C0353j.m1305c("lineNumbers == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return (this.f5267b.f24601h.length * 4) + 8;
    }
}
