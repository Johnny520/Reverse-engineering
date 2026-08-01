package p015b0;

import p004a3.AbstractC0042h;
import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p319w2.C9147v3;

/* JADX INFO: renamed from: b0.r4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0847r4 {

    /* JADX INFO: renamed from: a */
    public EnumC3191u f2688a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3175e f2689b;

    /* JADX INFO: renamed from: c */
    public AbstractC0042h.b f2690c;

    /* JADX INFO: renamed from: d */
    public C9147v3 f2691d;

    /* JADX INFO: renamed from: e */
    public Object f2692e;

    /* JADX INFO: renamed from: f */
    public long f2693f = m3182a();

    public C0847r4(EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, C9147v3 c9147v3, Object obj) {
        this.f2688a = enumC3191u;
        this.f2689b = interfaceC3175e;
        this.f2690c = bVar;
        this.f2691d = c9147v3;
        this.f2692e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final long m3182a() {
        return AbstractC0839q3.m3158b(this.f2691d, this.f2689b, this.f2690c, null, 0, 24, null);
    }

    /* JADX INFO: renamed from: b */
    public final long m3183b() {
        return this.f2693f;
    }

    /* JADX INFO: renamed from: c */
    public final void m3184c(EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, C9147v3 c9147v3, Object obj) {
        if (enumC3191u == this.f2688a && AbstractC1061t.m3842c(interfaceC3175e, this.f2689b) && AbstractC1061t.m3842c(bVar, this.f2690c) && AbstractC1061t.m3842c(c9147v3, this.f2691d) && AbstractC1061t.m3842c(obj, this.f2692e)) {
            return;
        }
        this.f2688a = enumC3191u;
        this.f2689b = interfaceC3175e;
        this.f2690c = bVar;
        this.f2691d = c9147v3;
        this.f2692e = obj;
        this.f2693f = m3182a();
    }
}
