package yyds;

import android.content.DialogInterface;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲁᛵᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2238 extends AbstractComponentCallbacksC2473 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC2738 f11041;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f11042;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f11043;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f11044;

    public DialogInterfaceOnCancelListenerC2238() {
        new RunnableC0871(4, this);
        this.f11041 = new DialogInterfaceOnDismissListenerC2738();
        this.f11042 = -1;
        new C0135(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f11044) {
            return;
        }
        if (C2791.m4906(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4238();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4238() {
        String str;
        if (this.f11043) {
            return;
        }
        this.f11043 = true;
        this.f11044 = true;
        if (this.f11042 >= 0) {
            C2791 c2791M4525 = m4525();
            int i = this.f11042;
            if (i < 0) {
                C0188.m798(AbstractC0897.m1989(i, "Bad id: "));
                return;
            }
            synchronized (((ArrayList) c2791M4525.f13647)) {
            }
            this.f11042 = -1;
            return;
        }
        C1764 c1764 = new C1764(m4525());
        C0277 c0277 = new C0277(3, this);
        c1764.f8854.add(c0277);
        c0277.f1489 = 0;
        c0277.f1491 = 0;
        c0277.f1486 = 0;
        c0277.f1490 = 0;
        C2791 c2791 = c1764.f8855;
        if (c1764.f8856) {
            C0188.m800("commit already called");
            return;
        }
        if (C2791.m4906(2)) {
            Log.v("FragmentManager", "Commit: " + c1764);
            PrintWriter printWriter = new PrintWriter(new C2511());
            ArrayList arrayList = c1764.f8854;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(c1764.f8857);
            printWriter.print(" mCommitted=");
            printWriter.println(c1764.f8856);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0277 c02772 = (C0277) arrayList.get(i2);
                    switch (c02772.f1487) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c02772.f1487;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c02772.f1488);
                    if (c02772.f1489 != 0 || c02772.f1491 != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c02772.f1489));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c02772.f1491));
                    }
                    if (c02772.f1486 != 0 || c02772.f1490 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c02772.f1486));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c02772.f1490));
                    }
                }
            }
            printWriter.close();
        }
        c1764.f8856 = true;
        c1764.f8857 = -1;
        synchronized (((ArrayList) c2791.f13647)) {
        }
    }
}
