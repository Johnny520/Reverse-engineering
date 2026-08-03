package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.AbstractC0628Oj;
import p000.C0329Hl;
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
public final /* synthetic */ class RawAdItem$$serializer implements InterfaceC2677wj {
    public static final RawAdItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        RawAdItem$$serializer r0 = new RawAdItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.RawAdItem", r0, 6);
        r1.m1614l("id");
        r1.m1614l("imageUrl");
        r1.m1614l("linkUrl");
        r1.m1614l("status");
        r1.m1614l("sortOrder");
        r1.m1614l("endTime");
        descriptor = r1;
    }

    private RawAdItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r0 = C2521sz.f8819a;
        InterfaceC0717Qm r1 = AbstractC0628Oj.m1249v(r0);
        C0329Hl r02 = C0329Hl.f1129a;
        return new InterfaceC0717Qm[]{r0, r0, r0, r02, r02, r1};
    }

    @Override // p000.InterfaceC0717Qm
    public final RawAdItem deserialize(InterfaceC0406Jc r14) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r142 = r14.mo839B(r0);
        int r5 = 0;
        int r9 = 0;
        int r10 = 0;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r11 = null;
        boolean r3 = true;
    L3:
        if (r3 == false) goto L15;
        int r4 = r142.mo1770j(r0);
        switch(r4) {
            case -1: goto L14;
            case 0: goto L13;
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            default: goto L7;
        };
    L7:
        throw new C2766ym(r4);
    L9:
        r10 = r142.mo1780w(r0, 4);
        r5 = r5 | 16;
        goto L3
    L10:
        r9 = r142.mo1780w(r0, 3);
        r5 = r5 | 8;
        goto L3
    L11:
        r8 = r142.mo1775o(r0, 2);
        r5 = r5 | 4;
        goto L3
    L12:
        r7 = r142.mo1775o(r0, 1);
        r5 = r5 | 2;
        goto L3
    L13:
        r6 = r142.mo1775o(r0, 0);
        r5 = r5 | 1;
        goto L3
    L14:
        r3 = false;
        goto L3
    L8:
        r11 = (String) r142.mo1769i(r0, 5, C2521sz.f8819a, r11);
        r5 = r5 | 32;
        goto L3
    L15:
        r142.mo1777r(r0);
        return new RawAdItem(r5, r6, r7, r8, r9, r10, r11, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, RawAdItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        RawAdItem.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (RawAdItem) r2);
    }
}
