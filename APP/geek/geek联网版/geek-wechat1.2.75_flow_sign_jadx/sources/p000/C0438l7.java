package p000;

import android.util.Log;
import com.github.megatronking.stringfog.Base64;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438l7 implements InterfaceC0934yl {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2947a;

    /* JADX INFO: renamed from: b */
    public int f2948b;

    /* JADX INFO: renamed from: c */
    public int f2949c;

    /* JADX INFO: renamed from: d */
    public int f2950d;

    /* JADX INFO: renamed from: e */
    public int f2951e;

    /* JADX INFO: renamed from: f */
    public int f2952f;

    /* JADX INFO: renamed from: g */
    public boolean f2953g;

    /* JADX INFO: renamed from: h */
    public String f2954h;

    /* JADX INFO: renamed from: i */
    public int f2955i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2956j;

    /* JADX INFO: renamed from: k */
    public int f2957k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2958l;

    /* JADX INFO: renamed from: m */
    public ArrayList f2959m;

    /* JADX INFO: renamed from: n */
    public ArrayList f2960n;

    /* JADX INFO: renamed from: o */
    public boolean f2961o;

    /* JADX INFO: renamed from: p */
    public final C0023am f2962p;

    /* JADX INFO: renamed from: q */
    public boolean f2963q;

    /* JADX INFO: renamed from: r */
    public int f2964r;

    public C0438l7(C0023am c0023am) {
        c0023am.m98x();
        C0600pl c0600pl = c0023am.f107n;
        if (c0600pl != null) {
            c0600pl.f3728z.getClassLoader();
        }
        this.f2947a = new ArrayList();
        this.f2961o = false;
        this.f2964r = -1;
        this.f2962p = c0023am;
    }

    @Override // p000.InterfaceC0934yl
    /* JADX INFO: renamed from: a */
    public final boolean mo1745a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2953g) {
            return true;
        }
        C0023am c0023am = this.f2962p;
        if (c0023am.f97d == null) {
            c0023am.f97d = new ArrayList();
        }
        c0023am.f97d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1746b(C0266gm c0266gm) {
        this.f2947a.add(c0266gm);
        c0266gm.f2030c = this.f2948b;
        c0266gm.f2031d = this.f2949c;
        c0266gm.f2032e = this.f2950d;
        c0266gm.f2033f = this.f2951e;
    }

    /* JADX INFO: renamed from: c */
    public final void m1747c(int i) {
        if (this.f2953g) {
            if (C0023am.m55A(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f2947a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0266gm c0266gm = (C0266gm) arrayList.get(i2);
                AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0266gm.f2029b;
                if (abstractComponentCallbacksC0563ol != null) {
                    abstractComponentCallbacksC0563ol.f3502q += i;
                    if (C0023am.m55A(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0266gm.f2029b + " to " + c0266gm.f2029b.f3502q);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1748d(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2954h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2964r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2963q);
            if (this.f2952f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2952f));
            }
            if (this.f2948b != 0 || this.f2949c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2948b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2949c));
            }
            if (this.f2950d != 0 || this.f2951e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2950d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2951e));
            }
            if (this.f2955i != 0 || this.f2956j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2955i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2956j);
            }
            if (this.f2957k != 0 || this.f2958l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2957k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2958l);
            }
        }
        ArrayList arrayList = this.f2947a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0266gm c0266gm = (C0266gm) arrayList.get(i);
            switch (c0266gm.f2028a) {
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
                    str2 = "cmd=" + c0266gm.f2028a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0266gm.f2029b);
            if (z) {
                if (c0266gm.f2030c != 0 || c0266gm.f2031d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0266gm.f2030c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0266gm.f2031d));
                }
                if (c0266gm.f2032e != 0 || c0266gm.f2033f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0266gm.f2032e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0266gm.f2033f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2964r >= 0) {
            sb.append(" #");
            sb.append(this.f2964r);
        }
        if (this.f2954h != null) {
            sb.append(" ");
            sb.append(this.f2954h);
        }
        sb.append("}");
        return sb.toString();
    }
}
