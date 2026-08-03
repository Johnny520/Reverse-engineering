package io.github.cherrywechat.network.model;

import kotlinx.serialization.json.AbstractC2158d;
import p000.AbstractC0828TB;
import p000.AbstractC2508sm;
import p000.AbstractC2822zz;
import p000.C2169kz;
import p000.C2250mu;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;

/* JADX INFO: loaded from: classes.dex */
public final class TolerantDoubleSerializer implements InterfaceC0717Qm {
    public static final TolerantDoubleSerializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        INSTANCE = new TolerantDoubleSerializer();
        descriptor = AbstractC0828TB.m1635b("TolerantDouble", C2250mu.f7959j);
    }

    private TolerantDoubleSerializer() {
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
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of r3, Object r4) {
        serialize(r3, ((Number) r4).doubleValue());
    }

    @Override // p000.InterfaceC0717Qm
    public Double deserialize(InterfaceC0406Jc r3) {
        Double r1 = null;
        if ((r3 instanceof C2169kz) == false) goto L5;
        C2169kz r0 = (C2169kz) r3;
    L6:
        if (r0 == null) goto L8;
        AbstractC2158d r32 = AbstractC2508sm.m4989d(r0.m4370A0());
        Double r02 = AbstractC2822zz.m5461F(r32.mo121a());
        if (r02 == null) goto L12;
        double r03 = r02.doubleValue();
    L19:
        return Double.valueOf(r03);
    L12:
        String r33 = AbstractC2508sm.m4988c(r32);
        if (r33 == null) goto L15;
        r1 = AbstractC2822zz.m5461F(r33);
    L15:
        if (r1 == null) goto L17;
        r03 = r1.doubleValue();
        goto L19
    L17:
        r03 = 0.0d;
        goto L19
    L8:
        return Double.valueOf(r3.mo840D());
    L5:
        r0 = null;
        goto L6
    }

    public void serialize(InterfaceC0624Of r1, double r2) {
        r1.m1211a();
    }
}
