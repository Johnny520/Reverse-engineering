package p226p6;

import android.util.Log;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p209o6.C5645h;
import p209o6.EnumC5647j;
import p209o6.InterfaceC5644g;
import p209o6.InterfaceC5648k;
import p215oc.C5729x;

/* JADX INFO: renamed from: p6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5959b implements InterfaceC5644g {

    /* JADX INFO: renamed from: a */
    public final String f18889a;

    /* JADX INFO: renamed from: p6.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18890a;

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
            f18890a = iArr;
        }
    }

    public C5959b(String str) {
        str.getClass();
        this.f18889a = str;
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
    /* JADX INFO: renamed from: e */
    public void mo22824e(EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k, InterfaceC0184l interfaceC0184l) {
        enumC5647j.getClass();
        interfaceC0184l.getClass();
        if (m23948i(enumC5647j, interfaceC5648k)) {
            C5645h c5645h = new C5645h();
            interfaceC0184l.mo27m(c5645h);
            switch (a.f18890a[enumC5647j.ordinal()]) {
                case 1:
                    Log.v(m23947h(), c5645h.m22842c(), c5645h.m22841b());
                    break;
                case 2:
                    Log.d(m23947h(), c5645h.m22842c(), c5645h.m22841b());
                    break;
                case 3:
                    Log.i(m23947h(), c5645h.m22842c(), c5645h.m22841b());
                    break;
                case 4:
                    Log.w(m23947h(), c5645h.m22842c(), c5645h.m22841b());
                    break;
                case 5:
                    Log.e(m23947h(), c5645h.m22842c(), c5645h.m22841b());
                    break;
                case 6:
                    break;
                default:
                    C5729x.m23182a();
                    break;
            }
        }
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
    public String m23947h() {
        return this.f18889a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m23948i(EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k) {
        enumC5647j.getClass();
        switch (a.f18890a[enumC5647j.ordinal()]) {
            case 1:
                return Log.isLoggable(m23947h(), 2);
            case 2:
                return Log.isLoggable(m23947h(), 3);
            case 3:
                return Log.isLoggable(m23947h(), 4);
            case 4:
                return Log.isLoggable(m23947h(), 5);
            case 5:
                return Log.isLoggable(m23947h(), 6);
            case 6:
                return false;
            default:
                C5729x.m23182a();
                return false;
        }
    }
}
