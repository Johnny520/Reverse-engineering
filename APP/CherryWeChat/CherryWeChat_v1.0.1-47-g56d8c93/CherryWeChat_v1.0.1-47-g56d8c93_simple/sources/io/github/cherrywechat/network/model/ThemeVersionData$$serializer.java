package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
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
public final /* synthetic */ class ThemeVersionData$$serializer implements InterfaceC2677wj {
    public static final ThemeVersionData$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        ThemeVersionData$$serializer r0 = new ThemeVersionData$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.ThemeVersionData", r0, 6);
        r1.m1614l("id");
        r1.m1614l("versionName");
        r1.m1614l("fileName");
        r1.m1614l("fileExt");
        r1.m1614l("fileSize");
        r1.m1614l("createdAt");
        descriptor = r1;
    }

    private ThemeVersionData$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r1 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r1, r1, r1, r1, C2597up.f8972a, r1};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeVersionData deserialize(InterfaceC0406Jc r18) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r18.mo839B(r0);
        int r8 = 0;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r15 = null;
        long r13 = 0;
        boolean r4 = true;
    L3:
        if (r4 == false) goto L15;
        int r5 = r1.mo1770j(r0);
        switch(r5) {
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
        throw new C2766ym(r5);
    L9:
        r13 = r1.mo1767A(r0, 4);
        r8 = r8 | 16;
        goto L3
    L10:
        r12 = r1.mo1775o(r0, 3);
        r8 = r8 | 8;
        goto L3
    L11:
        r11 = r1.mo1775o(r0, 2);
        r8 = r8 | 4;
        goto L3
    L12:
        r10 = r1.mo1775o(r0, 1);
        r8 = r8 | 2;
        goto L3
    L13:
        r9 = r1.mo1775o(r0, 0);
        r8 = r8 | 1;
        goto L3
    L14:
        r4 = false;
        goto L3
    L8:
        r15 = r1.mo1775o(r0, 5);
        r8 = r8 | 32;
        goto L3
    L15:
        r1.mo1777r(r0);
        return new ThemeVersionData(r8, r9, r10, r11, r12, r13, r15, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, ThemeVersionData r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        ThemeVersionData.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (ThemeVersionData) r2);
    }
}
