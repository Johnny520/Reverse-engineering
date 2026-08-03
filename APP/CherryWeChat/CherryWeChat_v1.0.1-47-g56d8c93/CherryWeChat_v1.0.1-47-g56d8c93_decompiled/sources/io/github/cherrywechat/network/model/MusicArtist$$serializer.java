package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
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
public final /* synthetic */ class MusicArtist$$serializer implements InterfaceC2677wj {
    public static final MusicArtist$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        MusicArtist$$serializer musicArtist$$serializer = new MusicArtist$$serializer();
        INSTANCE = musicArtist$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.MusicArtist", musicArtist$$serializer, 1);
        c0809St.m1614l("name");
        descriptor = c0809St;
    }

    private MusicArtist$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        return new InterfaceC0717Qm[]{AbstractC0628Oj.m1249v(C2521sz.f8819a)};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicArtist deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else {
                if (iMo1770j != 0) {
                    throw new C2766ym(iMo1770j);
                }
                str = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 0, C2521sz.f8819a, str);
                i = 1;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new MusicArtist(i, str, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, MusicArtist musicArtist) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        MusicArtist.write$Self$app_release(musicArtist, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
