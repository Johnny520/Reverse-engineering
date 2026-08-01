package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b7 implements defpackage.wl {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public java.lang.String h;
    public int i;
    public java.lang.CharSequence j;
    public int k;
    public java.lang.CharSequence l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public boolean o;
    public final defpackage.yl p;
    public boolean q;
    public int r;

    public b7(defpackage.yl r2) {
            r1 = this;
            r2.x()
            nl r0 = r2.n
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentActivity r0 = r0.D
            r0.getClassLoader()
        Lc:
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.o = r0
            r0 = -1
            r1.r = r0
            r1.p = r2
            return
    }

    @Override // defpackage.wl
    public final boolean a(java.util.ArrayList r3, java.util.ArrayList r4) {
            r2 = this;
            r0 = 2
            boolean r0 = defpackage.yl.A(r0)
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
            boolean r3 = r2.g
            if (r3 == 0) goto L38
            yl r3 = r2.p
            java.util.ArrayList r4 = r3.d
            if (r4 != 0) goto L33
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.d = r4
        L33:
            java.util.ArrayList r3 = r3.d
            r3.add(r2)
        L38:
            r3 = 1
            return r3
    }

    public final void b(defpackage.em r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            r0.add(r2)
            int r0 = r1.b
            r2.c = r0
            int r0 = r1.c
            r2.d = r0
            int r0 = r1.d
            r2.e = r0
            int r0 = r1.e
            r2.f = r0
            return
    }

    public final void c(int r9) {
            r8 = this;
            boolean r0 = r8.g
            if (r0 != 0) goto L5
            goto L67
        L5:
            r0 = 2
            boolean r1 = defpackage.yl.A(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Bump nesting in "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L27:
            java.util.ArrayList r1 = r8.a
            int r3 = r1.size()
            r4 = 0
        L2e:
            if (r4 >= r3) goto L67
            java.lang.Object r5 = r1.get(r4)
            em r5 = (defpackage.em) r5
            ml r6 = r5.b
            if (r6 == 0) goto L64
            int r7 = r6.q
            int r7 = r7 + r9
            r6.q = r7
            boolean r6 = defpackage.yl.A(r0)
            if (r6 == 0) goto L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Bump nesting of "
            r6.<init>(r7)
            ml r7 = r5.b
            r6.append(r7)
            java.lang.String r7 = " to "
            r6.append(r7)
            ml r5 = r5.b
            int r5 = r5.q
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.v(r2, r5)
        L64:
            int r4 = r4 + 1
            goto L2e
        L67:
            return
    }

    public final void d(java.lang.String r7, java.io.PrintWriter r8, boolean r9) {
            r6 = this;
            if (r9 == 0) goto Lcc
            r8.print(r7)
            java.lang.String r0 = "mName="
            r8.print(r0)
            java.lang.String r0 = r6.h
            r8.print(r0)
            java.lang.String r0 = " mIndex="
            r8.print(r0)
            int r0 = r6.r
            r8.print(r0)
            java.lang.String r0 = " mCommitted="
            r8.print(r0)
            boolean r0 = r6.q
            r8.println(r0)
            int r0 = r6.f
            if (r0 == 0) goto L38
            r8.print(r7)
            java.lang.String r0 = "mTransition=#"
            r8.print(r0)
            int r0 = r6.f
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
        L38:
            int r0 = r6.b
            if (r0 != 0) goto L40
            int r0 = r6.c
            if (r0 == 0) goto L5f
        L40:
            r8.print(r7)
            java.lang.String r0 = "mEnterAnim=#"
            r8.print(r0)
            int r0 = r6.b
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r8.print(r0)
            int r0 = r6.c
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.println(r0)
        L5f:
            int r0 = r6.d
            if (r0 != 0) goto L67
            int r0 = r6.e
            if (r0 == 0) goto L86
        L67:
            r8.print(r7)
            java.lang.String r0 = "mPopEnterAnim=#"
            r8.print(r0)
            int r0 = r6.d
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r8.print(r0)
            int r0 = r6.e
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.println(r0)
        L86:
            int r0 = r6.i
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r6.j
            if (r0 == 0) goto La9
        L8e:
            r8.print(r7)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r8.print(r0)
            int r0 = r6.i
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r8.print(r0)
            java.lang.CharSequence r0 = r6.j
            r8.println(r0)
        La9:
            int r0 = r6.k
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r6.l
            if (r0 == 0) goto Lcc
        Lb1:
            r8.print(r7)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r8.print(r0)
            int r0 = r6.k
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r8.print(r0)
            java.lang.CharSequence r0 = r6.l
            r8.println(r0)
        Lcc:
            java.util.ArrayList r0 = r6.a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L190
            r8.print(r7)
            java.lang.String r1 = "Operations:"
            r8.println(r1)
            int r1 = r0.size()
            r2 = 0
        Le1:
            if (r2 >= r1) goto L190
            java.lang.Object r3 = r0.get(r2)
            em r3 = (defpackage.em) r3
            int r4 = r3.a
            switch(r4) {
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
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "cmd="
            r4.<init>(r5)
            int r5 = r3.a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L11f
        Lff:
            java.lang.String r4 = "OP_SET_MAX_LIFECYCLE"
            goto L11f
        L102:
            java.lang.String r4 = "UNSET_PRIMARY_NAV"
            goto L11f
        L105:
            java.lang.String r4 = "SET_PRIMARY_NAV"
            goto L11f
        L108:
            java.lang.String r4 = "ATTACH"
            goto L11f
        L10b:
            java.lang.String r4 = "DETACH"
            goto L11f
        L10e:
            java.lang.String r4 = "SHOW"
            goto L11f
        L111:
            java.lang.String r4 = "HIDE"
            goto L11f
        L114:
            java.lang.String r4 = "REMOVE"
            goto L11f
        L117:
            java.lang.String r4 = "REPLACE"
            goto L11f
        L11a:
            java.lang.String r4 = "ADD"
            goto L11f
        L11d:
            java.lang.String r4 = "NULL"
        L11f:
            r8.print(r7)
            java.lang.String r5 = "  Op #"
            r8.print(r5)
            r8.print(r2)
            java.lang.String r5 = ": "
            r8.print(r5)
            r8.print(r4)
            java.lang.String r4 = " "
            r8.print(r4)
            ml r4 = r3.b
            r8.println(r4)
            if (r9 == 0) goto L18c
            int r4 = r3.c
            if (r4 != 0) goto L146
            int r4 = r3.d
            if (r4 == 0) goto L165
        L146:
            r8.print(r7)
            java.lang.String r4 = "enterAnim=#"
            r8.print(r4)
            int r4 = r3.c
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.print(r4)
            java.lang.String r4 = " exitAnim=#"
            r8.print(r4)
            int r4 = r3.d
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.println(r4)
        L165:
            int r4 = r3.e
            if (r4 != 0) goto L16d
            int r4 = r3.f
            if (r4 == 0) goto L18c
        L16d:
            r8.print(r7)
            java.lang.String r4 = "popEnterAnim=#"
            r8.print(r4)
            int r4 = r3.e
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.print(r4)
            java.lang.String r4 = " popExitAnim=#"
            r8.print(r4)
            int r3 = r3.f
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r8.println(r3)
        L18c:
            int r2 = r2 + 1
            goto Le1
        L190:
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
            int r1 = r2.r
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.r
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.h
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.h
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
