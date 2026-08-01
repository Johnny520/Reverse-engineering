package p056;

import androidx.activity.AbstractC0053;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.AbstractC7175;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6677 implements InterfaceC6660 {
    public static final C6681 Companion = new C6681();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18085 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(7)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7175 f18087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6835 f18089;

    public C6677(int i, InterfaceC6835 interfaceC6835, String str, AbstractC7175 abstractC7175, String str2) {
        if (2 != (i & 2)) {
            AbstractC7143.m12393(i, 2, C6680.f18095.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            AtomicLong atomicLong = AbstractC6603.f17983;
            atomicLong.getClass();
            interfaceC6835 = new C6836(atomicLong.addAndGet(1L));
        }
        this.f18089 = interfaceC6835;
        this.f18088 = str;
        if ((i & 4) == 0) {
            this.f18087 = AbstractC6601.f17981;
        } else {
            this.f18087 = abstractC7175;
        }
        if ((i & 8) == 0) {
            this.f18086 = "2.0";
        } else {
            this.f18086 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6677)) {
            return false;
        }
        C6677 c6677 = (C6677) obj;
        return AbstractC4394.m8917(this.f18089, c6677.f18089) && AbstractC4394.m8917(this.f18088, c6677.f18088) && AbstractC4394.m8917(this.f18087, c6677.f18087) && AbstractC4394.m8917(this.f18086, c6677.f18086);
    }

    public final int hashCode() {
        return this.f18086.hashCode() + ((this.f18087.hashCode() + AbstractC6136.m11539(this.f18089.hashCode() * 31, 31, this.f18088)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCRequest(id=");
        sb.append(this.f18089);
        sb.append(", method=");
        sb.append(this.f18088);
        sb.append(", params=");
        sb.append(this.f18087);
        sb.append(", jsonrpc=");
        return AbstractC0053.m155(sb, this.f18086, ')');
    }

    public C6677(String str, AbstractC7175 abstractC7175) {
        AtomicLong atomicLong = AbstractC6603.f17983;
        atomicLong.getClass();
        C6836 c6836 = new C6836(atomicLong.addAndGet(1L));
        str.getClass();
        this.f18089 = c6836;
        this.f18088 = str;
        this.f18087 = abstractC7175;
        this.f18086 = "2.0";
    }
}
