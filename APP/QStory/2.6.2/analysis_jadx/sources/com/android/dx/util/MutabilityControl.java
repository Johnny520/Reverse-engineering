package com.android.dx.util;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MutabilityControl {
    private boolean mutable;

    public MutabilityControl() {
        this.mutable = true;
    }

    public final boolean isImmutable() {
        return !this.mutable;
    }

    public final boolean isMutable() {
        return this.mutable;
    }

    public void setImmutable() {
        this.mutable = false;
    }

    public final void throwIfImmutable() {
        if (!this.mutable) {
            throw new MutabilityException("immutable instance");
        }
    }

    public final void throwIfMutable() {
        if (this.mutable) {
            throw new MutabilityException("mutable instance");
        }
    }

    public MutabilityControl(boolean z) {
        this.mutable = z;
    }
}
