package androidx.compose.runtime;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574r1 {

    /* JADX INFO: renamed from: a */
    public final Object f1578a;

    /* JADX INFO: renamed from: b */
    public final Object f1579b;

    public C0574r1(Object obj, Object obj2) {
        this.f1578a = obj;
        this.f1579b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2193a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0574r1)) {
            return false;
        }
        C0574r1 c0574r1 = (C0574r1) obj;
        return AbstractC1061t.m3842c(this.f1578a, c0574r1.f1578a) && AbstractC1061t.m3842c(this.f1579b, c0574r1.f1579b);
    }

    public int hashCode() {
        return (m2193a(this.f1578a) * 31) + m2193a(this.f1579b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f1578a + ", right=" + this.f1579b + ')';
    }
}
