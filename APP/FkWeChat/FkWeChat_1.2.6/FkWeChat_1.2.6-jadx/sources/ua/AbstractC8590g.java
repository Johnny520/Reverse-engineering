package ua;

import gb.AbstractC2706r0;
import p024b9.AbstractC1061t;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8590g {

    /* JADX INFO: renamed from: a */
    public final Object f28626a;

    public AbstractC8590g(Object obj) {
        this.f28626a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2706r0 mo32999a(InterfaceC6005h0 interfaceC6005h0);

    /* JADX INFO: renamed from: b */
    public Object mo33009b() {
        return this.f28626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo33009b = mo33009b();
        AbstractC8590g abstractC8590g = obj instanceof AbstractC8590g ? (AbstractC8590g) obj : null;
        return AbstractC1061t.m3842c(objMo33009b, abstractC8590g != null ? abstractC8590g.mo33009b() : null);
    }

    public int hashCode() {
        Object objMo33009b = mo33009b();
        if (objMo33009b != null) {
            return objMo33009b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo33009b());
    }
}
