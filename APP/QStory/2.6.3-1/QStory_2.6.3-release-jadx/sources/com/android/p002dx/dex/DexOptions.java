package com.android.p002dx.dex;

import com.bumptech.glide.AbstractC3889;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        return AbstractC3889.m7303(this.minSdkVersion);
    }

    public DexOptions(PrintStream printStream) {
        this.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = true;
        this.minSdkVersion = 13;
        this.forceJumbo = false;
        this.allowAllInterfaceMethodInvokes = false;
        this.err = printStream;
    }
}
