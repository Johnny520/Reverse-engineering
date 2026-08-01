package p182m5;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5025x extends AbstractC4979a0 {
    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: c */
    public EnumC4984c0 mo20091c() {
        return EnumC4984c0.TYPE_HEADER_ITEM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public int mo20111h() {
        return Opcodes.IREM;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        int iM20275f = c5009p.m20253n().m20275f();
        AbstractC5012q0 abstractC5012q0M20251l = c5009p.m20251l();
        AbstractC5012q0 abstractC5012q0M20252m = c5009p.m20252m();
        int iM20275f2 = abstractC5012q0M20251l.m20275f();
        int iM20275f3 = (abstractC5012q0M20252m.m20275f() + abstractC5012q0M20252m.mo20188n()) - iM20275f2;
        String strM12147b = c5009p.m20248i().m12147b();
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(8, "magic: " + new C6492c0(strM12147b).m25744v());
            interfaceC8819a.mo33825d(4, "checksum");
            interfaceC8819a.mo33825d(20, "signature");
            interfaceC8819a.mo33825d(4, "file_size:       " + AbstractC8826h.m33901j(c5009p.m20250k()));
            interfaceC8819a.mo33825d(4, "header_size:     " + AbstractC8826h.m33901j(Opcodes.IREM));
            interfaceC8819a.mo33825d(4, "endian_tag:      " + AbstractC8826h.m33901j(305419896));
            interfaceC8819a.mo33825d(4, "link_size:       0");
            interfaceC8819a.mo33825d(4, "link_off:        0");
            interfaceC8819a.mo33825d(4, "map_off:         " + AbstractC8826h.m33901j(iM20275f));
        }
        for (int i10 = 0; i10 < 8; i10++) {
            interfaceC8819a.writeByte(strM12147b.charAt(i10));
        }
        interfaceC8819a.mo33865e(24);
        interfaceC8819a.writeInt(c5009p.m20250k());
        interfaceC8819a.writeInt(Opcodes.IREM);
        interfaceC8819a.writeInt(305419896);
        interfaceC8819a.mo33865e(8);
        interfaceC8819a.writeInt(iM20275f);
        c5009p.m20259t().m20304v(interfaceC8819a);
        c5009p.m20260u().m20315w(interfaceC8819a);
        c5009p.m20256q().m20269u(interfaceC8819a);
        c5009p.m20249j().m20309v(interfaceC8819a);
        c5009p.m20255p().m20182v(interfaceC8819a);
        c5009p.m20247h().m20185t(interfaceC8819a);
        if (interfaceC8819a.mo33828k()) {
            interfaceC8819a.mo33825d(4, "data_size:       " + AbstractC8826h.m33901j(iM20275f3));
            interfaceC8819a.mo33825d(4, "data_off:        " + AbstractC8826h.m33901j(iM20275f2));
        }
        interfaceC8819a.writeInt(iM20275f3);
        interfaceC8819a.writeInt(iM20275f2);
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
    }
}
