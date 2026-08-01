package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p088.AbstractC7176;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6660 implements InterfaceC6661 {
    public static final C6659 Companion = new C6659();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7176 f18059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18060;

    public C6660(int i, String str, AbstractC7176 abstractC7176, String str2) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6663.f18062.getDescriptor());
            throw null;
        }
        this.f18060 = str;
        if ((i & 2) == 0) {
            this.f18059 = AbstractC6602.f17976;
        } else {
            this.f18059 = abstractC7176;
        }
        if ((i & 4) == 0) {
            this.f18058 = "2.0";
        } else {
            this.f18058 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6660)) {
            return false;
        }
        C6660 c6660 = (C6660) obj;
        return AbstractC4395.m8907(this.f18060, c6660.f18060) && AbstractC4395.m8907(this.f18059, c6660.f18059) && AbstractC4395.m8907(this.f18058, c6660.f18058);
    }

    public final int hashCode() {
        return this.f18058.hashCode() + ((this.f18059.hashCode() + (this.f18060.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCNotification(method=");
        sb.append(this.f18060);
        sb.append(", params=");
        sb.append(this.f18059);
        sb.append(", jsonrpc=");
        return AbstractC0053.m148(sb, this.f18058, ')');
    }

    public C6660(String str, AbstractC7176 abstractC7176) {
        str.getClass();
        this.f18060 = str;
        this.f18059 = abstractC7176;
        this.f18058 = "2.0";
    }
}
