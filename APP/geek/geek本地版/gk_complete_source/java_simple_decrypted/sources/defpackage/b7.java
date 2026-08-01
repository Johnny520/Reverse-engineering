package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b7 implements wl {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public final yl p;
    public boolean q;
    public int r;

    public b7(yl r2) {
        r2.x();
        nl r0 = r2.n;
        if (r0 == null) goto L5;
        r0.D.getClassLoader();
    L5:
        this.a = new ArrayList();
        this.o = false;
        this.r = -1;
        this.p = r2;
    }

    @Override // defpackage.wl
    public final boolean a(ArrayList r3, ArrayList r4) {
        if (yl.A(2) == false) goto L5;
        Log.v("FragmentManager", "Run: " + this);
    L5:
        r3.add(this);
        r4.add(Boolean.FALSE);
        if (this.g == false) goto L13;
        yl r32 = this.p;
        if (r32.d != null) goto L10;
        r32.d = new ArrayList();
    L10:
        r32.d.add(this);
        return true;
    L13:
        return true;
    }

    public final void b(em r2) {
        this.a.add(r2);
        r2.c = this.b;
        r2.d = this.c;
        r2.e = this.d;
        r2.f = this.e;
    }

    public final void c(int r9) {
        if (this.g == true) goto L6;
        return;
    L6:
        if (yl.A(2) == false) goto L8;
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + r9);
    L8:
        ArrayList r1 = this.a;
        int r3 = r1.size();
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L21;
        em r5 = (em) r1.get(r4);
        ml r6 = r5.b;
        if (r6 == null) goto L15;
        r6.q += r9;
        if (yl.A(2) == false) goto L15;
        Log.v("FragmentManager", "Bump nesting of " + r5.b + " to " + r5.b.q);
    L15:
        r4 = r4 + 1;
        goto L9
    }

    public final void d(String r7, PrintWriter r8, boolean r9) {
        if (r9 == false) goto L26;
        r8.print(r7);
        r8.print("mName=");
        r8.print(this.h);
        r8.print(" mIndex=");
        r8.print(this.r);
        r8.print(" mCommitted=");
        r8.println(this.q);
        if (this.f == 0) goto L7;
        r8.print(r7);
        r8.print("mTransition=#");
        r8.print(Integer.toHexString(this.f));
    L7:
        if (this.b == 0) goto L9;
    L10:
        r8.print(r7);
        r8.print("mEnterAnim=#");
        r8.print(Integer.toHexString(this.b));
        r8.print(" mExitAnim=#");
        r8.println(Integer.toHexString(this.c));
    L12:
        if (this.d == 0) goto L14;
    L15:
        r8.print(r7);
        r8.print("mPopEnterAnim=#");
        r8.print(Integer.toHexString(this.d));
        r8.print(" mPopExitAnim=#");
        r8.println(Integer.toHexString(this.e));
    L17:
        if (this.i == 0) goto L19;
    L20:
        r8.print(r7);
        r8.print("mBreadCrumbTitleRes=#");
        r8.print(Integer.toHexString(this.i));
        r8.print(" mBreadCrumbTitleText=");
        r8.println(this.j);
    L22:
        if (this.k == 0) goto L24;
    L25:
        r8.print(r7);
        r8.print("mBreadCrumbShortTitleRes=#");
        r8.print(Integer.toHexString(this.k));
        r8.print(" mBreadCrumbShortTitleText=");
        r8.println(this.l);
        goto L26
    L24:
        if (this.l == null) goto L26;
    L19:
        if (this.j == null) goto L22;
    L14:
        if (this.e == 0) goto L17;
    L9:
        if (this.c == 0) goto L12;
    L26:
        ArrayList r0 = this.a;
        if (r0.isEmpty() == true) goto L57;
        r8.print(r7);
        r8.println("Operations:");
        int r1 = r0.size();
        int r2 = 0;
    L29:
        if (r2 >= r1) goto L62;
        em r3 = (em) r0.get(r2);
        switch(r3.a) {
            case 0: goto L43;
            case 1: goto L42;
            case 2: goto L41;
            case 3: goto L40;
            case 4: goto L39;
            case 5: goto L38;
            case 6: goto L37;
            case 7: goto L36;
            case 8: goto L35;
            case 9: goto L34;
            case 10: goto L33;
            default: goto L32;
        };
    L32:
        String r4 = "cmd=" + r3.a;
    L44:
        r8.print(r7);
        r8.print("  Op #");
        r8.print(r2);
        r8.print(": ");
        r8.print(r4);
        r8.print(" ");
        r8.println(r3.b);
        if (r9 == false) goto L56;
        if (r3.c == 0) goto L49;
    L50:
        r8.print(r7);
        r8.print("enterAnim=#");
        r8.print(Integer.toHexString(r3.c));
        r8.print(" exitAnim=#");
        r8.println(Integer.toHexString(r3.d));
    L52:
        if (r3.e == 0) goto L54;
    L55:
        r8.print(r7);
        r8.print("popEnterAnim=#");
        r8.print(Integer.toHexString(r3.e));
        r8.print(" popExitAnim=#");
        r8.println(Integer.toHexString(r3.f));
        goto L56
    L54:
        if (r3.f == 0) goto L56;
    L49:
        if (r3.d == 0) goto L52;
    L56:
        r2 = r2 + 1;
        goto L29
    L33:
        r4 = "OP_SET_MAX_LIFECYCLE";
        goto L44
    L34:
        r4 = "UNSET_PRIMARY_NAV";
        goto L44
    L35:
        r4 = "SET_PRIMARY_NAV";
        goto L44
    L36:
        r4 = "ATTACH";
        goto L44
    L37:
        r4 = "DETACH";
        goto L44
    L38:
        r4 = "SHOW";
        goto L44
    L39:
        r4 = "HIDE";
        goto L44
    L40:
        r4 = "REMOVE";
        goto L44
    L41:
        r4 = "REPLACE";
        goto L44
    L42:
        r4 = "ADD";
        goto L44
    L43:
        r4 = "NULL";
        goto L44
    L62:
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("BackStackEntry{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r < 0) goto L6;
        r0.append(" #");
        r0.append(this.r);
    L6:
        if (this.h == null) goto L8;
        r0.append(" ");
        r0.append(this.h);
    L8:
        r0.append("}");
        return r0.toString();
    }
}
