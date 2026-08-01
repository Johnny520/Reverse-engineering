package ne;

import be.C1116d;
import me.C5164c;
import okhttp3.internal.url._UrlKt;
import p175le.C4752a;
import p376zd.C9987e;

/* JADX INFO: renamed from: ne.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5591c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5590b m22689a(InterfaceC5590b interfaceC5590b, C5164c.a aVar) {
        interfaceC5590b.getClass();
        aVar.getClass();
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        InterfaceC5590b interfaceC5590bMo22672e = interfaceC5590b.mo22672e(aVar);
        String strM21186c = aVar.m21186c();
        while (true) {
            InterfaceC5590b interfaceC5590bMo22671d = interfaceC5590bMo22672e.mo22671d(aVar.m21196m(m22694f(interfaceC5590bMo22672e, strM21186c) + 1));
            if (interfaceC5590bMo22671d == null) {
                return interfaceC5590bMo22672e;
            }
            interfaceC5590bMo22672e = interfaceC5590bMo22671d;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m22690b(InterfaceC5590b interfaceC5590b) {
        return interfaceC5590b.mo22670c(interfaceC5590b.mo22669b().length);
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m22691c(InterfaceC5590b interfaceC5590b, CharSequence charSequence) {
        interfaceC5590b.getClass();
        charSequence.getClass();
        return charSequence.length() < interfaceC5590b.mo22674g() ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence.subSequence(interfaceC5590b.mo22674g(), charSequence.length());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22692d(InterfaceC5590b interfaceC5590b, InterfaceC5590b interfaceC5590b2) {
        interfaceC5590b.getClass();
        interfaceC5590b2.getClass();
        if (interfaceC5590b2.mo22669b().length != 0) {
            return interfaceC5590b.mo22675h(interfaceC5590b2) && !interfaceC5590b.mo22670c(interfaceC5590b2.mo22669b().length - 1);
        }
        C9987e.m38645a("List constraints should contain at least one item");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m22693e(InterfaceC5590b interfaceC5590b, InterfaceC5590b interfaceC5590b2) {
        interfaceC5590b.getClass();
        interfaceC5590b2.getClass();
        return interfaceC5590b.mo22675h(interfaceC5590b2) && !interfaceC5590b.mo22670c(interfaceC5590b2.mo22669b().length);
    }

    /* JADX INFO: renamed from: f */
    public static final int m22694f(InterfaceC5590b interfaceC5590b, CharSequence charSequence) {
        interfaceC5590b.getClass();
        charSequence.getClass();
        return Math.min(interfaceC5590b.mo22674g(), charSequence.length());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m22695g(InterfaceC5590b interfaceC5590b, InterfaceC5590b interfaceC5590b2) {
        interfaceC5590b.getClass();
        interfaceC5590b2.getClass();
        return interfaceC5590b2.mo22675h(interfaceC5590b) && !m22690b(interfaceC5590b);
    }
}
