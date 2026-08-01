package p274t;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: t.p3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7883p3 implements InterfaceC7888q3 {

    /* JADX INFO: renamed from: b */
    public final String f26266b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f26267c;

    public C7883p3(C7876o1 c7876o1, String str) {
        this.f26266b = str;
        this.f26267c = AbstractC0522j5.m1773e(c7876o1, null, 2, null);
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: a */
    public int mo30228a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30472e().m30459c();
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: b */
    public int mo30229b(InterfaceC3175e interfaceC3175e) {
        return m30472e().m30460d();
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: c */
    public int mo30230c(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u) {
        return m30472e().m30458b();
    }

    @Override // p274t.InterfaceC7888q3
    /* JADX INFO: renamed from: d */
    public int mo30231d(InterfaceC3175e interfaceC3175e) {
        return m30472e().m30457a();
    }

    /* JADX INFO: renamed from: e */
    public final C7876o1 m30472e() {
        return (C7876o1) this.f26267c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7883p3) {
            return AbstractC1061t.m3842c(m30472e(), ((C7883p3) obj).m30472e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m30473f(C7876o1 c7876o1) {
        this.f26267c.setValue(c7876o1);
    }

    public int hashCode() {
        return this.f26266b.hashCode();
    }

    public String toString() {
        return this.f26266b + "(left=" + m30472e().m30458b() + ", top=" + m30472e().m30460d() + ", right=" + m30472e().m30459c() + ", bottom=" + m30472e().m30457a() + ')';
    }
}
