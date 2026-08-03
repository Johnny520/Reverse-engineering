package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
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
public final /* synthetic */ class CustomerInfo$$serializer implements InterfaceC2677wj {
    public static final CustomerInfo$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        CustomerInfo$$serializer customerInfo$$serializer = new CustomerInfo$$serializer();
        INSTANCE = customerInfo$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.CustomerInfo", customerInfo$$serializer, 2);
        c0809St.m1614l("id");
        c0809St.m1614l("status");
        descriptor = c0809St;
    }

    private CustomerInfo$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz};
    }

    @Override // p000.InterfaceC0717Qm
    public final CustomerInfo deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        boolean z = true;
        int i = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 0);
                i |= 1;
            } else {
                if (iMo1770j != 1) {
                    throw new C2766ym(iMo1770j);
                }
                strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                i |= 2;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new CustomerInfo(i, strMo1775o, strMo1775o2, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, CustomerInfo customerInfo) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        CustomerInfo.write$Self$app_release(customerInfo, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
