package p174m;

import gg.C1421q;
import gg.C1425u;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2592e0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C3903k f8394g;

    /* JADX INFO: renamed from: h */
    public int f8395h;

    /* JADX INFO: renamed from: i */
    public int f8396i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f8397j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1421q f8398k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1425u f8399l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1425u f8400m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2592e0(C1421q c1421q, C1425u c1425u, C1425u c1425u2, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f8398k = c1421q;
        this.f8399l = c1425u;
        this.f8400m = c1425u2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2592e0 c2592e0 = new C2592e0(this.f8398k, this.f8399l, this.f8400m, interfaceC5557c);
        c2592e0.f8397j = obj;
        return c2592e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2592e0) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf A[EDGE_INSN: B:69:0x00cf->B:45:0x00cf BREAK  A[LOOP:0: B:40:0x00bc->B:44:0x00cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b3). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3904k0 c3904k0;
        int i9;
        Object objM8102e;
        C3903k c3903k;
        int size;
        int i10;
        int size2;
        int i11;
        Object objM8102e2;
        Object obj2;
        Object obj3;
        int i12 = this.f8396i;
        C3903k c3903k2 = null;
        int i13 = 2;
        int i14 = 1;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i12 == 0) {
            AbstractC1089i.m2732I0(obj);
            c3904k0 = (C3904k0) this.f8397j;
            i9 = 0;
            if (i9 != 0) {
            }
        } else {
            if (i12 == 1) {
                i9 = this.f8395h;
                c3904k0 = (C3904k0) this.f8397j;
                AbstractC1089i.m2732I0(obj);
                objM8102e = obj;
                c3903k = (C3903k) objM8102e;
                ?? r92 = c3903k.f12800a;
                size = r92.size();
                i10 = 0;
                while (true) {
                    if (i10 >= size) {
                    }
                    i10++;
                }
                ?? r93 = c3903k.f12800a;
                size2 = r93.size();
                while (i11 < size2) {
                }
                if (c3903k.f12802c != i13) {
                }
                this.f8397j = c3904k0;
                this.f8394g = c3903k;
                this.f8395h = i9;
                this.f8396i = i13;
                objM8102e2 = c3904k0.m8102e(EnumC3905l.f12814i, this);
                if (objM8102e2 != enumC5799a) {
                }
                return enumC5799a;
            }
            if (i12 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i9 = this.f8395h;
            C3903k c3903k3 = this.f8394g;
            C3904k0 c3904k02 = (C3904k0) this.f8397j;
            AbstractC1089i.m2732I0(obj);
            int i15 = 1;
            objM8102e2 = obj;
            ?? r5 = ((C3903k) objM8102e2).f12800a;
            int size3 = r5.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size3) {
                    break;
                }
                if (((C3914t) r5.get(i16)).m8119b()) {
                    i9 = i15;
                    break;
                }
                i16++;
            }
            C1425u c1425u = this.f8399l;
            boolean zM6068e = AbstractC2615j0.m6068e(c3903k3, ((C3914t) c1425u.f4738g).f12834a);
            ?? r72 = c3903k3.f12800a;
            C1425u c1425u2 = this.f8400m;
            if (!zM6068e) {
                int size4 = r72.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size4) {
                        obj3 = c3903k2;
                        break;
                    }
                    obj3 = r72.get(i17);
                    if (((C3914t) obj3).f12837d) {
                        break;
                    }
                    i17++;
                }
                C3914t c3914t = (C3914t) obj3;
                if (c3914t == null) {
                    i9 = i15;
                    i14 = i9;
                    c3904k0 = c3904k02;
                    if (i9 != 0) {
                        return C3967n.f12976a;
                    }
                    this.f8397j = c3904k0;
                    this.f8394g = c3903k2;
                    this.f8395h = i9;
                    this.f8396i = i14;
                    objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                    if (objM8102e != enumC5799a) {
                        c3903k = (C3903k) objM8102e;
                        ?? r922 = c3903k.f12800a;
                        size = r922.size();
                        i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                i9 = i14;
                                break;
                            }
                            if (!AbstractC3913s.m8111d((C3914t) r922.get(i10))) {
                                break;
                            }
                            i10++;
                        }
                        ?? r932 = c3903k.f12800a;
                        size2 = r932.size();
                        for (i11 = 0; i11 < size2; i11++) {
                            C3914t c3914t2 = (C3914t) r932.get(i11);
                            if (c3914t2.m8119b() || AbstractC3913s.m8113f(c3914t2, c3904k0.f12811l.f12820E, c3904k0.m8103m())) {
                                break;
                            }
                        }
                        if (c3903k.f12802c != i13) {
                            i15 = 1;
                            this.f8398k.f4734g = true;
                            i9 = 1;
                        } else {
                            i15 = 1;
                        }
                        this.f8397j = c3904k0;
                        this.f8394g = c3903k;
                        this.f8395h = i9;
                        this.f8396i = i13;
                        objM8102e2 = c3904k0.m8102e(EnumC3905l.f12814i, this);
                        if (objM8102e2 != enumC5799a) {
                            c3904k02 = c3904k0;
                            c3903k3 = c3903k;
                            ?? r52 = ((C3903k) objM8102e2).f12800a;
                            int size32 = r52.size();
                            int i162 = 0;
                            while (true) {
                                if (i162 >= size32) {
                                }
                                i162++;
                            }
                            C1425u c1425u3 = this.f8399l;
                            boolean zM6068e2 = AbstractC2615j0.m6068e(c3903k3, ((C3914t) c1425u3.f4738g).f12834a);
                            ?? r722 = c3903k3.f12800a;
                            C1425u c1425u22 = this.f8400m;
                            if (!zM6068e2) {
                                int size5 = r722.size();
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = r722.get(i18);
                                    if (AbstractC3913s.m8112e(((C3914t) obj2).f12834a, ((C3914t) c1425u3.f4738g).f12834a)) {
                                        break;
                                    }
                                    i18++;
                                }
                                c1425u22.f4738g = obj2;
                            }
                        }
                    }
                    return enumC5799a;
                }
                c1425u3.f4738g = c3914t;
                c1425u22.f4738g = c3914t;
            }
            c3904k0 = c3904k02;
            c3903k2 = null;
            i13 = 2;
            i14 = 1;
            if (i9 != 0) {
            }
        }
    }
}
