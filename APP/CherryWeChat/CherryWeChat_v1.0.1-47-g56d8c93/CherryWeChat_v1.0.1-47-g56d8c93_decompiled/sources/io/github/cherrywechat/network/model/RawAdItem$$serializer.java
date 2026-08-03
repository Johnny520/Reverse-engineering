package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
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
public final /* synthetic */ class RawAdItem$$serializer implements InterfaceC2677wj {
    public static final RawAdItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        RawAdItem$$serializer rawAdItem$$serializer = new RawAdItem$$serializer();
        INSTANCE = rawAdItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.RawAdItem", rawAdItem$$serializer, 6);
        c0809St.m1614l("id");
        c0809St.m1614l("imageUrl");
        c0809St.m1614l("linkUrl");
        c0809St.m1614l("status");
        c0809St.m1614l("sortOrder");
        c0809St.m1614l("endTime");
        descriptor = c0809St;
    }

    private RawAdItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz c2521sz = C2521sz.f8819a;
        InterfaceC0717Qm interfaceC0717QmM1249v = AbstractC0628Oj.m1249v(c2521sz);
        C0329Hl c0329Hl = C0329Hl.f1129a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, c0329Hl, c0329Hl, interfaceC0717QmM1249v};
    }

    @Override // p000.InterfaceC0717Qm
    public final RawAdItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        int iMo1780w = 0;
        int iMo1780w2 = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            switch (iMo1770j) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo1775o3 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo1780w = interfaceC0919VaMo839B.mo1780w(interfaceC0126Cx, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo1780w2 = interfaceC0919VaMo839B.mo1780w(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 5, C2521sz.f8819a, str);
                    i |= 32;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new RawAdItem(i, strMo1775o, strMo1775o2, strMo1775o3, iMo1780w, iMo1780w2, str, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, RawAdItem rawAdItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        RawAdItem.write$Self$app_release(rawAdItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
