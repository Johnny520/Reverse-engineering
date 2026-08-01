package net.bytebuddy.implementation.attribute;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationRetention {
    ENABLED(true),
    DISABLED(false);

    private final boolean enabled;

    AnnotationRetention(boolean z) {
        this.enabled = z;
    }

    public static AnnotationRetention of(boolean z) {
        return z ? ENABLED : DISABLED;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
