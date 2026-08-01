package p361yc;

import java.lang.annotation.Annotation;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;
import p300uc.C8661o;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9223k;
import p329wc.AbstractC9225m;
import p329wc.C9213a;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9785y1 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final Object f33070a;

    /* JADX INFO: renamed from: b */
    public List f33071b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f33072c;

    public C9785y1(final String str, Object obj) {
        str.getClass();
        obj.getClass();
        this.f33070a = obj;
        this.f33071b = AbstractC5114x.m20800o();
        this.f33072c = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: yc.w1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9785y1.m38088h(str, this);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m38087g(C9785y1 c9785y1, C9213a c9213a) {
        c9213a.getClass();
        c9213a.m35884h(c9785y1.f33071b);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC9218f m38088h(String str, final C9785y1 c9785y1) {
        return AbstractC9223k.m35908d(str, AbstractC9225m.d.f31489a, new InterfaceC9218f[0], new InterfaceC0184l() { // from class: yc.x1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9785y1.m38087g(this.f33066q, (C9213a) obj);
            }
        });
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return (InterfaceC9218f) this.f33072c.getValue();
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        obj.getClass();
        interfaceC9488f.mo637c(mo15953a()).mo638d(mo15953a());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public Object mo15956d(InterfaceC9487e interfaceC9487e) {
        int iMo788v;
        interfaceC9487e.getClass();
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218fMo15953a);
        if (interfaceC9485cMo674c.mo36958r() || (iMo788v = interfaceC9485cMo674c.mo788v(mo15953a())) == -1) {
            C4700i0 c4700i0 = C4700i0.f13910a;
            interfaceC9485cMo674c.mo675d(interfaceC9218fMo15953a);
            return this.f33070a;
        }
        throw new C8661o("Unexpected index " + iMo788v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9785y1(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        str.getClass();
        obj.getClass();
        annotationArr.getClass();
        this.f33071b = AbstractC5102r.m20652d(annotationArr);
    }
}
