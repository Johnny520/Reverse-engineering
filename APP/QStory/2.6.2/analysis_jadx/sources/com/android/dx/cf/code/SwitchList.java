package com.android.dx.cf.code;

import bsh.C2632;
import com.android.dx.util.IntList;
import com.android.dx.util.MutabilityControl;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SwitchList extends MutabilityControl {
    private int size;
    private final IntList targets;
    private final IntList values;

    public SwitchList(int i) {
        super(true);
        this.values = new IntList(i);
        this.targets = new IntList(i + 1);
        this.size = i;
    }

    public void add(int i, int i2) {
        throwIfImmutable();
        if (i2 < 0) {
            C5919.m11249("target < 0");
        } else {
            this.values.add(i);
            this.targets.add(i2);
        }
    }

    public int getDefaultTarget() {
        return this.targets.get(this.size);
    }

    public int getTarget(int i) {
        return this.targets.get(i);
    }

    public IntList getTargets() {
        return this.targets;
    }

    public int getValue(int i) {
        return this.values.get(i);
    }

    public IntList getValues() {
        return this.values;
    }

    public void removeSuperfluousDefaults() {
        throwIfImmutable();
        int i = this.size;
        if (i != this.targets.size() - 1) {
            C5919.m11249("incomplete instance");
            return;
        }
        int i2 = this.targets.get(i);
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.targets.get(i4);
            if (i5 != i2) {
                if (i4 != i3) {
                    this.targets.set(i3, i5);
                    IntList intList = this.values;
                    intList.set(i3, intList.get(i4));
                }
                i3++;
            }
        }
        if (i3 != i) {
            this.values.shrink(i3);
            this.targets.set(i3, i2);
            this.targets.shrink(i3 + 1);
            this.size = i3;
        }
    }

    public void setDefaultTarget(int i) {
        throwIfImmutable();
        if (i < 0) {
            C5919.m11249("target < 0");
        } else if (this.targets.size() == this.size) {
            this.targets.add(i);
        } else {
            C2632.m5294("non-default elements not all set");
        }
    }

    @Override // com.android.dx.util.MutabilityControl
    public void setImmutable() {
        this.values.setImmutable();
        this.targets.setImmutable();
        super.setImmutable();
    }

    public int size() {
        return this.size;
    }
}
