package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6823 implements InterfaceC6816 {
    public static final C6826 Companion = new C6826();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f18265;

    public /* synthetic */ C6823(int i, String str) {
        if (1 == (i & 1)) {
            this.f18265 = str;
        } else {
            AbstractC7144.m12420(i, 1, C6825.f18266.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6823) && AbstractC4395.m8907(this.f18265, ((C6823) obj).f18265);
    }

    @Override // p056.InterfaceC6816
    public final String getValue() {
        return this.f18265;
    }

    public final int hashCode() {
        return this.f18265.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("Custom(value="), this.f18265, ')');
    }

    public C6823(String str) {
        str.getClass();
        this.f18265 = str;
    }
}
