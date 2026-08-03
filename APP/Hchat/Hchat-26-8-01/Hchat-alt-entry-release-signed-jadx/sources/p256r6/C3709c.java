package p256r6;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: r6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3709c {

    /* JADX INFO: renamed from: a */
    public final Class f12064a;

    /* JADX INFO: renamed from: b */
    public EnumC3708b f12065b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3709c(Class cls, EnumC3708b enumC3708b) {
        this.f12064a = cls;
        this.f12065b = enumC3708b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3709c)) {
            return false;
        }
        C3709c c3709c = (C3709c) obj;
        return this.f12064a.equals(c3709c.f12064a) && this.f12065b == c3709c.f12065b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12065b.hashCode() + AbstractC0921a.m2245h(this.f12064a.hashCode() * 29791, 31, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Configuration(declaringClass=" + this.f12064a + ", memberInstance=null, processorResolver=null, superclass=false, optional=" + this.f12065b + ")";
    }
}
