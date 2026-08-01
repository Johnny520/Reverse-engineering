package p172l8;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1064u0;
import p172l8.C4712s;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6532a;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: l8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4689d extends AbstractC4687c implements InterfaceC5976f {

    /* JADX INFO: renamed from: q */
    public InterfaceC0189q f13896q;

    /* JADX INFO: renamed from: r */
    public Object f13897r;

    /* JADX INFO: renamed from: s */
    public InterfaceC5976f f13898s;

    /* JADX INFO: renamed from: t */
    public Object f13899t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4689d(InterfaceC0189q interfaceC0189q, Object obj) {
        super(null);
        interfaceC0189q.getClass();
        this.f13896q = interfaceC0189q;
        this.f13897r = obj;
        this.f13898s = this;
        this.f13899t = AbstractC4685b.f13890a;
    }

    @Override // p172l8.AbstractC4687c
    /* JADX INFO: renamed from: a */
    public Object mo18727a(Object obj, InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        this.f13898s = interfaceC5976f;
        this.f13897r = obj;
        Object objM24992g = AbstractC6325c.m24992g();
        if (objM24992g == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM24992g;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18735b() throws Throwable {
        while (true) {
            Object obj = this.f13899t;
            InterfaceC5976f interfaceC5976f = this.f13898s;
            if (interfaceC5976f == null) {
                AbstractC4713t.m18808b(obj);
                return obj;
            }
            if (C4712s.m18800d(AbstractC4685b.f13890a, obj)) {
                try {
                    InterfaceC0189q interfaceC0189q = this.f13896q;
                    Object obj2 = this.f13897r;
                    Object objM24991f = !(interfaceC0189q instanceof AbstractC6532a) ? AbstractC6324b.m24991f(interfaceC0189q, this, obj2, interfaceC5976f) : ((InterfaceC0189q) AbstractC1064u0.m3858f(interfaceC0189q, 3)).mo236e(this, obj2, interfaceC5976f);
                    if (objM24991f != AbstractC6325c.m24992g()) {
                        interfaceC5976f.resumeWith(C4712s.m18798b(objM24991f));
                    }
                } catch (Throwable th) {
                    C4712s.a aVar = C4712s.f13928r;
                    interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(th)));
                }
            } else {
                this.f13899t = AbstractC4685b.f13890a;
                interfaceC5976f.resumeWith(obj);
            }
        }
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return C5981k.f18917q;
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) {
        this.f13898s = null;
        this.f13899t = obj;
    }
}
