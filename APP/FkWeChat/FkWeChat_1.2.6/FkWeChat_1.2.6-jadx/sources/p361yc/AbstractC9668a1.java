package p361yc;

import p024b9.AbstractC1043k;
import p300uc.C8661o;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9668a1 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8647b f32899a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8647b f32900b;

    public AbstractC9668a1(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2) {
        this.f32899a = interfaceC8647b;
        this.f32900b = interfaceC8647b2;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(mo15953a());
        interfaceC9486dMo637c.mo36969g(mo15953a(), 0, this.f32899a, mo37801g(obj));
        interfaceC9486dMo637c.mo36969g(mo15953a(), 1, this.f32900b, mo37803i(obj));
        interfaceC9486dMo637c.mo638d(mo15953a());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public Object mo15956d(InterfaceC9487e interfaceC9487e) {
        Object objMo37805k;
        interfaceC9487e.getClass();
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218fMo15953a);
        if (interfaceC9485cMo674c.mo36958r()) {
            objMo37805k = mo37805k(InterfaceC9485c.m36978A(interfaceC9485cMo674c, mo15953a(), 0, m37802h(), null, 8, null), InterfaceC9485c.m36978A(interfaceC9485cMo674c, mo15953a(), 1, m37804j(), null, 8, null));
        } else {
            Object objM36978A = AbstractC9700g3.f32944a;
            Object objM36978A2 = AbstractC9700g3.f32944a;
            while (true) {
                int iMo788v = interfaceC9485cMo674c.mo788v(mo15953a());
                if (iMo788v != -1) {
                    if (iMo788v == 0) {
                        objM36978A = InterfaceC9485c.m36978A(interfaceC9485cMo674c, mo15953a(), 0, m37802h(), null, 8, null);
                    } else {
                        if (iMo788v != 1) {
                            throw new C8661o("Invalid index: " + iMo788v);
                        }
                        objM36978A2 = InterfaceC9485c.m36978A(interfaceC9485cMo674c, mo15953a(), 1, m37804j(), null, 8, null);
                    }
                } else {
                    if (objM36978A == AbstractC9700g3.f32944a) {
                        throw new C8661o("Element 'key' is missing");
                    }
                    if (objM36978A2 == AbstractC9700g3.f32944a) {
                        throw new C8661o("Element 'value' is missing");
                    }
                    objMo37805k = mo37805k(objM36978A, objM36978A2);
                }
            }
        }
        interfaceC9485cMo674c.mo675d(interfaceC9218fMo15953a);
        return objMo37805k;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo37801g(Object obj);

    /* JADX INFO: renamed from: h */
    public final InterfaceC8647b m37802h() {
        return this.f32899a;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo37803i(Object obj);

    /* JADX INFO: renamed from: j */
    public final InterfaceC8647b m37804j() {
        return this.f32900b;
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo37805k(Object obj, Object obj2);

    public /* synthetic */ AbstractC9668a1(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2, AbstractC1043k abstractC1043k) {
        this(interfaceC8647b, interfaceC8647b2);
    }
}
