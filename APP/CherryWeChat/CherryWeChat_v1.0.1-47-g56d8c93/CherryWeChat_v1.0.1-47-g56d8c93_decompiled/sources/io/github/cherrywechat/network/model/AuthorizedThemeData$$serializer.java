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
public final /* synthetic */ class AuthorizedThemeData$$serializer implements InterfaceC2677wj {
    public static final AuthorizedThemeData$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        AuthorizedThemeData$$serializer authorizedThemeData$$serializer = new AuthorizedThemeData$$serializer();
        INSTANCE = authorizedThemeData$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.AuthorizedThemeData", authorizedThemeData$$serializer, 7);
        c0809St.m1614l("id");
        c0809St.m1614l("name");
        c0809St.m1614l("author");
        c0809St.m1614l("baiduSkinDownloadUrl");
        c0809St.m1614l("authType");
        c0809St.m1614l("createdAt");
        c0809St.m1614l("versions");
        descriptor = c0809St;
    }

    private AuthorizedThemeData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] interfaceC0159DnArr = AuthorizedThemeData.$childSerializers;
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, c2521sz, c2521sz, c2521sz, interfaceC0159DnArr[6].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final AuthorizedThemeData deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = AuthorizedThemeData.$childSerializers;
        int i = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String strMo1775o4 = null;
        String strMo1775o5 = null;
        String strMo1775o6 = null;
        List list = null;
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
                    strMo1775o5 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo1775o6 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 6, (InterfaceC0717Qm) interfaceC0159DnArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new AuthorizedThemeData(i, strMo1775o, strMo1775o2, strMo1775o3, strMo1775o4, strMo1775o5, strMo1775o6, list, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, AuthorizedThemeData authorizedThemeData) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        AuthorizedThemeData.write$Self$app_release(authorizedThemeData, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
