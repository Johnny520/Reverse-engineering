package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0053;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p009.AbstractC6183;
import p203.AbstractC7887;
import p203.C7878;
import p203.C7879;
import p206.C7911;
import p305.C8623;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int f6369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f6371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f6374;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6372;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM147 = AbstractC0053.m147(sb, "] <", this.f6373);
        for (C7879 c7879 : this.f6374) {
            StringBuilder sbM11584 = AbstractC6183.m11584(strM147, " ");
            sbM11584.append(c7879.f21751);
            strM147 = sbM11584.toString();
        }
        return strM147.concat(" >");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3905(int i, C2156 c2156) {
        int i2 = c2156.f6373;
        for (C7879 c7879 : this.f6374) {
            ArrayList arrayList = c2156.f6374;
            if (!arrayList.contains(c7879)) {
                arrayList.add(c7879);
            }
            if (i == 0) {
                c7879.f21745 = i2;
            } else {
                c7879.f21746 = i2;
            }
        }
        this.f6370 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m3906(C7911 c7911, int i) {
        int iM13375;
        int iM133752;
        ArrayList arrayList = this.f6374;
        if (arrayList.size() == 0) {
            return 0;
        }
        C7878 c7878 = (C7878) ((C7879) arrayList.get(0)).f21691;
        c7911.m13382();
        c7878.mo13266(c7911, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C7879) arrayList.get(i2)).mo13266(c7911, false);
        }
        if (i == 0 && c7878.f21678 > 0) {
            AbstractC7887.m13310(c7878, c7911, arrayList, 0);
        }
        if (i == 1 && c7878.f21672 > 0) {
            AbstractC7887.m13310(c7878, c7911, arrayList, 1);
        }
        try {
            c7911.m13388();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f6371 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C7879 c7879 = (C7879) arrayList.get(i3);
            C8623 c8623 = new C8623(6);
            new WeakReference(c7879);
            C7911.m13375(c7879.f21710);
            C7911.m13375(c7879.f21709);
            C7911.m13375(c7879.f21700);
            C7911.m13375(c7879.f21699);
            C7911.m13375(c7879.f21702);
            this.f6371.add(c8623);
        }
        if (i == 0) {
            iM13375 = C7911.m13375(c7878.f21710);
            iM133752 = C7911.m13375(c7878.f21700);
            c7911.m13382();
        } else {
            iM13375 = C7911.m13375(c7878.f21709);
            iM133752 = C7911.m13375(c7878.f21699);
            c7911.m13382();
        }
        return iM133752 - iM13375;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3907(ArrayList arrayList) {
        int size = this.f6374.size();
        if (this.f6370 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2156 c2156 = (C2156) arrayList.get(i);
                if (this.f6370 == c2156.f6373) {
                    m3905(this.f6372, c2156);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
