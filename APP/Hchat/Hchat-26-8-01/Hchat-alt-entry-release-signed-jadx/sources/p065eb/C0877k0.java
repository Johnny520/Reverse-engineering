package p065eb;

import p243q9.C3465a;

/* JADX INFO: renamed from: eb.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0877k0 {

    /* JADX INFO: renamed from: a */
    public final C3465a f2692a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0877k0(C3465a c3465a) {
        this.f2692a = c3465a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0877k0) && this.f2692a.equals(((C0877k0) obj).f2692a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2692a.hashCode() + 480288616;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RegisteredTextDecorator(id=message_affix, decorator=" + this.f2692a + ")";
    }
}
