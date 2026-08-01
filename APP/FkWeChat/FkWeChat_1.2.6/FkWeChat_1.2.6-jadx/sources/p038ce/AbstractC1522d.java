package p038ce;

import be.AbstractC1113a;
import java.util.Iterator;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: ce.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1522d {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1519a m5946a(InterfaceC1519a interfaceC1519a, AbstractC1113a abstractC1113a) {
        Object next;
        interfaceC1519a.getClass();
        abstractC1113a.getClass();
        Iterator it = interfaceC1519a.mo5938f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1061t.m3842c(((InterfaceC1519a) next).getType(), abstractC1113a)) {
                break;
            }
        }
        return (InterfaceC1519a) next;
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m5947b(InterfaceC1519a interfaceC1519a, CharSequence charSequence) {
        interfaceC1519a.getClass();
        charSequence.getClass();
        return charSequence.subSequence(interfaceC1519a.mo5940h(), interfaceC1519a.mo5939g());
    }
}
