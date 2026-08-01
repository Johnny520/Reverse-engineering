package p072;

import kotlin.jvm.internal.AbstractC5227;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7590 {
    public static final C7584 Companion = new C7584();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7593 f18540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7605 f18541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7607 f18542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7981 f18545;

    public C7590(int i, C7981 c7981, C7981 c79812, C7981 c79813, C7607 c7607, C7605 c7605, C7593 c7593) {
        this.f18545 = (i & 1) == 0 ? AbstractC7431.f18321 : c7981;
        if ((i & 2) == 0) {
            this.f18544 = AbstractC7431.f18321;
        } else {
            this.f18544 = c79812;
        }
        if ((i & 4) == 0) {
            this.f18543 = AbstractC7431.f18321;
        } else {
            this.f18543 = c79813;
        }
        if ((i & 8) == 0) {
            this.f18542 = null;
        } else {
            this.f18542 = c7607;
        }
        if ((i & 16) == 0) {
            this.f18541 = null;
        } else {
            this.f18541 = c7605;
        }
        if ((i & 32) == 0) {
            this.f18540 = null;
        } else {
            this.f18540 = c7593;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7590)) {
            return false;
        }
        C7590 c7590 = (C7590) obj;
        return AbstractC5227.m9466(this.f18545, c7590.f18545) && AbstractC5227.m9466(this.f18544, c7590.f18544) && AbstractC5227.m9466(this.f18543, c7590.f18543) && AbstractC5227.m9466(this.f18542, c7590.f18542) && AbstractC5227.m9466(this.f18541, c7590.f18541) && AbstractC5227.m9466(this.f18540, c7590.f18540);
    }

    public final int hashCode() {
        C7981 c7981 = this.f18545;
        int iHashCode = (c7981 == null ? 0 : c7981.f19461.hashCode()) * 31;
        C7981 c79812 = this.f18544;
        int iHashCode2 = (iHashCode + (c79812 == null ? 0 : c79812.f19461.hashCode())) * 31;
        C7981 c79813 = this.f18543;
        int iHashCode3 = (iHashCode2 + (c79813 == null ? 0 : c79813.f19461.hashCode())) * 31;
        C7607 c7607 = this.f18542;
        int iHashCode4 = (iHashCode3 + (c7607 == null ? 0 : c7607.hashCode())) * 31;
        C7605 c7605 = this.f18541;
        int iHashCode5 = (iHashCode4 + (c7605 == null ? 0 : c7605.hashCode())) * 31;
        C7593 c7593 = this.f18540;
        return iHashCode5 + (c7593 != null ? c7593.hashCode() : 0);
    }

    public final String toString() {
        return "ServerCapabilities(experimental=" + this.f18545 + ", sampling=" + this.f18544 + ", logging=" + this.f18543 + ", prompts=" + this.f18542 + ", resources=" + this.f18541 + ", tools=" + this.f18540 + ')';
    }

    public C7590(C7607 c7607, C7605 c7605, C7593 c7593, int i) {
        C7981 c7981 = AbstractC7431.f18321;
        c7607 = (i & 8) != 0 ? null : c7607;
        c7605 = (i & 16) != 0 ? null : c7605;
        c7593 = (i & 32) != 0 ? null : c7593;
        this.f18545 = c7981;
        this.f18544 = c7981;
        this.f18543 = c7981;
        this.f18542 = c7607;
        this.f18541 = c7605;
        this.f18540 = c7593;
    }
}
