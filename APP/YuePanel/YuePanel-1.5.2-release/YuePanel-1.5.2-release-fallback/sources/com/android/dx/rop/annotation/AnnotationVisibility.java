package com.android.dx.rop.annotation;

/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibility extends java.lang.Enum<com.android.dx.rop.annotation.AnnotationVisibility> implements com.android.dx.util.ToHuman {
    private static final /* synthetic */ com.android.dx.rop.annotation.AnnotationVisibility[] $VALUES = null;
    public static final com.android.dx.rop.annotation.AnnotationVisibility BUILD = null;
    public static final com.android.dx.rop.annotation.AnnotationVisibility EMBEDDED = null;
    public static final com.android.dx.rop.annotation.AnnotationVisibility RUNTIME = null;
    public static final com.android.dx.rop.annotation.AnnotationVisibility SYSTEM = null;
    private final java.lang.String human;

    static {
            com.android.dx.rop.annotation.AnnotationVisibility r0 = new com.android.dx.rop.annotation.AnnotationVisibility
            r1 = 0
            java.lang.String r2 = "runtime"
            java.lang.String r3 = "RUNTIME"
            r0.<init>(r3, r1, r2)
            com.android.dx.rop.annotation.AnnotationVisibility.RUNTIME = r0
            com.android.dx.rop.annotation.AnnotationVisibility r1 = new com.android.dx.rop.annotation.AnnotationVisibility
            r2 = 1
            java.lang.String r3 = "build"
            java.lang.String r4 = "BUILD"
            r1.<init>(r4, r2, r3)
            com.android.dx.rop.annotation.AnnotationVisibility.BUILD = r1
            com.android.dx.rop.annotation.AnnotationVisibility r2 = new com.android.dx.rop.annotation.AnnotationVisibility
            r3 = 2
            java.lang.String r4 = "system"
            java.lang.String r5 = "SYSTEM"
            r2.<init>(r5, r3, r4)
            com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM = r2
            com.android.dx.rop.annotation.AnnotationVisibility r3 = new com.android.dx.rop.annotation.AnnotationVisibility
            r4 = 3
            java.lang.String r5 = "embedded"
            java.lang.String r6 = "EMBEDDED"
            r3.<init>(r6, r4, r5)
            com.android.dx.rop.annotation.AnnotationVisibility.EMBEDDED = r3
            com.android.dx.rop.annotation.AnnotationVisibility[] r0 = new com.android.dx.rop.annotation.AnnotationVisibility[]{r0, r1, r2, r3}
            com.android.dx.rop.annotation.AnnotationVisibility.$VALUES = r0
            return
    }

    AnnotationVisibility(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.human = r3
            return
    }

    public static com.android.dx.rop.annotation.AnnotationVisibility valueOf(java.lang.String r1) {
            java.lang.Class<com.android.dx.rop.annotation.AnnotationVisibility> r0 = com.android.dx.rop.annotation.AnnotationVisibility.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.android.dx.rop.annotation.AnnotationVisibility r1 = (com.android.dx.rop.annotation.AnnotationVisibility) r1
            return r1
    }

    public static com.android.dx.rop.annotation.AnnotationVisibility[] values() {
            com.android.dx.rop.annotation.AnnotationVisibility[] r0 = com.android.dx.rop.annotation.AnnotationVisibility.$VALUES
            java.lang.Object r0 = r0.clone()
            com.android.dx.rop.annotation.AnnotationVisibility[] r0 = (com.android.dx.rop.annotation.AnnotationVisibility[]) r0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.human
            return r0
    }
}
