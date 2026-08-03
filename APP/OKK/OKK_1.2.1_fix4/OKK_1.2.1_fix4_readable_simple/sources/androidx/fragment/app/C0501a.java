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

    public C0501a(C0509i r2) {
        this.f1412a = 0;
        r2.getClass();
        this.f1415d = new ArrayList();
        this.f1413b = -1;
        this.f1416e = r2;
    }

    /* JADX INFO: renamed from: a */
    public void m1224a(C0510j r2) {
        ((ArrayList) this.f1415d).add(r2);
        r2.f1442c = 0;
        r2.f1443d = 0;
        r2.f1444e = 0;
        r2.f1445f = 0;
    }

    /* JADX INFO: renamed from: b */
    public int m1225b(boolean r4) {
        if (this.f1414c == true) goto L24;
        if (Log.isLoggable("FragmentManager", 2) == false) goto L7;
        toString();
        PrintWriter r2 = new PrintWriter(new C0511k());
        m1227d("  ", r2, true);
        r2.close();
    L7:
        this.f1414c = true;
        C0509i r02 = (C0509i) this.f1416e;
        this.f1413b = -1;
        if (r4 == false) goto L21;
        ArrayList r1 = r02.f1435a;
        monitor-enter(r1);
        if (r4 == false) goto L18;
        monitor-exit(r1);     // Catch: Throwable -> L15
        return this.f1413b;
    L18:
        throw new IllegalStateException("Activity has been destroyed");     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L21:
        r02.getClass();
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L24:
        throw new IllegalStateException("commit already called");
    }

    /* JADX INFO: renamed from: c */
    public void m1226c(int r5) {
        Object r1 = this.f1415d;
        Object r2 = this.f1416e;
        switch(this.f1412a) {
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r22 = (SideSheetBehavior) r2;
        WeakReference r3 = r22.f2424p;
        if (r3 != null) goto L7;
        return;
    L7:
        if (r3.get() == null) goto L24;
        this.f1413b = r5;
        if (this.f1414c == true) goto L23;
        View r52 = (View) r22.f2424p.get();
        Field r23 = AbstractC0080Q.f219a;
        r52.postOnAnimation((RunnableC0028d) r1);
        this.f1414c = true;
        return;
    L23:
        return;
    L24:
        return;
    L13:
        BottomSheetBehavior r24 = (BottomSheetBehavior) r2;
        WeakReference r32 = r24.f2301U;
        if (r32 != null) goto L16;
        return;
    L16:
        if (r32.get() == null) goto L27;
        this.f1413b = r5;
        if (this.f1414c == true) goto L26;
        View r53 = (View) r24.f2301U.get();
        Field r25 = AbstractC0080Q.f219a;
        r53.postOnAnimation((RunnableC0019E) r1);
        this.f1414c = true;
        return;
    L26:
        return;
    }

    /* JADX INFO: renamed from: d */
    public void m1227d(String r7, PrintWriter r8, boolean r9) {
        if (r9 == false) goto L4;
        r8.print(r7);
        r8.print("mName=");
        r8.print(null);
        r8.print(" mIndex=");
        r8.print(this.f1413b);
        r8.print(" mCommitted=");
        r8.println(this.f1414c);
    L4:
        ArrayList r02 = (ArrayList) this.f1415d;
        if (r02.isEmpty() == true) goto L35;
        r8.print(r7);
        r8.println("Operations:");
        int r1 = r02.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L40;
        C0510j r3 = (C0510j) r02.get(r2);
        switch(r3.f1440a) {
            case 0: goto L21;
            case 1: goto L20;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L17;
            case 5: goto L16;
            case 6: goto L15;
            case 7: goto L14;
            case 8: goto L13;
            case 9: goto L12;
            case 10: goto L11;
            default: goto L10;
        };
    L10:
        String r4 = "cmd=" + r3.f1440a;
    L22:
        r8.print(r7);
        r8.print("  Op #");
        r8.print(r2);
        r8.print(": ");
        r8.print(r4);
        r8.print(" ");
        r8.println(r3.f1441b);
        if (r9 == false) goto L34;
        if (r3.f1442c == 0) goto L27;
    L28:
        r8.print(r7);
        r8.print("enterAnim=#");
        r8.print(Integer.toHexString(r3.f1442c));
        r8.print(" exitAnim=#");
        r8.println(Integer.toHexString(r3.f1443d));
    L30:
        if (r3.f1444e == 0) goto L32;
    L33:
        r8.print(r7);
        r8.print("popEnterAnim=#");
        r8.print(Integer.toHexString(r3.f1444e));
        r8.print(" popExitAnim=#");
        r8.println(Integer.toHexString(r3.f1445f));
        goto L34
    L32:
        if (r3.f1445f == 0) goto L34;
    L27:
        if (r3.f1443d == 0) goto L30;
    L34:
        r2 = r2 + 1;
        goto L7
    L11:
        r4 = "OP_SET_MAX_LIFECYCLE";
        goto L22
    L12:
        r4 = "UNSET_PRIMARY_NAV";
        goto L22
    L13:
        r4 = "SET_PRIMARY_NAV";
        goto L22
    L14:
        r4 = "ATTACH";
        goto L22
    L15:
        r4 = "DETACH";
        goto L22
    L16:
        r4 = "SHOW";
        goto L22
    L17:
        r4 = "HIDE";
        goto L22
    L18:
        r4 = "REMOVE";
        goto L22
    L19:
        r4 = "REPLACE";
        goto L22
    L20:
        r4 = "ADD";
        goto L22
    L21:
        r4 = "NULL";
        goto L22
    L40:
        return;
    }

    public String toString() {
        switch(this.f1412a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r02 = new StringBuilder(128);
        r02.append("BackStackEntry{");
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1413b < 0) goto L9;
        r02.append(" #");
        r02.append(this.f1413b);
    L9:
        r02.append("}");
        return r02.toString();
    L5:
        return super.toString();
    }

    public C0501a(SideSheetBehavior r2) {
        this.f1412a = 2;
        this.f1416e = r2;
        this.f1415d = new RunnableC0028d(12, this);
    }

    public C0501a(BottomSheetBehavior r2) {
        this.f1412a = 1;
        this.f1416e = r2;
        this.f1415d = new RunnableC0019E(11, this);
    }
}
