package p264s0;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.Locale;
import p080f9.C2363j;
import p275t0.AbstractC7951e0;
import p275t0.AbstractC7963h0;
import p275t0.C7967i0;

/* JADX INFO: renamed from: s0.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7031z {

    /* JADX INFO: renamed from: a */
    public final C2363j f23352a;

    /* JADX INFO: renamed from: b */
    public final Locale f23353b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7951e0 f23354c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f23355d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f23356e;

    public AbstractC7031z(Long l10, C2363j c2363j, InterfaceC6888p8 interfaceC6888p8, Locale locale) {
        C7967i0 c7967i0Mo30699i;
        this.f23352a = c2363j;
        this.f23353b = locale;
        AbstractC7951e0 abstractC7951e0M30731a = AbstractC7963h0.m30731a(locale);
        this.f23354c = abstractC7951e0M30731a;
        this.f23355d = AbstractC0522j5.m1773e(interfaceC6888p8, null, 2, null);
        if (l10 != null) {
            c7967i0Mo30699i = abstractC7951e0M30731a.mo30698h(l10.longValue());
            if (!c2363j.m8566t(c7967i0Mo30699i.m30738e())) {
                c7967i0Mo30699i = abstractC7951e0M30731a.mo30699i(abstractC7951e0M30731a.mo30700j());
            }
        } else {
            c7967i0Mo30699i = abstractC7951e0M30731a.mo30699i(abstractC7951e0M30731a.mo30700j());
        }
        this.f23356e = AbstractC0522j5.m1773e(c7967i0Mo30699i, null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m27700c(long j10) {
        C7967i0 c7967i0Mo30698h = this.f23354c.mo30698h(j10);
        if (this.f23352a.m8566t(c7967i0Mo30698h.m30738e())) {
            this.f23356e.setValue(c7967i0Mo30698h);
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC6888p8 m27701d() {
        return (InterfaceC6888p8) this.f23355d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final long m27702e() {
        return ((C7967i0) this.f23356e.getValue()).m30737d();
    }

    /* JADX INFO: renamed from: g */
    public final C2363j m27703g() {
        return this.f23352a;
    }

    /* JADX INFO: renamed from: i */
    public final Locale m27704i() {
        return this.f23353b;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC7951e0 m27705j() {
        return this.f23354c;
    }

    /* JADX INFO: renamed from: k */
    public final void m27706k(InterfaceC6888p8 interfaceC6888p8) {
        this.f23355d.setValue(interfaceC6888p8);
    }
}
