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
public final /* synthetic */ class UpdateType$$serializer implements InterfaceC2677wj {
    public static final UpdateType$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        UpdateType$$serializer r0 = new UpdateType$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.UpdateType", r0, 3);
        r1.m1614l("name");
        r1.m1614l("label");
        r1.m1614l("color");
        descriptor = r1;
    }

    private UpdateType$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r1 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r1, r1, r1};
    }

    @Override // p000.InterfaceC0717Qm
    public final UpdateType deserialize(InterfaceC0406Jc r11) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r112 = r11.mo839B(r0);
        int r5 = 0;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        boolean r3 = true;
    L3:
        if (r3 == false) goto L16;
        int r4 = r112.mo1770j(r0);
        if (r4 != (-1)) goto L6;
        r3 = false;
        goto L3
    L6:
        if (r4 != 0) goto L7;
        r6 = r112.mo1775o(r0, 0);
        r5 = r5 | 1;
        goto L3
    L7:
        if (r4 != 1) goto L9;
        r7 = r112.mo1775o(r0, 1);
        r5 = r5 | 2;
        goto L3
    L9:
        if (r4 != 2) goto L12;
        r8 = r112.mo1775o(r0, 2);
        r5 = r5 | 4;
        goto L3
    L12:
        throw new C2766ym(r4);
    L16:
        r112.mo1777r(r0);
        return new UpdateType(r5, r6, r7, r8, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, UpdateType r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        UpdateType.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (UpdateType) r2);
    }
}
