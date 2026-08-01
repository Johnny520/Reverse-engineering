package p024b9;

import java.util.Collection;
import p372z8.C9887b;

/* JADX INFO: renamed from: b9.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1030d0 implements InterfaceC1037h {

    /* JADX INFO: renamed from: q */
    public final Class f3185q;

    /* JADX INFO: renamed from: r */
    public final String f3186r;

    public C1030d0(Class cls, String str) {
        cls.getClass();
        str.getClass();
        this.f3185q = cls;
        this.f3186r = str;
    }

    @Override // p024b9.InterfaceC1037h
    /* JADX INFO: renamed from: b */
    public Class mo3775b() {
        return this.f3185q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1030d0) && AbstractC1061t.m3842c(mo3775b(), ((C1030d0) obj).mo3775b());
    }

    public int hashCode() {
        return mo3775b().hashCode();
    }

    @Override // p098g9.InterfaceC2551e
    /* JADX INFO: renamed from: t */
    public Collection mo3776t() {
        throw new C9887b();
    }

    public String toString() {
        return mo3775b().toString() + " (Kotlin reflection is not available)";
    }
}
