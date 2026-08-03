package com.android.p001dx.util;

/* JADX INFO: loaded from: classes.dex */
public class MutabilityControl {
    private boolean mutable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
