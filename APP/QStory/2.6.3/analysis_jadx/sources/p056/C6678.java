package p056;

import androidx.activity.AbstractC0053;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.AbstractC7176;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6678 implements InterfaceC6661 {
    public static final C6682 Companion = new C6682();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18080 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(7)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7176 f18082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6836 f18084;

    public C6678(int i, InterfaceC6836 interfaceC6836, String str, AbstractC7176 abstractC7176, String str2) {
        if (2 != (i & 2)) {
            AbstractC7144.m12420(i, 2, C6681.f18090.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            AtomicLong atomicLong = AbstractC6604.f17978;
            atomicLong.getClass();
            interfaceC6836 = new C6837(atomicLong.addAndGet(1L));
        }
        this.f18084 = interfaceC6836;
        this.f18083 = str;
        if ((i & 4) == 0) {
            this.f18082 = AbstractC6602.f17976;
        } else {
            this.f18082 = abstractC7176;
        }
        if ((i & 8) == 0) {
            this.f18081 = "2.0";
        } else {
            this.f18081 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6678)) {
            return false;
        }
        C6678 c6678 = (C6678) obj;
        return AbstractC4395.m8907(this.f18084, c6678.f18084) && AbstractC4395.m8907(this.f18083, c6678.f18083) && AbstractC4395.m8907(this.f18082, c6678.f18082) && AbstractC4395.m8907(this.f18081, c6678.f18081);
    }

    public final int hashCode() {
        return this.f18081.hashCode() + ((this.f18082.hashCode() + AbstractC6183.m11572(this.f18084.hashCode() * 31, 31, this.f18083)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCRequest(id=");
        sb.append(this.f18084);
        sb.append(", method=");
        sb.append(this.f18083);
        sb.append(", params=");
        sb.append(this.f18082);
        sb.append(", jsonrpc=");
        return AbstractC0053.m148(sb, this.f18081, ')');
    }

    public C6678(String str, AbstractC7176 abstractC7176) {
        AtomicLong atomicLong = AbstractC6604.f17978;
        atomicLong.getClass();
        C6837 c6837 = new C6837(atomicLong.addAndGet(1L));
        str.getClass();
        this.f18084 = c6837;
        this.f18083 = str;
        this.f18082 = abstractC7176;
        this.f18081 = "2.0";
    }
}
