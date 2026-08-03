package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.C0809St;
import p000.C2521sz;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThemeSimpleItem$$serializer implements InterfaceC2677wj {
    public static final ThemeSimpleItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        ThemeSimpleItem$$serializer r0 = new ThemeSimpleItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.ThemeSimpleItem", r0, 5);
        r1.m1614l("themeId");
        r1.m1614l("themeName");
        r1.m1614l("ownerId");
        r1.m1614l("owner");
        r1.m1614l("versions");
        descriptor = r1;
    }

    private ThemeSimpleItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] r0 = ThemeSimpleItem.access$get$childSerializers$cp();
        C2521sz r2 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r2, r2, r2, r2, r0[4].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final ThemeSimpleItem deserialize(InterfaceC0406Jc r14) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r142 = r14.mo839B(r0);
        InterfaceC0159Dn[] r1 = ThemeSimpleItem.access$get$childSerializers$cp();
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        List r11 = null;
        boolean r4 = true;
    L3:
        if (r4 == false) goto L22;
        int r5 = r142.mo1770j(r0);
        if (r5 != (-1)) goto L6;
        r4 = false;
        goto L3
    L6:
        if (r5 != 0) goto L7;
        r7 = r142.mo1775o(r0, 0);
        r6 = r6 | 1;
        goto L3
    L7:
        if (r5 != 1) goto L9;
        r8 = r142.mo1775o(r0, 1);
        r6 = r6 | 2;
        goto L3
    L9:
        if (r5 != 2) goto L11;
        r9 = r142.mo1775o(r0, 2);
        r6 = r6 | 4;
        goto L3
    L11:
        if (r5 != 3) goto L13;
        r10 = r142.mo1775o(r0, 3);
        r6 = r6 | 8;
        goto L3
    L13:
        if (r5 != 4) goto L16;
        r11 = (List) r142.mo1779v(r0, 4, (InterfaceC0717Qm) r1[4].getValue(), r11);
        r6 = r6 | 16;
        goto L3
    L16:
        throw new C2766ym(r5);
    L22:
        r142.mo1777r(r0);
        return new ThemeSimpleItem(r6, r7, r8, r9, r10, r11, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, ThemeSimpleItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        ThemeSimpleItem.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (ThemeSimpleItem) r2);
    }
}
