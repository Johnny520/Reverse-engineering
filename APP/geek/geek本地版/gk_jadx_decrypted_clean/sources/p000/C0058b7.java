package p000;

import android.util.Log;
import com.github.megatronking.stringfog.Base64;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058b7 implements InterfaceC0860wl {

    /* JADX INFO: renamed from: a */
    public final ArrayList f756a;

    /* JADX INFO: renamed from: b */
    public int f757b;

    /* JADX INFO: renamed from: c */
    public int f758c;

    /* JADX INFO: renamed from: d */
    public int f759d;

    /* JADX INFO: renamed from: e */
    public int f760e;

    /* JADX INFO: renamed from: f */
    public int f761f;

    /* JADX INFO: renamed from: g */
    public boolean f762g;

    /* JADX INFO: renamed from: h */
    public String f763h;

    /* JADX INFO: renamed from: i */
    public int f764i;

    /* JADX INFO: renamed from: j */
    public CharSequence f765j;

    /* JADX INFO: renamed from: k */
    public int f766k;

    /* JADX INFO: renamed from: l */
    public CharSequence f767l;

    /* JADX INFO: renamed from: m */
    public ArrayList f768m;

    /* JADX INFO: renamed from: n */
    public ArrayList f769n;

    /* JADX INFO: renamed from: o */
    public boolean f770o;

    /* JADX INFO: renamed from: p */
    public final C0934yl f771p;

    /* JADX INFO: renamed from: q */
    public boolean f772q;

    /* JADX INFO: renamed from: r */
    public int f773r;

    public C0058b7(C0934yl c0934yl) {
        c0934yl.m2732x();
        C0526nl c0526nl = c0934yl.f5365n;
        if (c0526nl != null) {
            c0526nl.f3428D.getClassLoader();
        }
        this.f756a = new ArrayList();
        this.f770o = false;
        this.f773r = -1;
        this.f771p = c0934yl;
    }

    @Override // p000.InterfaceC0860wl
    /* JADX INFO: renamed from: a */
    public final boolean mo535a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f762g) {
            return true;
        }
        C0934yl c0934yl = this.f771p;
        if (c0934yl.f5355d == null) {
            c0934yl.f5355d = new ArrayList();
        }
        c0934yl.f5355d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m536b(C0192em c0192em) {
        this.f756a.add(c0192em);
        c0192em.f1819c = this.f757b;
        c0192em.f1820d = this.f758c;
        c0192em.f1821e = this.f759d;
        c0192em.f1822f = this.f760e;
    }

    /* JADX INFO: renamed from: c */
    public final void m537c(int i) {
        if (this.f762g) {
            if (C0934yl.m2689A(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f756a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0192em c0192em = (C0192em) arrayList.get(i2);
                AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0192em.f1818b;
                if (abstractComponentCallbacksC0489ml != null) {
                    abstractComponentCallbacksC0489ml.f3257q += i;
                    if (C0934yl.m2689A(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0192em.f1818b + " to " + c0192em.f1818b.f3257q);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m538d(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f763h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f773r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f772q);
            if (this.f761f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f761f));
            }
            if (this.f757b != 0 || this.f758c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f757b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f758c));
            }
            if (this.f759d != 0 || this.f760e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f759d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f760e));
            }
            if (this.f764i != 0 || this.f765j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f764i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f765j);
            }
            if (this.f766k != 0 || this.f767l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f766k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f767l);
            }
        }
        ArrayList arrayList = this.f756a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0192em c0192em = (C0192em) arrayList.get(i);
            switch (c0192em.f1817a) {
                case Base64.DEFAULT /* 0 */:
                    str2 = "NULL";
                    break;
                case Base64.NO_PADDING /* 1 */:
                    str2 = "ADD";
                    break;
                case Base64.NO_WRAP /* 2 */:
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
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0192em.f1817a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0192em.f1818b);
            if (z) {
                if (c0192em.f1819c != 0 || c0192em.f1820d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0192em.f1819c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0192em.f1820d));
                }
                if (c0192em.f1821e != 0 || c0192em.f1822f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0192em.f1821e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0192em.f1822f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f773r >= 0) {
            sb.append(" #");
            sb.append(this.f773r);
        }
        if (this.f763h != null) {
            sb.append(" ");
            sb.append(this.f763h);
        }
        sb.append("}");
        return sb.toString();
    }
}
