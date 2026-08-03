package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0298Gx;
import p000.C0809St;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MusicQuality$$serializer implements InterfaceC2677wj {
    public static final MusicQuality$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        MusicQuality$$serializer musicQuality$$serializer = new MusicQuality$$serializer();
        INSTANCE = musicQuality$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.MusicQuality", musicQuality$$serializer, 1);
        c0809St.m1614l("size");
        descriptor = c0809St;
    }

    private MusicQuality$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        return new InterfaceC0717Qm[]{C2597up.f8972a};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicQuality deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        long jMo1767A = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else {
                if (iMo1770j != 0) {
                    throw new C2766ym(iMo1770j);
                }
                jMo1767A = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 0);
                i = 1;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new MusicQuality(i, jMo1767A, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, MusicQuality musicQuality) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        MusicQuality.write$Self$app_release(musicQuality, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
