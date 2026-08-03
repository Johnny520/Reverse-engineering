package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationRetention extends java.lang.Enum<net.bytebuddy.implementation.attribute.AnnotationRetention> {
    private static final /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationRetention[] $VALUES = null;
    public static final net.bytebuddy.implementation.attribute.AnnotationRetention DISABLED = null;
    public static final net.bytebuddy.implementation.attribute.AnnotationRetention ENABLED = null;
    private final boolean enabled;

    static {
            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = new net.bytebuddy.implementation.attribute.AnnotationRetention
            java.lang.String r1 = "ENABLED"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            net.bytebuddy.implementation.attribute.AnnotationRetention.ENABLED = r0
            net.bytebuddy.implementation.attribute.AnnotationRetention r1 = new net.bytebuddy.implementation.attribute.AnnotationRetention
            java.lang.String r4 = "DISABLED"
            r1.<init>(r4, r3, r2)
            net.bytebuddy.implementation.attribute.AnnotationRetention.DISABLED = r1
            net.bytebuddy.implementation.attribute.AnnotationRetention[] r0 = new net.bytebuddy.implementation.attribute.AnnotationRetention[]{r0, r1}
            net.bytebuddy.implementation.attribute.AnnotationRetention.$VALUES = r0
            return
    }

    AnnotationRetention(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.enabled = r3
            return
    }

    public static net.bytebuddy.implementation.attribute.AnnotationRetention of(boolean r0) {
            if (r0 == 0) goto L5
            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = net.bytebuddy.implementation.attribute.AnnotationRetention.ENABLED
            goto L7
        L5:
            net.bytebuddy.implementation.attribute.AnnotationRetention r0 = net.bytebuddy.implementation.attribute.AnnotationRetention.DISABLED
        L7:
            return r0
    }

    public static net.bytebuddy.implementation.attribute.AnnotationRetention valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.attribute.AnnotationRetention> r0 = net.bytebuddy.implementation.attribute.AnnotationRetention.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.attribute.AnnotationRetention r1 = (net.bytebuddy.implementation.attribute.AnnotationRetention) r1
            return r1
    }

    public static net.bytebuddy.implementation.attribute.AnnotationRetention[] values() {
            net.bytebuddy.implementation.attribute.AnnotationRetention[] r0 = net.bytebuddy.implementation.attribute.AnnotationRetention.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.attribute.AnnotationRetention[] r0 = (net.bytebuddy.implementation.attribute.AnnotationRetention[]) r0
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.enabled
            return r0
    }
}
