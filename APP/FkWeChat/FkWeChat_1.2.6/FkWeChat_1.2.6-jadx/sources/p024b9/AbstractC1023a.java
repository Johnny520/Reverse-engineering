package p024b9;

import java.io.Serializable;

/* JADX INFO: renamed from: b9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1023a implements InterfaceC1051o, Serializable {

    /* JADX INFO: renamed from: q */
    public final Object f3175q;

    /* JADX INFO: renamed from: r */
    public final Class f3176r;

    /* JADX INFO: renamed from: s */
    public final String f3177s;

    /* JADX INFO: renamed from: t */
    public final String f3178t;

    /* JADX INFO: renamed from: u */
    public final boolean f3179u;

    /* JADX INFO: renamed from: v */
    public final int f3180v;

    /* JADX INFO: renamed from: w */
    public final int f3181w;

    public AbstractC1023a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f3175q = obj;
        this.f3176r = cls;
        this.f3177s = str;
        this.f3178t = str2;
        this.f3179u = (i11 & 1) == 1;
        this.f3180v = i10;
        this.f3181w = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1023a)) {
            return false;
        }
        AbstractC1023a abstractC1023a = (AbstractC1023a) obj;
        return this.f3179u == abstractC1023a.f3179u && this.f3180v == abstractC1023a.f3180v && this.f3181w == abstractC1023a.f3181w && AbstractC1061t.m3842c(this.f3175q, abstractC1023a.f3175q) && AbstractC1061t.m3842c(this.f3176r, abstractC1023a.f3176r) && this.f3177s.equals(abstractC1023a.f3177s) && this.f3178t.equals(abstractC1023a.f3178t);
    }

    @Override // p024b9.InterfaceC1051o
    public int getArity() {
        return this.f3180v;
    }

    public int hashCode() {
        Object obj = this.f3175q;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f3176r;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f3177s.hashCode()) * 31) + this.f3178t.hashCode()) * 31) + (this.f3179u ? 1231 : 1237)) * 31) + this.f3180v) * 31) + this.f3181w;
    }

    public String toString() {
        return AbstractC1052o0.m3815j(this);
    }

    public AbstractC1023a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, AbstractC1033f.f3188w, cls, str, str2, i11);
    }
}
