package p000;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0460k8 implements p000.z60 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f5790;

    /* JADX INFO: renamed from: β */
    public int f5791;

    /* JADX INFO: renamed from: γ */
    public int f5792;

    /* JADX INFO: renamed from: δ */
    public int f5793;

    /* JADX INFO: renamed from: ε */
    public int f5794;

    /* JADX INFO: renamed from: ζ */
    public int f5795;

    /* JADX INFO: renamed from: η */
    public boolean f5796;

    /* JADX INFO: renamed from: θ */
    public java.lang.String f5797;

    /* JADX INFO: renamed from: ι */
    public int f5798;

    /* JADX INFO: renamed from: κ */
    public java.lang.CharSequence f5799;

    /* JADX INFO: renamed from: λ */
    public int f5800;

    /* JADX INFO: renamed from: μ */
    public java.lang.CharSequence f5801;

    /* JADX INFO: renamed from: ν */
    public java.util.ArrayList f5802;

    /* JADX INFO: renamed from: ξ */
    public java.util.ArrayList f5803;

    /* JADX INFO: renamed from: ο */
    public boolean f5804;

    /* JADX INFO: renamed from: π */
    public final p000.b70 f5805;

    /* JADX INFO: renamed from: ρ */
    public boolean f5806;

    /* JADX INFO: renamed from: σ */
    public int f5807;

    public C0460k8(p000.b70 r2) {
            r1 = this;
            r2.m759()
            p60 r0 = r2.f1537
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentActivity r0 = r0.f8431
            r0.getClassLoader()
        Lc:
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5790 = r0
            r0 = 0
            r1.f5804 = r0
            r0 = -1
            r1.f5807 = r0
            r1.f5805 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.f5807
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f5807
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.f5797
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r2.f5797
            r0.append(r2)
        L33:
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.z60
    /* JADX INFO: renamed from: α */
    public final boolean mo47(java.util.ArrayList r3, java.util.ArrayList r4) {
            r2 = this;
            r0 = 2
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Run: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.f5796
            if (r3 == 0) goto L38
            b70 r3 = r2.f5805
            java.util.ArrayList r4 = r3.f1521
            if (r4 != 0) goto L33
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f1521 = r4
        L33:
            java.util.ArrayList r3 = r3.f1521
            r3.add(r2)
        L38:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final void m3178(p000.m70 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f5790
            r0.add(r2)
            int r0 = r1.f5791
            r2.f6994 = r0
            int r0 = r1.f5792
            r2.f6995 = r0
            int r0 = r1.f5793
            r2.f6996 = r0
            int r1 = r1.f5794
            r2.f6997 = r1
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3179(int r8) {
            r7 = this;
            boolean r0 = r7.f5796
            if (r0 != 0) goto L5
            goto L67
        L5:
            r0 = 2
            boolean r1 = p000.b70.m751(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Bump nesting in "
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L27:
            java.util.ArrayList r7 = r7.f5790
            int r1 = r7.size()
            r3 = 0
        L2e:
            if (r3 >= r1) goto L67
            java.lang.Object r4 = r7.get(r3)
            m70 r4 = (p000.m70) r4
            n60 r5 = r4.f6992
            if (r5 == 0) goto L64
            int r6 = r5.f7438
            int r6 = r6 + r8
            r5.f7438 = r6
            boolean r5 = p000.b70.m751(r0)
            if (r5 == 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Bump nesting of "
            r5.<init>(r6)
            n60 r6 = r4.f6992
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            n60 r4 = r4.f6992
            int r4 = r4.f7438
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L64:
            int r3 = r3 + 1
            goto L2e
        L67:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3180(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.f5797
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.f5807
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.f5806
            r7.println(r0)
            int r0 = r5.f5795
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.f5795
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.f5791
            if (r0 != 0) goto L40
            int r0 = r5.f5792
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f5791
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.f5792
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.f5793
            if (r0 != 0) goto L67
            int r0 = r5.f5794
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f5793
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.f5794
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.f5798
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.f5799
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.f5798
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f5799
            r7.println(r0)
        La9:
            int r0 = r5.f5800
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.f5801
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.f5800
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f5801
            r7.println(r0)
        Lcc:
            java.util.ArrayList r5 = r5.f5790
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L190
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            int r0 = r5.size()
            r1 = 0
        Le1:
            if (r1 >= r0) goto L190
            java.lang.Object r2 = r5.get(r1)
            m70 r2 = (p000.m70) r2
            int r3 = r2.f6991
            switch(r3) {
                case 0: goto L11d;
                case 1: goto L11a;
                case 2: goto L117;
                case 3: goto L114;
                case 4: goto L111;
                case 5: goto L10e;
                case 6: goto L10b;
                case 7: goto L108;
                case 8: goto L105;
                case 9: goto L102;
                case 10: goto Lff;
                default: goto Lee;
            }
        Lee:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cmd="
            r3.<init>(r4)
            int r4 = r2.f6991
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L11f
        Lff:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L11f
        L102:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L11f
        L105:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L11f
        L108:
            java.lang.String r3 = "ATTACH"
            goto L11f
        L10b:
            java.lang.String r3 = "DETACH"
            goto L11f
        L10e:
            java.lang.String r3 = "SHOW"
            goto L11f
        L111:
            java.lang.String r3 = "HIDE"
            goto L11f
        L114:
            java.lang.String r3 = "REMOVE"
            goto L11f
        L117:
            java.lang.String r3 = "REPLACE"
            goto L11f
        L11a:
            java.lang.String r3 = "ADD"
            goto L11f
        L11d:
            java.lang.String r3 = "NULL"
        L11f:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            n60 r3 = r2.f6992
            r7.println(r3)
            if (r8 == 0) goto L18c
            int r3 = r2.f6994
            if (r3 != 0) goto L146
            int r3 = r2.f6995
            if (r3 == 0) goto L165
        L146:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.f6994
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.f6995
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L165:
            int r3 = r2.f6996
            if (r3 != 0) goto L16d
            int r3 = r2.f6997
            if (r3 == 0) goto L18c
        L16d:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.f6996
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.f6997
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L18c:
            int r1 = r1 + 1
            goto Le1
        L190:
            return
    }
}
