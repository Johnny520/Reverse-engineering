package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public class MutabilityControl {
    private boolean mutable;

    public MutabilityControl() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mutable = r0
            return
    }

    public MutabilityControl(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mutable = r1
            return
    }

    public final boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.mutable
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isMutable() {
            r1 = this;
            boolean r0 = r1.mutable
            return r0
    }

    public void setImmutable() {
            r1 = this;
            r0 = 0
            r1.mutable = r0
            return
    }

    public final void throwIfImmutable() {
            r2 = this;
            boolean r0 = r2.mutable
            if (r0 == 0) goto L5
            return
        L5:
            com.android.dx.util.MutabilityException r0 = new com.android.dx.util.MutabilityException
            java.lang.String r1 = "immutable instance"
            r0.<init>(r1)
            throw r0
    }

    public final void throwIfMutable() {
            r2 = this;
            boolean r0 = r2.mutable
            if (r0 != 0) goto L5
            return
        L5:
            com.android.dx.util.MutabilityException r0 = new com.android.dx.util.MutabilityException
            java.lang.String r1 = "mutable instance"
            r0.<init>(r1)
            throw r0
    }
}
