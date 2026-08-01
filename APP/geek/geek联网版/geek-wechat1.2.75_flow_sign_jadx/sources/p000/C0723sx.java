package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: sx */
/* JADX INFO: loaded from: classes.dex */
public final class C0723sx implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f4373a;

    /* JADX INFO: renamed from: b */
    public final Object f4374b;

    public C0723sx(Object obj, Object obj2) {
        this.f4373a = obj;
        this.f4374b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0723sx)) {
            return false;
        }
        C0723sx c0723sx = (C0723sx) obj;
        return AbstractC0493mp.m1853c(this.f4373a, c0723sx.f4373a) && AbstractC0493mp.m1853c(this.f4374b, c0723sx.f4374b);
    }

    public final int hashCode() {
        Object obj = this.f4373a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4374b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4373a + ", " + this.f4374b + ')';
    }
}
