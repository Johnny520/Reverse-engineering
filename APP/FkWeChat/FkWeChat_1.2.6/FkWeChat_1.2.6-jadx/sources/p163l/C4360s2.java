package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4360s2 implements InterfaceC4283d0 {

    /* JADX INFO: renamed from: a */
    public final int f12770a;

    /* JADX INFO: renamed from: b */
    public final int f12771b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4288e0 f12772c;

    public /* synthetic */ C4360s2(int i10, int i11, InterfaceC4288e0 interfaceC4288e0, int i12, AbstractC1043k abstractC1043k) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? AbstractC4298g0.m16928c() : interfaceC4288e0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4360s2) {
            C4360s2 c4360s2 = (C4360s2) obj;
            if (c4360s2.f12770a == this.f12770a && c4360s2.f12771b == this.f12771b && AbstractC1061t.m3842c(c4360s2.f12772c, this.f12772c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p163l.InterfaceC4283d0, p163l.InterfaceC4317k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4270a4 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4270a4(this.f12770a, this.f12771b, this.f12772c);
    }

    public int hashCode() {
        return (((this.f12770a * 31) + this.f12772c.hashCode()) * 31) + this.f12771b;
    }

    public C4360s2(int i10, int i11, InterfaceC4288e0 interfaceC4288e0) {
        this.f12770a = i10;
        this.f12771b = i11;
        this.f12772c = interfaceC4288e0;
    }
}
