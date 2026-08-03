package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.C0809St;
import p000.C2521sz;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThemeVersionData$$serializer implements InterfaceC2677wj {
    public static final ThemeVersionData$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        ThemeVersionData$$serializer themeVersionData$$serializer = new ThemeVersionData$$serializer();
        INSTANCE = themeVersionData$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.ThemeVersionData", themeVersionData$$serializer, 6);
        c0809St.m1614l("id");
        c0809St.m1614l("versionName");
        c0809St.m1614l("fileName");
        c0809St.m1614l("fileExt");
        c0809St.m1614l("fileSize");
        c0809St.m1614l("createdAt");
        descriptor = c0809St;
    }

    private ThemeVersionData$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, c2521sz, C2597up.f8972a, c2521sz};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeVersionData deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String strMo1775o4 = null;
        String strMo1775o5 = null;
        long jMo1767A = 0;
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
                    strMo1775o4 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 3);
                    i |= 8;
                    break;
                case 4:
                    jMo1767A = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo1775o5 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 5);
                    i |= 32;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new ThemeVersionData(i, strMo1775o, strMo1775o2, strMo1775o3, strMo1775o4, jMo1767A, strMo1775o5, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, ThemeVersionData themeVersionData) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        ThemeVersionData.write$Self$app_release(themeVersionData, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
