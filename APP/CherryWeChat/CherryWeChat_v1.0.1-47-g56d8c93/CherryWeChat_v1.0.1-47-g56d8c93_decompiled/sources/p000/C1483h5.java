package p000;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import party.iroiro.luajava.luajit.LuaJitConsts;

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

    public C1483h5(AbstractC2805zi abstractC2805zi) {
        abstractC2805zi.m5382E();
        C2104ji c2104ji = abstractC2805zi.f9512u;
        if (c2104ji != null) {
            c2104ji.f7401m.getClassLoader();
        }
        this.f5236a = new ArrayList();
        this.f5250o = false;
        this.f5253r = -1;
        this.f5251p = abstractC2805zi;
    }

    @Override // p000.InterfaceC2719xi
    /* JADX INFO: renamed from: a */
    public final boolean mo2838a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC2805zi.m5374G(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5242g) {
            return true;
        }
        AbstractC2805zi abstractC2805zi = this.f5251p;
        if (abstractC2805zi.f9495d == null) {
            abstractC2805zi.f9495d = new ArrayList();
        }
        abstractC2805zi.f9495d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2839b(C0455Ki c0455Ki) {
        this.f5236a.add(c0455Ki);
        c0455Ki.f1492d = this.f5237b;
        c0455Ki.f1493e = this.f5238c;
        c0455Ki.f1494f = this.f5239d;
        c0455Ki.f1495g = this.f5240e;
    }

    /* JADX INFO: renamed from: c */
    public final void m2840c(int i) {
        if (this.f5242g) {
            if (AbstractC2805zi.m5374G(2)) {
                toString();
            }
            ArrayList arrayList = this.f5236a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0455Ki c0455Ki = (C0455Ki) arrayList.get(i2);
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0455Ki.f1490b;
                if (abstractComponentCallbacksC1503hi != null) {
                    abstractComponentCallbacksC1503hi.f5326q += i;
                    if (AbstractC2805zi.m5374G(2)) {
                        Objects.toString(c0455Ki.f1490b);
                        int i3 = c0455Ki.f1490b.f5326q;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2841d(boolean z) {
        if (this.f5252q) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC2805zi.m5374G(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C2068ip());
            m2843f("  ", printWriter, true);
            printWriter.close();
        }
        this.f5252q = true;
        boolean z2 = this.f5242g;
        AbstractC2805zi abstractC2805zi = this.f5251p;
        if (z2) {
            this.f5253r = abstractC2805zi.f9500i.getAndIncrement();
        } else {
            this.f5253r = -1;
        }
        abstractC2805zi.m5425w(this, z);
        return this.f5253r;
    }

    /* JADX INFO: renamed from: e */
    public final void m2842e(int i, AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, String str, int i2) {
        String str2 = abstractComponentCallbacksC1503hi.f5302K;
        if (str2 != null) {
            AbstractC0412Ji.m856c(abstractComponentCallbacksC1503hi, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1503hi.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC1503hi.f5333x;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC1503hi + ": was " + abstractComponentCallbacksC1503hi.f5333x + " now " + str);
            }
            abstractComponentCallbacksC1503hi.f5333x = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1503hi + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC1503hi.f5331v;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1503hi + ": was " + abstractComponentCallbacksC1503hi.f5331v + " now " + i);
            }
            abstractComponentCallbacksC1503hi.f5331v = i;
            abstractComponentCallbacksC1503hi.f5332w = i;
        }
        m2839b(new C0455Ki(i2, abstractComponentCallbacksC1503hi));
        abstractComponentCallbacksC1503hi.f5327r = this.f5251p;
    }

    /* JADX INFO: renamed from: f */
    public final void m2843f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5243h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5253r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5252q);
            if (this.f5241f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5241f));
            }
            if (this.f5237b != 0 || this.f5238c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5237b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5238c));
            }
            if (this.f5239d != 0 || this.f5240e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5239d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5240e));
            }
            if (this.f5244i != 0 || this.f5245j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5244i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5245j);
            }
            if (this.f5246k != 0 || this.f5247l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5246k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5247l);
            }
        }
        ArrayList arrayList = this.f5236a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0455Ki c0455Ki = (C0455Ki) arrayList.get(i);
            switch (c0455Ki.f1489a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0455Ki.f1489a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0455Ki.f1490b);
            if (z) {
                if (c0455Ki.f1492d != 0 || c0455Ki.f1493e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0455Ki.f1492d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0455Ki.f1493e));
                }
                if (c0455Ki.f1494f != 0 || c0455Ki.f1495g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0455Ki.f1494f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0455Ki.f1495g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2844g(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
        if (abstractC2805zi == null || abstractC2805zi == this.f5251p) {
            m2839b(new C0455Ki(3, abstractComponentCallbacksC1503hi));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1503hi.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: h */
    public final void m2845h(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, EnumC0675Pn enumC0675Pn) {
        AbstractC2805zi abstractC2805zi = abstractComponentCallbacksC1503hi.f5327r;
        AbstractC2805zi abstractC2805zi2 = this.f5251p;
        if (abstractC2805zi != abstractC2805zi2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC2805zi2);
        }
        if (enumC0675Pn == EnumC0675Pn.f2148b && abstractComponentCallbacksC1503hi.f5310a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0675Pn + " after the Fragment has been created");
        }
        if (enumC0675Pn == EnumC0675Pn.f2147a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0675Pn + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        C0455Ki c0455Ki = new C0455Ki();
        c0455Ki.f1489a = 10;
        c0455Ki.f1490b = abstractComponentCallbacksC1503hi;
        c0455Ki.f1491c = false;
        c0455Ki.f1496h = abstractComponentCallbacksC1503hi.f5303L;
        c0455Ki.f1497i = enumC0675Pn;
        m2839b(c0455Ki);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5253r >= 0) {
            sb.append(" #");
            sb.append(this.f5253r);
        }
        if (this.f5243h != null) {
            sb.append(" ");
            sb.append(this.f5243h);
        }
        sb.append("}");
        return sb.toString();
    }
}
