package org.apache.commons.lang3.arch;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
