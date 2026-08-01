package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p104.AbstractC8005;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7489 implements InterfaceC7490 {
    public static final C7488 Companion = new C7488();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8005 f18404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18405;

    public C7489(int i, String str, AbstractC8005 abstractC8005, String str2) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7492.f18407.getDescriptor());
            throw null;
        }
        this.f18405 = str;
        if ((i & 2) == 0) {
            this.f18404 = AbstractC7431.f18321;
        } else {
            this.f18404 = abstractC8005;
        }
        if ((i & 4) == 0) {
            this.f18403 = "2.0";
        } else {
            this.f18403 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7489)) {
            return false;
        }
        C7489 c7489 = (C7489) obj;
        return AbstractC5227.m9466(this.f18405, c7489.f18405) && AbstractC5227.m9466(this.f18404, c7489.f18404) && AbstractC5227.m9466(this.f18403, c7489.f18403);
    }

    public final int hashCode() {
        return this.f18403.hashCode() + ((this.f18404.hashCode() + (this.f18405.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCNotification(method=");
        sb.append(this.f18405);
        sb.append(", params=");
        sb.append(this.f18404);
        sb.append(", jsonrpc=");
        return AbstractC0900.m708(sb, this.f18403, ')');
    }

    public C7489(String str, AbstractC8005 abstractC8005) {
        str.getClass();
        this.f18405 = str;
        this.f18404 = abstractC8005;
        this.f18403 = "2.0";
    }
}
