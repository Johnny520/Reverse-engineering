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
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SavedMusicItem$$serializer implements InterfaceC2677wj {
    public static final SavedMusicItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        SavedMusicItem$$serializer savedMusicItem$$serializer = new SavedMusicItem$$serializer();
        INSTANCE = savedMusicItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.SavedMusicItem", savedMusicItem$$serializer, 9);
        c0809St.m1614l("songId");
        c0809St.m1614l("albumId");
        c0809St.m1614l("title");
        c0809St.m1614l("artist");
        c0809St.m1614l("size");
        c0809St.m1614l("url");
        c0809St.m1614l("duration");
        c0809St.m1614l("album");
        c0809St.m1614l("imageUrl");
        descriptor = c0809St;
    }

    private SavedMusicItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2597up c2597up = C2597up.f8972a;
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2597up, c2597up, c2521sz, c2521sz, c2597up, c2521sz, c2597up, c2521sz, c2521sz};
    }

    @Override // p000.InterfaceC0717Qm
    public final SavedMusicItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        long jMo1767A = 0;
        long jMo1767A2 = 0;
        long jMo1767A3 = 0;
        long jMo1767A4 = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String strMo1775o4 = null;
        String strMo1775o5 = null;
        boolean z = true;
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
                    jMo1767A2 = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 3);
                    i |= 8;
                    break;
                case 4:
                    jMo1767A3 = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo1775o3 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 5);
                    i |= 32;
                    break;
                case 6:
                    jMo1767A4 = interfaceC0919VaMo839B.mo1767A(interfaceC0126Cx, 6);
                    i |= 64;
                    break;
                case 7:
                    strMo1775o4 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 7);
                    i |= 128;
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    strMo1775o5 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 8);
                    i |= 256;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new SavedMusicItem(i, jMo1767A, jMo1767A2, strMo1775o, strMo1775o2, jMo1767A3, strMo1775o3, jMo1767A4, strMo1775o4, strMo1775o5, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, SavedMusicItem savedMusicItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        SavedMusicItem.write$Self$app_release(savedMusicItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
