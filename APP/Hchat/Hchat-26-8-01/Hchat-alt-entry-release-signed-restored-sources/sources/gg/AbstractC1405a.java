package gg;

import java.io.Serializable;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1405a implements InterfaceC1413i, Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f4711g;

    /* JADX INFO: renamed from: h */
    public final Class f4712h;

    /* JADX INFO: renamed from: i */
    public final String f4713i;

    /* JADX INFO: renamed from: j */
    public final String f4714j;

    /* JADX INFO: renamed from: k */
    public final boolean f4715k = false;

    /* JADX INFO: renamed from: l */
    public final int f4716l;

    /* JADX INFO: renamed from: m */
    public final int f4717m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1405a(int i9, int i10, Class cls, Object obj, String str, String str2) {
        this.f4711g = obj;
        this.f4712h = cls;
        this.f4713i = str;
        this.f4714j = str2;
        this.f4716l = i9;
        this.f4717m = i10 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1405a)) {
            return false;
        }
        AbstractC1405a abstractC1405a = (AbstractC1405a) obj;
        return this.f4715k == abstractC1405a.f4715k && this.f4716l == abstractC1405a.f4716l && this.f4717m == abstractC1405a.f4717m && this.f4711g.equals(abstractC1405a.f4711g) && this.f4712h.equals(abstractC1405a.f4712h) && this.f4713i.equals(abstractC1405a.f4713i) && this.f4714j.equals(abstractC1405a.f4714j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1413i
    public final int getArity() {
        return this.f4716l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((AbstractC0921a.m2244g(AbstractC0921a.m2244g((this.f4712h.hashCode() + (this.f4711g.hashCode() * 31)) * 31, 31, this.f4713i), 31, this.f4714j) + (this.f4715k ? 1231 : 1237)) * 31) + this.f4716l) * 31) + this.f4717m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        AbstractC1426v.f4739a.getClass();
        return C1427w.m3835a(this);
    }
}
