package p116i;

import ci.C0579e;
import p015b0.C0154t;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p131j0.C2046b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1752g0 {

    /* JADX INFO: renamed from: a */
    public final C2046b f5844a = new C2046b(new C1743d0[16]);

    /* JADX INFO: renamed from: b */
    public final C1845j1 f5845b = AbstractC1874r.m4639u(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public long f5846c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public final C1845j1 f5847d = AbstractC1874r.m4639u(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4401a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-318043801);
        int i10 = (c1836h0.m4538h(this) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(null);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            if (((Boolean) this.f5847d.getValue()).booleanValue() || ((Boolean) this.f5845b.getValue()).booleanValue()) {
                c1836h0.m4525a0(-144841960);
                boolean zM4538h = c1836h0.m4538h(this);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4538h || objM4514P2 == c1823e) {
                    objM4514P2 = new C0579e(interfaceC1809a1, this, (InterfaceC5557c) null);
                    c1836h0.m4545k0(objM4514P2);
                }
                AbstractC1874r.m4624f((InterfaceC1235p) objM4514P2, c1836h0, this);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(-143455237);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0154t(i9, 7, this);
        }
    }
}
