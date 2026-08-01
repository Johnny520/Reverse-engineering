package p400;

import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9871 {
    public static final C9874 Companion = new C9874();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25671;

    public /* synthetic */ C9871(int i, long j) {
        if ((i & 1) == 0) {
            this.f25671 = 0L;
        } else {
            this.f25671 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9871) && this.f25671 == ((C9871) obj).f25671;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25671);
    }

    public final String toString() {
        return "SyncInfoHead(syncTime=" + this.f25671 + ')';
    }
}
