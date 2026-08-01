package p056;

import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6611 implements InterfaceC6796 {
    public static final C6615 Companion = new C6615();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7152 f17984;

    public C6611(int i, C7152 c7152) {
        if ((i & 1) == 0) {
            this.f17984 = AbstractC6602.f17976;
        } else {
            this.f17984 = c7152;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6611) && AbstractC4395.m8907(this.f17984, ((C6611) obj).f17984);
    }

    public final int hashCode() {
        return this.f17984.f19116.hashCode();
    }

    public final String toString() {
        return AbstractC6183.m11580(new StringBuilder("EmptyRequestResult(_meta="), this.f17984, ')');
    }

    public C6611() {
        C7152 c7152 = AbstractC6602.f17976;
        c7152.getClass();
        this.f17984 = c7152;
    }
}
