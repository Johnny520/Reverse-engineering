package p072;

import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7544 implements InterfaceC7625 {
    public static final C7545 Companion = new C7545();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7981 f18487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7550 f18488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7590 f18489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18490;

    public C7544(int i, String str, C7590 c7590, C7550 c7550, C7981 c7981) {
        if (4 != (i & 4)) {
            AbstractC7973.m12979(i, 4, C7542.f18481.getDescriptor());
            throw null;
        }
        this.f18490 = (i & 1) == 0 ? "2024-11-05" : str;
        if ((i & 2) == 0) {
            this.f18489 = new C7590(null, null, null, 63);
        } else {
            this.f18489 = c7590;
        }
        this.f18488 = c7550;
        if ((i & 8) == 0) {
            this.f18487 = AbstractC7431.f18321;
        } else {
            this.f18487 = c7981;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7544)) {
            return false;
        }
        C7544 c7544 = (C7544) obj;
        return AbstractC5227.m9466(this.f18490, c7544.f18490) && AbstractC5227.m9466(this.f18489, c7544.f18489) && AbstractC5227.m9466(this.f18488, c7544.f18488) && AbstractC5227.m9466(this.f18487, c7544.f18487);
    }

    public final int hashCode() {
        return this.f18487.f19461.hashCode() + ((this.f18488.hashCode() + ((this.f18489.hashCode() + (this.f18490.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeResult(protocolVersion=");
        sb.append(this.f18490);
        sb.append(", capabilities=");
        sb.append(this.f18489);
        sb.append(", serverInfo=");
        sb.append(this.f18488);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18487, ')');
    }

    public C7544(String str, C7590 c7590, C7550 c7550) {
        C7981 c7981 = AbstractC7431.f18321;
        str.getClass();
        c7590.getClass();
        c7550.getClass();
        c7981.getClass();
        this.f18490 = str;
        this.f18489 = c7590;
        this.f18488 = c7550;
        this.f18487 = c7981;
    }
}
