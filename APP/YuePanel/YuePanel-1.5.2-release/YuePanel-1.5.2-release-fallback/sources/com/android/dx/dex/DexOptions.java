package com.android.dx.dex;

/* JADX INFO: loaded from: classes.dex */
public final class DexOptions {
    public static final boolean ALIGN_64BIT_REGS_SUPPORT = true;
    public boolean ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER;
    public boolean allowAllInterfaceMethodInvokes;
    public final java.io.PrintStream err;
    public boolean forceJumbo;
    public int minSdkVersion;

    public DexOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = r0
            r0 = 13
            r1.minSdkVersion = r0
            r0 = 0
            r1.forceJumbo = r0
            r1.allowAllInterfaceMethodInvokes = r0
            java.io.PrintStream r0 = java.lang.System.err
            r1.err = r0
            return
    }

    public DexOptions(java.io.PrintStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = r0
            r0 = 13
            r1.minSdkVersion = r0
            r0 = 0
            r1.forceJumbo = r0
            r1.allowAllInterfaceMethodInvokes = r0
            r1.err = r2
            return
    }

    public boolean apiIsSupported(int r2) {
            r1 = this;
            int r0 = r1.minSdkVersion
            if (r0 < r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    public java.lang.String getMagic() {
            r1 = this;
            int r0 = r1.minSdkVersion
            java.lang.String r0 = com.android.dex.DexFormat.apiToMagic(r0)
            return r0
    }
}
