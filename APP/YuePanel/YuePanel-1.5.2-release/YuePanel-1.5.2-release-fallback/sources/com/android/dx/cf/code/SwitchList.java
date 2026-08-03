package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchList extends com.android.dx.util.MutabilityControl {
    private int size;
    private final com.android.dx.util.IntList targets;
    private final com.android.dx.util.IntList values;

    public SwitchList(int r3) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r0.<init>(r3)
            r2.values = r0
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            int r1 = r3 + 1
            r0.<init>(r1)
            r2.targets = r0
            r2.size = r3
            return
    }

    public void add(int r2, int r3) {
            r1 = this;
            r1.throwIfImmutable()
            if (r3 < 0) goto L10
            com.android.dx.util.IntList r0 = r1.values
            r0.add(r2)
            com.android.dx.util.IntList r2 = r1.targets
            r2.add(r3)
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "target < 0"
            r2.<init>(r3)
            throw r2
    }

    public int getDefaultTarget() {
            r2 = this;
            com.android.dx.util.IntList r0 = r2.targets
            int r1 = r2.size
            int r0 = r0.get(r1)
            return r0
    }

    public int getTarget(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.targets
            int r2 = r0.get(r2)
            return r2
    }

    public com.android.dx.util.IntList getTargets() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.targets
            return r0
    }

    public int getValue(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.values
            int r2 = r0.get(r2)
            return r2
    }

    public com.android.dx.util.IntList getValues() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.values
            return r0
    }

    public void removeSuperfluousDefaults() {
            r6 = this;
            r6.throwIfImmutable()
            int r0 = r6.size
            com.android.dx.util.IntList r1 = r6.targets
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L4c
            com.android.dx.util.IntList r1 = r6.targets
            int r1 = r1.get(r0)
            r2 = 0
            r3 = r2
        L17:
            if (r2 >= r0) goto L36
            com.android.dx.util.IntList r4 = r6.targets
            int r4 = r4.get(r2)
            if (r4 == r1) goto L33
            if (r2 == r3) goto L31
            com.android.dx.util.IntList r5 = r6.targets
            r5.set(r3, r4)
            com.android.dx.util.IntList r4 = r6.values
            int r5 = r4.get(r2)
            r4.set(r3, r5)
        L31:
            int r3 = r3 + 1
        L33:
            int r2 = r2 + 1
            goto L17
        L36:
            if (r3 == r0) goto L4b
            com.android.dx.util.IntList r0 = r6.values
            r0.shrink(r3)
            com.android.dx.util.IntList r0 = r6.targets
            r0.set(r3, r1)
            com.android.dx.util.IntList r0 = r6.targets
            int r1 = r3 + 1
            r0.shrink(r1)
            r6.size = r3
        L4b:
            return
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "incomplete instance"
            r0.<init>(r1)
            throw r0
    }

    public void setDefaultTarget(int r3) {
            r2 = this;
            r2.throwIfImmutable()
            if (r3 < 0) goto L1d
            com.android.dx.util.IntList r0 = r2.targets
            int r0 = r0.size()
            int r1 = r2.size
            if (r0 != r1) goto L15
            com.android.dx.util.IntList r0 = r2.targets
            r0.add(r3)
            return
        L15:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "non-default elements not all set"
            r3.<init>(r0)
            throw r3
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "target < 0"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.android.dx.util.MutabilityControl
    public void setImmutable() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.values
            r0.setImmutable()
            com.android.dx.util.IntList r0 = r1.targets
            r0.setImmutable()
            super.setImmutable()
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
