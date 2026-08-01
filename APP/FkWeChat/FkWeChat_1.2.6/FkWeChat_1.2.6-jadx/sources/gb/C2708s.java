package gb;

import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p243q9.AbstractC6335j;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: gb.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2708s extends AbstractC2698o1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6333h f7072a;

    public C2708s(InterfaceC6333h interfaceC6333h) {
        interfaceC6333h.getClass();
        this.f7072a = interfaceC6333h;
    }

    @Override // gb.AbstractC2698o1
    /* JADX INFO: renamed from: b */
    public InterfaceC2549c mo9528b() {
        return AbstractC1052o0.m3807b(C2708s.class);
    }

    @Override // gb.AbstractC2698o1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2708s mo9527a(C2708s c2708s) {
        return c2708s == null ? this : new C2708s(AbstractC6335j.m25007a(this.f7072a, c2708s.f7072a));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC6333h m9591e() {
        return this.f7072a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2708s) {
            return AbstractC1061t.m3842c(((C2708s) obj).f7072a, this.f7072a);
        }
        return false;
    }

    @Override // gb.AbstractC2698o1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2708s mo9529c(C2708s c2708s) {
        if (AbstractC1061t.m3842c(c2708s, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f7072a.hashCode();
    }
}
