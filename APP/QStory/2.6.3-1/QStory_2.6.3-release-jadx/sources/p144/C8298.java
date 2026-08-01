package p144;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20555 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f20553 = new ArrayList();

    public C8298(View view) {
        this.f20554 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8298)) {
            return false;
        }
        C8298 c8298 = (C8298) obj;
        return this.f20554 == c8298.f20554 && this.f20555.equals(c8298.f20555);
    }

    public final int hashCode() {
        return this.f20555.hashCode() + (this.f20554.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM12143 = AbstractC7012.m12143("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM12143.append(this.f20554);
        sbM12143.append("\n");
        String strConcat = sbM12143.toString().concat("    values:");
        HashMap map = this.f20555;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
