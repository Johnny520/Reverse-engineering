package p034G;

import p000A.C0009E0;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0089u;
import p012C.C0233a;
import p018D.AbstractC0253b;
import p018D.C0254c;
import p018D.C0257f;
import p028F.C0352m;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0597i;
import p058L.C0912N;
import p058L.C0913O;
import p058L.C0914P;
import p105V.C1480b;
import p112W2.InterfaceC1601c;
import p169h0.InterfaceC2207p;
import p186k.C2404A;

/* JADX INFO: renamed from: G.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0464i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2207p m746a(InterfaceC2207p interfaceC2207p, C0352m c0352m) {
        return interfaceC2207p.mo4021c(new C0457b(c0352m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0254c m747b(InterfaceC0597i interfaceC0597i) {
        C0257f c0257f;
        C0233a c0233a = new C0233a();
        AbstractC0601k.m1047w(interfaceC0597i, C0459d.f1362a, new C0049a(5, new C0049a(4, c0233a), new C0009E0(1, c0233a, C0233a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 2)));
        C2404A c2404a = new C2404A();
        C2404A c2404a2 = c0233a.f785a;
        Object[] objArr = c2404a2.f7766a;
        int i5 = c2404a2.f7767b;
        int i6 = 0;
        boolean z5 = true;
        AbstractC0253b abstractC0253b = null;
        while (true) {
            c0257f = C0257f.f850b;
            if (i6 >= i5) {
                break;
            }
            AbstractC0253b abstractC0253b2 = (AbstractC0253b) objArr[i6];
            if (!z5 || abstractC0253b2 != c0257f) {
                if (abstractC0253b2 == c0257f && abstractC0253b == c0257f) {
                    z5 = false;
                    break;
                    break;
                }
                if (abstractC0253b2 != c0257f) {
                    C2404A c2404a3 = c0233a.f786b;
                    Object[] objArr2 = c2404a3.f7766a;
                    int i7 = c2404a3.f7767b;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (!((Boolean) ((InterfaceC1601c) objArr2[i8]).mo1h(abstractC0253b2)).booleanValue()) {
                            z5 = false;
                            break;
                        }
                    }
                }
                c2404a.m4243a(abstractC0253b2);
                z5 = false;
                abstractC0253b = abstractC0253b2;
            }
            i6++;
        }
        if (((AbstractC0253b) (c2404a.m4250h() ? null : c2404a.f7766a[c2404a.f7767b - 1])) == c0257f) {
            c2404a.m4253k(c2404a.f7767b - 1);
        }
        C1480b c1480b = c2404a.f7768c;
        if (c1480b == null) {
            c1480b = new C1480b(1, c2404a);
            c2404a.f7768c = c1480b;
        }
        return new C0254c(c1480b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC2207p m748c(C0912N c0912n) {
        return new C0460e(c0912n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC2207p m749d(InterfaceC2207p interfaceC2207p, C0038T0 c0038t0, C0913O c0913o, C0914P c0914p, C0089u c0089u) {
        return interfaceC2207p.mo4021c(new C0465j(c0038t0, c0913o, c0914p, c0089u));
    }
}
