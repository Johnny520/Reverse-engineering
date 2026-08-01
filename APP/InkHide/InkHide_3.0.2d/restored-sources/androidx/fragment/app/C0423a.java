package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0423a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1282a;

    /* JADX INFO: renamed from: b */
    public int f1283b;

    /* JADX INFO: renamed from: c */
    public int f1284c;

    /* JADX INFO: renamed from: d */
    public int f1285d;

    /* JADX INFO: renamed from: e */
    public int f1286e;

    /* JADX INFO: renamed from: f */
    public int f1287f;

    /* JADX INFO: renamed from: g */
    public boolean f1288g;

    /* JADX INFO: renamed from: h */
    public String f1289h;

    /* JADX INFO: renamed from: i */
    public int f1290i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1291j;

    /* JADX INFO: renamed from: k */
    public int f1292k;

    /* JADX INFO: renamed from: l */
    public CharSequence f1293l;

    /* JADX INFO: renamed from: m */
    public ArrayList f1294m;

    /* JADX INFO: renamed from: n */
    public ArrayList f1295n;

    /* JADX INFO: renamed from: o */
    public boolean f1296o;

    /* JADX INFO: renamed from: p */
    public final C0448z f1297p;

    /* JADX INFO: renamed from: q */
    public int f1298q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0423a(C0448z c0448z) {
        c0448z.m862B();
        C0437o c0437o = c0448z.f1443n;
        if (c0437o != null) {
            c0437o.f1395e.getClassLoader();
        }
        this.f1282a = new ArrayList();
        this.f1296o = false;
        this.f1298q = -1;
        this.f1297p = c0448z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m819a(int i2, AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l, String str) {
        Class<?> cls = abstractComponentCallbacksC0434l.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = abstractComponentCallbacksC0434l.f1388y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0434l + ": was " + abstractComponentCallbacksC0434l.f1388y + " now " + str);
            }
            abstractComponentCallbacksC0434l.f1388y = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0434l + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0434l.f1386w;
            if (i3 != 0 && i3 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0434l + ": was " + abstractComponentCallbacksC0434l.f1386w + " now " + i2);
            }
            abstractComponentCallbacksC0434l.f1386w = i2;
            abstractComponentCallbacksC0434l.f1387x = i2;
        }
        m820b(new C0416G(1, abstractComponentCallbacksC0434l));
        abstractComponentCallbacksC0434l.f1382s = this.f1297p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m820b(C0416G c0416g) {
        this.f1282a.add(c0416g);
        c0416g.f1260c = this.f1283b;
        c0416g.f1261d = this.f1284c;
        c0416g.f1262e = this.f1285d;
        c0416g.f1263f = this.f1286e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m821c(int i2) {
        if (this.f1288g) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f1282a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0416G c0416g = (C0416G) arrayList.get(i3);
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0416g.f1259b;
                if (abstractComponentCallbacksC0434l != null) {
                    abstractComponentCallbacksC0434l.f1381r += i2;
                    if (C0448z.m856E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0416g.f1259b + " to " + c0416g.f1259b.f1381r);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m822d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1289h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1298q);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f1287f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1287f));
            }
            if (this.f1283b != 0 || this.f1284c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1283b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1284c));
            }
            if (this.f1285d != 0 || this.f1286e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1285d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1286e));
            }
            if (this.f1290i != 0 || this.f1291j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1290i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1291j);
            }
            if (this.f1292k != 0 || this.f1293l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1292k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1293l);
            }
        }
        ArrayList arrayList = this.f1282a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0416G c0416g = (C0416G) arrayList.get(i2);
            switch (c0416g.f1258a) {
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
                    str2 = "cmd=" + c0416g.f1258a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0416g.f1259b);
            if (z2) {
                if (c0416g.f1260c != 0 || c0416g.f1261d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0416g.f1260c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0416g.f1261d));
                }
                if (c0416g.f1262e != 0 || c0416g.f1263f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0416g.f1262e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0416g.f1263f));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m823e(ArrayList arrayList, ArrayList arrayList2) {
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1288g) {
            C0448z c0448z = this.f1297p;
            if (c0448z.f1433d == null) {
                c0448z.f1433d = new ArrayList();
            }
            c0448z.f1433d.add(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1298q >= 0) {
            sb.append(" #");
            sb.append(this.f1298q);
        }
        if (this.f1289h != null) {
            sb.append(" ");
            sb.append(this.f1289h);
        }
        sb.append("}");
        return sb.toString();
    }
}
