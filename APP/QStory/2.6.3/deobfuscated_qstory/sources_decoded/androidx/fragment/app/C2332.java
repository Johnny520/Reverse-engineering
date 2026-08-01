package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p156.AbstractC7622;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 implements InterfaceC2311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f6844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f6847;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6848;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ArrayList f6849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public CharSequence f6850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2313 f6851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f6852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList f6853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f6854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f6855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f6857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f6858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f6859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f6860;

    public C2332(AbstractC2313 abstractC2313) {
        abstractC2313.m4383();
        C2319 c2319 = abstractC2313.f6791;
        if (c2319 != null) {
            c2319.f6816.getClassLoader();
        }
        this.f6847 = new ArrayList();
        this.f6855 = true;
        this.f6854 = false;
        this.f6848 = -1;
        this.f6851 = abstractC2313;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6848 >= 0) {
            sb.append(" #");
            sb.append(this.f6848);
        }
        if (this.f6859 != null) {
            sb.append(" ");
            sb.append(this.f6859);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4426(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6859);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6848);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6852);
            if (this.f6842 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6842));
            }
            if (this.f6846 != 0 || this.f6845 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6846));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6845));
            }
            if (this.f6844 != 0 || this.f6843 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6844));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6843));
            }
            if (this.f6860 != 0 || this.f6857 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6860));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6857);
            }
            if (this.f6858 != 0 || this.f6850 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6858));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6850);
            }
        }
        ArrayList arrayList = this.f6847;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2356 c2356 = (C2356) arrayList.get(i);
            switch (c2356.f6974) {
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
                    str2 = "cmd=" + c2356.f6974;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c2356.f6973);
            if (z) {
                if (c2356.f6971 != 0 || c2356.f6970 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c2356.f6971));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c2356.f6970));
                }
                if (c2356.f6969 != 0 || c2356.f6976 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c2356.f6969));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c2356.f6976));
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4427(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str, int i2) {
        String str2 = abstractComponentCallbacksC2338.f6921;
        if (str2 != null) {
            AbstractC7622.m12854(abstractComponentCallbacksC2338, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2338.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            C2308.m4354(cls.getCanonicalName(), "Fragment ", " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2338.f6888;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC2338);
                String str4 = abstractComponentCallbacksC2338.f6888;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC2338.f6888 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2338 + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC2338.f6886;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC2338);
                int i4 = abstractComponentCallbacksC2338.f6886;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC2338.f6886 = i;
            abstractComponentCallbacksC2338.f6885 = i;
        }
        m4430(new C2356(i2, abstractComponentCallbacksC2338));
        abstractComponentCallbacksC2338.f6898 = this.f6851;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4428(boolean z) {
        if (this.f6852) {
            C5925.m11311("commit already called");
            return 0;
        }
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2359());
            m4426(printWriter, "  ", true);
            printWriter.close();
        }
        this.f6852 = true;
        boolean z2 = this.f6856;
        AbstractC2313 abstractC2313 = this.f6851;
        if (z2) {
            this.f6848 = abstractC2313.f6803.getAndIncrement();
        } else {
            this.f6848 = -1;
        }
        abstractC2313.m4392(this, z);
        return this.f6848;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4429(int i) {
        if (this.f6856) {
            if (AbstractC2313.m4362(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f6847;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2356 c2356 = (C2356) arrayList.get(i2);
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2356.f6973;
                if (abstractComponentCallbacksC2338 != null) {
                    abstractComponentCallbacksC2338.f6899 += i;
                    if (AbstractC2313.m4362(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c2356.f6973 + " to " + c2356.f6973.f6899);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4430(C2356 c2356) {
        this.f6847.add(c2356);
        c2356.f6971 = this.f6846;
        c2356.f6970 = this.f6845;
        c2356.f6969 = this.f6844;
        c2356.f6976 = this.f6843;
    }

    @Override // androidx.fragment.app.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4358(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC2313.m4362(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6856) {
            return true;
        }
        AbstractC2313 abstractC2313 = this.f6851;
        if (abstractC2313.f6783 == null) {
            abstractC2313.f6783 = new ArrayList();
        }
        abstractC2313.f6783.add(this);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4431(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str) {
        if (i != 0) {
            m4427(i, abstractComponentCallbacksC2338, str, 2);
        } else {
            C5925.m11310("Must use non-zero containerViewId");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4432(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6898;
        if (abstractC2313 == null || abstractC2313 == this.f6851) {
            m4430(new C2356(3, abstractComponentCallbacksC2338));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2338.toString() + " is already attached to a FragmentManager.");
    }
}
