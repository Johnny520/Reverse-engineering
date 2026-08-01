package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class Symbol {
    final long data;
    final int hashCode;
    final int index;
    int info;
    final String name;
    Symbol next;
    final String owner;
    final int tag;
    final String value;

    public Symbol(int i10, int i11, String str, String str2, String str3, long j10, int i12) {
        this.index = i10;
        this.tag = i11;
        this.owner = str;
        this.name = str2;
        this.value = str3;
        this.data = j10;
        this.hashCode = i12;
    }

    public int getArgumentsAndReturnSizes() {
        if (this.info == 0) {
            this.info = Type.getArgumentsAndReturnSizes(this.value);
        }
        return this.info;
    }
}
