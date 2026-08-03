package com.android.dx.merge;

/* JADX INFO: loaded from: classes.dex */
public enum CollisionPolicy extends java.lang.Enum<com.android.dx.merge.CollisionPolicy> {
    private static final /* synthetic */ com.android.dx.merge.CollisionPolicy[] $VALUES = null;
    public static final com.android.dx.merge.CollisionPolicy FAIL = null;
    public static final com.android.dx.merge.CollisionPolicy KEEP_FIRST = null;

    static {
            com.android.dx.merge.CollisionPolicy r0 = new com.android.dx.merge.CollisionPolicy
            java.lang.String r1 = "KEEP_FIRST"
            r2 = 0
            r0.<init>(r1, r2)
            com.android.dx.merge.CollisionPolicy.KEEP_FIRST = r0
            com.android.dx.merge.CollisionPolicy r1 = new com.android.dx.merge.CollisionPolicy
            java.lang.String r2 = "FAIL"
            r3 = 1
            r1.<init>(r2, r3)
            com.android.dx.merge.CollisionPolicy.FAIL = r1
            com.android.dx.merge.CollisionPolicy[] r0 = new com.android.dx.merge.CollisionPolicy[]{r0, r1}
            com.android.dx.merge.CollisionPolicy.$VALUES = r0
            return
    }

    CollisionPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.android.dx.merge.CollisionPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.android.dx.merge.CollisionPolicy> r0 = com.android.dx.merge.CollisionPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.android.dx.merge.CollisionPolicy r1 = (com.android.dx.merge.CollisionPolicy) r1
            return r1
    }

    public static com.android.dx.merge.CollisionPolicy[] values() {
            com.android.dx.merge.CollisionPolicy[] r0 = com.android.dx.merge.CollisionPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.android.dx.merge.CollisionPolicy[] r0 = (com.android.dx.merge.CollisionPolicy[]) r0
            return r0
    }
}
