package p189n;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p265s1.AbstractC7078g1;

/* JADX INFO: renamed from: n.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5294w {

    /* JADX INFO: renamed from: a */
    public final float f16260a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7078g1 f16261b;

    public C5294w(float f10, AbstractC7078g1 abstractC7078g1) {
        this.f16260a = f10;
        this.f16261b = abstractC7078g1;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7078g1 m21603a() {
        return this.f16261b;
    }

    /* JADX INFO: renamed from: b */
    public final float m21604b() {
        return this.f16260a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5294w)) {
            return false;
        }
        C5294w c5294w = (C5294w) obj;
        return C3179i.m12005m(this.f16260a, c5294w.f16260a) && AbstractC1061t.m3842c(this.f16261b, c5294w.f16261b);
    }

    public int hashCode() {
        return (C3179i.m12006n(this.f16260a) * 31) + this.f16261b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) C3179i.m12007p(this.f16260a)) + ", brush=" + this.f16261b + ')';
    }

    public /* synthetic */ C5294w(float f10, AbstractC7078g1 abstractC7078g1, AbstractC1043k abstractC1043k) {
        this(f10, abstractC7078g1);
    }
}
