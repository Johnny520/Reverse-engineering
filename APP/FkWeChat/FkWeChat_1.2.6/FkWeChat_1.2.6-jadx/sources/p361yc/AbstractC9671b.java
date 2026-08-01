package p361yc;

import p024b9.C1050n0;
import p098g9.InterfaceC2549c;
import p300uc.AbstractC8654h;
import p300uc.C8661o;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p376zd.C9987e;
import p376zd.C9994h0;

/* JADX INFO: renamed from: yc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9671b implements InterfaceC8647b {
    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public final void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        obj.getClass();
        InterfaceC8662p interfaceC8662pM33263b = AbstractC8654h.m33263b(this, interfaceC9488f, obj);
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218fMo15953a);
        interfaceC9486dMo637c.mo36966D(mo15953a(), 0, interfaceC8662pM33263b.mo15953a().mo35888a());
        interfaceC9486dMo637c.mo36969g(mo15953a(), 1, interfaceC8662pM33263b, obj);
        interfaceC9486dMo637c.mo638d(interfaceC9218fMo15953a);
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public final Object mo15956d(InterfaceC9487e interfaceC9487e) {
        Object objM37811h;
        interfaceC9487e.getClass();
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218fMo15953a);
        C1050n0 c1050n0 = new C1050n0();
        if (interfaceC9485cMo674c.mo36958r()) {
            objM37811h = m37811h(interfaceC9485cMo674c);
        } else {
            Object objM36978A = null;
            while (true) {
                int iMo788v = interfaceC9485cMo674c.mo788v(mo15953a());
                if (iMo788v != -1) {
                    if (iMo788v != 0) {
                        Object obj = c1050n0.f3208q;
                        if (iMo788v != 1) {
                            StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) obj;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iMo788v);
                            throw new C8661o(sb2.toString());
                        }
                        if (obj == null) {
                            C9987e.m38645a("Cannot read polymorphic value before its type token");
                            return null;
                        }
                        c1050n0.f3208q = obj;
                        objM36978A = InterfaceC9485c.m36978A(interfaceC9485cMo674c, mo15953a(), iMo788v, AbstractC8654h.m33262a(this, interfaceC9485cMo674c, (String) obj), null, 8, null);
                    } else {
                        c1050n0.f3208q = interfaceC9485cMo674c.mo36955m(mo15953a(), iMo788v);
                    }
                } else {
                    if (objM36978A == null) {
                        C9994h0.m38667a("Polymorphic value has not been read for class ", (String) c1050n0.f3208q);
                        return null;
                    }
                    objM37811h = objM36978A;
                }
            }
        }
        interfaceC9485cMo674c.mo675d(interfaceC9218fMo15953a);
        return objM37811h;
    }

    /* JADX INFO: renamed from: h */
    public final Object m37811h(InterfaceC9485c interfaceC9485c) {
        return InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), 1, AbstractC8654h.m33262a(this, interfaceC9485c, interfaceC9485c.mo36955m(mo15953a(), 0)), null, 8, null);
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC8645a mo33267i(InterfaceC9485c interfaceC9485c, String str) {
        interfaceC9485c.getClass();
        return interfaceC9485c.mo672a().mo4010e(mo33261k(), str);
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC8662p mo33268j(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        obj.getClass();
        return interfaceC9488f.mo635a().mo4011f(mo33261k(), obj);
    }

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC2549c mo33261k();
}
