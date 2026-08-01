package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0053;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p007.AbstractC6136;
import p203.AbstractC7886;
import p203.C7877;
import p203.C7878;
import p206.C7910;
import p305.C8631;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int f6368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f6370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f6371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f6372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f6373;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6371;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM147 = AbstractC0053.m147(sb, "] <", this.f6372);
        for (C7878 c7878 : this.f6373) {
            StringBuilder sbM11553 = AbstractC6136.m11553(strM147, " ");
            sbM11553.append(c7878.f21754);
            strM147 = sbM11553.toString();
        }
        return strM147.concat(" >");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3895(int i, C2156 c2156) {
        int i2 = c2156.f6372;
        for (C7878 c7878 : this.f6373) {
            ArrayList arrayList = c2156.f6373;
            if (!arrayList.contains(c7878)) {
                arrayList.add(c7878);
            }
            if (i == 0) {
                c7878.f21748 = i2;
            } else {
                c7878.f21749 = i2;
            }
        }
        this.f6369 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m3896(C7910 c7910, int i) {
        int iM13347;
        int iM133472;
        ArrayList arrayList = this.f6373;
        if (arrayList.size() == 0) {
            return 0;
        }
        C7877 c7877 = (C7877) ((C7878) arrayList.get(0)).f21694;
        c7910.m13354();
        c7877.mo13238(c7910, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C7878) arrayList.get(i2)).mo13238(c7910, false);
        }
        if (i == 0 && c7877.f21681 > 0) {
            AbstractC7886.m13282(c7877, c7910, arrayList, 0);
        }
        if (i == 1 && c7877.f21675 > 0) {
            AbstractC7886.m13282(c7877, c7910, arrayList, 1);
        }
        try {
            c7910.m13360();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f6370 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C7878 c7878 = (C7878) arrayList.get(i3);
            C8631 c8631 = new C8631(6);
            new WeakReference(c7878);
            C7910.m13347(c7878.f21713);
            C7910.m13347(c7878.f21712);
            C7910.m13347(c7878.f21703);
            C7910.m13347(c7878.f21702);
            C7910.m13347(c7878.f21705);
            this.f6370.add(c8631);
        }
        if (i == 0) {
            iM13347 = C7910.m13347(c7877.f21713);
            iM133472 = C7910.m13347(c7877.f21703);
            c7910.m13354();
        } else {
            iM13347 = C7910.m13347(c7877.f21712);
            iM133472 = C7910.m13347(c7877.f21702);
            c7910.m13354();
        }
        return iM133472 - iM13347;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3897(ArrayList arrayList) {
        int size = this.f6373.size();
        if (this.f6369 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2156 c2156 = (C2156) arrayList.get(i);
                if (this.f6369 == c2156.f6372) {
                    m3895(this.f6371, c2156);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
