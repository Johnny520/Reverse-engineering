package p255r6;

import p010a9.InterfaceC0173a;
import p086ff.InterfaceC2436d;
import p209o6.EnumC5647j;
import p209o6.InterfaceC5644g;
import p209o6.InterfaceC5648k;
import p215oc.C5729x;
import p240q6.AbstractC6276a;

/* JADX INFO: renamed from: r6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6523b implements InterfaceC5644g {

    /* JADX INFO: renamed from: r6.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20449a;

        static {
            int[] iArr = new int[EnumC5647j.values().length];
            try {
                iArr[EnumC5647j.f17767s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5647j.f17768t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5647j.f17769u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5647j.f17770v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5647j.f17771w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5647j.f17772x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f20449a = iArr;
        }
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: a */
    public void mo22820a(InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22838l(this, interfaceC0173a);
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: b */
    public void mo22821b(Throwable th, InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22836j(this, th, interfaceC0173a);
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: c */
    public void mo22822c(InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22834h(this, interfaceC0173a);
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: d */
    public void mo22823d(InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22837k(this, interfaceC0173a);
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: f */
    public void mo22825f(InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22835i(this, interfaceC0173a);
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: g */
    public void mo22826g(InterfaceC0173a interfaceC0173a) {
        InterfaceC5644g.a.m22839m(this, interfaceC0173a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m25821h(InterfaceC2436d interfaceC2436d, EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k) {
        interfaceC2436d.getClass();
        enumC5647j.getClass();
        switch (a.f20449a[enumC5647j.ordinal()]) {
            case 1:
                return interfaceC2436d.mo8806d(interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null);
            case 2:
                return interfaceC2436d.mo8801E(interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null);
            case 3:
                return interfaceC2436d.mo8805c(interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null);
            case 4:
                return interfaceC2436d.mo8814l(interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null);
            case 5:
                return interfaceC2436d.mo8811i(interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null);
            case 6:
                return false;
            default:
                C5729x.m23182a();
                return false;
        }
    }
}
