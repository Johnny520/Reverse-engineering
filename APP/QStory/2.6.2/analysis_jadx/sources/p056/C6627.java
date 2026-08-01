package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6627 {
    public static final C6691 Companion = new C6691();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18020;

    public /* synthetic */ C6627(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6690.f18106.getDescriptor());
            throw null;
        }
        this.f18020 = str;
        this.f18019 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6627)) {
            return false;
        }
        C6627 c6627 = (C6627) obj;
        return AbstractC4394.m8917(this.f18020, c6627.f18020) && AbstractC4394.m8917(this.f18019, c6627.f18019);
    }

    public final int hashCode() {
        return this.f18019.hashCode() + (this.f18020.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Argument(name=");
        sb.append(this.f18020);
        sb.append(", value=");
        return AbstractC0053.m155(sb, this.f18019, ')');
    }
}
