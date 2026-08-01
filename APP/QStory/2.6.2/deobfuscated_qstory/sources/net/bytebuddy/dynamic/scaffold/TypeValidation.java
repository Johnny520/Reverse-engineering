package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum TypeValidation {
    ENABLED(true),
    DISABLED(false);

    private final boolean enabled;

    TypeValidation(boolean z) {
        this.enabled = z;
    }

    public static TypeValidation of(boolean z) {
        return z ? ENABLED : DISABLED;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
