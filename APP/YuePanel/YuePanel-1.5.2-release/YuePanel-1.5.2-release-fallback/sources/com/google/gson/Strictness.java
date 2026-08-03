package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public enum Strictness extends java.lang.Enum<com.google.gson.Strictness> {
    private static final /* synthetic */ com.google.gson.Strictness[] $VALUES = null;
    public static final com.google.gson.Strictness LEGACY_STRICT = null;
    public static final com.google.gson.Strictness LENIENT = null;
    public static final com.google.gson.Strictness STRICT = null;

    private static /* synthetic */ com.google.gson.Strictness[] $values() {
            com.google.gson.Strictness r0 = com.google.gson.Strictness.LENIENT
            com.google.gson.Strictness r1 = com.google.gson.Strictness.LEGACY_STRICT
            com.google.gson.Strictness r2 = com.google.gson.Strictness.STRICT
            com.google.gson.Strictness[] r0 = new com.google.gson.Strictness[]{r0, r1, r2}
            return r0
    }

    static {
            com.google.gson.Strictness r0 = new com.google.gson.Strictness
            java.lang.String r1 = "LENIENT"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.Strictness.LENIENT = r0
            com.google.gson.Strictness r0 = new com.google.gson.Strictness
            java.lang.String r1 = "LEGACY_STRICT"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.gson.Strictness.LEGACY_STRICT = r0
            com.google.gson.Strictness r0 = new com.google.gson.Strictness
            java.lang.String r1 = "STRICT"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.gson.Strictness.STRICT = r0
            com.google.gson.Strictness[] r0 = $values()
            com.google.gson.Strictness.$VALUES = r0
            return
    }

    Strictness(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.Strictness valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.Strictness> r0 = com.google.gson.Strictness.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.Strictness r1 = (com.google.gson.Strictness) r1
            return r1
    }

    public static com.google.gson.Strictness[] values() {
            com.google.gson.Strictness[] r0 = com.google.gson.Strictness.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.Strictness[] r0 = (com.google.gson.Strictness[]) r0
            return r0
    }
}
