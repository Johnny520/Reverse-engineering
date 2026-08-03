package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
import p000.C0809St;
import p000.C2521sz;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MusicPlaylistResult$$serializer implements InterfaceC2677wj {
    public static final MusicPlaylistResult$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        MusicPlaylistResult$$serializer musicPlaylistResult$$serializer = new MusicPlaylistResult$$serializer();
        INSTANCE = musicPlaylistResult$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.MusicPlaylistResult", musicPlaylistResult$$serializer, 5);
        c0809St.m1614l("id");
        c0809St.m1614l("name");
        c0809St.m1614l("coverImgUrl");
        c0809St.m1614l("description");
        c0809St.m1614l("tracks");
        descriptor = c0809St;
    }

    private MusicPlaylistResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] interfaceC0159DnArr = MusicPlaylistResult.$childSerializers;
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{C2597up.f8972a, AbstractC0628Oj.m1249v(c2521sz), AbstractC0628Oj.m1249v(c2521sz), AbstractC0628Oj.m1249v(c2521sz), interfaceC0159DnArr[4].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicPlaylistResult deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = MusicPlaylistResult.$childSerializers;
        int i = 0;
        long jMo1767A = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
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
            } else if (iMo1770j == 2) {
                str2 = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 2, C2521sz.f8819a, str2);
                i |= 4;
            } else if (iMo1770j == 3) {
                str3 = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 3, C2521sz.f8819a, str3);
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
        return new MusicPlaylistResult(i, jMo1767A, str, str2, str3, list, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, MusicPlaylistResult musicPlaylistResult) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        MusicPlaylistResult.write$Self$app_release(musicPlaylistResult, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
