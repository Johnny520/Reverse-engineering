package p000a;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.AbstractC0553e7;
import p000a.AbstractC0762p7;
import p000a.ActivityC0422X6;

/* JADX INFO: renamed from: a.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0327S1 extends AbstractC0762p7 implements AbstractC0553e7.i {

    /* JADX INFO: renamed from: q */
    public final AbstractC0553e7 f1161q;

    /* JADX INFO: renamed from: r */
    public boolean f1162r;

    /* JADX INFO: renamed from: s */
    public int f1163s;

    public C0327S1(AbstractC0553e7 abstractC0553e7) {
        abstractC0553e7.m1340G();
        ActivityC0422X6.a aVar = abstractC0553e7.f2079v;
        if (aVar != null) {
            aVar.f1723b.getClassLoader();
        }
        this.f3000a = new ArrayList<>();
        this.f3014o = false;
        this.f1163s = -1;
        this.f1161q = abstractC0553e7;
    }

    @Override // p000a.AbstractC0553e7.i
    /* JADX INFO: renamed from: a */
    public final boolean mo902a(ArrayList<C0327S1> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3006g) {
            return true;
        }
        this.f1161q.f2061d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m903c(int i) {
        if (this.f3006g) {
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<AbstractC0762p7.a> arrayList = this.f3000a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0762p7.a aVar = arrayList.get(i2);
                ComponentCallbacksC1100b componentCallbacksC1100b = aVar.f3017b;
                if (componentCallbacksC1100b != null) {
                    componentCallbacksC1100b.f4575s += i;
                    if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3017b + " to " + aVar.f3017b.f4575s);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m904d(boolean z) {
        if (this.f1162r) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0228M9());
            m906f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1162r = true;
        boolean z2 = this.f3006g;
        AbstractC0553e7 abstractC0553e7 = this.f1161q;
        if (z2) {
            this.f1163s = abstractC0553e7.f2067j.getAndIncrement();
        } else {
            this.f1163s = -1;
        }
        abstractC0553e7.m1384x(this, z);
        return this.f1163s;
    }

    /* JADX INFO: renamed from: e */
    public final void m905e(int i, ComponentCallbacksC1100b componentCallbacksC1100b, String str, int i2) {
        String str2 = componentCallbacksC1100b.f4549M;
        if (str2 != null) {
            C0743o7.m1764c(componentCallbacksC1100b, str2);
        }
        Class<?> cls = componentCallbacksC1100b.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC1100b.f4582z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC1100b + ": was " + componentCallbacksC1100b.f4582z + " now " + str);
            }
            componentCallbacksC1100b.f4582z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC1100b + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC1100b.f4580x;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC1100b + ": was " + componentCallbacksC1100b.f4580x + " now " + i);
            }
            componentCallbacksC1100b.f4580x = i;
            componentCallbacksC1100b.f4581y = i;
        }
        m1801b(new AbstractC0762p7.a(i2, componentCallbacksC1100b));
        componentCallbacksC1100b.f4576t = this.f1161q;
    }

    /* JADX INFO: renamed from: f */
    public final void m906f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3007h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1163s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1162r);
            if (this.f3005f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3005f));
            }
            if (this.f3001b != 0 || this.f3002c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3001b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3002c));
            }
            if (this.f3003d != 0 || this.f3004e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3003d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3004e));
            }
            if (this.f3008i != 0 || this.f3009j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3008i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3009j);
            }
            if (this.f3010k != 0 || this.f3011l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3010k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3011l);
            }
        }
        ArrayList<AbstractC0762p7.a> arrayList = this.f3000a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0762p7.a aVar = arrayList.get(i);
            switch (aVar.f3016a) {
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
                    str2 = "cmd=" + aVar.f3016a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3017b);
            if (z) {
                if (aVar.f3019d != 0 || aVar.f3020e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3019d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3020e));
                }
                if (aVar.f3021f != 0 || aVar.f3022g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3021f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3022g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1163s >= 0) {
            sb.append(" #");
            sb.append(this.f1163s);
        }
        if (this.f3007h != null) {
            sb.append(" ");
            sb.append(this.f3007h);
        }
        sb.append("}");
        return sb.toString();
    }
}
