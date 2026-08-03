package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import java.util.BitSet;

/* JADX INFO: renamed from: j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0164o extends AbstractC0203e implements InterfaceC0197e {

    /* JADX INFO: renamed from: c */
    public static final C0164o f512c = null;

    static {
        f512c = new C0164o(0);
    }

    /* JADX INFO: renamed from: F */
    static /* synthetic */ Object m394F(C0164o r0, int r1) {
        return r0.m516s(r1);
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m395G(C0164o r0, int r1, C0162m r2) {
        r0.m503A(r1, r2);
    }

    /* JADX INFO: renamed from: H */
    public static C0164o m396H(C0162m r2) {
        C0164o r0 = new C0164o(1);
        r0.m503A(0, r2);
        return r0;
    }

    /* JADX INFO: renamed from: I */
    public static C0164o m397I(C0162m r2, C0162m r3) {
        C0164o r0 = new C0164o(2);
        r0.m503A(0, r2);
        r0.m503A(1, r3);
        return r0;
    }

    /* JADX INFO: renamed from: J */
    public static C0164o m398J(C0162m r2, C0162m r3, C0162m r4) {
        C0164o r0 = new C0164o(3);
        r0.m503A(0, r2);
        r0.m503A(1, r3);
        r0.m503A(2, r4);
        return r0;
    }

    /* JADX INFO: renamed from: K */
    public final C0164o m399K(BitSet r5) {
        int r0 = m504B() - r5.cardinality();
        if (r0 == 0) goto L5;
        C0164o r1 = new C0164o(r0);
        int r02 = 0;
        int r2 = 0;
    L8:
        if (r02 >= m504B()) goto L14;
        if (r5.get(r02) == true) goto L12;
        r1.m503A(r2, m516s(r02));
        r2 = r2 + 1;
    L12:
        r02 = r02 + 1;
        goto L8
    L14:
        if (m534e() == false) goto L16;
        r1.m536g();
    L16:
        return r1;
    L5:
        return f512c;
    }

    /* JADX INFO: renamed from: L */
    public final C0164o m400L(boolean r3, BitSet r4) {
        int r0 = m504B();
        if (r0 != 0) goto L5;
        return this;
    L5:
        C0163n r1 = new C0163n(this, r4, r3);
        int r32 = 0;
    L6:
        if (r32 >= r0) goto L9;
        C0163n.m392a(r1, r32);
        r32 = r32 + 1;
        goto L6
    L9:
        return C0163n.m393b(r1);
    }

    /* JADX INFO: renamed from: M */
    public final C0164o m401M(C0162m r6) {
        int r0 = m504B();
        C0164o r1 = new C0164o(r0 + 1);
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        int r4 = r3 + 1;
        r1.m503A(r4, m516s(r3));
        r3 = r4;
        goto L3
    L5:
        r1.m503A(0, r6);
        if (m534e() == false) goto L8;
        r1.m536g();
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: N */
    public final C0164o m402N(int r5) {
        int r0 = m504B();
        if (r0 != 0) goto L5;
        return this;
    L5:
        C0164o r1 = new C0164o(r0);
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L9;
        r1.m503A(r2, ((C0162m) m516s(r2)).m389q(r5));
        r2 = r2 + 1;
        goto L6
    L9:
        if (m534e() == false) goto L11;
        r1.m536g();
    L11:
        return r1;
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0197e
    /* JADX INFO: renamed from: b */
    public final C0195c mo403b(int r1) {
        C0195c r12 = m513p(r1).mo379c();
        r12.getClass();
        return r12;
    }
}
