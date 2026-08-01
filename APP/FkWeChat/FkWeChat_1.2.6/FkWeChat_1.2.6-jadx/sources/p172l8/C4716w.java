package p172l8;

import java.io.Serializable;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l8.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4716w implements Serializable {

    /* JADX INFO: renamed from: q */
    public final Object f13939q;

    /* JADX INFO: renamed from: r */
    public final Object f13940r;

    /* JADX INFO: renamed from: s */
    public final Object f13941s;

    public C4716w(Object obj, Object obj2, Object obj3) {
        this.f13939q = obj;
        this.f13940r = obj2;
        this.f13941s = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final Object m18809a() {
        return this.f13939q;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18810b() {
        return this.f13940r;
    }

    /* JADX INFO: renamed from: c */
    public final Object m18811c() {
        return this.f13941s;
    }

    /* JADX INFO: renamed from: d */
    public final Object m18812d() {
        return this.f13939q;
    }

    /* JADX INFO: renamed from: e */
    public final Object m18813e() {
        return this.f13940r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4716w)) {
            return false;
        }
        C4716w c4716w = (C4716w) obj;
        return AbstractC1061t.m3842c(this.f13939q, c4716w.f13939q) && AbstractC1061t.m3842c(this.f13940r, c4716w.f13940r) && AbstractC1061t.m3842c(this.f13941s, c4716w.f13941s);
    }

    /* JADX INFO: renamed from: f */
    public final Object m18814f() {
        return this.f13941s;
    }

    public int hashCode() {
        Object obj = this.f13939q;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13940r;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f13941s;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.f13939q + ", " + this.f13940r + ", " + this.f13941s + ')';
    }
}
