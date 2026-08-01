package p227r;

import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p117X2.C1671p;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: r.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3026z extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public C0200n f9593f;

    /* JADX INFO: renamed from: g */
    public int f9594g;

    /* JADX INFO: renamed from: h */
    public int f9595h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f9596i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1671p f9597j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1675t f9598k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1675t f9599l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3026z(C1671p c1671p, C1675t c1675t, C1675t c1675t2, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9597j = c1671p;
        this.f9598k = c1675t;
        this.f9599l = c1675t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C3026z) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C3026z c3026z = new C3026z(this.f9597j, this.f9598k, this.f9599l, interfaceC1046d);
        c3026z.f9596i = obj;
        return c3026z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[EDGE_INSN: B:69:0x00d0->B:45:0x00d0 BREAK  A[LOOP:0: B:40:0x00bd->B:44:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:39:0x00b4). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C0185S c0185s;
        int i5;
        Object objM271a;
        C0200n c0200n;
        int size;
        int i6;
        int size2;
        int i7;
        Object objM271a2;
        Object obj2;
        Object obj3;
        int i8 = this.f9595h;
        C0200n c0200n2 = null;
        int i9 = 2;
        int i10 = 1;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i8 == 0) {
            AbstractC1784a.m3205S(obj);
            c0185s = (C0185S) this.f9596i;
            i5 = 0;
            if (i5 != 0) {
            }
        } else {
            if (i8 == 1) {
                i5 = this.f9594g;
                c0185s = (C0185S) this.f9596i;
                AbstractC1784a.m3205S(obj);
                objM271a = obj;
                c0200n = (C0200n) objM271a;
                ?? r9 = c0200n.f696a;
                size = r9.size();
                i6 = 0;
                while (true) {
                    if (i6 >= size) {
                    }
                    i6++;
                }
                ?? r92 = c0200n.f696a;
                size2 = r92.size();
                while (i7 < size2) {
                }
                if (c0200n.f698c != i9) {
                }
                this.f9596i = c0185s;
                this.f9593f = c0200n;
                this.f9594g = i5;
                this.f9595h = i9;
                objM271a2 = c0185s.m271a(EnumC0201o.f704f, this);
                if (objM271a2 != enumC1152a) {
                }
                return enumC1152a;
            }
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = this.f9594g;
            C0200n c0200n3 = this.f9593f;
            C0185S c0185s2 = (C0185S) this.f9596i;
            AbstractC1784a.m3205S(obj);
            int i11 = 1;
            objM271a2 = obj;
            ?? r5 = ((C0200n) objM271a2).f696a;
            int size3 = r5.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    break;
                }
                if (((C0209w) r5.get(i12)).m321b()) {
                    i5 = i11;
                    break;
                }
                i12++;
            }
            C1675t c1675t = this.f9598k;
            boolean zM5155f = AbstractC2945D.m5155f(c0200n3, ((C0209w) c1675t.f5710e).f711a);
            ?? r7 = c0200n3.f696a;
            C1675t c1675t2 = this.f9599l;
            if (!zM5155f) {
                int size4 = r7.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        obj3 = c0200n2;
                        break;
                    }
                    obj3 = r7.get(i13);
                    if (((C0209w) obj3).f714d) {
                        break;
                    }
                    i13++;
                }
                C0209w c0209w = (C0209w) obj3;
                if (c0209w == null) {
                    i5 = i11;
                    i10 = i5;
                    c0185s = c0185s2;
                    if (i5 != 0) {
                        return C0891q.f2780a;
                    }
                    this.f9596i = c0185s;
                    this.f9593f = c0200n2;
                    this.f9594g = i5;
                    this.f9595h = i10;
                    objM271a = c0185s.m271a(EnumC0201o.f703e, this);
                    if (objM271a != enumC1152a) {
                        c0200n = (C0200n) objM271a;
                        ?? r93 = c0200n.f696a;
                        size = r93.size();
                        i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                i5 = i10;
                                break;
                            }
                            if (!AbstractC0208v.m314d((C0209w) r93.get(i6))) {
                                break;
                            }
                            i6++;
                        }
                        ?? r922 = c0200n.f696a;
                        size2 = r922.size();
                        for (i7 = 0; i7 < size2; i7++) {
                            C0209w c0209w2 = (C0209w) r922.get(i7);
                            if (c0209w2.m321b() || AbstractC0208v.m316f(c0209w2, c0185s.f645i.f647B, c0185s.m274d())) {
                                break;
                            }
                        }
                        if (c0200n.f698c != i9) {
                            i11 = 1;
                            this.f9597j.f5705d = true;
                            i5 = 1;
                        } else {
                            i11 = 1;
                        }
                        this.f9596i = c0185s;
                        this.f9593f = c0200n;
                        this.f9594g = i5;
                        this.f9595h = i9;
                        objM271a2 = c0185s.m271a(EnumC0201o.f704f, this);
                        if (objM271a2 != enumC1152a) {
                            c0185s2 = c0185s;
                            c0200n3 = c0200n;
                            ?? r52 = ((C0200n) objM271a2).f696a;
                            int size32 = r52.size();
                            int i122 = 0;
                            while (true) {
                                if (i122 >= size32) {
                                }
                                i122++;
                            }
                            C1675t c1675t3 = this.f9598k;
                            boolean zM5155f2 = AbstractC2945D.m5155f(c0200n3, ((C0209w) c1675t3.f5710e).f711a);
                            ?? r72 = c0200n3.f696a;
                            C1675t c1675t22 = this.f9599l;
                            if (!zM5155f2) {
                                int size5 = r72.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = r72.get(i14);
                                    if (AbstractC0208v.m315e(((C0209w) obj2).f711a, ((C0209w) c1675t3.f5710e).f711a)) {
                                        break;
                                    }
                                    i14++;
                                }
                                c1675t22.f5710e = obj2;
                            }
                        }
                    }
                    return enumC1152a;
                }
                c1675t3.f5710e = c0209w;
                c1675t22.f5710e = c0209w;
            }
            c0185s = c0185s2;
            c0200n2 = null;
            i9 = 2;
            i10 = 1;
            if (i5 != 0) {
            }
        }
    }
}
