package p072;

import androidx.activity.AbstractC0900;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.AbstractC8005;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7507 implements InterfaceC7490 {
    public static final C7511 Companion = new C7511();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18425 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(7)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC8005 f18427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7665 f18429;

    public C7507(int i, InterfaceC7665 interfaceC7665, String str, AbstractC8005 abstractC8005, String str2) {
        if (2 != (i & 2)) {
            AbstractC7973.m12979(i, 2, C7510.f18435.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            AtomicLong atomicLong = AbstractC7433.f18323;
            atomicLong.getClass();
            interfaceC7665 = new C7666(atomicLong.addAndGet(1L));
        }
        this.f18429 = interfaceC7665;
        this.f18428 = str;
        if ((i & 4) == 0) {
            this.f18427 = AbstractC7431.f18321;
        } else {
            this.f18427 = abstractC8005;
        }
        if ((i & 8) == 0) {
            this.f18426 = "2.0";
        } else {
            this.f18426 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7507)) {
            return false;
        }
        C7507 c7507 = (C7507) obj;
        return AbstractC5227.m9466(this.f18429, c7507.f18429) && AbstractC5227.m9466(this.f18428, c7507.f18428) && AbstractC5227.m9466(this.f18427, c7507.f18427) && AbstractC5227.m9466(this.f18426, c7507.f18426);
    }

    public final int hashCode() {
        return this.f18426.hashCode() + ((this.f18427.hashCode() + AbstractC7012.m12131(this.f18429.hashCode() * 31, 31, this.f18428)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCRequest(id=");
        sb.append(this.f18429);
        sb.append(", method=");
        sb.append(this.f18428);
        sb.append(", params=");
        sb.append(this.f18427);
        sb.append(", jsonrpc=");
        return AbstractC0900.m708(sb, this.f18426, ')');
    }

    public C7507(String str, AbstractC8005 abstractC8005) {
        AtomicLong atomicLong = AbstractC7433.f18323;
        atomicLong.getClass();
        C7666 c7666 = new C7666(atomicLong.addAndGet(1L));
        str.getClass();
        this.f18429 = c7666;
        this.f18428 = str;
        this.f18427 = abstractC8005;
        this.f18426 = "2.0";
    }
}
