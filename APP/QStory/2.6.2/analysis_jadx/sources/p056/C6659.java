package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p088.AbstractC7175;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6659 implements InterfaceC6660 {
    public static final C6658 Companion = new C6658();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7175 f18064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18065;

    public C6659(int i, String str, AbstractC7175 abstractC7175, String str2) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6662.f18067.getDescriptor());
            throw null;
        }
        this.f18065 = str;
        if ((i & 2) == 0) {
            this.f18064 = AbstractC6601.f17981;
        } else {
            this.f18064 = abstractC7175;
        }
        if ((i & 4) == 0) {
            this.f18063 = "2.0";
        } else {
            this.f18063 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6659)) {
            return false;
        }
        C6659 c6659 = (C6659) obj;
        return AbstractC4394.m8917(this.f18065, c6659.f18065) && AbstractC4394.m8917(this.f18064, c6659.f18064) && AbstractC4394.m8917(this.f18063, c6659.f18063);
    }

    public final int hashCode() {
        return this.f18063.hashCode() + ((this.f18064.hashCode() + (this.f18065.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCNotification(method=");
        sb.append(this.f18065);
        sb.append(", params=");
        sb.append(this.f18064);
        sb.append(", jsonrpc=");
        return AbstractC0053.m155(sb, this.f18063, ')');
    }

    public C6659(String str, AbstractC7175 abstractC7175) {
        str.getClass();
        this.f18065 = str;
        this.f18064 = abstractC7175;
        this.f18063 = "2.0";
    }
}
