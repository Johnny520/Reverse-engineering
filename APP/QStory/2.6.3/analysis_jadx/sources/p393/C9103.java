package p393;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p333.C8787;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9103 {
    public static final C9104 Companion = new C9104();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f25528 = {null, null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C8787(12)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f25530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25532;

    public /* synthetic */ C9103(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            AbstractC7144.m12420(i, 15, C9105.f25533.getDescriptor());
            throw null;
        }
        this.f25532 = str;
        this.f25531 = str2;
        this.f25530 = list;
        this.f25529 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9103)) {
            return false;
        }
        C9103 c9103 = (C9103) obj;
        return AbstractC4395.m8907(this.f25532, c9103.f25532) && AbstractC4395.m8907(this.f25531, c9103.f25531) && AbstractC4395.m8907(this.f25530, c9103.f25530) && AbstractC4395.m8907(this.f25529, c9103.f25529);
    }

    public final int hashCode() {
        return this.f25529.hashCode() + AbstractC0053.m160(this.f25530, AbstractC6183.m11572(this.f25532.hashCode() * 31, 31, this.f25531), 31);
    }

    public final String toString() {
        StringBuilder sbM11582 = AbstractC6183.m11582("MethodInfo(declareClass=", this.f25532, ", methodName=", this.f25531, ", params=");
        sbM11582.append(this.f25530);
        sbM11582.append(", returnType=");
        sbM11582.append(this.f25529);
        sbM11582.append(")");
        return sbM11582.toString();
    }

    public C9103(String str, String str2, String str3, ArrayList arrayList) {
        this.f25532 = str;
        this.f25531 = str2;
        this.f25530 = arrayList;
        this.f25529 = str3;
    }
}
