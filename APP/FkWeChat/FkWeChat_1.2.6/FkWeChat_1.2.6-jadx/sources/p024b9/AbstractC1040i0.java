package p024b9;

import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2557k;
import p215oc.C5725t;

/* JADX INFO: renamed from: b9.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1040i0 extends AbstractC1033f implements InterfaceC2557k {

    /* JADX INFO: renamed from: x */
    public final boolean f3200x;

    public AbstractC1040i0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f3200x = (i10 & 2) == 2;
    }

    @Override // p024b9.AbstractC1033f
    /* JADX INFO: renamed from: a */
    public InterfaceC2548b mo3777a() {
        return this.f3200x ? this : super.mo3777a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1040i0) {
            AbstractC1040i0 abstractC1040i0 = (AbstractC1040i0) obj;
            return m3782l().equals(abstractC1040i0.m3782l()) && getName().equals(abstractC1040i0.getName()) && m3786w().equals(abstractC1040i0.m3786w()) && AbstractC1061t.m3842c(m3780g(), abstractC1040i0.m3780g());
        }
        if (obj instanceof InterfaceC2557k) {
            return obj.equals(mo3777a());
        }
        return false;
    }

    public int hashCode() {
        return (((m3782l().hashCode() * 31) + getName().hashCode()) * 31) + m3786w().hashCode();
    }

    public String toString() {
        InterfaceC2548b interfaceC2548bMo3777a = mo3777a();
        if (interfaceC2548bMo3777a != this) {
            return interfaceC2548bMo3777a.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p024b9.AbstractC1033f
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC2557k mo3785v() {
        if (!this.f3200x) {
            return (InterfaceC2557k) super.mo3785v();
        }
        C5725t.m23179a("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }
}
