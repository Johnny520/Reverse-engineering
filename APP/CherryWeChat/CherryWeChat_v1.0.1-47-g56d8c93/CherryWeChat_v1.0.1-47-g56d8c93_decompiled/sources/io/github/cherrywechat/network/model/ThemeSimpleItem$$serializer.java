package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.C0809St;
import p000.C2521sz;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThemeSimpleItem$$serializer implements InterfaceC2677wj {
    public static final ThemeSimpleItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        ThemeSimpleItem$$serializer themeSimpleItem$$serializer = new ThemeSimpleItem$$serializer();
        INSTANCE = themeSimpleItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.ThemeSimpleItem", themeSimpleItem$$serializer, 5);
        c0809St.m1614l("themeId");
        c0809St.m1614l("themeName");
        c0809St.m1614l("ownerId");
        c0809St.m1614l("owner");
        c0809St.m1614l("versions");
        descriptor = c0809St;
    }

    private ThemeSimpleItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] interfaceC0159DnArr = ThemeSimpleItem.$childSerializers;
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, c2521sz, interfaceC0159DnArr[4].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeSimpleItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = ThemeSimpleItem.$childSerializers;
        int i = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String strMo1775o4 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 0);
                i |= 1;
            } else if (iMo1770j == 1) {
                strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                i |= 2;
            } else if (iMo1770j == 2) {
                strMo1775o3 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 2);
                i |= 4;
            } else if (iMo1770j == 3) {
                strMo1775o4 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 3);
                i |= 8;
            } else {
                if (iMo1770j != 4) {
                    throw new C2766ym(iMo1770j);
                }
                list = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 4, (InterfaceC0717Qm) interfaceC0159DnArr[4].getValue(), list);
                i |= 16;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new ThemeSimpleItem(i, strMo1775o, strMo1775o2, strMo1775o3, strMo1775o4, list, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, ThemeSimpleItem themeSimpleItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        ThemeSimpleItem.write$Self$app_release(themeSimpleItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
