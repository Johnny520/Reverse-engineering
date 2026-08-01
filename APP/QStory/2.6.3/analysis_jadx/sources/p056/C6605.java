package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6605 implements InterfaceC6827 {
    public static final C6606 Companion = new C6606();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17980;

    public /* synthetic */ C6605(int i, String str) {
        if (1 == (i & 1)) {
            this.f17980 = str;
        } else {
            AbstractC7144.m12420(i, 1, C6607.f17981.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6605) && AbstractC4395.m8907(this.f17980, ((C6605) obj).f17980);
    }

    public final int hashCode() {
        return this.f17980.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("UnknownReference(type="), this.f17980, ')');
    }
}
