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
public final /* synthetic */ class MusicTrack$$serializer implements InterfaceC2677wj {
    public static final MusicTrack$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        MusicTrack$$serializer musicTrack$$serializer = new MusicTrack$$serializer();
        INSTANCE = musicTrack$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.MusicTrack", musicTrack$$serializer, 8);
        c0809St.m1614l("id");
        c0809St.m1614l("name");
        c0809St.m1614l("artists");
        c0809St.m1614l("album");
        c0809St.m1614l("duration");
        c0809St.m1614l("hMusic");
        c0809St.m1614l("mMusic");
        c0809St.m1614l("lMusic");
        descriptor = c0809St;
    }

    private MusicTrack$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] interfaceC0159DnArr = MusicTrack.$childSerializers;
        C2597up c2597up = C2597up.f8972a;
        MusicQuality$$serializer musicQuality$$serializer = MusicQuality$$serializer.INSTANCE;
        return new InterfaceC0717Qm[]{c2597up, AbstractC0628Oj.m1249v(C2521sz.f8819a), interfaceC0159DnArr[2].getValue(), AbstractC0628Oj.m1249v(MusicAlbum$$serializer.INSTANCE), c2597up, AbstractC0628Oj.m1249v(musicQuality$$serializer), AbstractC0628Oj.m1249v(musicQuality$$serializer), AbstractC0628Oj.m1249v(musicQuality$$serializer)};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicTrack deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        InterfaceC0159Dn[] interfaceC0159DnArr = MusicTrack.$childSerializers;
        MusicQuality musicQuality = null;
        long jMo1767A = 0;
        long jMo1767A2 = 0;
        MusicQuality musicQuality2 = null;
        MusicQuality musicQuality3 = null;
        String str = null;
        List list = null;
        MusicAlbum musicAlbum = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            switch (iMo1770j) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo1767A = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 1, C2521sz.f8819a, str);
                    i |= 2;
                    break;
                case 2:
                    list = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 2, (InterfaceC0717Qm) interfaceC0159DnArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    musicAlbum = (MusicAlbum) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 3, MusicAlbum$$serializer.INSTANCE, musicAlbum);
                    i |= 8;
                    break;
                case 4:
                    jMo1767A2 = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    musicQuality = (MusicQuality) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 5, MusicQuality$$serializer.INSTANCE, musicQuality);
                    i |= 32;
                    break;
                case 6:
                    musicQuality2 = (MusicQuality) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 6, MusicQuality$$serializer.INSTANCE, musicQuality2);
                    i |= 64;
                    break;
                case 7:
                    musicQuality3 = (MusicQuality) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 7, MusicQuality$$serializer.INSTANCE, musicQuality3);
                    i |= 128;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new MusicTrack(i, jMo1767A, str, list, musicAlbum, jMo1767A2, musicQuality, musicQuality2, musicQuality3, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, MusicTrack musicTrack) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        MusicTrack.write$Self$app_release(musicTrack, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
