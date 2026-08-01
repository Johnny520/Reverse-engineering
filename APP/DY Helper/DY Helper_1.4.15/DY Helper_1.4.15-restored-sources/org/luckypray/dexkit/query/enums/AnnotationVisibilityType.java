package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibilityType extends java.lang.Enum<org.luckypray.dexkit.query.enums.AnnotationVisibilityType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType Build = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion Companion = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType Runtime = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType System = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.query.enums.AnnotationVisibilityType from(byte r1) {
                r0 = this;
                if (r1 != 0) goto L5
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Build
                return r0
            L5:
                r0 = 1
                if (r1 != r0) goto Lb
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Runtime
                return r0
            Lb:
                r0 = 2
                if (r1 != r0) goto L11
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.System
                return r0
            L11:
                r0 = 3
                if (r1 != r0) goto L16
                r0 = 0
                return r0
            L16:
                java.lang.String r0 = "Unknown AnnotationVisibilityType: "
                java.lang.String r0 = p000.a12.m17(r0, r1)
                p000.C1080.m7275(r0)
                r0 = 0
                return r0
        }
    }

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] $values() {
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Build
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r1 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Runtime
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r2 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.System
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = new org.luckypray.dexkit.query.enums.AnnotationVisibilityType[]{r0, r1, r2}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = new org.luckypray.dexkit.query.enums.AnnotationVisibilityType
            java.lang.String r1 = "Build"
            r2 = 0
            r0.<init>(r1, r2)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Build = r0
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = new org.luckypray.dexkit.query.enums.AnnotationVisibilityType
            java.lang.String r1 = "Runtime"
            r2 = 1
            r0.<init>(r1, r2)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Runtime = r0
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = new org.luckypray.dexkit.query.enums.AnnotationVisibilityType
            java.lang.String r1 = "System"
            r2 = 2
            r0.<init>(r1, r2)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType.System = r0
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = $values()
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType.$VALUES = r0
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType$Companion r0 = new org.luckypray.dexkit.query.enums.AnnotationVisibilityType$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion = r0
            return
    }

    AnnotationVisibilityType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.luckypray.dexkit.query.enums.AnnotationVisibilityType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.AnnotationVisibilityType> r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r1 = (org.luckypray.dexkit.query.enums.AnnotationVisibilityType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] values() {
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = (org.luckypray.dexkit.query.enums.AnnotationVisibilityType[]) r0
            return r0
    }
}
