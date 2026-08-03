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
    public static final TolerantBooleanSerializer INSTANCE = new TolerantBooleanSerializer();
    private static final InterfaceC0126Cx descriptor = AbstractC0828TB.m1635b("TolerantBoolean", C2250mu.f7956g);

    private TolerantBooleanSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        serialize(interfaceC0624Of, ((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // p000.InterfaceC0717Qm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        Boolean bool = null;
        C2169kz c2169kz = interfaceC0406Jc instanceof C2169kz ? (C2169kz) interfaceC0406Jc : null;
        if (c2169kz == null) {
            return Boolean.valueOf(interfaceC0406Jc.mo842e());
        }
        String strM4988c = AbstractC2508sm.m4988c(AbstractC2508sm.m4989d(c2169kz.m4370A0()));
        if (strM4988c == null) {
            return Boolean.FALSE;
        }
        boolean zBooleanValue = true;
        if (!strM4988c.equalsIgnoreCase("true")) {
            if (!strM4988c.equalsIgnoreCase("false")) {
                if (!strM4988c.equals("1")) {
                    if (!strM4988c.equals("0")) {
                        if (strM4988c.equals("true")) {
                            bool = Boolean.TRUE;
                        } else if (strM4988c.equals("false")) {
                            bool = Boolean.FALSE;
                        }
                        zBooleanValue = bool != null ? bool.booleanValue() : false;
                    }
                }
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public void serialize(InterfaceC0624Of interfaceC0624Of, boolean z) {
        interfaceC0624Of.m1212b();
    }
}
