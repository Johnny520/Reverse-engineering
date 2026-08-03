package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
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
public final /* synthetic */ class MusicAlbum$$serializer implements InterfaceC2677wj {
    public static final MusicAlbum$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        MusicAlbum$$serializer musicAlbum$$serializer = new MusicAlbum$$serializer();
        INSTANCE = musicAlbum$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.MusicAlbum", musicAlbum$$serializer, 3);
        c0809St.m1614l("id");
        c0809St.m1614l("name");
        c0809St.m1614l("picUrl");
        descriptor = c0809St;
    }

    private MusicAlbum$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{C2597up.f8972a, AbstractC0628Oj.m1249v(c2521sz), AbstractC0628Oj.m1249v(c2521sz)};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicAlbum deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        long jMo1767A = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                jMo1767A = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 0);
                i |= 1;
            } else if (iMo1770j == 1) {
                str = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 1, C2521sz.f8819a, str);
                i |= 2;
            } else {
                if (iMo1770j != 2) {
                    throw new C2766ym(iMo1770j);
                }
                str2 = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 2, C2521sz.f8819a, str2);
                i |= 4;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new MusicAlbum(i, jMo1767A, str, str2, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, MusicAlbum musicAlbum) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        MusicAlbum.write$Self$app_release(musicAlbum, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
