package p077f6;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;
import p148k.AbstractC3886l;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: f6.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2334t {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC2332r m8503b(InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        if ((i11 & 1) != 0) {
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: f6.s
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return AbstractC2334t.m8504c((InterfaceC4507m) obj);
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            interfaceC0184l = (InterfaceC0184l) objMo2170f;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1421981431, i10, -1, "com.mikepenz.markdown.model.markdownAnimations (MarkdownAnimations.kt:47)");
        }
        C2300b c2300b = new C2300b(interfaceC0184l);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c2300b;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m8504c(InterfaceC4507m interfaceC4507m) {
        interfaceC4507m.getClass();
        return AbstractC3886l.m15428b(interfaceC4507m, null, null, 3, null);
    }
}
