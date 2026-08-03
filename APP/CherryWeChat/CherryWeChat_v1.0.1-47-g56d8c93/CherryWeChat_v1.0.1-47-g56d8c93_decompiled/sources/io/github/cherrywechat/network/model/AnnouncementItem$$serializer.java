package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
import p000.C0809St;
import p000.C0865U5;
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
public final /* synthetic */ class AnnouncementItem$$serializer implements InterfaceC2677wj {
    public static final AnnouncementItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        AnnouncementItem$$serializer announcementItem$$serializer = new AnnouncementItem$$serializer();
        INSTANCE = announcementItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.AnnouncementItem", announcementItem$$serializer, 8);
        c0809St.m1614l("id");
        c0809St.m1614l("title");
        c0809St.m1614l("content");
        c0809St.m1614l("type");
        c0809St.m1614l("isPopup");
        c0809St.m1614l("canClose");
        c0809St.m1614l("targetUsers");
        c0809St.m1614l("betaUserList");
        descriptor = c0809St;
    }

    private AnnouncementItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0717Qm interfaceC0717QmM1249v = AbstractC0628Oj.m1249v((InterfaceC0717Qm) AnnouncementItem.$childSerializers[7].getValue());
        C2521sz c2521sz = C2521sz.f8819a;
        C0865U5 c0865u5 = C0865U5.f2734a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, c2521sz, c0865u5, c0865u5, c2521sz, interfaceC0717QmM1249v};
    }

    @Override // p000.InterfaceC0717Qm
    public final AnnouncementItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = AnnouncementItem.$childSerializers;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String strMo1775o4 = null;
        String strMo1775o5 = null;
        List list = null;
        int i = 0;
        boolean zMo1778s = false;
        boolean zMo1778s2 = false;
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
                    zMo1778s = interfaceC0919VaMo839B.mo1778s(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo1778s2 = interfaceC0919VaMo839B.mo1778s(interfaceC0126Cx, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo1775o5 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 7, (InterfaceC0717Qm) interfaceC0159DnArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new AnnouncementItem(i, strMo1775o, strMo1775o2, strMo1775o3, strMo1775o4, zMo1778s, zMo1778s2, strMo1775o5, list, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, AnnouncementItem announcementItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        AnnouncementItem.write$Self$app_release(announcementItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
