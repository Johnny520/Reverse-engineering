package p409;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p349.C9616;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9932 {
    public static final C9933 Companion = new C9933();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f25873 = {null, null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C9616(12)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f25875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25877;

    public /* synthetic */ C9932(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            AbstractC7973.m12979(i, 15, C9934.f25878.getDescriptor());
            throw null;
        }
        this.f25877 = str;
        this.f25876 = str2;
        this.f25875 = list;
        this.f25874 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9932)) {
            return false;
        }
        C9932 c9932 = (C9932) obj;
        return AbstractC5227.m9466(this.f25877, c9932.f25877) && AbstractC5227.m9466(this.f25876, c9932.f25876) && AbstractC5227.m9466(this.f25875, c9932.f25875) && AbstractC5227.m9466(this.f25874, c9932.f25874);
    }

    public final int hashCode() {
        return this.f25874.hashCode() + AbstractC0900.m720(this.f25875, AbstractC7012.m12131(this.f25877.hashCode() * 31, 31, this.f25876), 31);
    }

    public final String toString() {
        StringBuilder sbM12141 = AbstractC7012.m12141("MethodInfo(declareClass=", this.f25877, ", methodName=", this.f25876, ", params=");
        sbM12141.append(this.f25875);
        sbM12141.append(", returnType=");
        sbM12141.append(this.f25874);
        sbM12141.append(")");
        return sbM12141.toString();
    }

    public C9932(String str, String str2, String str3, ArrayList arrayList) {
        this.f25877 = str;
        this.f25876 = str2;
        this.f25875 = arrayList;
        this.f25874 = str3;
    }
}
