package p072;

import androidx.activity.AbstractC0900;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7559 implements InterfaceC7556 {
    public static final C7558 Companion = new C7558();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18502;

    public /* synthetic */ C7559(int i, int i2) {
        if (1 == (i & 1)) {
            this.f18502 = i2;
        } else {
            AbstractC7973.m12979(i, 1, C7554.f18499.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7559) && this.f18502 == ((C7559) obj).f18502;
    }

    @Override // p072.InterfaceC7556
    public final int getCode() {
        return this.f18502;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18502);
    }

    public final String toString() {
        return AbstractC0900.m716(new StringBuilder("Unknown(code="), this.f18502, ')');
    }

    public C7559(int i) {
        this.f18502 = i;
    }
}
