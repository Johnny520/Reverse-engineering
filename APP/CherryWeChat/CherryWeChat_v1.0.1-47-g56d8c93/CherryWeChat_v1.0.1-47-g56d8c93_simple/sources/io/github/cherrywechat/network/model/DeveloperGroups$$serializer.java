package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.C0809St;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DeveloperGroups$$serializer implements InterfaceC2677wj {
    public static final DeveloperGroups$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        DeveloperGroups$$serializer r0 = new DeveloperGroups$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.DeveloperGroups", r0, 2);
        r1.m1614l("core");
        r1.m1614l("special");
        descriptor = r1;
    }

    private DeveloperGroups$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] r0 = DeveloperGroups.access$get$childSerializers$cp();
        return new InterfaceC0717Qm[]{r0[0].getValue(), r0[1].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final DeveloperGroups deserialize(InterfaceC0406Jc r12) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r122 = r12.mo839B(r0);
        InterfaceC0159Dn[] r1 = DeveloperGroups.access$get$childSerializers$cp();
        boolean r5 = true;
        int r6 = 0;
        List r7 = null;
        List r8 = null;
    L3:
        if (r5 == false) goto L13;
        int r9 = r122.mo1770j(r0);
        if (r9 != (-1)) goto L6;
        r5 = false;
        goto L3
    L6:
        if (r9 != 0) goto L7;
        r7 = (List) r122.mo1779v(r0, 0, (InterfaceC0717Qm) r1[0].getValue(), r7);
        r6 = r6 | 1;
        goto L3
    L7:
        if (r9 != 1) goto L10;
        r8 = (List) r122.mo1779v(r0, 1, (InterfaceC0717Qm) r1[1].getValue(), r8);
        r6 = r6 | 2;
        goto L3
    L10:
        throw new C2766ym(r9);
    L13:
        r122.mo1777r(r0);
        return new DeveloperGroups(r6, r7, r8, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, DeveloperGroups r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        DeveloperGroups.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (DeveloperGroups) r2);
    }
}
