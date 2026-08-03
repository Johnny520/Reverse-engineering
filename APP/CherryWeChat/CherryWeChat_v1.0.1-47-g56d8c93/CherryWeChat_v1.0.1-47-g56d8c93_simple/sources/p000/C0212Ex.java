package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Ex */
/* JADX INFO: loaded from: classes.dex */
public final class C0212Ex implements InterfaceC0126Cx, InterfaceC0050B6 {

    /* JADX INFO: renamed from: a */
    public final String f618a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1406fG f619b;

    /* JADX INFO: renamed from: c */
    public final int f620c;

    /* JADX INFO: renamed from: d */
    public final HashSet f621d;

    /* JADX INFO: renamed from: e */
    public final String[] f622e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0126Cx[] f623f;

    /* JADX INFO: renamed from: g */
    public final List[] f624g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f625h;

    /* JADX INFO: renamed from: i */
    public final Map f626i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx[] f627j;

    /* JADX INFO: renamed from: k */
    public final C1251cA f628k;

    public C0212Ex(String r2, AbstractC1406fG r3, int r4, List r5, C0268G9 r6) {
        this.f618a = r2;
        this.f619b = r3;
        this.f620c = r4;
        ArrayList r22 = r6.f860b;
        HashSet r32 = new HashSet(AbstractC2598uq.m5109K(AbstractC2539ta.m5019d0(r22, 12)));
        AbstractC2453ra.m4906p0(r22, r32);
        this.f621d = r32;
        int r33 = 0;
        this.f622e = (String[]) r22.toArray(new String[0]);
        this.f623f = AbstractC1293cr.m2551l(r6.f862d);
        this.f624g = (List[]) r6.f863e.toArray(new List[0]);
        ArrayList r23 = r6.f864f;
        boolean[] r42 = new boolean[r23.size()];
        Iterator r24 = r23.iterator();
    L4:
        if (r24.hasNext() == false) goto L6;
        r42[r33] = ((Boolean) r24.next()).booleanValue();
        r33 = r33 + 1;
        goto L4
    L6:
        this.f625h = r42;
        C0693Q4 r43 = new C0693Q4(0, this.f622e);
        C2107jl r34 = new C2107jl(0, r43);
        ArrayList r25 = new ArrayList(AbstractC2539ta.m5019d0(r34, 10));
        Iterator r35 = r34.iterator();
    L7:
        C2694x r44 = (C2694x) r35;
        if (((Iterator) r44.f9269c).hasNext() == false) goto L10;
        C1549il r45 = (C1549il) r44.next();
        r25.add(new C0208Et(r45.f5503b, Integer.valueOf(r45.f5502a)));
        goto L7
    L10:
        this.f626i = AbstractC2598uq.m5111M(r25);
        this.f627j = AbstractC1293cr.m2551l(r5);
        this.f628k = new C1251cA(new C0693Q4(6, this));
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r2) {
        Integer r22 = (Integer) this.f626i.get(r2);
        if (r22 != null) goto L5;
        return -3;
    L5:
        return r22.intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f618a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return this.f619b;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return this.f620c;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int r2) {
        return this.f622e[r2];
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof C0212Ex) == false) goto L23;
        InterfaceC0126Cx r0 = (InterfaceC0126Cx) r7;
        if (this.f618a.equals(r0.mo203b()) == false) goto L23;
        if (Arrays.equals(this.f627j, ((C0212Ex) r7).f627j) == false) goto L23;
        int r72 = r0.mo205d();
        int r2 = this.f620c;
        if (r2 != r72) goto L23;
        int r73 = 0;
    L17:
        if (r73 >= r2) goto L30;
        InterfaceC0126Cx[] r3 = this.f623f;
        if (AbstractC0585Nj.m1134a(r3[r73].mo203b(), r0.mo210j(r73).mo203b()) == false) goto L23;
        if (AbstractC0585Nj.m1134a(r3[r73].mo204c(), r0.mo210j(r73).mo204c()) == false) goto L23;
        r73 = r73 + 1;
        goto L17
    L30:
        return true;
    L23:
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public final boolean mo207f() {
        return false;
    }

    @Override // p000.InterfaceC0050B6
    /* JADX INFO: renamed from: g */
    public final Set mo89g() {
        return this.f621d;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f628k.getValue()).intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r2) {
        return this.f624g[r2];
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r2) {
        return this.f623f[r2];
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r2) {
        return this.f625h[r2];
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(AbstractC0828TB.m1632J(0, this.f620c), ", ", this.f618a.concat("("), ")", new C2479s(6, this), 24);
    }
}
