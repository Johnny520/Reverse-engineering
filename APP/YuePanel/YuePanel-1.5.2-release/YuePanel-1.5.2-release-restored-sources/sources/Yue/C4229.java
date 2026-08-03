package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4229 {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۦۥ$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7470(version = "1.3")
    @InterfaceC4772
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final <E extends InterfaceC4225.InterfaceC0357> E m1193(@InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        C5499.m17103(interfaceC0357, "<this>");
        C5499.m17103(interfaceC4228, C6659.f17103);
        if (!(interfaceC4228 instanceof AbstractC2982)) {
            if (interfaceC0357.getKey() == interfaceC4228) {
                return interfaceC0357;
            }
            return null;
        }
        AbstractC2982 abstractC2982 = (AbstractC2982) interfaceC4228;
        if (!abstractC2982.m42(interfaceC0357.getKey())) {
            return null;
        }
        E e = (E) abstractC2982.m43(interfaceC0357);
        if (e instanceof InterfaceC4225.InterfaceC0357) {
            return e;
        }
        return null;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC4225 m1194(@InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        C5499.m17103(interfaceC0357, "<this>");
        C5499.m17103(interfaceC4228, C6659.f17103);
        if (!(interfaceC4228 instanceof AbstractC2982)) {
            return interfaceC0357.getKey() == interfaceC4228 ? C4629.f9940 : interfaceC0357;
        }
        AbstractC2982 abstractC2982 = (AbstractC2982) interfaceC4228;
        return (!abstractC2982.m42(interfaceC0357.getKey()) || abstractC2982.m43(interfaceC0357) == null) ? interfaceC0357 : C4629.f9940;
    }
}
