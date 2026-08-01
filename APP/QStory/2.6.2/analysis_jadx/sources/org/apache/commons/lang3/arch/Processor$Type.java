package org.apache.commons.lang3.arch;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum Processor$Type {
    AARCH_64("AArch64"),
    X86("x86"),
    IA_64("IA-64"),
    PPC("PPC"),
    RISC_V("RISC-V"),
    UNKNOWN("Unknown");

    private final String label;

    Processor$Type(String str) {
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }
}
