package p092S0;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2767z;
import p211o0.C2762u;

/* JADX INFO: renamed from: S0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1248A implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public static final C1248A f4456d = new C1248A();

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        if (AbstractC1665j.m2981a(obj, Boolean.FALSE)) {
            return new C2762u(C2762u.f8762g);
        }
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C2762u(AbstractC2767z.m4933c(((Integer) obj).intValue()));
    }
}
