package io.github.cherrywechat.network.model;

import kotlinx.serialization.json.AbstractC2158d;
import p000.AbstractC0042Az;
import p000.AbstractC0828TB;
import p000.AbstractC2508sm;
import p000.C2169kz;
import p000.C2250mu;
import p000.C2341oz;
import p000.C2465rm;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;

/* JADX INFO: loaded from: classes.dex */
public final class TolerantIntSerializer implements InterfaceC0717Qm {
    public static final TolerantIntSerializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        INSTANCE = new TolerantIntSerializer();
        descriptor = AbstractC0828TB.m1635b("TolerantInt", C2250mu.f7961l);
    }

    private TolerantIntSerializer() {
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
        serialize(r1, ((Number) r2).intValue());
    }

    @Override // p000.InterfaceC0717Qm
    public Integer deserialize(InterfaceC0406Jc r7) {
        Integer r1 = null;
        if ((r7 instanceof C2169kz) == false) goto L5;
        C2169kz r0 = (C2169kz) r7;
    L6:
        if (r0 == null) goto L8;
        AbstractC2158d r72 = AbstractC2508sm.m4989d(r0.m4370A0());
        Long r02 = Long.valueOf(new C2341oz(r72.mo121a()).m4758h());     // Catch: C2465rm -> L12
    L13:
        if (r02 == null) goto L19;
        long r2 = r02.longValue();
        if ((-2147483648L) > r2) goto L19;
        if (r2 > 2147483647L) goto L19;
        Integer r03 = Integer.valueOf((int) r2);
    L20:
        if (r03 == null) goto L22;
        int r73 = r03.intValue();
    L29:
        return Integer.valueOf(r73);
    L22:
        String r74 = AbstractC2508sm.m4988c(r72);
        if (r74 == null) goto L25;
        r1 = AbstractC0042Az.m61H(r74);
    L25:
        if (r1 == null) goto L27;
        r73 = r1.intValue();
        goto L29
    L27:
        r73 = 0;
    L19:
        r03 = null;
    L12:
        r02 = null;
        goto L13
    L8:
        return Integer.valueOf(r7.mo846p());
    L5:
        r0 = null;
        goto L6
    }

    public void serialize(InterfaceC0624Of r1, int r2) {
        r1.m1214d();
    }
}
