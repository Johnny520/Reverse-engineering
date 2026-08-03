package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public enum SELECT_MODE extends java.lang.Enum<com.kongzue.dialogx.interfaces.SELECT_MODE> {
    private static final /* synthetic */ com.kongzue.dialogx.interfaces.SELECT_MODE[] $VALUES = null;
    public static final com.kongzue.dialogx.interfaces.SELECT_MODE MULTIPLE = null;
    public static final com.kongzue.dialogx.interfaces.SELECT_MODE NONE = null;
    public static final com.kongzue.dialogx.interfaces.SELECT_MODE SINGLE = null;

    static {
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = new com.kongzue.dialogx.interfaces.SELECT_MODE
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            com.kongzue.dialogx.interfaces.SELECT_MODE.NONE = r0
            com.kongzue.dialogx.interfaces.SELECT_MODE r1 = new com.kongzue.dialogx.interfaces.SELECT_MODE
            java.lang.String r2 = "SINGLE"
            r3 = 1
            r1.<init>(r2, r3)
            com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE = r1
            com.kongzue.dialogx.interfaces.SELECT_MODE r2 = new com.kongzue.dialogx.interfaces.SELECT_MODE
            java.lang.String r3 = "MULTIPLE"
            r4 = 2
            r2.<init>(r3, r4)
            com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE = r2
            com.kongzue.dialogx.interfaces.SELECT_MODE[] r0 = new com.kongzue.dialogx.interfaces.SELECT_MODE[]{r0, r1, r2}
            com.kongzue.dialogx.interfaces.SELECT_MODE.$VALUES = r0
            return
    }

    SELECT_MODE(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.kongzue.dialogx.interfaces.SELECT_MODE valueOf(java.lang.String r1) {
            java.lang.Class<com.kongzue.dialogx.interfaces.SELECT_MODE> r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kongzue.dialogx.interfaces.SELECT_MODE r1 = (com.kongzue.dialogx.interfaces.SELECT_MODE) r1
            return r1
    }

    public static com.kongzue.dialogx.interfaces.SELECT_MODE[] values() {
            com.kongzue.dialogx.interfaces.SELECT_MODE[] r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kongzue.dialogx.interfaces.SELECT_MODE[] r0 = (com.kongzue.dialogx.interfaces.SELECT_MODE[]) r0
            return r0
    }
}
