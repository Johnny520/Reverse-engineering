package p200nb;

import java.util.List;
import p200nb.InterfaceC5541f;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6056z;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: nb.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5548m implements InterfaceC5541f {

    /* JADX INFO: renamed from: a */
    public static final C5548m f17338a = new C5548m();

    /* JADX INFO: renamed from: b */
    public static final String f17339b = "should not have varargs or parameters with default values";

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: a */
    public String mo22561a(InterfaceC6056z interfaceC6056z) {
        return InterfaceC5541f.a.m22571a(this, interfaceC6056z);
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: b */
    public String mo22562b() {
        return f17339b;
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: c */
    public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        List<InterfaceC6039s1> listMo12680m = interfaceC6056z.mo12680m();
        listMo12680m.getClass();
        if (listMo12680m != null && listMo12680m.isEmpty()) {
            return true;
        }
        for (InterfaceC6039s1 interfaceC6039s1 : listMo12680m) {
            interfaceC6039s1.getClass();
            if (AbstractC9211e.m35851f(interfaceC6039s1) || interfaceC6039s1.mo24070o0() != null) {
                return false;
            }
        }
        return true;
    }
}
