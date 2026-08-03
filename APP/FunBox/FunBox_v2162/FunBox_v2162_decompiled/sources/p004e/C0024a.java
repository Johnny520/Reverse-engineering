package p004e;

import java.util.ArrayList;
import java.util.HashSet;
import p007h.C0117b;
import p009j.C0150a;
import p009j.C0152c;
import p009j.C0168s;
import p010k.C0191u;
import p011l.C0195c;
import p011l.InterfaceC0197e;
import p013n.AbstractC0203e;
import p013n.C0205g;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0024a {

    /* JADX INFO: renamed from: a */
    private final Object f83a;

    /* JADX INFO: renamed from: b */
    private final Object f84b;

    /* JADX INFO: renamed from: c */
    private final Object f85c;

    public C0024a(C0117b c0117b) {
        int iM531F = c0117b.m341a().m531F();
        this.f83a = new C0029f[iM531F];
        this.f84b = new C0029f[iM531F];
        this.f85c = new C0029f[iM531F];
        C0152c c0152cM341a = c0117b.m341a();
        int iM504B = c0152cM341a.m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            C0150a c0150aN = c0152cM341a.m511n(i2);
            int iM350c = c0150aN.m350c();
            ((C0029f[]) this.f83a)[iM350c] = new C0029f(c0150aN.m349b().m512o(0).m367i());
            C0168s c0168sM367i = c0150aN.m351d().m367i();
            ((C0029f[]) this.f84b)[iM350c] = new C0029f(c0168sM367i);
            ((C0029f[]) this.f85c)[iM350c] = new C0029f(c0168sM367i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C0028e m94a() {
        C0152c c0152c;
        C0026c c0026c;
        C0117b c0117b = (C0117b) this.f83a;
        int[] iArr = (int[]) this.f84b;
        C0024a c0024a = (C0024a) this.f85c;
        int length = iArr.length;
        C0152c c0152cM341a = c0117b.m341a();
        ArrayList arrayList = new ArrayList(length);
        C0026c c0026c2 = C0026c.f88c;
        C0150a c0150a = null;
        C0150a c0150a2 = null;
        int i2 = 0;
        while (i2 < length) {
            C0150a c0150aM359K = c0152cM341a.m359K(iArr[i2]);
            if (c0150aM359K.m348a()) {
                C0205g c0205gM354g = c0150aM359K.m354g();
                int iM529o = c0205gM354g.m529o();
                int iM352e = c0150aM359K.m352e();
                InterfaceC0197e interfaceC0197eMo365f = c0150aM359K.m351d().mo365f();
                int iM504B = ((AbstractC0203e) interfaceC0197eMo365f).m504B();
                if (iM504B == 0) {
                    c0026c = C0026c.f88c;
                    c0152c = c0152cM341a;
                } else {
                    if ((iM352e == -1 && iM529o != iM504B) || (iM352e != -1 && (iM529o != iM504B + 1 || iM352e != c0205gM354g.m526l(iM504B)))) {
                        throw new RuntimeException("shouldn't happen: weird successors list");
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iM504B) {
                            break;
                        }
                        if (interfaceC0197eMo365f.mo403b(i3).equals(C0195c.f776u)) {
                            iM504B = i3 + 1;
                            break;
                        }
                        i3++;
                    }
                    C0026c c0026c3 = new C0026c(iM504B);
                    int i4 = 0;
                    while (i4 < iM504B) {
                        c0026c3.m105G(i4, new C0191u(interfaceC0197eMo365f.mo403b(i4)), c0024a.m98e(c0205gM354g.m526l(i4)).m135h());
                        i4++;
                        c0152cM341a = c0152cM341a;
                    }
                    c0152c = c0152cM341a;
                    c0026c3.m536g();
                    c0026c = c0026c3;
                }
                if (c0026c2.m504B() != 0) {
                    if (c0026c2.equals(c0026c)) {
                        if (c0150a == null) {
                            throw new NullPointerException("start == null");
                        }
                        if (c0024a.m96c(c0150aM359K).m135h() - c0024a.m97d(c0150a).m135h() <= 65535) {
                            c0150a2 = c0150aM359K;
                        }
                    }
                    if (c0026c2.m504B() != 0) {
                        arrayList.add(new C0027d(c0024a.m97d(c0150a).m135h(), c0024a.m96c(c0150a2).m135h(), c0026c2));
                    }
                    c0026c2 = c0026c;
                    c0150a = c0150aM359K;
                    c0150a2 = c0150a;
                } else {
                    c0026c2 = c0026c;
                    c0150a = c0150aM359K;
                    c0150a2 = c0150a;
                }
            } else {
                c0152c = c0152cM341a;
            }
            i2++;
            c0152cM341a = c0152c;
        }
        if (c0026c2.m504B() != 0) {
            arrayList.add(new C0027d(c0024a.m97d(c0150a).m135h(), c0024a.m96c(c0150a2).m135h(), c0026c2));
        }
        int size = arrayList.size();
        if (size == 0) {
            return C0028e.f92c;
        }
        C0028e c0028e = new C0028e(size);
        for (int i5 = 0; i5 < size; i5++) {
            c0028e.m518u(i5, (C0027d) arrayList.get(i5));
        }
        c0028e.m536g();
        return c0028e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final HashSet m95b() {
        HashSet hashSet = new HashSet(20);
        C0152c c0152cM341a = ((C0117b) this.f83a).m341a();
        int iM504B = c0152cM341a.m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            InterfaceC0197e interfaceC0197eMo365f = c0152cM341a.m511n(i2).m351d().mo365f();
            int iM504B2 = ((AbstractC0203e) interfaceC0197eMo365f).m504B();
            for (int i3 = 0; i3 < iM504B2; i3++) {
                hashSet.add(interfaceC0197eMo365f.mo403b(i3));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public final C0029f m96c(C0150a c0150a) {
        return ((C0029f[]) this.f85c)[c0150a.m350c()];
    }

    /* JADX INFO: renamed from: d */
    public final C0029f m97d(C0150a c0150a) {
        return ((C0029f[]) this.f84b)[c0150a.m350c()];
    }

    /* JADX INFO: renamed from: e */
    public final C0029f m98e(int i2) {
        return ((C0029f[]) this.f83a)[i2];
    }

    /* JADX INFO: renamed from: f */
    public final C0029f m99f(C0150a c0150a) {
        return ((C0029f[]) this.f83a)[c0150a.m350c()];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m100g() {
        C0152c c0152cM341a = ((C0117b) this.f83a).m341a();
        int iM504B = c0152cM341a.m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            if (((AbstractC0203e) c0152cM341a.m511n(i2).m351d().mo365f()).m504B() != 0) {
                return true;
            }
        }
        return false;
    }

    public C0024a(C0117b c0117b, int[] iArr, C0024a c0024a) {
        if (c0117b == null) {
            throw new NullPointerException("method == null");
        }
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c0024a == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f83a = c0117b;
        this.f84b = iArr;
        this.f85c = c0024a;
    }
}
