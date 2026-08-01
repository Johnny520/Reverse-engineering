package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: AnnotationVisibilityType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "", "(Ljava/lang/String;I)V", "Build", "Runtime", "System", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public enum AnnotationVisibilityType extends java.lang.Enum<org.luckypray.dexkit.query.enums.AnnotationVisibilityType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType Build = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion Companion = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType Runtime = null;
    public static final org.luckypray.dexkit.query.enums.AnnotationVisibilityType System = null;

    /* JADX INFO: compiled from: AnnotationVisibilityType.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "retentionPolicy", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.query.enums.AnnotationVisibilityType from(byte r4) {
                r3 = this;
                if (r4 != 0) goto L6
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Build
                goto L16
            L6:
                r0 = 1
                if (r4 != r0) goto Lc
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Runtime
                goto L16
            Lc:
                r0 = 2
                if (r4 != r0) goto L12
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.System
                goto L16
            L12:
                r0 = 3
                if (r4 != r0) goto L17
                r0 = 0
            L16:
                return r0
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown AnnotationVisibilityType: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
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
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = (org.luckypray.dexkit.query.enums.AnnotationVisibilityType) r0
            return r0
    }

    public static org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] values() {
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType[] r0 = (org.luckypray.dexkit.query.enums.AnnotationVisibilityType[]) r0
            return r0
    }
}
