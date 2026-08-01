package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p172.AbstractC8451;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3165 implements InterfaceC3144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7192;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f7193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ArrayList f7194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public CharSequence f7195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3146 f7196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList f7198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f7199;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7200;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7201;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public CharSequence f7202;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7203;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f7204;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f7205;

    public C3165(AbstractC3146 abstractC3146) {
        abstractC3146.m4943();
        C3152 c3152 = abstractC3146.f7136;
        if (c3152 != null) {
            c3152.f7161.getClassLoader();
        }
        this.f7192 = new ArrayList();
        this.f7200 = true;
        this.f7199 = false;
        this.f7193 = -1;
        this.f7196 = abstractC3146;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7193 >= 0) {
            sb.append(" #");
            sb.append(this.f7193);
        }
        if (this.f7204 != null) {
            sb.append(" ");
            sb.append(this.f7204);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4986(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7204);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7193);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7197);
            if (this.f7187 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7187));
            }
            if (this.f7191 != 0 || this.f7190 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7191));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7190));
            }
            if (this.f7189 != 0 || this.f7188 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7189));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7188));
            }
            if (this.f7205 != 0 || this.f7202 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7205));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7202);
            }
            if (this.f7203 != 0 || this.f7195 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7203));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7195);
            }
        }
        ArrayList arrayList = this.f7192;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3189 c3189 = (C3189) arrayList.get(i);
            switch (c3189.f7319) {
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
                    str2 = "cmd=" + c3189.f7319;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c3189.f7318);
            if (z) {
                if (c3189.f7316 != 0 || c3189.f7315 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c3189.f7316));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c3189.f7315));
                }
                if (c3189.f7314 != 0 || c3189.f7321 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c3189.f7314));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c3189.f7321));
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4987(int i, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, String str, int i2) {
        String str2 = abstractComponentCallbacksC3171.f7266;
        if (str2 != null) {
            AbstractC8451.m13413(abstractComponentCallbacksC3171, str2);
        }
        Class<?> cls = abstractComponentCallbacksC3171.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            C3141.m4914(cls.getCanonicalName(), "Fragment ", " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC3171.f7233;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC3171);
                String str4 = abstractComponentCallbacksC3171.f7233;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC3171.f7233 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC3171 + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC3171.f7231;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC3171);
                int i4 = abstractComponentCallbacksC3171.f7231;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC3171.f7231 = i;
            abstractComponentCallbacksC3171.f7230 = i;
        }
        m4990(new C3189(i2, abstractComponentCallbacksC3171));
        abstractComponentCallbacksC3171.f7243 = this.f7196;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4988(boolean z) {
        if (this.f7197) {
            C6755.m11870("commit already called");
            return 0;
        }
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C3192());
            m4986(printWriter, "  ", true);
            printWriter.close();
        }
        this.f7197 = true;
        boolean z2 = this.f7201;
        AbstractC3146 abstractC3146 = this.f7196;
        if (z2) {
            this.f7193 = abstractC3146.f7148.getAndIncrement();
        } else {
            this.f7193 = -1;
        }
        abstractC3146.m4952(this, z);
        return this.f7193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4989(int i) {
        if (this.f7201) {
            if (AbstractC3146.m4922(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f7192;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3189 c3189 = (C3189) arrayList.get(i2);
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3189.f7318;
                if (abstractComponentCallbacksC3171 != null) {
                    abstractComponentCallbacksC3171.f7244 += i;
                    if (AbstractC3146.m4922(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c3189.f7318 + " to " + c3189.f7318.f7244);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4990(C3189 c3189) {
        this.f7192.add(c3189);
        c3189.f7316 = this.f7191;
        c3189.f7315 = this.f7190;
        c3189.f7314 = this.f7189;
        c3189.f7321 = this.f7188;
    }

    @Override // androidx.fragment.app.InterfaceC3144
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4918(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC3146.m4922(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7201) {
            return true;
        }
        AbstractC3146 abstractC3146 = this.f7196;
        if (abstractC3146.f7128 == null) {
            abstractC3146.f7128 = new ArrayList();
        }
        abstractC3146.f7128.add(this);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4991(int i, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, String str) {
        if (i != 0) {
            m4987(i, abstractComponentCallbacksC3171, str, 2);
        } else {
            C6755.m11869("Must use non-zero containerViewId");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4992(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        AbstractC3146 abstractC3146 = abstractComponentCallbacksC3171.f7243;
        if (abstractC3146 == null || abstractC3146 == this.f7196) {
            m4990(new C3189(3, abstractComponentCallbacksC3171));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC3171.toString() + " is already attached to a FragmentManager.");
    }
}
