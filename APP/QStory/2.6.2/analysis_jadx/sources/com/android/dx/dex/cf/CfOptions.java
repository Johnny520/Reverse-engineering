package com.android.dx.dex.cf;

import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CfOptions {
    public boolean statistics;
    public int positionInfo = 2;
    public boolean localInfo = false;
    public boolean strictNameCheck = true;
    public boolean optimize = false;
    public String optimizeListFile = null;
    public String dontOptimizeListFile = null;
    public PrintStream warn = System.err;
}
