package p390;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;
import p332.C8801;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9107 {
    public static final C9108 Companion = new C9108();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f25475 = {null, null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(13)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f25477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25479;

    public /* synthetic */ C9107(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            AbstractC7143.m12393(i, 15, C9109.f25480.getDescriptor());
            throw null;
        }
        this.f25479 = str;
        this.f25478 = str2;
        this.f25477 = list;
        this.f25476 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9107)) {
            return false;
        }
        C9107 c9107 = (C9107) obj;
        return AbstractC4394.m8917(this.f25479, c9107.f25479) && AbstractC4394.m8917(this.f25478, c9107.f25478) && AbstractC4394.m8917(this.f25477, c9107.f25477) && AbstractC4394.m8917(this.f25476, c9107.f25476);
    }

    public final int hashCode() {
        return this.f25476.hashCode() + AbstractC0053.m159(this.f25477, AbstractC6136.m11539(this.f25479.hashCode() * 31, 31, this.f25478), 31);
    }

    public final String toString() {
        StringBuilder sbM11551 = AbstractC6136.m11551("MethodInfo(declareClass=", this.f25479, ", methodName=", this.f25478, ", params=");
        sbM11551.append(this.f25477);
        sbM11551.append(", returnType=");
        sbM11551.append(this.f25476);
        sbM11551.append(")");
        return sbM11551.toString();
    }

    public C9107(String str, String str2, String str3, ArrayList arrayList) {
        this.f25479 = str;
        this.f25478 = str2;
        this.f25477 = arrayList;
        this.f25476 = str3;
    }
}
