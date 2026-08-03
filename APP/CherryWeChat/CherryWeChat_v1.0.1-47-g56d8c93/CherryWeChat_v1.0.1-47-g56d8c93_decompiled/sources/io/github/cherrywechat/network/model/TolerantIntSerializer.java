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
    public static final TolerantIntSerializer INSTANCE = new TolerantIntSerializer();
    private static final InterfaceC0126Cx descriptor = AbstractC0828TB.m1635b("TolerantInt", C2250mu.f7961l);

    private TolerantIntSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        serialize(interfaceC0624Of, ((Number) obj).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // p000.InterfaceC0717Qm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        Long lValueOf;
        Integer numValueOf;
        int iIntValue;
        C2169kz c2169kz = interfaceC0406Jc instanceof C2169kz ? (C2169kz) interfaceC0406Jc : null;
        if (c2169kz == null) {
            return Integer.valueOf(interfaceC0406Jc.mo846p());
        }
        AbstractC2158d abstractC2158dM4989d = AbstractC2508sm.m4989d(c2169kz.m4370A0());
        try {
            lValueOf = Long.valueOf(new C2341oz(abstractC2158dM4989d.mo121a()).m4758h());
        } catch (C2465rm unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            numValueOf = (-2147483648L > jLongValue || jLongValue > 2147483647L) ? null : Integer.valueOf((int) jLongValue);
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            String strM4988c = AbstractC2508sm.m4988c(abstractC2158dM4989d);
            Integer numM61H = strM4988c != null ? AbstractC0042Az.m61H(strM4988c) : null;
            iIntValue = numM61H != null ? numM61H.intValue() : 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public void serialize(InterfaceC0624Of interfaceC0624Of, int i) {
        interfaceC0624Of.m1214d();
    }
}
