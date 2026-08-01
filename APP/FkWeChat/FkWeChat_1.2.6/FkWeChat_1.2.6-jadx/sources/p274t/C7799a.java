package p274t;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p252r3.C6475f;
import p336x3.C9408m0;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7799a implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final int f25994b;

    /* JADX INFO: renamed from: c */
    public final String f25995c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f25996d = AbstractC0522j5.m1773e(C6475f.f20346e, null, 2, null);

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f25997e = AbstractC0522j5.m1773e(Boolean.TRUE, null, 2, null);

    public C7799a(int i10, String str) {
        this.f25994b = i10;
        this.f25995c = str;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30232e().f20349c;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return m30232e().f20348b;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30232e().f20347a;
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return m30232e().f20350d;
    }

    /* JADX INFO: renamed from: e */
    public final C6475f m30232e() {
        return (C6475f) this.f25996d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7799a) && this.f25994b == ((C7799a) obj).f25994b;
    }

    /* JADX INFO: renamed from: f */
    public final void m30233f(C6475f c6475f) {
        this.f25996d.setValue(c6475f);
    }

    /* JADX INFO: renamed from: g */
    public final void m30234g(boolean z10) {
        this.f25997e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: h */
    public final void m30235h(C9408m0 c9408m0, int i10) {
        if (i10 == 0 || (i10 & this.f25994b) != 0) {
            m30233f(c9408m0.m36558f(this.f25994b));
            m30234g(c9408m0.m36563l(this.f25994b));
        }
    }

    public int hashCode() {
        return this.f25994b;
    }

    public String toString() {
        return this.f25995c + '(' + m30232e().f20347a + ", " + m30232e().f20348b + ", " + m30232e().f20349c + ", " + m30232e().f20350d + ')';
    }
}
