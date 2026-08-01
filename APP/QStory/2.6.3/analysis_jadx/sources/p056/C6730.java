package p056;

import androidx.activity.AbstractC0053;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6730 implements InterfaceC6727 {
    public static final C6729 Companion = new C6729();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18157;

    public /* synthetic */ C6730(int i, int i2) {
        if (1 == (i & 1)) {
            this.f18157 = i2;
        } else {
            AbstractC7144.m12420(i, 1, C6725.f18154.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6730) && this.f18157 == ((C6730) obj).f18157;
    }

    @Override // p056.InterfaceC6727
    public final int getCode() {
        return this.f18157;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18157);
    }

    public final String toString() {
        return AbstractC0053.m156(new StringBuilder("Unknown(code="), this.f18157, ')');
    }

    public C6730(int i) {
        this.f18157 = i;
    }
}
