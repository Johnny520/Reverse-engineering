package p154k5;

import bsh.C1259t2;
import okhttp3.internal.url._UrlKt;
import p239q5.C6268s;
import p239q5.C6274y;
import p254r5.AbstractC6487a;
import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3974h extends AbstractC3980n {

    /* JADX INFO: renamed from: e */
    public final AbstractC6487a f11471e;

    /* JADX INFO: renamed from: f */
    public int f11472f;

    /* JADX INFO: renamed from: g */
    public int f11473g;

    public C3974h(C3978l c3978l, C6274y c6274y, C6268s c6268s, AbstractC6487a abstractC6487a) {
        super(c3978l, c6274y, c6268s);
        if (abstractC6487a == null) {
            C1259t2.m5095a("constant == null");
            throw null;
        }
        this.f11471e = abstractC6487a;
        this.f11472f = -1;
        this.f11473g = -1;
    }

    /* JADX INFO: renamed from: A */
    public AbstractC6487a m15750A() {
        return this.f11471e;
    }

    /* JADX INFO: renamed from: B */
    public int m15751B() {
        int i10 = this.f11472f;
        if (i10 >= 0) {
            return i10;
        }
        C3972g.m15749a("index not yet set for ", this.f11471e);
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public boolean m15752C() {
        return this.f11472f >= 0;
    }

    /* JADX INFO: renamed from: D */
    public void m15753D(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("index < 0");
        } else if (this.f11473g < 0) {
            this.f11473g = i10;
        } else {
            C10010p0.m38820a("class index already set");
        }
    }

    /* JADX INFO: renamed from: E */
    public void m15754E(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("index < 0");
        } else if (this.f11472f < 0) {
            this.f11472f = i10;
        } else {
            C10010p0.m38820a("index already set");
        }
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        return this.f11471e.mo6828g();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: c */
    public String mo15755c() {
        if (!m15752C()) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(m15750A().mo25729j());
        sb2.append('@');
        int i10 = this.f11472f;
        if (i10 < 65536) {
            sb2.append(AbstractC8826h.m33898g(i10));
        } else {
            sb2.append(AbstractC8826h.m33901j(i10));
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: d */
    public String mo15756d() {
        AbstractC6487a abstractC6487a = this.f11471e;
        return abstractC6487a instanceof C6492c0 ? ((C6492c0) abstractC6487a).m25744v() : abstractC6487a.mo6828g();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: w */
    public AbstractC3976j mo15716w(C3978l c3978l) {
        C3974h c3974h = new C3974h(c3978l, m15777m(), m15778n(), this.f11471e);
        int i10 = this.f11472f;
        if (i10 >= 0) {
            c3974h.m15754E(i10);
        }
        int i11 = this.f11473g;
        if (i11 >= 0) {
            c3974h.m15753D(i11);
        }
        return c3974h;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        C3974h c3974h = new C3974h(m15776l(), m15777m(), c6268s, this.f11471e);
        int i10 = this.f11472f;
        if (i10 >= 0) {
            c3974h.m15754E(i10);
        }
        int i11 = this.f11473g;
        if (i11 >= 0) {
            c3974h.m15753D(i11);
        }
        return c3974h;
    }
}
