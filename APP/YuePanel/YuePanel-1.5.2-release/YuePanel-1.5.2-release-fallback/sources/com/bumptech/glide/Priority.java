package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public enum Priority extends java.lang.Enum<com.bumptech.glide.Priority> {
    private static final /* synthetic */ com.bumptech.glide.Priority[] $VALUES = null;
    public static final com.bumptech.glide.Priority HIGH = null;
    public static final com.bumptech.glide.Priority IMMEDIATE = null;
    public static final com.bumptech.glide.Priority LOW = null;
    public static final com.bumptech.glide.Priority NORMAL = null;

    private static /* synthetic */ com.bumptech.glide.Priority[] $values() {
            com.bumptech.glide.Priority r0 = com.bumptech.glide.Priority.IMMEDIATE
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.HIGH
            com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.NORMAL
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.Priority[] r0 = new com.bumptech.glide.Priority[]{r0, r1, r2, r3}
            return r0
    }

    static {
            com.bumptech.glide.Priority r0 = new com.bumptech.glide.Priority
            java.lang.String r1 = "IMMEDIATE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.Priority.IMMEDIATE = r0
            com.bumptech.glide.Priority r0 = new com.bumptech.glide.Priority
            java.lang.String r1 = "HIGH"
            r2 = 1
            r0.<init>(r1, r2)
            com.bumptech.glide.Priority.HIGH = r0
            com.bumptech.glide.Priority r0 = new com.bumptech.glide.Priority
            java.lang.String r1 = "NORMAL"
            r2 = 2
            r0.<init>(r1, r2)
            com.bumptech.glide.Priority.NORMAL = r0
            com.bumptech.glide.Priority r0 = new com.bumptech.glide.Priority
            java.lang.String r1 = "LOW"
            r2 = 3
            r0.<init>(r1, r2)
            com.bumptech.glide.Priority.LOW = r0
            com.bumptech.glide.Priority[] r0 = $values()
            com.bumptech.glide.Priority.$VALUES = r0
            return
    }

    Priority(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.Priority valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.Priority> r0 = com.bumptech.glide.Priority.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.Priority r1 = (com.bumptech.glide.Priority) r1
            return r1
    }

    public static com.bumptech.glide.Priority[] values() {
            com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.Priority[] r0 = (com.bumptech.glide.Priority[]) r0
            return r0
    }
}
