package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p156.AbstractC7621;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 implements InterfaceC2311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f6843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f6846;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ArrayList f6848;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public CharSequence f6849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2313 f6850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f6851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList f6852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f6853;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f6854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f6856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f6857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f6858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f6859;

    public C2332(AbstractC2313 abstractC2313) {
        abstractC2313.m4373();
        C2319 c2319 = abstractC2313.f6790;
        if (c2319 != null) {
            c2319.f6819.getClassLoader();
        }
        this.f6846 = new ArrayList();
        this.f6854 = true;
        this.f6853 = false;
        this.f6847 = -1;
        this.f6850 = abstractC2313;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6847 >= 0) {
            sb.append(" #");
            sb.append(this.f6847);
        }
        if (this.f6858 != null) {
            sb.append(" ");
            sb.append(this.f6858);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4416(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6858);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6847);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6851);
            if (this.f6841 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6841));
            }
            if (this.f6845 != 0 || this.f6844 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6845));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6844));
            }
            if (this.f6843 != 0 || this.f6842 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6843));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6842));
            }
            if (this.f6859 != 0 || this.f6856 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6859));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6856);
            }
            if (this.f6857 != 0 || this.f6849 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6857));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6849);
            }
        }
        ArrayList arrayList = this.f6846;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2356 c2356 = (C2356) arrayList.get(i);
            switch (c2356.f6973) {
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
                    str2 = "cmd=" + c2356.f6973;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c2356.f6972);
            if (z) {
                if (c2356.f6970 != 0 || c2356.f6969 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c2356.f6970));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c2356.f6969));
                }
                if (c2356.f6968 != 0 || c2356.f6975 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c2356.f6968));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c2356.f6975));
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4417(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str, int i2) {
        String str2 = abstractComponentCallbacksC2338.f6920;
        if (str2 != null) {
            AbstractC7621.m12825(abstractComponentCallbacksC2338, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2338.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            C2308.m4344(cls.getCanonicalName(), "Fragment ", " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2338.f6887;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC2338);
                String str4 = abstractComponentCallbacksC2338.f6887;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC2338.f6887 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2338 + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC2338.f6885;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC2338);
                int i4 = abstractComponentCallbacksC2338.f6885;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC2338.f6885 = i;
            abstractComponentCallbacksC2338.f6884 = i;
        }
        m4420(new C2356(i2, abstractComponentCallbacksC2338));
        abstractComponentCallbacksC2338.f6897 = this.f6850;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4418(boolean z) {
        if (this.f6851) {
            C5919.m11250("commit already called");
            return 0;
        }
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2359());
            m4416(printWriter, "  ", true);
            printWriter.close();
        }
        this.f6851 = true;
        boolean z2 = this.f6855;
        AbstractC2313 abstractC2313 = this.f6850;
        if (z2) {
            this.f6847 = abstractC2313.f6802.getAndIncrement();
        } else {
            this.f6847 = -1;
        }
        abstractC2313.m4382(this, z);
        return this.f6847;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4419(int i) {
        if (this.f6855) {
            if (AbstractC2313.m4352(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f6846;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2356 c2356 = (C2356) arrayList.get(i2);
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2356.f6972;
                if (abstractComponentCallbacksC2338 != null) {
                    abstractComponentCallbacksC2338.f6898 += i;
                    if (AbstractC2313.m4352(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c2356.f6972 + " to " + c2356.f6972.f6898);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4420(C2356 c2356) {
        this.f6846.add(c2356);
        c2356.f6970 = this.f6845;
        c2356.f6969 = this.f6844;
        c2356.f6968 = this.f6843;
        c2356.f6975 = this.f6842;
    }

    @Override // androidx.fragment.app.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4348(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC2313.m4352(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6855) {
            return true;
        }
        AbstractC2313 abstractC2313 = this.f6850;
        if (abstractC2313.f6782 == null) {
            abstractC2313.f6782 = new ArrayList();
        }
        abstractC2313.f6782.add(this);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4421(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, String str) {
        if (i != 0) {
            m4417(i, abstractComponentCallbacksC2338, str, 2);
        } else {
            C5919.m11249("Must use non-zero containerViewId");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4422(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        AbstractC2313 abstractC2313 = abstractComponentCallbacksC2338.f6897;
        if (abstractC2313 == null || abstractC2313 == this.f6850) {
            m4420(new C2356(3, abstractComponentCallbacksC2338));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2338.toString() + " is already attached to a FragmentManager.");
    }
}
