package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7652 implements InterfaceC7645 {
    public static final C7655 Companion = new C7655();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f18610;

    public /* synthetic */ C7652(int i, String str) {
        if (1 == (i & 1)) {
            this.f18610 = str;
        } else {
            AbstractC7973.m12979(i, 1, C7654.f18611.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7652) && AbstractC5227.m9466(this.f18610, ((C7652) obj).f18610);
    }

    @Override // p072.InterfaceC7645
    public final String getValue() {
        return this.f18610;
    }

    public final int hashCode() {
        return this.f18610.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("Custom(value="), this.f18610, ')');
    }

    public C7652(String str) {
        str.getClass();
        this.f18610 = str;
    }
}
