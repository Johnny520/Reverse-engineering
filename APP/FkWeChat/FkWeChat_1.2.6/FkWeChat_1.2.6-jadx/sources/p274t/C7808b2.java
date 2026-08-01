package p274t;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7808b2 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7888q3 f26025b;

    /* JADX INFO: renamed from: c */
    public final int f26026c;

    public C7808b2(InterfaceC7888q3 interfaceC7888q3, int i10) {
        this.f26025b = interfaceC7888q3;
        this.f26026c = i10;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        if (AbstractC7923x3.m30586j(this.f26026c, enumC3191u == EnumC3191u.f8484q ? AbstractC7923x3.f26388a.m30594c() : AbstractC7923x3.f26388a.m30595d())) {
            return this.f26025b.mo30228a(interfaceC3175e, enumC3191u);
        }
        return 0;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        if (AbstractC7923x3.m30586j(this.f26026c, AbstractC7923x3.f26388a.m30598g())) {
            return this.f26025b.mo30229b(interfaceC3175e);
        }
        return 0;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        if (AbstractC7923x3.m30586j(this.f26026c, enumC3191u == EnumC3191u.f8484q ? AbstractC7923x3.f26388a.m30592a() : AbstractC7923x3.f26388a.m30593b())) {
            return this.f26025b.mo30230c(interfaceC3175e, enumC3191u);
        }
        return 0;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        if (AbstractC7923x3.m30586j(this.f26026c, AbstractC7923x3.f26388a.m30596e())) {
            return this.f26025b.mo30231d(interfaceC3175e);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7808b2)) {
            return false;
        }
        C7808b2 c7808b2 = (C7808b2) obj;
        return AbstractC1061t.m3842c(this.f26025b, c7808b2.f26025b) && AbstractC7923x3.m30585i(this.f26026c, c7808b2.f26026c);
    }

    public int hashCode() {
        return (this.f26025b.hashCode() * 31) + AbstractC7923x3.m30587k(this.f26026c);
    }

    public String toString() {
        return "(" + this.f26025b + " only " + ((Object) AbstractC7923x3.m30589m(this.f26026c)) + ')';
    }

    public /* synthetic */ C7808b2(InterfaceC7888q3 interfaceC7888q3, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC7888q3, i10);
    }
}
