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
    public static final TolerantDoubleSerializer INSTANCE = new TolerantDoubleSerializer();
    private static final InterfaceC0126Cx descriptor = AbstractC0828TB.m1635b("TolerantDouble", C2250mu.f7959j);

    private TolerantDoubleSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        serialize(interfaceC0624Of, ((Number) obj).doubleValue());
    }

    @Override // p000.InterfaceC0717Qm
    public Double deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        double dDoubleValue;
        C2169kz c2169kz = interfaceC0406Jc instanceof C2169kz ? (C2169kz) interfaceC0406Jc : null;
        if (c2169kz == null) {
            return Double.valueOf(interfaceC0406Jc.mo840D());
        }
        AbstractC2158d abstractC2158dM4989d = AbstractC2508sm.m4989d(c2169kz.m4370A0());
        Double dM5461F = AbstractC2822zz.m5461F(abstractC2158dM4989d.mo121a());
        if (dM5461F != null) {
            dDoubleValue = dM5461F.doubleValue();
        } else {
            String strM4988c = AbstractC2508sm.m4988c(abstractC2158dM4989d);
            Double dM5461F2 = strM4988c != null ? AbstractC2822zz.m5461F(strM4988c) : null;
            dDoubleValue = dM5461F2 != null ? dM5461F2.doubleValue() : 0.0d;
        }
        return Double.valueOf(dDoubleValue);
    }

    public void serialize(InterfaceC0624Of interfaceC0624Of, double d) {
        interfaceC0624Of.m1211a();
    }
}
