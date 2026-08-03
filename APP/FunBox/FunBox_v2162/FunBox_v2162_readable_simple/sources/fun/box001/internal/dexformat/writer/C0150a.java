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

    public C0150a(int r5, C0157h r6, C0205g r7, int r8) {
        if (r5 < 0) goto L39;
        r6.m538i();     // Catch: NullPointerException -> L36
        int r0 = r6.m504B();
        if (r0 == 0) goto L35;
        int r1 = r0 - 2;
    L9:
        if (r1 < 0) goto L16;
        if (r6.m512o(r1).m366h().m412b() != 1) goto L14;
        r1 = r1 - 1;
        goto L9
    L14:
        throw new IllegalArgumentException("insns[" + r1 + "] is a branch or can throw");
    L16:
        if (r6.m512o(r0 - 1).m366h().m412b() == 1) goto L33;
        r7.m538i();     // Catch: NullPointerException -> L30
        if (r8 < (-1)) goto L29;
        if (r8 >= 0) goto L22;
    L26:
        this.f482a = r5;
        this.f483b = r6;
        this.f484c = r7;
        this.f485d = r8;
        return;
    L22:
        if (r7.m525k(r8) == true) goto L26;
        throw new IllegalArgumentException("primarySuccessor " + r8 + " not in successors " + r7);
    L29:
        throw new IllegalArgumentException("primarySuccessor < -1");
    L31:
        throw new NullPointerException("successors == null");
    L33:
        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
    L35:
        throw new IllegalArgumentException("insns.size() == 0");
    L37:
        throw new NullPointerException("insns == null");
    L39:
        throw new IllegalArgumentException("label < 0");
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

    public final boolean equals(Object r1) {
        if (this != r1) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m353f() {
        C0205g r0 = this.f484c;
        if (r0.m529o() != 2) goto L9;
        int r1 = r0.m526l(0);
        if (r1 == this.f485d) goto L7;
        return r1;
    L7:
        return r0.m526l(1);
    L9:
        throw new UnsupportedOperationException("block doesn't have exactly two successors");
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
