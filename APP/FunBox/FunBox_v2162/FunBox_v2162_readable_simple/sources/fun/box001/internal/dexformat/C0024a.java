package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.annotations.C0117b;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0152c;
import fun.box001.internal.dexformat.writer.C0168s;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0024a {

    /* JADX INFO: renamed from: a */
    private final Object f83a;

    /* JADX INFO: renamed from: b */
    private final Object f84b;

    /* JADX INFO: renamed from: c */
    private final Object f85c;

    public C0024a(C0117b r9) {
        int r0 = r9.m341a().m531F();
        this.f83a = new C0029f[r0];
        this.f84b = new C0029f[r0];
        this.f85c = new C0029f[r0];
        C0152c r92 = r9.m341a();
        int r02 = r92.m504B();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        C0150a r3 = r92.m511n(r2);
        int r4 = r3.m350c();
        ((C0029f[]) this.f83a)[r4] = new C0029f(r3.m349b().m512o(0).m367i());
        C0168s r32 = r3.m351d().m367i();
        ((C0029f[]) this.f84b)[r4] = new C0029f(r32);
        ((C0029f[]) this.f85c)[r4] = new C0029f(r32);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C0028e m94a() {
        C0117b r1 = (C0117b) this.f83a;
        int[] r2 = (int[]) this.f84b;
        C0024a r3 = (C0024a) this.f85c;
        int r4 = r2.length;
        C0152c r12 = r1.m341a();
        ArrayList r5 = new ArrayList(r4);
        C0026c r6 = C0026c.f88c;
        C0150a r7 = null;
        C0150a r9 = null;
        int r10 = 0;
    L3:
        if (r10 >= r4) goto L51;
        C0150a r11 = r12.m359K(r2[r10]);
        if (r11.m348a() == true) goto L7;
        C0152c r16 = r12;
    L49:
        r10 = r10 + 1;
        r12 = r16;
        goto L3
    L7:
        C0205g r122 = r11.m354g();
        int r13 = r122.m529o();
        int r14 = r11.m352e();
        InterfaceC0197e r15 = r11.m351d().mo365f();
        int r8 = ((AbstractC0203e) r15).m504B();
        if (r8 != 0) goto L11;
        C0026c r82 = C0026c.f88c;
        r16 = r12;
    L32:
        if (r6.m504B() != 0) goto L35;
    L48:
        r6 = r82;
        r7 = r11;
        r9 = r7;
        goto L49
    L35:
        if (r6.equals(r82) == false) goto L46;
        if (r7 == null) goto L44;
        if ((r3.m96c(r11).m135h() - r3.m97d(r7).m135h()) > 65535) goto L40;
        boolean r0 = true;
    L41:
        if (r0 == false) goto L46;
        r9 = r11;
        goto L49
    L40:
        r0 = false;
        goto L41
    L44:
        throw new NullPointerException("start == null");
    L46:
        if (r6.m504B() == 0) goto L48;
        r5.add(new C0027d(r3.m97d(r7).m135h(), r3.m96c(r9).m135h(), r6));
        goto L48
    L11:
        if (r14 != (-1)) goto L13;
        if (r13 == r8) goto L13;
    L20:
        throw new RuntimeException("shouldn't happen: weird successors list");
    L13:
        if (r14 != (-1)) goto L15;
    L21:
        int r02 = 0;
    L22:
        if (r02 >= r8) goto L27;
        if (r15.mo403b(r02).equals(C0195c.f776u) == true) goto L25;
        r02 = r02 + 1;
        goto L22
    L25:
        r8 = r02 + 1;
    L27:
        C0026c r03 = new C0026c(r8);
        int r132 = 0;
    L28:
        if (r132 >= r8) goto L30;
        r03.m105G(r132, new C0191u(r15.mo403b(r132)), r3.m98e(r122.m526l(r132)).m135h());
        r132 = r132 + 1;
        r12 = r12;
        goto L28
    L30:
        r16 = r12;
        r03.m536g();
        r82 = r03;
        goto L32
    L15:
        if (r13 != (r8 + 1)) goto L20;
        if (r14 != r122.m526l(r8)) goto L20;
    L51:
        if (r6.m504B() == 0) goto L53;
        r5.add(new C0027d(r3.m97d(r7).m135h(), r3.m96c(r9).m135h(), r6));
    L53:
        int r04 = r5.size();
        if (r04 == 0) goto L73;
        C0028e r17 = new C0028e(r04);
        int r83 = 0;
    L57:
        if (r83 >= r04) goto L59;
        r17.m518u(r83, (C0027d) r5.get(r83));
        r83 = r83 + 1;
        goto L57
    L59:
        r17.m536g();
        return r17;
    L73:
        return C0028e.f92c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final HashSet m95b() {
        HashSet r0 = new HashSet(20);
        C0152c r1 = ((C0117b) this.f83a).m341a();
        int r2 = r1.m504B();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L8;
        InterfaceC0197e r5 = r1.m511n(r4).m351d().mo365f();
        int r6 = ((AbstractC0203e) r5).m504B();
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L7;
        r0.add(r5.mo403b(r7));
        r7 = r7 + 1;
        goto L5
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public final C0029f m96c(C0150a r2) {
        return ((C0029f[]) this.f85c)[r2.m350c()];
    }

    /* JADX INFO: renamed from: d */
    public final C0029f m97d(C0150a r2) {
        return ((C0029f[]) this.f84b)[r2.m350c()];
    }

    /* JADX INFO: renamed from: e */
    public final C0029f m98e(int r2) {
        return ((C0029f[]) this.f83a)[r2];
    }

    /* JADX INFO: renamed from: f */
    public final C0029f m99f(C0150a r2) {
        return ((C0029f[]) this.f83a)[r2.m350c()];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m100g() {
        C0152c r0 = ((C0117b) this.f83a).m341a();
        int r1 = r0.m504B();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (((AbstractC0203e) r0.m511n(r3).m351d().mo365f()).m504B() != 0) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public C0024a(C0117b r1, int[] r2, C0024a r3) {
        if (r1 == null) goto L13;
        if (r2 == null) goto L11;
        if (r3 == null) goto L9;
        this.f83a = r1;
        this.f84b = r2;
        this.f85c = r3;
        return;
    L9:
        throw new NullPointerException("addresses == null");
    L11:
        throw new NullPointerException("order == null");
    L13:
        throw new NullPointerException("method == null");
    }
}
