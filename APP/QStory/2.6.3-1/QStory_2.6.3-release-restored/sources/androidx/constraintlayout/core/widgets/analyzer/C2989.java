package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0900;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p025.AbstractC7012;
import p219.AbstractC8716;
import p219.C8707;
import p219.C8708;
import p222.C8740;
import p321.C9452;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int f6714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f6716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f6719;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6717;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM707 = AbstractC0900.m707(sb, "] <", this.f6718);
        for (C8708 c8708 : this.f6719) {
            StringBuilder sbM12143 = AbstractC7012.m12143(strM707, " ");
            sbM12143.append(c8708.f22096);
            strM707 = sbM12143.toString();
        }
        return strM707.concat(" >");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4465(int i, C2989 c2989) {
        int i2 = c2989.f6718;
        for (C8708 c8708 : this.f6719) {
            ArrayList arrayList = c2989.f6719;
            if (!arrayList.contains(c8708)) {
                arrayList.add(c8708);
            }
            if (i == 0) {
                c8708.f22090 = i2;
            } else {
                c8708.f22091 = i2;
            }
        }
        this.f6715 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m4466(C8740 c8740, int i) {
        int iM13934;
        int iM139342;
        ArrayList arrayList = this.f6719;
        if (arrayList.size() == 0) {
            return 0;
        }
        C8707 c8707 = (C8707) ((C8708) arrayList.get(0)).f22036;
        c8740.m13941();
        c8707.mo13825(c8740, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C8708) arrayList.get(i2)).mo13825(c8740, false);
        }
        if (i == 0 && c8707.f22023 > 0) {
            AbstractC8716.m13869(c8707, c8740, arrayList, 0);
        }
        if (i == 1 && c8707.f22017 > 0) {
            AbstractC8716.m13869(c8707, c8740, arrayList, 1);
        }
        try {
            c8740.m13947();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f6716 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C8708 c8708 = (C8708) arrayList.get(i3);
            C9452 c9452 = new C9452(6);
            new WeakReference(c8708);
            C8740.m13934(c8708.f22055);
            C8740.m13934(c8708.f22054);
            C8740.m13934(c8708.f22045);
            C8740.m13934(c8708.f22044);
            C8740.m13934(c8708.f22047);
            this.f6716.add(c9452);
        }
        if (i == 0) {
            iM13934 = C8740.m13934(c8707.f22055);
            iM139342 = C8740.m13934(c8707.f22045);
            c8740.m13941();
        } else {
            iM13934 = C8740.m13934(c8707.f22054);
            iM139342 = C8740.m13934(c8707.f22044);
            c8740.m13941();
        }
        return iM139342 - iM13934;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4467(ArrayList arrayList) {
        int size = this.f6719.size();
        if (this.f6715 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2989 c2989 = (C2989) arrayList.get(i);
                if (this.f6715 == c2989.f6718) {
                    m4465(this.f6717, c2989);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
