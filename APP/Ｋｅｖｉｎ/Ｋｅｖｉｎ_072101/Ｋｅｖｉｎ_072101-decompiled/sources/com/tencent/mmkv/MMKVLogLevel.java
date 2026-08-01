package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public enum MMKVLogLevel extends java.lang.Enum<com.tencent.mmkv.MMKVLogLevel> {
    private static final /* synthetic */ com.tencent.mmkv.MMKVLogLevel[] $VALUES = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelDebug = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelError = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelInfo = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelNone = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelWarning = null;

    static {
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelDebug"
            r2 = 0
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelDebug = r0
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelInfo"
            r2 = 1
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelInfo = r0
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelWarning"
            r2 = 2
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelWarning = r0
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelError"
            r2 = 3
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelError = r0
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelNone"
            r2 = 4
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelNone = r0
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelDebug
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            com.tencent.mmkv.MMKVLogLevel r2 = com.tencent.mmkv.MMKVLogLevel.LevelWarning
            com.tencent.mmkv.MMKVLogLevel r3 = com.tencent.mmkv.MMKVLogLevel.LevelError
            com.tencent.mmkv.MMKVLogLevel r4 = com.tencent.mmkv.MMKVLogLevel.LevelNone
            com.tencent.mmkv.MMKVLogLevel[] r0 = new com.tencent.mmkv.MMKVLogLevel[]{r0, r1, r2, r3, r4}
            com.tencent.mmkv.MMKVLogLevel.$VALUES = r0
            return
    }

    MMKVLogLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.tencent.mmkv.MMKVLogLevel valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mmkv.MMKVLogLevel> r0 = com.tencent.mmkv.MMKVLogLevel.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mmkv.MMKVLogLevel r0 = (com.tencent.mmkv.MMKVLogLevel) r0
            return r0
    }

    public static com.tencent.mmkv.MMKVLogLevel[] values() {
            com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            com.tencent.mmkv.MMKVLogLevel[] r0 = (com.tencent.mmkv.MMKVLogLevel[]) r0
            return r0
    }
}
