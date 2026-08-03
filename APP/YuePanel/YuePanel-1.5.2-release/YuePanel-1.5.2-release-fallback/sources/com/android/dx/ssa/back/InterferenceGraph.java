package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class InterferenceGraph {
    private final java.util.ArrayList<com.android.dx.util.IntSet> interference;

    public InterferenceGraph(int r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r3.interference = r0
            r0 = 0
        Lb:
            if (r0 >= r4) goto L19
            java.util.ArrayList<com.android.dx.util.IntSet> r1 = r3.interference
            com.android.dx.util.IntSet r2 = com.android.dx.ssa.SetFactory.makeInterferenceSet(r4)
            r1.add(r2)
            int r0 = r0 + 1
            goto Lb
        L19:
            return
    }

    private void ensureCapacity(int r4) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r3.interference
            int r0 = r0.size()
            java.util.ArrayList<com.android.dx.util.IntSet> r1 = r3.interference
            r1.ensureCapacity(r4)
        Lb:
            if (r0 >= r4) goto L19
            java.util.ArrayList<com.android.dx.util.IntSet> r1 = r3.interference
            com.android.dx.util.IntSet r2 = com.android.dx.ssa.SetFactory.makeInterferenceSet(r4)
            r1.add(r2)
            int r0 = r0 + 1
            goto Lb
        L19:
            return
    }

    public void add(int r2, int r3) {
            r1 = this;
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = r0 + 1
            r1.ensureCapacity(r0)
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r1.interference
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.util.IntSet r0 = (com.android.dx.util.IntSet) r0
            r0.add(r3)
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r1.interference
            java.lang.Object r3 = r0.get(r3)
            com.android.dx.util.IntSet r3 = (com.android.dx.util.IntSet) r3
            r3.add(r2)
            return
    }

    public void dumpToStdout() {
            r5 = this;
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r5.interference
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reg "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ":"
            r3.append(r4)
            java.util.ArrayList<com.android.dx.util.IntSet> r4 = r5.interference
            java.lang.Object r4 = r4.get(r1)
            com.android.dx.util.IntSet r4 = (com.android.dx.util.IntSet) r4
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r2 = r2.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto L7
        L42:
            return
    }

    public void mergeInterferenceSet(int r2, com.android.dx.util.IntSet r3) {
            r1 = this;
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r1.interference
            int r0 = r0.size()
            if (r2 >= r0) goto L13
            java.util.ArrayList<com.android.dx.util.IntSet> r0 = r1.interference
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.util.IntSet r2 = (com.android.dx.util.IntSet) r2
            r3.merge(r2)
        L13:
            return
    }
}
