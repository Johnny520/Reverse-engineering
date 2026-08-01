package p095T;

import p029F0.C0363A;
import p074O2.InterfaceC1050h;
import p109W.InterfaceC1575b;
import p117X2.AbstractC1665j;
import p119Y.C1719c;
import p119Y.C1728l;
import p121Y1.C1753n;
import p124Z.C1777a;
import p124Z.C1778b;
import p129a0.C1787b;
import p178i3.C2318C;
import p184j3.AbstractC2384c;

/* JADX INFO: renamed from: T.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1357e implements InterfaceC1050h, InterfaceC1334Q0 {

    /* JADX INFO: renamed from: e */
    public static final C0363A f4793e = new C0363A(9);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C1357e f4794f = new C1357e(1);

    /* JADX INFO: renamed from: g */
    public static final C1357e f4795g = new C1357e(2);

    /* JADX INFO: renamed from: h */
    public static final C1357e f4796h = new C1357e(3);

    /* JADX INFO: renamed from: i */
    public static final C1357e f4797i = new C1357e(4);

    /* JADX INFO: renamed from: j */
    public static final C1357e f4798j = new C1357e(5);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4799d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [T.e.<clinit>():void] */
    public /* synthetic */ C1357e(int i5) {
        this.f4799d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2504b(C1357e c1357e) {
        C2318C c2318c;
        Object obj;
        C1778b c1778b;
        C2318C c2318c2 = C1400z0.f4994z;
        do {
            c2318c = C1400z0.f4994z;
            obj = (InterfaceC1575b) c2318c.getValue();
            c1778b = (C1778b) obj;
            C1719c c1719cM3055a = c1778b.f6083f;
            C1777a c1777a = (C1777a) c1719cM3055a.get(c1357e);
            if (c1777a != null) {
                Object obj2 = c1777a.f6078a;
                Object obj3 = c1777a.f6079b;
                C1728l c1728l = c1719cM3055a.f5959d;
                C1728l c1728lM3081v = c1728l.m3081v(c1357e != null ? c1357e.hashCode() : 0, 0, c1357e);
                if (c1728l != c1728lM3081v) {
                    c1719cM3055a = c1728lM3081v == null ? C1719c.f5958f : new C1719c(c1728lM3081v, c1719cM3055a.f5960e - 1);
                }
                C1787b c1787b = C1787b.f6103a;
                if (obj2 != c1787b) {
                    Object obj4 = c1719cM3055a.get(obj2);
                    AbstractC1665j.m2982b(obj4);
                    c1719cM3055a = c1719cM3055a.m3055a(obj2, new C1777a(((C1777a) obj4).f6078a, obj3));
                }
                if (obj3 != c1787b) {
                    Object obj5 = c1719cM3055a.get(obj3);
                    AbstractC1665j.m2982b(obj5);
                    c1719cM3055a = c1719cM3055a.m3055a(obj3, new C1777a(obj2, ((C1777a) obj5).f6079b));
                }
                Object obj6 = obj2 != c1787b ? c1778b.f6081d : obj3;
                if (obj3 != c1787b) {
                    obj2 = c1778b.f6082e;
                }
                c1778b = new C1778b(obj6, obj2, c1719cM3055a);
            }
            if (obj == c1778b) {
                return;
            }
            C1753n c1753n = AbstractC2384c.f7730b;
            if (obj == null) {
                obj = c1753n;
            }
        } while (!c2318c.m4147g(obj, c1778b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1334Q0
    /* JADX INFO: renamed from: a */
    public boolean mo2498a(Object obj, Object obj2) {
        switch (this.f4799d) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return AbstractC1665j.m2981a(obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4799d) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
