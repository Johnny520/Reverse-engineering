package p148k;

import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;

/* JADX INFO: renamed from: k.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3905z {

    /* JADX INFO: renamed from: a */
    public final float f11367a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4303h0 f11368b;

    public C3905z(float f10, InterfaceC4303h0 interfaceC4303h0) {
        this.f11367a = f10;
        this.f11368b = interfaceC4303h0;
    }

    /* JADX INFO: renamed from: a */
    public final float m15559a() {
        return this.f11367a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4303h0 m15560b() {
        return this.f11368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3905z)) {
            return false;
        }
        C3905z c3905z = (C3905z) obj;
        return Float.compare(this.f11367a, c3905z.f11367a) == 0 && AbstractC1061t.m3842c(this.f11368b, c3905z.f11368b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f11367a) * 31) + this.f11368b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f11367a + ", animationSpec=" + this.f11368b + ')';
    }
}
