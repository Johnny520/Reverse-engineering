package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.C0329Hl;
import p000.C0809St;
import p000.C2521sz;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FAQItem$$serializer implements InterfaceC2677wj {
    public static final FAQItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        FAQItem$$serializer fAQItem$$serializer = new FAQItem$$serializer();
        INSTANCE = fAQItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.FAQItem", fAQItem$$serializer, 4);
        c0809St.m1614l("id");
        c0809St.m1614l("question");
        c0809St.m1614l("answer");
        c0809St.m1614l("item_order");
        descriptor = c0809St;
    }

    private FAQItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C0329Hl c0329Hl = C0329Hl.f1129a;
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c0329Hl, c2521sz, c2521sz, c0329Hl};
    }

    @Override // p000.InterfaceC0717Qm
    public final FAQItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        int iMo1780w = 0;
        int iMo1780w2 = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        boolean z = true;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                iMo1780w = interfaceC0919VaMo839B.mo1780w(interfaceC0126Cx, 0);
                i |= 1;
            } else if (iMo1770j == 1) {
                strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                i |= 2;
            } else if (iMo1770j == 2) {
                strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 2);
                i |= 4;
            } else {
                if (iMo1770j != 3) {
                    throw new C2766ym(iMo1770j);
                }
                iMo1780w2 = interfaceC0919VaMo839B.mo1780w(interfaceC0126Cx, 3);
                i |= 8;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new FAQItem(i, iMo1780w, strMo1775o, strMo1775o2, iMo1780w2, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, FAQItem fAQItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        FAQItem.write$Self$app_release(fAQItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
