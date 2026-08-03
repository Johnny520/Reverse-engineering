package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
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
public final /* synthetic */ class ThemeSimpleVersion$$serializer implements InterfaceC2677wj {
    public static final ThemeSimpleVersion$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        ThemeSimpleVersion$$serializer r0 = new ThemeSimpleVersion$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.ThemeSimpleVersion", r0, 2);
        r1.m1614l("versionName");
        r1.m1614l("downloadUrl");
        descriptor = r1;
    }

    private ThemeSimpleVersion$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r1 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r1, r1};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeSimpleVersion deserialize(InterfaceC0406Jc r11) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r112 = r11.mo839B(r0);
        boolean r4 = true;
        int r5 = 0;
        String r6 = null;
        String r7 = null;
    L3:
        if (r4 == false) goto L13;
        int r8 = r112.mo1770j(r0);
        if (r8 != (-1)) goto L6;
        r4 = false;
        goto L3
    L6:
        if (r8 != 0) goto L7;
        r6 = r112.mo1775o(r0, 0);
        r5 = r5 | 1;
        goto L3
    L7:
        if (r8 != 1) goto L10;
        r7 = r112.mo1775o(r0, 1);
        r5 = r5 | 2;
        goto L3
    L10:
        throw new C2766ym(r8);
    L13:
        r112.mo1777r(r0);
        return new ThemeSimpleVersion(r5, r6, r7, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, ThemeSimpleVersion r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        ThemeSimpleVersion.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (ThemeSimpleVersion) r2);
    }
}
