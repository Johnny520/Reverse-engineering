package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.output.InterfaceC0206h;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0150a implements InterfaceC0206h {

    /* JADX INFO: renamed from: a */
    private final int f482a;

    /* JADX INFO: renamed from: b */
    private final C0157h f483b;

    /* JADX INFO: renamed from: c */
    private final C0205g f484c;

    /* JADX INFO: renamed from: d */
    private final int f485d;

    public C0150a(int i2, C0157h c0157h, C0205g c0205g, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c0157h.m538i();
            int iM504B = c0157h.m504B();
            if (iM504B == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            for (int i4 = iM504B - 2; i4 >= 0; i4--) {
                if (c0157h.m512o(i4).m366h().m412b() != 1) {
                    throw new IllegalArgumentException("insns[" + i4 + "] is a branch or can throw");
                }
            }
            if (c0157h.m512o(iM504B - 1).m366h().m412b() == 1) {
                throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
            }
            try {
                c0205g.m538i();
                if (i3 < -1) {
                    throw new IllegalArgumentException("primarySuccessor < -1");
                }
                if (i3 < 0 || c0205g.m525k(i3)) {
                    this.f482a = i2;
                    this.f483b = c0157h;
                    this.f484c = c0205g;
                    this.f485d = i3;
                    return;
                }
                throw new IllegalArgumentException("primarySuccessor " + i3 + " not in successors " + c0205g);
            } catch (NullPointerException unused) {
                throw new NullPointerException("successors == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m348a() {
        return this.f483b.m512o(r0.m504B() - 1).m364e();
    }

    /* JADX INFO: renamed from: b */
    public final C0157h m349b() {
        return this.f483b;
    }

    /* JADX INFO: renamed from: c */
    public final int m350c() {
        return this.f482a;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0156g m351d() {
        return this.f483b.m512o(r0.m504B() - 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m352e() {
        return this.f485d;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final int m353f() {
        C0205g c0205g = this.f484c;
        if (c0205g.m529o() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int iM526l = c0205g.m526l(0);
        return iM526l == this.f485d ? c0205g.m526l(1) : iM526l;
    }

    /* JADX INFO: renamed from: g */
    public final C0205g m354g() {
        return this.f484c;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + RuntimeDexGenerator.m11q(this.f482a) + '}';
    }
}
