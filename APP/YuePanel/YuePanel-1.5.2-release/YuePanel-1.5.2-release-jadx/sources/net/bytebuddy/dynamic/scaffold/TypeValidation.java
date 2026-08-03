package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public enum TypeValidation {
    ENABLED(true),
    DISABLED(false);

    private final boolean enabled;

    TypeValidation(boolean z) {
        this.enabled = z;
    }

    /* JADX INFO: renamed from: of */
    public static TypeValidation m5286of(boolean z) {
        return z ? ENABLED : DISABLED;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
