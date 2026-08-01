package p128;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20210 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f20208 = new ArrayList();

    public C7469(View view) {
        this.f20209 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7469)) {
            return false;
        }
        C7469 c7469 = (C7469) obj;
        return this.f20209 == c7469.f20209 && this.f20210.equals(c7469.f20210);
    }

    public final int hashCode() {
        return this.f20210.hashCode() + (this.f20209.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM11584 = AbstractC6183.m11584("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM11584.append(this.f20209);
        sbM11584.append("\n");
        String strConcat = sbM11584.toString().concat("    values:");
        HashMap map = this.f20210;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
