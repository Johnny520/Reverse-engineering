package p172l8;

import java.io.Serializable;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l8.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4711r implements Serializable {

    /* JADX INFO: renamed from: q */
    public final Object f13926q;

    /* JADX INFO: renamed from: r */
    public final Object f13927r;

    public C4711r(Object obj, Object obj2) {
        this.f13926q = obj;
        this.f13927r = obj2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C4711r m18791d(C4711r c4711r, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c4711r.f13926q;
        }
        if ((i10 & 2) != 0) {
            obj2 = c4711r.f13927r;
        }
        return c4711r.m18794c(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m18792a() {
        return this.f13926q;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18793b() {
        return this.f13927r;
    }

    /* JADX INFO: renamed from: c */
    public final C4711r m18794c(Object obj, Object obj2) {
        return new C4711r(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public final Object m18795e() {
        return this.f13926q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4711r)) {
            return false;
        }
        C4711r c4711r = (C4711r) obj;
        return AbstractC1061t.m3842c(this.f13926q, c4711r.f13926q) && AbstractC1061t.m3842c(this.f13927r, c4711r.f13927r);
    }

    /* JADX INFO: renamed from: f */
    public final Object m18796f() {
        return this.f13927r;
    }

    public int hashCode() {
        Object obj = this.f13926q;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13927r;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.f13926q + ", " + this.f13927r + ')';
    }
}
