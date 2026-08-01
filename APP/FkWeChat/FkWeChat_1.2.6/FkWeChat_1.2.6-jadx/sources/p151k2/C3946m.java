package p151k2;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: k2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3946m extends AbstractC3940g {

    /* JADX INFO: renamed from: a */
    public final AbstractC3936c f11418a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 f11419b;

    public C3946m(AbstractC3936c abstractC3936c) {
        super(null);
        this.f11418a = abstractC3936c;
        this.f11419b = AbstractC0522j5.m1773e(null, null, 2, null);
    }

    @Override // p151k2.AbstractC3940g
    /* JADX INFO: renamed from: a */
    public boolean mo15632a(AbstractC3936c abstractC3936c) {
        return abstractC3936c == this.f11418a;
    }

    @Override // p151k2.AbstractC3940g
    /* JADX INFO: renamed from: b */
    public Object mo15633b(AbstractC3936c abstractC3936c) {
        if (!(abstractC3936c == this.f11418a)) {
            AbstractC3167a.m11956b("Check failed.");
        }
        Object objM15648c = m15648c();
        if (objM15648c == null) {
            return null;
        }
        return objM15648c;
    }

    /* JADX INFO: renamed from: c */
    public final Object m15648c() {
        return this.f11419b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public void m15649d(AbstractC3936c abstractC3936c, Object obj) {
        if (!(abstractC3936c == this.f11418a)) {
            AbstractC3167a.m11956b("Check failed.");
        }
        m15650e(obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m15650e(Object obj) {
        this.f11419b.setValue(obj);
    }
}
