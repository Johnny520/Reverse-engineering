package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6822 implements InterfaceC6815 {
    public static final C6825 Companion = new C6825();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f18270;

    public /* synthetic */ C6822(int i, String str) {
        if (1 == (i & 1)) {
            this.f18270 = str;
        } else {
            AbstractC7143.m12393(i, 1, C6824.f18271.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6822) && AbstractC4394.m8917(this.f18270, ((C6822) obj).f18270);
    }

    @Override // p056.InterfaceC6815
    public final String getValue() {
        return this.f18270;
    }

    public final int hashCode() {
        return this.f18270.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("Custom(value="), this.f18270, ')');
    }

    public C6822(String str) {
        str.getClass();
        this.f18270 = str;
    }
}
