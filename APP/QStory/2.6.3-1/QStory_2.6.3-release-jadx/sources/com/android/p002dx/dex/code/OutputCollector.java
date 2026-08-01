package com.android.p002dx.dex.code;

import com.android.p002dx.dex.DexOptions;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C6755.m11867("already processed");
        return null;
    }

    public void reverseBranch(int i, CodeAddress codeAddress) {
        this.finisher.reverseBranch(i, codeAddress);
    }

    public int size() {
        return this.finisher.size();
    }
}
