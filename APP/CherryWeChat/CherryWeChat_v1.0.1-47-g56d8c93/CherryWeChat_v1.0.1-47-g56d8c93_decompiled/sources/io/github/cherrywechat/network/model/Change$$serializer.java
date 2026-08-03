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
public final /* synthetic */ class Change$$serializer implements InterfaceC2677wj {
    public static final Change$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        Change$$serializer change$$serializer = new Change$$serializer();
        INSTANCE = change$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.Change", change$$serializer, 2);
        c0809St.m1614l("type");
        c0809St.m1614l("description");
        descriptor = c0809St;
    }

    private Change$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        return new InterfaceC0717Qm[]{ChangeType$$serializer.INSTANCE, C2521sz.f8819a};
    }

    @Override // p000.InterfaceC0717Qm
    public final Change deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        boolean z = true;
        int i = 0;
        ChangeType changeType = null;
        String strMo1775o = null;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                changeType = (ChangeType) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 0, ChangeType$$serializer.INSTANCE, changeType);
                i |= 1;
            } else {
                if (iMo1770j != 1) {
                    throw new C2766ym(iMo1770j);
                }
                strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                i |= 2;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new Change(i, changeType, strMo1775o, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Change change) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        Change.write$Self$app_release(change, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
