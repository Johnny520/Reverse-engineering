package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4324l1 implements InterfaceC4303h0 {

    /* JADX INFO: renamed from: a */
    public final float f12651a;

    /* JADX INFO: renamed from: b */
    public final float f12652b;

    /* JADX INFO: renamed from: c */
    public final Object f12653c;

    public /* synthetic */ C4324l1(float f10, float f11, Object obj, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4324l1) {
            C4324l1 c4324l1 = (C4324l1) obj;
            if (c4324l1.f12651a == this.f12651a && c4324l1.f12652b == this.f12652b && AbstractC1061t.m3842c(c4324l1.f12653c, this.f12653c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final float m16977f() {
        return this.f12651a;
    }

    /* JADX INFO: renamed from: g */
    public final float m16978g() {
        return this.f12652b;
    }

    /* JADX INFO: renamed from: h */
    public final Object m16979h() {
        return this.f12653c;
    }

    public int hashCode() {
        Object obj = this.f12653c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f12651a)) * 31) + Float.hashCode(this.f12652b);
    }

    @Override // p163l.InterfaceC4317k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C4396z3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4396z3(this.f12651a, this.f12652b, AbstractC4322l.m16966b(interfaceC4365t2, this.f12653c));
    }

    public C4324l1(float f10, float f11, Object obj) {
        this.f12651a = f10;
        this.f12652b = f11;
        this.f12653c = obj;
    }
}
