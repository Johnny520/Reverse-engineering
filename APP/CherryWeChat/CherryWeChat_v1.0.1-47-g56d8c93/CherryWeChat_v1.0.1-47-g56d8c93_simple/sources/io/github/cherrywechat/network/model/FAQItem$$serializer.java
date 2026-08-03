package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
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
public final /* synthetic */ class FAQItem$$serializer implements InterfaceC2677wj {
    public static final FAQItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        FAQItem$$serializer r0 = new FAQItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.FAQItem", r0, 4);
        r1.m1614l("id");
        r1.m1614l("question");
        r1.m1614l("answer");
        r1.m1614l("item_order");
        descriptor = r1;
    }

    private FAQItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C0329Hl r1 = C0329Hl.f1129a;
        C2521sz r2 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r1, r2, r2, r1};
    }

    @Override // p000.InterfaceC0717Qm
    public final FAQItem deserialize(InterfaceC0406Jc r12) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r122 = r12.mo839B(r0);
        int r5 = 0;
        int r6 = 0;
        int r9 = 0;
        String r7 = null;
        String r8 = null;
        boolean r3 = true;
    L3:
        if (r3 == false) goto L19;
        int r4 = r122.mo1770j(r0);
        if (r4 != (-1)) goto L6;
        r3 = false;
        goto L3
    L6:
        if (r4 != 0) goto L7;
        r6 = r122.mo1780w(r0, 0);
        r5 = r5 | 1;
        goto L3
    L7:
        if (r4 != 1) goto L9;
        r7 = r122.mo1775o(r0, 1);
        r5 = r5 | 2;
        goto L3
    L9:
        if (r4 != 2) goto L11;
        r8 = r122.mo1775o(r0, 2);
        r5 = r5 | 4;
        goto L3
    L11:
        if (r4 != 3) goto L14;
        r9 = r122.mo1780w(r0, 3);
        r5 = r5 | 8;
        goto L3
    L14:
        throw new C2766ym(r4);
    L19:
        r122.mo1777r(r0);
        return new FAQItem(r5, r6, r7, r8, r9, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, FAQItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        FAQItem.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (FAQItem) r2);
    }
}
