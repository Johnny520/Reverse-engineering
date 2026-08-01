package com.alibaba.fastjson2.internal.asm;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class MethodCollector {
    protected boolean debugInfoPresent;
    private final int ignoreCount;
    private final int paramCount;
    private final StringBuilder result = new StringBuilder();
    private int currentParameter = 0;

    public MethodCollector(int i10, int i11) {
        this.ignoreCount = i10;
        this.paramCount = i11;
        this.debugInfoPresent = i11 == 0;
    }

    public String getResult() {
        return this.result.length() != 0 ? this.result.substring(1) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public void visitLocalVariable(String str, int i10) {
        int i11 = this.ignoreCount;
        if (i10 < i11 || i10 >= i11 + this.paramCount) {
            return;
        }
        if (!("arg" + this.currentParameter).equals(str)) {
            this.debugInfoPresent = true;
        }
        this.result.append(',');
        this.result.append(str);
        this.currentParameter++;
    }
}
