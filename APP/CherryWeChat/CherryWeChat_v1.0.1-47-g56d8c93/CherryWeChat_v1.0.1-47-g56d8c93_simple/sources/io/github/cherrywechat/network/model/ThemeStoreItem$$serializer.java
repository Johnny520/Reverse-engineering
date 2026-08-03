package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
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
public final /* synthetic */ class ThemeStoreItem$$serializer implements InterfaceC2677wj {
    public static final ThemeStoreItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        ThemeStoreItem$$serializer r0 = new ThemeStoreItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.ThemeStoreItem", r0, 10);
        r1.m1614l("id");
        r1.m1614l("name");
        r1.m1614l("author");
        r1.m1614l("price");
        r1.m1614l("demoUrl");
        r1.m1614l("coverImage");
        r1.m1614l("screenshots");
        r1.m1614l("description");
        r1.m1614l("featured");
        r1.m1614l("downloadCount");
        descriptor = r1;
    }

    private ThemeStoreItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r0 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r0, r0, r0, TolerantDoubleSerializer.INSTANCE, AbstractC0628Oj.m1249v(r0), AbstractC0628Oj.m1249v(r0), ScreenshotsSerializer.INSTANCE, r0, TolerantBooleanSerializer.INSTANCE, TolerantIntSerializer.INSTANCE};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeStoreItem deserialize(InterfaceC0406Jc r22) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r22.mo839B(r0);
        List r4 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r14 = null;
        String r15 = null;
        String r17 = null;
        double r12 = 0.0d;
        int r8 = 0;
        boolean r18 = false;
        int r19 = 0;
        boolean r5 = true;
    L3:
        if (r5 == false) goto L19;
        int r6 = r1.mo1770j(r0);
        switch(r6) {
            case -1: goto L18;
            case 0: goto L17;
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L14;
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L11;
            case 7: goto L10;
            case 8: goto L9;
            case 9: goto L8;
            default: goto L7;
        };
    L7:
        throw new C2766ym(r6);
    L9:
        r18 = ((Boolean) r1.mo1779v(r0, 8, TolerantBooleanSerializer.INSTANCE, Boolean.valueOf(r18))).booleanValue();
        r8 = r8 | 256;
        goto L3
    L10:
        r17 = r1.mo1775o(r0, 7);
        r8 = r8 | 128;
        goto L3
    L11:
        r4 = (List) r1.mo1779v(r0, 6, ScreenshotsSerializer.INSTANCE, r4);
        r8 = r8 | 64;
        goto L3
    L12:
        r15 = (String) r1.mo1769i(r0, 5, C2521sz.f8819a, r15);
        r8 = r8 | 32;
        goto L3
    L13:
        r14 = (String) r1.mo1769i(r0, 4, C2521sz.f8819a, r14);
        r8 = r8 | 16;
        goto L3
    L14:
        r12 = ((Number) r1.mo1779v(r0, 3, TolerantDoubleSerializer.INSTANCE, Double.valueOf(r12))).doubleValue();
        r8 = r8 | 8;
        goto L3
    L15:
        r11 = r1.mo1775o(r0, 2);
        r8 = r8 | 4;
        goto L3
    L16:
        r10 = r1.mo1775o(r0, 1);
        r8 = r8 | 2;
        goto L3
    L17:
        r9 = r1.mo1775o(r0, 0);
        r8 = r8 | 1;
        goto L3
    L18:
        r5 = false;
        goto L3
    L8:
        r19 = ((Number) r1.mo1779v(r0, 9, TolerantIntSerializer.INSTANCE, Integer.valueOf(r19))).intValue();
        r8 = r8 | 512;
        goto L3
    L19:
        r1.mo1777r(r0);
        return new ThemeStoreItem(r8, r9, r10, r11, r12, r14, r15, r4, r17, r18, r19, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, ThemeStoreItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        ThemeStoreItem.write$Self$app_release(r3, null, r0);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC0406Jc r1) {
        return deserialize(r1);
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of r1, Object r2) {
        serialize(r1, (ThemeStoreItem) r2);
    }
}
