package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public enum MMKVRecoverStrategic extends java.lang.Enum<com.tencent.mmkv.MMKVRecoverStrategic> {
    private static final /* synthetic */ com.tencent.mmkv.MMKVRecoverStrategic[] $VALUES = null;
    public static final com.tencent.mmkv.MMKVRecoverStrategic OnErrorDiscard = null;
    public static final com.tencent.mmkv.MMKVRecoverStrategic OnErrorRecover = null;

    static {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = new com.tencent.mmkv.MMKVRecoverStrategic
            java.lang.String r1 = "OnErrorDiscard"
            r2 = 0
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard = r0
            com.tencent.mmkv.MMKVRecoverStrategic r0 = new com.tencent.mmkv.MMKVRecoverStrategic
            java.lang.String r1 = "OnErrorRecover"
            r2 = 1
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVRecoverStrategic.OnErrorRecover = r0
            com.tencent.mmkv.MMKVRecoverStrategic r0 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            com.tencent.mmkv.MMKVRecoverStrategic r1 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorRecover
            com.tencent.mmkv.MMKVRecoverStrategic[] r0 = new com.tencent.mmkv.MMKVRecoverStrategic[]{r0, r1}
            com.tencent.mmkv.MMKVRecoverStrategic.$VALUES = r0
            return
    }

    MMKVRecoverStrategic(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.tencent.mmkv.MMKVRecoverStrategic valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mmkv.MMKVRecoverStrategic> r0 = com.tencent.mmkv.MMKVRecoverStrategic.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mmkv.MMKVRecoverStrategic r0 = (com.tencent.mmkv.MMKVRecoverStrategic) r0
            return r0
    }

    public static com.tencent.mmkv.MMKVRecoverStrategic[] values() {
            com.tencent.mmkv.MMKVRecoverStrategic[] r0 = com.tencent.mmkv.MMKVRecoverStrategic.$VALUES
            java.lang.Object r0 = r0.clone()
            com.tencent.mmkv.MMKVRecoverStrategic[] r0 = (com.tencent.mmkv.MMKVRecoverStrategic[]) r0
            return r0
    }
}
