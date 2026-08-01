package com.android.dx.dex;

import com.bumptech.glide.AbstractC3055;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DexOptions {
    public static final boolean ALIGN_64BIT_REGS_SUPPORT = true;
    public boolean ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER;
    public boolean allowAllInterfaceMethodInvokes;
    public final PrintStream err;
    public boolean forceJumbo;
    public int minSdkVersion;

    public DexOptions() {
        this.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = true;
        this.minSdkVersion = 13;
        this.forceJumbo = false;
        this.allowAllInterfaceMethodInvokes = false;
        this.err = System.err;
    }

    public boolean apiIsSupported(int i) {
        return this.minSdkVersion >= i;
    }

    public String getMagic() {
        return AbstractC3055.m6632(this.minSdkVersion);
    }

    public DexOptions(PrintStream printStream) {
        this.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = true;
        this.minSdkVersion = 13;
        this.forceJumbo = false;
        this.allowAllInterfaceMethodInvokes = false;
        this.err = printStream;
    }
}
