package p361yc;

import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p172l8.C4716w;
import p300uc.C8661o;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9223k;
import p329wc.C9213a;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.f3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9695f3 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8647b f32933a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8647b f32934b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8647b f32935c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9218f f32936d;

    public C9695f3(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2, InterfaceC8647b interfaceC8647b3) {
        interfaceC8647b.getClass();
        interfaceC8647b2.getClass();
        interfaceC8647b3.getClass();
        this.f32933a = interfaceC8647b;
        this.f32934b = interfaceC8647b2;
        this.f32935c = interfaceC8647b3;
        this.f32936d = AbstractC9223k.m35907c("kotlin.Triple", new InterfaceC9218f[0], new InterfaceC0184l() { // from class: yc.e3
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9695f3.m37892g(this.f32926q, (C9213a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m37892g(C9695f3 c9695f3, C9213a c9213a) {
        c9213a.getClass();
        C9213a.m35877b(c9213a, "first", c9695f3.f32933a.mo15953a(), null, false, 12, null);
        C9213a.m35877b(c9213a, "second", c9695f3.f32934b.mo15953a(), null, false, 12, null);
        C9213a.m35877b(c9213a, "third", c9695f3.f32935c.mo15953a(), null, false, 12, null);
        return C4700i0.f13910a;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32936d;
    }

    /* JADX INFO: renamed from: h */
    public final C4716w m37893h(InterfaceC9485c interfaceC9485c) {
        Object objM36978A = InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), 0, this.f32933a, null, 8, null);
        Object objM36978A2 = InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), 1, this.f32934b, null, 8, null);
        Object objM36978A3 = InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), 2, this.f32935c, null, 8, null);
        interfaceC9485c.mo675d(mo15953a());
        return new C4716w(objM36978A, objM36978A2, objM36978A3);
    }

    /* JADX INFO: renamed from: i */
    public final C4716w m37894i(InterfaceC9485c interfaceC9485c) {
        InterfaceC9485c interfaceC9485c2;
        Object objM36978A = AbstractC9700g3.f32944a;
        Object objM36978A2 = AbstractC9700g3.f32944a;
        Object objM36978A3 = AbstractC9700g3.f32944a;
        while (true) {
            int iMo788v = interfaceC9485c.mo788v(mo15953a());
            if (iMo788v == -1) {
                interfaceC9485c.mo675d(mo15953a());
                if (objM36978A == AbstractC9700g3.f32944a) {
                    throw new C8661o("Element 'first' is missing");
                }
                if (objM36978A2 == AbstractC9700g3.f32944a) {
                    throw new C8661o("Element 'second' is missing");
                }
                if (objM36978A3 != AbstractC9700g3.f32944a) {
                    return new C4716w(objM36978A, objM36978A2, objM36978A3);
                }
                throw new C8661o("Element 'third' is missing");
            }
            if (iMo788v == 0) {
                interfaceC9485c2 = interfaceC9485c;
                objM36978A = InterfaceC9485c.m36978A(interfaceC9485c2, mo15953a(), 0, this.f32933a, null, 8, null);
            } else if (iMo788v == 1) {
                interfaceC9485c2 = interfaceC9485c;
                objM36978A2 = InterfaceC9485c.m36978A(interfaceC9485c2, mo15953a(), 1, this.f32934b, null, 8, null);
            } else {
                if (iMo788v != 2) {
                    throw new C8661o("Unexpected index " + iMo788v);
                }
                objM36978A3 = InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), 2, this.f32935c, null, 8, null);
            }
            interfaceC9485c = interfaceC9485c2;
        }
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4716w mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(mo15953a());
        return interfaceC9485cMo674c.mo36958r() ? m37893h(interfaceC9485cMo674c) : m37894i(interfaceC9485cMo674c);
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo15954b(InterfaceC9488f interfaceC9488f, C4716w c4716w) {
        interfaceC9488f.getClass();
        c4716w.getClass();
        InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(mo15953a());
        interfaceC9486dMo637c.mo36969g(mo15953a(), 0, this.f32933a, c4716w.m18812d());
        interfaceC9486dMo637c.mo36969g(mo15953a(), 1, this.f32934b, c4716w.m18813e());
        interfaceC9486dMo637c.mo36969g(mo15953a(), 2, this.f32935c, c4716w.m18814f());
        interfaceC9486dMo637c.mo638d(mo15953a());
    }
}
