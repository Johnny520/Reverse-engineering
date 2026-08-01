package org.apache.commons.lang3.arch;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
