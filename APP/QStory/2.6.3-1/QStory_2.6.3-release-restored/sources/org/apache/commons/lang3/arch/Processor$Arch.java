package org.apache.commons.lang3.arch;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum Processor$Arch {
    BIT_32("32-bit"),
    BIT_64("64-bit"),
    UNKNOWN("Unknown");

    private final String label;

    Processor$Arch(String str) {
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }
}
