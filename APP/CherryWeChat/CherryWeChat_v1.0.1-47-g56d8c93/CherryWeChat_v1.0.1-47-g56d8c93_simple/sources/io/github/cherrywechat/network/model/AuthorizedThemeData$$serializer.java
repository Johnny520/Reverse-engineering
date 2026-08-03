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
public final /* synthetic */ class AuthorizedThemeData$$serializer implements InterfaceC2677wj {
    public static final AuthorizedThemeData$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        AuthorizedThemeData$$serializer r0 = new AuthorizedThemeData$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.AuthorizedThemeData", r0, 7);
        r1.m1614l("id");
        r1.m1614l("name");
        r1.m1614l("author");
        r1.m1614l("baiduSkinDownloadUrl");
        r1.m1614l("authType");
        r1.m1614l("createdAt");
        r1.m1614l("versions");
        descriptor = r1;
    }

    private AuthorizedThemeData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] r0 = AuthorizedThemeData.access$get$childSerializers$cp();
        C2521sz r2 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r2, r2, r2, r2, r2, r2, r0[6].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final AuthorizedThemeData deserialize(InterfaceC0406Jc r17) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r17.mo839B(r0);
        InterfaceC0159Dn[] r2 = AuthorizedThemeData.access$get$childSerializers$cp();
        int r7 = 0;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        List r14 = null;
        boolean r5 = true;
    L3:
        if (r5 == false) goto L16;
        int r6 = r1.mo1770j(r0);
        switch(r6) {
            case -1: goto L15;
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            default: goto L7;
        };
    L7:
        throw new C2766ym(r6);
    L9:
        r13 = r1.mo1775o(r0, 5);
        r7 = r7 | 32;
        goto L3
    L10:
        r12 = r1.mo1775o(r0, 4);
        r7 = r7 | 16;
        goto L3
    L11:
        r11 = r1.mo1775o(r0, 3);
        r7 = r7 | 8;
        goto L3
    L12:
        r10 = r1.mo1775o(r0, 2);
        r7 = r7 | 4;
        goto L3
    L13:
        r9 = r1.mo1775o(r0, 1);
        r7 = r7 | 2;
        goto L3
    L14:
        r8 = r1.mo1775o(r0, 0);
        r7 = r7 | 1;
        goto L3
    L15:
        r5 = false;
        goto L3
    L8:
        r14 = (List) r1.mo1779v(r0, 6, (InterfaceC0717Qm) r2[6].getValue(), r14);
        r7 = r7 | 64;
        goto L3
    L16:
        r1.mo1777r(r0);
        return new AuthorizedThemeData(r7, r8, r9, r10, r11, r12, r13, r14, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, AuthorizedThemeData r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        AuthorizedThemeData.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (AuthorizedThemeData) r2);
    }
}
