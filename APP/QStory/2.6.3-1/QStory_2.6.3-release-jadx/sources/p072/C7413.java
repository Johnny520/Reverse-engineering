package p072;

import p025.AbstractC7012;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7413 implements InterfaceC7411 {
    public static final C7414 Companion = new C7414();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18303;

    public /* synthetic */ C7413(String str) {
        this.f18303 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7413) {
            return this.f18303.equals(((C7413) obj).f18303);
        }
        return false;
    }

    @Override // p072.InterfaceC7411
    public final String getValue() {
        return this.f18303;
    }

    public final int hashCode() {
        return this.f18303.hashCode();
    }

    public final String toString() {
        return AbstractC7012.m12149(')', "Other(value=", this.f18303);
    }
}
