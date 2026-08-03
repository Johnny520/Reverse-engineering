package p000;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1483h5 implements InterfaceC2719xi {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5236a;

    /* JADX INFO: renamed from: b */
    public int f5237b;

    /* JADX INFO: renamed from: c */
    public int f5238c;

    /* JADX INFO: renamed from: d */
    public int f5239d;

    /* JADX INFO: renamed from: e */
    public int f5240e;

    /* JADX INFO: renamed from: f */
    public int f5241f;

    /* JADX INFO: renamed from: g */
    public boolean f5242g;

    /* JADX INFO: renamed from: h */
    public String f5243h;

    /* JADX INFO: renamed from: i */
    public int f5244i;

    /* JADX INFO: renamed from: j */
    public CharSequence f5245j;

    /* JADX INFO: renamed from: k */
    public int f5246k;

    /* JADX INFO: renamed from: l */
    public CharSequence f5247l;

    /* JADX INFO: renamed from: m */
    public ArrayList f5248m;

    /* JADX INFO: renamed from: n */
    public ArrayList f5249n;

    /* JADX INFO: renamed from: o */
    public boolean f5250o;

    /* JADX INFO: renamed from: p */
    public final AbstractC2805zi f5251p;

    /* JADX INFO: renamed from: q */
    public boolean f5252q;

    /* JADX INFO: renamed from: r */
    public int f5253r;

    public C1483h5(AbstractC2805zi r2) {
        r2.m5382E();
        C2104ji r0 = r2.f9512u;
        if (r0 == null) goto L5;
        r0.f7401m.getClassLoader();
    L5:
        this.f5236a = new ArrayList();
        this.f5250o = false;
        this.f5253r = -1;
        this.f5251p = r2;
    }

    @Override // p000.InterfaceC2719xi
    /* JADX INFO: renamed from: a */
    public final boolean mo2838a(ArrayList r2, ArrayList r3) {
        if (AbstractC2805zi.m5374G(2) == false) goto L5;
        toString();
    L5:
        r2.add(this);
        r3.add(Boolean.FALSE);
        if (this.f5242g == false) goto L13;
        AbstractC2805zi r22 = this.f5251p;
        if (r22.f9495d != null) goto L10;
        r22.f9495d = new ArrayList();
    L10:
        r22.f9495d.add(this);
        return true;
    L13:
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2839b(C0455Ki r2) {
        this.f5236a.add(r2);
        r2.f1492d = this.f5237b;
        r2.f1493e = this.f5238c;
        r2.f1494f = this.f5239d;
        r2.f1495g = this.f5240e;
    }

    /* JADX INFO: renamed from: c */
    public final void m2840c(int r8) {
        if (this.f5242g == true) goto L6;
        return;
    L6:
        if (AbstractC2805zi.m5374G(2) == false) goto L8;
        toString();
    L8:
        ArrayList r1 = this.f5236a;
        int r2 = r1.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L21;
        C0455Ki r4 = (C0455Ki) r1.get(r3);
        AbstractComponentCallbacksC1503hi r5 = r4.f1490b;
        if (r5 == null) goto L15;
        r5.f5326q += r8;
        if (AbstractC2805zi.m5374G(2) == false) goto L15;
        Objects.toString(r4.f1490b);
        int r42 = r4.f1490b.f5326q;
    L15:
        r3 = r3 + 1;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final int m2841d(boolean r4) {
        if (this.f5252q == true) goto L14;
        if (AbstractC2805zi.m5374G(2) == false) goto L7;
        toString();
        PrintWriter r2 = new PrintWriter(new C2068ip());
        m2843f("  ", r2, true);
        r2.close();
    L7:
        this.f5252q = true;
        boolean r0 = this.f5242g;
        AbstractC2805zi r1 = this.f5251p;
        if (r0 == false) goto L10;
        this.f5253r = r1.f9500i.getAndIncrement();
    L11:
        r1.m5425w(this, r4);
        return this.f5253r;
    L10:
        this.f5253r = -1;
        goto L11
    L14:
        throw new IllegalStateException("commit already called");
    }

    /* JADX INFO: renamed from: e */
    public final void m2842e(int r4, AbstractComponentCallbacksC1503hi r5, String r6, int r7) {
        String r0 = r5.f5302K;
        if (r0 == null) goto L5;
        AbstractC0412Ji.m856c(r5, r0);
    L5:
        Class<?> r02 = r5.getClass();
        int r1 = r02.getModifiers();
        if (r02.isAnonymousClass() == true) goto L38;
        if (Modifier.isPublic(r1) == false) goto L38;
        if (r02.isMemberClass() == false) goto L14;
        if (Modifier.isStatic(r1) == false) goto L38;
    L14:
        if (r6 == null) goto L23;
        String r2 = r5.f5333x;
        if (r2 != null) goto L18;
    L22:
        r5.f5333x = r6;
        goto L23
    L18:
        if (r6.equals(r2) == true) goto L22;
        throw new IllegalStateException("Can't change tag of fragment " + r5 + ": was " + r5.f5333x + " now " + r6);
    L23:
        if (r4 != 0) goto L25;
    L35:
        m2839b(new C0455Ki(r7, r5));
        r5.f5327r = this.f5251p;
        return;
    L25:
        if (r4 == (-1)) goto L34;
        int r62 = r5.f5331v;
        if (r62 == 0) goto L32;
        if (r62 == r4) goto L32;
        throw new IllegalStateException("Can't change container ID of fragment " + r5 + ": was " + r5.f5331v + " now " + r4);
    L32:
        r5.f5331v = r4;
        r5.f5332w = r4;
        goto L35
    L34:
        throw new IllegalArgumentException("Can't add fragment " + r5 + " with tag " + r6 + " to container view with no id");
    L38:
        throw new IllegalStateException("Fragment " + r02.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* JADX INFO: renamed from: f */
    public final void m2843f(String r7, PrintWriter r8, boolean r9) {
        if (r9 == false) goto L26;
        r8.print(r7);
        r8.print("mName=");
        r8.print(this.f5243h);
        r8.print(" mIndex=");
        r8.print(this.f5253r);
        r8.print(" mCommitted=");
        r8.println(this.f5252q);
        if (this.f5241f == 0) goto L7;
        r8.print(r7);
        r8.print("mTransition=#");
        r8.print(Integer.toHexString(this.f5241f));
    L7:
        if (this.f5237b == 0) goto L9;
    L10:
        r8.print(r7);
        r8.print("mEnterAnim=#");
        r8.print(Integer.toHexString(this.f5237b));
        r8.print(" mExitAnim=#");
        r8.println(Integer.toHexString(this.f5238c));
    L12:
        if (this.f5239d == 0) goto L14;
    L15:
        r8.print(r7);
        r8.print("mPopEnterAnim=#");
        r8.print(Integer.toHexString(this.f5239d));
        r8.print(" mPopExitAnim=#");
        r8.println(Integer.toHexString(this.f5240e));
    L17:
        if (this.f5244i == 0) goto L19;
    L20:
        r8.print(r7);
        r8.print("mBreadCrumbTitleRes=#");
        r8.print(Integer.toHexString(this.f5244i));
        r8.print(" mBreadCrumbTitleText=");
        r8.println(this.f5245j);
    L22:
        if (this.f5246k == 0) goto L24;
    L25:
        r8.print(r7);
        r8.print("mBreadCrumbShortTitleRes=#");
        r8.print(Integer.toHexString(this.f5246k));
        r8.print(" mBreadCrumbShortTitleText=");
        r8.println(this.f5247l);
        goto L26
    L24:
        if (this.f5247l == null) goto L26;
    L19:
        if (this.f5245j == null) goto L22;
    L14:
        if (this.f5240e == 0) goto L17;
    L9:
        if (this.f5238c == 0) goto L12;
    L26:
        ArrayList r0 = this.f5236a;
        if (r0.isEmpty() == true) goto L57;
        r8.print(r7);
        r8.println("Operations:");
        int r1 = r0.size();
        int r2 = 0;
    L29:
        if (r2 >= r1) goto L62;
        C0455Ki r3 = (C0455Ki) r0.get(r2);
        switch(r3.f1489a) {
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
        String r4 = "cmd=" + r3.f1489a;
    L44:
        r8.print(r7);
        r8.print("  Op #");
        r8.print(r2);
        r8.print(": ");
        r8.print(r4);
        r8.print(" ");
        r8.println(r3.f1490b);
        if (r9 == false) goto L56;
        if (r3.f1492d == 0) goto L49;
    L50:
        r8.print(r7);
        r8.print("enterAnim=#");
        r8.print(Integer.toHexString(r3.f1492d));
        r8.print(" exitAnim=#");
        r8.println(Integer.toHexString(r3.f1493e));
    L52:
        if (r3.f1494f == 0) goto L54;
    L55:
        r8.print(r7);
        r8.print("popEnterAnim=#");
        r8.print(Integer.toHexString(r3.f1494f));
        r8.print(" popExitAnim=#");
        r8.println(Integer.toHexString(r3.f1495g));
        goto L56
    L54:
        if (r3.f1495g == 0) goto L56;
    L49:
        if (r3.f1493e == 0) goto L52;
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

    /* JADX INFO: renamed from: g */
    public final void m2844g(AbstractComponentCallbacksC1503hi r4) {
        AbstractC2805zi r0 = r4.f5327r;
        if (r0 != null) goto L5;
    L9:
        m2839b(new C0455Ki(3, r4));
        return;
    L5:
        if (r0 == this.f5251p) goto L9;
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + r4.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: h */
    public final void m2845h(AbstractComponentCallbacksC1503hi r4, EnumC0675Pn r5) {
        AbstractC2805zi r0 = r4.f5327r;
        AbstractC2805zi r1 = this.f5251p;
        if (r0 != r1) goto L18;
        if (r5 != EnumC0675Pn.f2148b) goto L12;
        if (r4.f5310a <= (-1)) goto L12;
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + r5 + " after the Fragment has been created");
    L12:
        if (r5 == EnumC0675Pn.f2147a) goto L16;
        C0455Ki r02 = new C0455Ki();
        r02.f1489a = 10;
        r02.f1490b = r4;
        r02.f1491c = false;
        r02.f1496h = r4.f5303L;
        r02.f1497i = r5;
        m2839b(r02);
        return;
    L16:
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + r5 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    L18:
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + r1);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("BackStackEntry{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5253r < 0) goto L6;
        r0.append(" #");
        r0.append(this.f5253r);
    L6:
        if (this.f5243h == null) goto L8;
        r0.append(" ");
        r0.append(this.f5243h);
    L8:
        r0.append("}");
        return r0.toString();
    }
}
