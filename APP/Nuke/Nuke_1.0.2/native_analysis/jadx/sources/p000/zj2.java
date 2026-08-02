package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zj2 {

    /* JADX INFO: renamed from: a */
    public final yf2 f13930a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13931b;

    /* JADX INFO: renamed from: c */
    public final String f13932c;

    public zj2(yf2 yf2Var, ArrayList arrayList, String str) {
        this.f13930a = yf2Var;
        this.f13931b = arrayList;
        this.f13932c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj2)) {
            return false;
        }
        zj2 zj2Var = (zj2) obj;
        return this.f13930a.equals(zj2Var.f13930a) && this.f13931b.equals(zj2Var.f13931b) && t11.m5086l(this.f13932c, zj2Var.f13932c);
    }

    public final int hashCode() {
        int iHashCode = (this.f13931b.hashCode() + (this.f13930a.hashCode() * 31)) * 31;
        String str = this.f13932c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptSendMessageRequest(conversation=");
        sb.append(this.f13930a);
        sb.append(", segments=");
        sb.append(this.f13931b);
        sb.append(", replyTo=");
        return hk1.m2211j(sb, this.f13932c, ")");
    }
}
