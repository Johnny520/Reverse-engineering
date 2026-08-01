package p056;

import p009.AbstractC6183;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6584 implements InterfaceC6582 {
    public static final C6585 Companion = new C6585();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17958;

    public /* synthetic */ C6584(String str) {
        this.f17958 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6584) {
            return this.f17958.equals(((C6584) obj).f17958);
        }
        return false;
    }

    @Override // p056.InterfaceC6582
    public final String getValue() {
        return this.f17958;
    }

    public final int hashCode() {
        return this.f17958.hashCode();
    }

    public final String toString() {
        return AbstractC6183.m11590(')', "Other(value=", this.f17958);
    }
}
