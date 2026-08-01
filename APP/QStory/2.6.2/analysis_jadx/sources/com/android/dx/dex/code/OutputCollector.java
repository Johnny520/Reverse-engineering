package com.android.dx.dex.code;

import com.android.dx.dex.DexOptions;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class OutputCollector {
    private final OutputFinisher finisher;
    private ArrayList<DalvInsn> suffix;

    public OutputCollector(DexOptions dexOptions, int i, int i2, int i3, int i4) {
        this.finisher = new OutputFinisher(dexOptions, i, i3, i4);
        this.suffix = new ArrayList<>(i2);
    }

    private void appendSuffixToOutput() {
        int size = this.suffix.size();
        for (int i = 0; i < size; i++) {
            this.finisher.add(this.suffix.get(i));
        }
        this.suffix = null;
    }

    public void add(DalvInsn dalvInsn) {
        this.finisher.add(dalvInsn);
    }

    public void addSuffix(DalvInsn dalvInsn) {
        this.suffix.add(dalvInsn);
    }

    public DalvInsn get(int i) {
        if (i >= this.finisher.size() || i < 0) {
            return null;
        }
        return this.finisher.get(i);
    }

    public OutputFinisher getFinisher() {
        if (this.suffix != null) {
            appendSuffixToOutput();
            return this.finisher;
        }
        C5919.m11247("already processed");
        return null;
    }

    public void reverseBranch(int i, CodeAddress codeAddress) {
        this.finisher.reverseBranch(i, codeAddress);
    }

    public int size() {
        return this.finisher.size();
    }
}
