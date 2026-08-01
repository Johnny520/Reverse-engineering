package p153k4;

import androidx.lifecycle.AbstractC0671l0;
import androidx.lifecycle.C0673m0;
import androidx.lifecycle.InterfaceC0664i;
import androidx.lifecycle.InterfaceC0677o0;
import p098g9.InterfaceC2549c;
import p137j4.AbstractC3594a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3959i {

    /* JADX INFO: renamed from: a */
    public static final C3959i f11426a = new C3959i();

    /* JADX INFO: renamed from: a */
    public final AbstractC3594a m15674a(InterfaceC0677o0 interfaceC0677o0) {
        interfaceC0677o0.getClass();
        return interfaceC0677o0 instanceof InterfaceC0664i ? ((InterfaceC0664i) interfaceC0677o0).mo2615b() : AbstractC3594a.b.f9991c;
    }

    /* JADX INFO: renamed from: b */
    public final C0673m0.c m15675b(InterfaceC0677o0 interfaceC0677o0) {
        interfaceC0677o0.getClass();
        return interfaceC0677o0 instanceof InterfaceC0664i ? ((InterfaceC0664i) interfaceC0677o0).mo2614a() : C3952b.f11420b;
    }

    /* JADX INFO: renamed from: c */
    public final String m15676c(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        String strM15662a = AbstractC3951a.m15662a(interfaceC2549c);
        if (strM15662a != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM15662a);
        }
        C9987e.m38645a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0671l0 m15677d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
