package p141j8;

import ec.AbstractC2204y;
import ec.InterfaceC2196w;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4706m;
import p172l8.C4700i0;
import p172l8.InterfaceC4705l;
import p209o6.C5646i;
import p209o6.InterfaceC5644g;
import p314vb.AbstractC8899f;
import p314vb.C8895b;
import p314vb.EnumC8900g;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9974z;
import p375zc.C9947g;
import p375zc.EnumC9935a;

/* JADX INFO: renamed from: j8.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3649z {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5644g f10142a = C5646i.f17766a.m22846a(new InterfaceC0173a() { // from class: j8.w
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC3649z.m13602a();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4705l f10143b = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: j8.x
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC3649z.m13603b();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final long f10144c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2196w f10145d;

    static {
        C8895b.a aVar = C8895b.f29484r;
        f10144c = AbstractC8899f.m34137B(60, EnumC8900g.f29496u);
        C4700i0 c4700i0 = C4700i0.f13910a;
        InterfaceC2196w interfaceC2196wM7935b = AbstractC2204y.m7935b(c4700i0);
        interfaceC2196wM7935b.mo7918v0(c4700i0);
        f10145d = interfaceC2196wM7935b;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m13602a() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC9939c m13603b() {
        return AbstractC9974z.m38608b(null, new InterfaceC0184l() { // from class: j8.y
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3649z.m13605d((C9947g) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public static final C4700i0 m13605d(C9947g c9947g) {
        c9947g.getClass();
        c9947g.m38535h(true);
        c9947g.m38533f(true);
        c9947g.m38536i(true);
        c9947g.m38532e(EnumC9935a.f33472q);
        c9947g.m38534g(false);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2196w m13607f() {
        return f10145d;
    }

    /* JADX INFO: renamed from: g */
    public static final long m13608g() {
        return f10144c;
    }
}
