package p095T;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1333Q {

    /* JADX INFO: renamed from: a */
    public final Integer f4764a;

    /* JADX INFO: renamed from: b */
    public final Object f4765b;

    public C1333Q(Integer num, Object obj) {
        this.f4764a = num;
        this.f4765b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1333Q)) {
            return false;
        }
        C1333Q c1333q = (C1333Q) obj;
        return this.f4764a.equals(c1333q.f4764a) && AbstractC1665j.m2981a(this.f4765b, c1333q.f4765b);
    }

    public final int hashCode() {
        int iHashCode = this.f4764a.hashCode() * 31;
        Object obj = this.f4765b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4764a + ", right=" + this.f4765b + ')';
    }
}
