package p182m5;

import p254r5.AbstractC6487a;
import p254r5.AbstractC6495e;
import p254r5.C6508m;
import p254r5.C6511p;
import p254r5.C6519x;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m5.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4994h0 extends AbstractC4979a0 {

    /* JADX INFO: renamed from: r */
    public final int f15180r = 8;

    /* JADX INFO: renamed from: s */
    public final C6519x f15181s;

    public C4994h0(C6519x c6519x) {
        this.f15181s = c6519x;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        c5009p.m20254o().m20156t(this.f15181s);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return 8;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20146n = m20146n(c5009p);
        int iM25808k = this.f15181s.m25808k();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(0, m20100l() + ' ' + this.f15181s.toString());
            interfaceC8819a.mo33825d(2, "type:     " + AbstractC8826h.m33898g(iM25808k) + (" // " + C6519x.m25804n(iM25808k)));
            interfaceC8819a.mo33825d(2, "reserved: " + AbstractC8826h.m33898g(0));
            String str = " // " + this.f15181s.m25809p().toString();
            if (this.f15181s.m25810s()) {
                interfaceC8819a.mo33825d(2, "fieldId:  " + AbstractC8826h.m33898g(iM20146n) + str);
            } else {
                interfaceC8819a.mo33825d(2, "methodId: " + AbstractC8826h.m33898g(iM20146n) + str);
            }
            interfaceC8819a.mo33825d(2, "reserved: " + AbstractC8826h.m33898g(0));
        }
        interfaceC8819a.writeShort(iM25808k);
        interfaceC8819a.writeShort(0);
        interfaceC8819a.writeShort(m20146n(c5009p));
        interfaceC8819a.writeShort(0);
    }

    /* JADX INFO: renamed from: n */
    public final int m20146n(C5009p c5009p) {
        AbstractC6487a abstractC6487aM25809p = this.f15181s.m25809p();
        if (this.f15181s.m25810s()) {
            return c5009p.m20249j().m20307t((C6508m) abstractC6487aM25809p);
        }
        if (!this.f15181s.m25811u()) {
            C10010p0.m38820a("Unhandled invocation type");
            return 0;
        }
        if (abstractC6487aM25809p instanceof C6511p) {
            abstractC6487aM25809p = ((C6511p) abstractC6487aM25809p).m25783x();
        }
        return c5009p.m20255p().m20180t((AbstractC6495e) abstractC6487aM25809p);
    }
}
