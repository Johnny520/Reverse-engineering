package p128;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f20214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20215 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f20213 = new ArrayList();

    public C7468(View view) {
        this.f20214 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7468)) {
            return false;
        }
        C7468 c7468 = (C7468) obj;
        return this.f20214 == c7468.f20214 && this.f20215.equals(c7468.f20215);
    }

    public final int hashCode() {
        return this.f20215.hashCode() + (this.f20214.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM11553 = AbstractC6136.m11553("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM11553.append(this.f20214);
        sbM11553.append("\n");
        String strConcat = sbM11553.toString().concat("    values:");
        HashMap map = this.f20215;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
