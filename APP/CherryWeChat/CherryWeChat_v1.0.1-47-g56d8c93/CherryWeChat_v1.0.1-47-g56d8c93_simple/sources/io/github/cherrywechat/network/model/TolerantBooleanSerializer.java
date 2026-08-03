package io.github.cherrywechat.network.model;

import p000.AbstractC0828TB;
import p000.AbstractC2508sm;
import p000.C2169kz;
import p000.C2250mu;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;

/* JADX INFO: loaded from: classes.dex */
public final class TolerantBooleanSerializer implements InterfaceC0717Qm {
    public static final TolerantBooleanSerializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        INSTANCE = new TolerantBooleanSerializer();
        descriptor = AbstractC0828TB.m1635b("TolerantBoolean", C2250mu.f7956g);
    }

    private TolerantBooleanSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC0406Jc r1) {
        return deserialize(r1);
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of r1, Object r2) {
        serialize(r1, ((Boolean) r2).booleanValue());
    }

    @Override // p000.InterfaceC0717Qm
    public Boolean deserialize(InterfaceC0406Jc r7) {
        Boolean r1 = null;
        if ((r7 instanceof C2169kz) == false) goto L5;
        C2169kz r0 = (C2169kz) r7;
    L6:
        if (r0 == null) goto L8;
        String r72 = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(r0.m4370A0()));
        if (r72 == null) goto L12;
        boolean r3 = true;
        if (r72.equalsIgnoreCase("true") == true) goto L34;
        if (r72.equalsIgnoreCase("false") == false) goto L20;
    L18:
        r3 = false;
        goto L34
    L20:
        if (r72.equals("1") == true) goto L34;
        if (r72.equals("0") == true) goto L18;
        if (r72.equals("true") == false) goto L29;
        r1 = Boolean.TRUE;
    L31:
        if (r1 == null) goto L18;
        r3 = r1.booleanValue();
        goto L34
    L29:
        if (r72.equals("false") == false) goto L31;
        r1 = Boolean.FALSE;
    L34:
        return Boolean.valueOf(r3);
    L12:
        return Boolean.FALSE;
    L8:
        return Boolean.valueOf(r7.mo842e());
    L5:
        r0 = null;
        goto L6
    }

    public void serialize(InterfaceC0624Of r1, boolean r2) {
        r1.m1212b();
    }
}
