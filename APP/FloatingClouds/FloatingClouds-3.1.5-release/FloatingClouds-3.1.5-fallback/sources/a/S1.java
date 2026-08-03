package a;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends a.AbstractC0316p7 implements a.AbstractC0119e7.i {
    public final a.AbstractC0119e7 q;
    public boolean r;
    public int s;

    public S1(a.AbstractC0119e7 r2) {
            r1 = this;
            r2.G()
            a.X6$a r0 = r2.v
            if (r0 == 0) goto Lc
            a.X6 r0 = r0.b
            r0.getClassLoader()
        Lc:
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f636a = r0
            r0 = 0
            r1.o = r0
            r0 = -1
            r1.s = r0
            r1.q = r2
            return
    }

    @Override // a.AbstractC0119e7.i
    public final boolean a(java.util.ArrayList<a.S1> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = a.AbstractC0119e7.J(r0)
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
            if (r3 == 0) goto L2d
            a.e7 r3 = r2.q
            java.util.ArrayList<a.S1> r3 = r3.d
            r3.add(r2)
        L2d:
            r3 = 1
            return r3
    }

    public final void c(int r9) {
            r8 = this;
            boolean r0 = r8.g
            if (r0 != 0) goto L5
            goto L67
        L5:
            r0 = 2
            boolean r1 = a.AbstractC0119e7.J(r0)
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
            java.util.ArrayList<a.p7$a> r1 = r8.f636a
            int r3 = r1.size()
            r4 = 0
        L2e:
            if (r4 >= r3) goto L67
            java.lang.Object r5 = r1.get(r4)
            a.p7$a r5 = (a.AbstractC0316p7.a) r5
            androidx.fragment.app.b r6 = r5.b
            if (r6 == 0) goto L64
            int r7 = r6.s
            int r7 = r7 + r9
            r6.s = r7
            boolean r6 = a.AbstractC0119e7.J(r0)
            if (r6 == 0) goto L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Bump nesting of "
            r6.<init>(r7)
            androidx.fragment.app.b r7 = r5.b
            r6.append(r7)
            java.lang.String r7 = " to "
            r6.append(r7)
            androidx.fragment.app.b r5 = r5.b
            int r5 = r5.s
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.v(r2, r5)
        L64:
            int r4 = r4 + 1
            goto L2e
        L67:
            return
    }

    public final int d(boolean r4) {
            r3 = this;
            boolean r0 = r3.r
            if (r0 != 0) goto L4b
            r0 = 2
            boolean r0 = a.AbstractC0119e7.J(r0)
            r1 = 1
            if (r0 == 0) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Commit: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
            a.M9 r0 = new a.M9
            r0.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            java.lang.String r0 = "  "
            r3.f(r0, r2, r1)
            r2.close()
        L31:
            r3.r = r1
            boolean r0 = r3.g
            a.e7 r1 = r3.q
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j
            int r0 = r0.getAndIncrement()
            r3.s = r0
            goto L45
        L42:
            r0 = -1
            r3.s = r0
        L45:
            r1.x(r3, r4)
            int r4 = r3.s
            return r4
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r4.<init>(r0)
            throw r4
    }

    public final void e(int r4, androidx.fragment.app.b r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.String r0 = r5.M
            if (r0 == 0) goto L7
            a.C0298o7.c(r5, r0)
        L7:
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lbd
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lbd
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L27
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lbd
        L27:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L5c
            java.lang.String r2 = r5.z
            if (r2 == 0) goto L5a
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            goto L5a
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't change tag of fragment "
            r7.<init>(r2)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r5.z
            r7.append(r5)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L5a:
            r5.z = r6
        L5c:
            if (r4 == 0) goto Lb0
            r2 = -1
            if (r4 == r2) goto L8f
            int r6 = r5.x
            if (r6 == 0) goto L8a
            if (r6 != r4) goto L68
            goto L8a
        L68:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.<init>(r2)
            r7.append(r5)
            r7.append(r1)
            int r5 = r5.x
            r7.append(r5)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L8a:
            r5.x = r4
            r5.y = r4
            goto Lb0
        L8f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't add fragment "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " with tag "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " to container view with no id"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        Lb0:
            a.p7$a r4 = new a.p7$a
            r4.<init>(r7, r5)
            r3.b(r4)
            a.e7 r4 = r3.q
            r5.t = r4
            return
        Lbd:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Fragment "
            r5.<init>(r6)
            java.lang.String r6 = r0.getCanonicalName()
            r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from instance state."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public final void f(java.lang.String r7, java.io.PrintWriter r8, boolean r9) {
            r6 = this;
            if (r9 == 0) goto Lcc
            r8.print(r7)
            java.lang.String r0 = "mName="
            r8.print(r0)
            java.lang.String r0 = r6.h
            r8.print(r0)
            java.lang.String r0 = " mIndex="
            r8.print(r0)
            int r0 = r6.s
            r8.print(r0)
            java.lang.String r0 = " mCommitted="
            r8.print(r0)
            boolean r0 = r6.r
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
            java.util.ArrayList<a.p7$a> r0 = r6.f636a
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
            a.p7$a r3 = (a.AbstractC0316p7.a) r3
            int r4 = r3.f637a
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
            int r5 = r3.f637a
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
            androidx.fragment.app.b r4 = r3.b
            r8.println(r4)
            if (r9 == 0) goto L18c
            int r4 = r3.d
            if (r4 != 0) goto L146
            int r4 = r3.e
            if (r4 == 0) goto L165
        L146:
            r8.print(r7)
            java.lang.String r4 = "enterAnim=#"
            r8.print(r4)
            int r4 = r3.d
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.print(r4)
            java.lang.String r4 = " exitAnim=#"
            r8.print(r4)
            int r4 = r3.e
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.println(r4)
        L165:
            int r4 = r3.f
            if (r4 != 0) goto L16d
            int r4 = r3.g
            if (r4 == 0) goto L18c
        L16d:
            r8.print(r7)
            java.lang.String r4 = "popEnterAnim=#"
            r8.print(r4)
            int r4 = r3.f
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r8.print(r4)
            java.lang.String r4 = " popExitAnim=#"
            r8.print(r4)
            int r3 = r3.g
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
            int r1 = r2.s
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.s
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
