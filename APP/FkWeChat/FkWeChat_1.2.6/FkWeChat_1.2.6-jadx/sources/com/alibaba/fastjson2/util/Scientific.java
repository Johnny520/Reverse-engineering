package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class Scientific {

    /* JADX INFO: renamed from: b */
    public final boolean f4755b;
    public final int count;
    public final int e10;
    public final long output;
    public static final Scientific SCIENTIFIC_NULL = new Scientific(0, true);
    public static final Scientific ZERO = new Scientific(0, 3, 0);
    public static final Scientific NEGATIVE_ZERO = new Scientific(0, 3, 0);
    public static final Scientific DOUBLE_MIN = new Scientific(49, 2, -324);

    public Scientific(int i10, boolean z10) {
        this.e10 = i10;
        this.f4755b = z10;
        this.output = 0L;
        this.count = 0;
    }

    public String toString() {
        if (this == SCIENTIFIC_NULL) {
            return "null";
        }
        if (this == ZERO) {
            return "0.0";
        }
        if (this == NEGATIVE_ZERO) {
            return "-0.0";
        }
        if (this.f4755b) {
            return "1e" + this.e10;
        }
        return this.output + "|" + this.e10;
    }

    public Scientific(long j10, int i10, int i11) {
        this.output = j10;
        this.count = i10;
        this.e10 = i11;
        this.f4755b = false;
    }
}
