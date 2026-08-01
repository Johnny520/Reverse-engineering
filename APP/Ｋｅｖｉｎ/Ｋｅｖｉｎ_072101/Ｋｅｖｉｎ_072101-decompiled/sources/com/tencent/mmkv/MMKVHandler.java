package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public interface MMKVHandler {
    void mmkvLog(com.tencent.mmkv.MMKVLogLevel r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5);

    com.tencent.mmkv.MMKVRecoverStrategic onMMKVCRCCheckFail(java.lang.String r1);

    com.tencent.mmkv.MMKVRecoverStrategic onMMKVFileLengthError(java.lang.String r1);

    boolean wantLogRedirecting();
}
