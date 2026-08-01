package com.android.p002dx.ssa.back;

import androidx.activity.AbstractC0900;
import com.android.p002dx.ssa.SetFactory;
import com.android.p002dx.util.IntSet;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InterferenceGraph {
    private final ArrayList<IntSet> interference;

    public InterferenceGraph(int i) {
        this.interference = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.interference.add(SetFactory.makeInterferenceSet(i));
        }
    }

    private void ensureCapacity(int i) {
        this.interference.ensureCapacity(i);
        for (int size = this.interference.size(); size < i; size++) {
            this.interference.add(SetFactory.makeInterferenceSet(i));
        }
    }

    public void add(int i, int i2) {
        ensureCapacity(Math.max(i, i2) + 1);
        this.interference.get(i).add(i2);
        this.interference.get(i2).add(i);
    }

    public void dumpToStdout() {
        int size = this.interference.size();
        for (int i = 0; i < size; i++) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "Reg ", ":");
            sbM710.append(this.interference.get(i).toString());
            System.out.println(sbM710.toString());
        }
    }

    public void mergeInterferenceSet(int i, IntSet intSet) {
        if (i < this.interference.size()) {
            intSet.merge(this.interference.get(i));
        }
    }
}
