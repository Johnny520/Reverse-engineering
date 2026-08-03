package io.github.cherrywechat.network.model;

import java.util.List;
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
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThemeStoreItem$$serializer implements InterfaceC2677wj {
    public static final ThemeStoreItem$$serializer INSTANCE;
    private static final InterfaceC0126Cx descriptor;

    static {
        ThemeStoreItem$$serializer themeStoreItem$$serializer = new ThemeStoreItem$$serializer();
        INSTANCE = themeStoreItem$$serializer;
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.ThemeStoreItem", themeStoreItem$$serializer, 10);
        c0809St.m1614l("id");
        c0809St.m1614l("name");
        c0809St.m1614l("author");
        c0809St.m1614l("price");
        c0809St.m1614l("demoUrl");
        c0809St.m1614l("coverImage");
        c0809St.m1614l("screenshots");
        c0809St.m1614l("description");
        c0809St.m1614l("featured");
        c0809St.m1614l("downloadCount");
        descriptor = c0809St;
    }

    private ThemeStoreItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{c2521sz, c2521sz, c2521sz, TolerantDoubleSerializer.INSTANCE, AbstractC0628Oj.m1249v(c2521sz), AbstractC0628Oj.m1249v(c2521sz), ScreenshotsSerializer.INSTANCE, c2521sz, TolerantBooleanSerializer.INSTANCE, TolerantIntSerializer.INSTANCE};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeStoreItem deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        List list = null;
        String strMo1775o = null;
        String strMo1775o2 = null;
        String strMo1775o3 = null;
        String str = null;
        String str2 = null;
        String strMo1775o4 = null;
        double dDoubleValue = 0.0d;
        int i = 0;
        boolean zBooleanValue = false;
        int iIntValue = 0;
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
                    dDoubleValue = ((Number) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 3, TolerantDoubleSerializer.INSTANCE, Double.valueOf(dDoubleValue))).doubleValue();
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 4, C2521sz.f8819a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 5, C2521sz.f8819a, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 6, ScreenshotsSerializer.INSTANCE, list);
                    i |= 64;
                    break;
                case 7:
                    strMo1775o4 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 7);
                    i |= 128;
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    zBooleanValue = ((Boolean) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 8, TolerantBooleanSerializer.INSTANCE, Boolean.valueOf(zBooleanValue))).booleanValue();
                    i |= 256;
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    iIntValue = ((Number) interfaceC0919VaMo839B.mo1779v(interfaceC0126Cx, 9, TolerantIntSerializer.INSTANCE, Integer.valueOf(iIntValue))).intValue();
                    i |= 512;
                    break;
                default:
                    throw new C2766ym(iMo1770j);
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new ThemeStoreItem(i, strMo1775o, strMo1775o2, strMo1775o3, dDoubleValue, str, str2, list, strMo1775o4, zBooleanValue, iIntValue, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, ThemeStoreItem themeStoreItem) {
        InterfaceC0126Cx interfaceC0126Cx = descriptor;
        interfaceC0624Of.m1213c();
        ThemeStoreItem.write$Self$app_release(themeStoreItem, null, interfaceC0126Cx);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }
}
