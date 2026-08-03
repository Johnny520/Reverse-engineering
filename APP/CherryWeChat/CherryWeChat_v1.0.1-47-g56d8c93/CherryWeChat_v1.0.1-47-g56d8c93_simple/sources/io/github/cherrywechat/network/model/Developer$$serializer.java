package io.github.cherrywechat.network.model;

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
public final /* synthetic */ class Developer$$serializer implements InterfaceC2677wj {
    public static final Developer$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        Developer$$serializer r0 = new Developer$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.Developer", r0, 4);
        r1.m1614l("name");
        r1.m1614l("role");
        r1.m1614l("link");
        r1.m1614l("avatar");
        descriptor = r1;
    }

    private Developer$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2521sz r0 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r0, r0, AbstractC0628Oj.m1249v(r0), r0};
    }

    @Override // p000.InterfaceC0717Qm
    public final Developer deserialize(InterfaceC0406Jc r12) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r122 = r12.mo839B(r0);
        int r5 = 0;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        boolean r3 = true;
    L3:
        if (r3 == false) goto L19;
        int r4 = r122.mo1770j(r0);
        if (r4 != (-1)) goto L6;
        r3 = false;
        goto L3
    L6:
        if (r4 != 0) goto L7;
        r6 = r122.mo1775o(r0, 0);
        r5 = r5 | 1;
        goto L3
    L7:
        if (r4 != 1) goto L9;
        r7 = r122.mo1775o(r0, 1);
        r5 = r5 | 2;
        goto L3
    L9:
        if (r4 != 2) goto L11;
        r8 = (String) r122.mo1769i(r0, 2, C2521sz.f8819a, r8);
        r5 = r5 | 4;
        goto L3
    L11:
        if (r4 != 3) goto L14;
        r9 = r122.mo1775o(r0, 3);
        r5 = r5 | 8;
        goto L3
    L14:
        throw new C2766ym(r4);
    L19:
        r122.mo1777r(r0);
        return new Developer(r5, r6, r7, r8, r9, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, Developer r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        Developer.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (Developer) r2);
    }
}
