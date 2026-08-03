package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p001A0.RunnableC0019E;
import p001A0.RunnableC0028d;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0501a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1412a;

    /* JADX INFO: renamed from: b */
    public int f1413b;

    /* JADX INFO: renamed from: c */
    public boolean f1414c;

    /* JADX INFO: renamed from: d */
    public final Object f1415d;

    /* JADX INFO: renamed from: e */
    public final Object f1416e;

    public C0501a(C0509i c0509i) {
        this.f1412a = 0;
        c0509i.getClass();
        this.f1415d = new ArrayList();
        this.f1413b = -1;
        this.f1416e = c0509i;
    }

    /* JADX INFO: renamed from: a */
    public void m1224a(C0510j c0510j) {
        ((ArrayList) this.f1415d).add(c0510j);
        c0510j.f1442c = 0;
        c0510j.f1443d = 0;
        c0510j.f1444e = 0;
        c0510j.f1445f = 0;
    }

    /* JADX INFO: renamed from: b */
    public int m1225b(boolean z2) {
        if (this.f1414c) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C0511k());
            m1227d("  ", printWriter, true);
            printWriter.close();
        }
        this.f1414c = true;
        C0509i c0509i = (C0509i) this.f1416e;
        this.f1413b = -1;
        if (!z2) {
            c0509i.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (c0509i.f1435a) {
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f1413b;
    }

    /* JADX INFO: renamed from: c */
    public void m1226c(int i2) {
        Object obj = this.f1415d;
        Object obj2 = this.f1416e;
        switch (this.f1412a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f2301U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1413b = i2;
                    if (!this.f1414c) {
                        View view = (View) bottomSheetBehavior.f2301U.get();
                        Field field = AbstractC0080Q.f219a;
                        view.postOnAnimation((RunnableC0019E) obj);
                        this.f1414c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f2424p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1413b = i2;
                    if (!this.f1414c) {
                        View view2 = (View) sideSheetBehavior.f2424p.get();
                        Field field2 = AbstractC0080Q.f219a;
                        view2.postOnAnimation((RunnableC0028d) obj);
                        this.f1414c = true;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1227d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1413b);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1414c);
        }
        ArrayList arrayList = (ArrayList) this.f1415d;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0510j c0510j = (C0510j) arrayList.get(i2);
            switch (c0510j.f1440a) {
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
                    str2 = "cmd=" + c0510j.f1440a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0510j.f1441b);
            if (z2) {
                if (c0510j.f1442c != 0 || c0510j.f1443d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0510j.f1442c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0510j.f1443d));
                }
                if (c0510j.f1444e != 0 || c0510j.f1445f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0510j.f1444e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0510j.f1445f));
                }
            }
        }
    }

    public String toString() {
        switch (this.f1412a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1413b >= 0) {
                    sb.append(" #");
                    sb.append(this.f1413b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0501a(SideSheetBehavior sideSheetBehavior) {
        this.f1412a = 2;
        this.f1416e = sideSheetBehavior;
        this.f1415d = new RunnableC0028d(12, this);
    }

    public C0501a(BottomSheetBehavior bottomSheetBehavior) {
        this.f1412a = 1;
        this.f1416e = bottomSheetBehavior;
        this.f1415d = new RunnableC0019E(11, this);
    }
}
