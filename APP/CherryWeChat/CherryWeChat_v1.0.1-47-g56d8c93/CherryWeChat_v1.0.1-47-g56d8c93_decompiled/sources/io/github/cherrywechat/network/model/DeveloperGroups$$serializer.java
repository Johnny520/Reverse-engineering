package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.C0809St;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DeveloperGroups$$serializer implements InterfaceC2677wj {
    public static final DeveloperGroups$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        DeveloperGroups$$serializer developerGroups$$serializer = new DeveloperGroups$$serializer();
        INSTANCE = developerGroups$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.DeveloperGroups", developerGroups$$serializer, 2);
        c0809St.m1614l("core");
        c0809St.m1614l("special");
        descriptor = c0809St;
    }

    private DeveloperGroups$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] interfaceC0159DnArr = DeveloperGroups.$childSerializers;
        return new InterfaceC0717Qm[]{interfaceC0159DnArr[0].getValue(), interfaceC0159DnArr[1].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final DeveloperGroups deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = DeveloperGroups.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                list = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 0, (InterfaceC0717Qm) interfaceC0159DnArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iMo1770j != 1) {
                    throw new C2766ym(iMo1770j);
                }
                list2 = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 1, (InterfaceC0717Qm) interfaceC0159DnArr[1].getValue(), list2);
                i |= 2;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new DeveloperGroups(i, list, list2, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, DeveloperGroups developerGroups) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        DeveloperGroups.write$Self$app_release(developerGroups, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
