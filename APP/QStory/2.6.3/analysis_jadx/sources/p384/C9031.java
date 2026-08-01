package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9031 {
    public static final C9032 Companion = new C9032();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25313;

    public /* synthetic */ C9031(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C9033.f25314.getDescriptor());
            throw null;
        }
        this.f25313 = str;
        this.f25312 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9031)) {
            return false;
        }
        C9031 c9031 = (C9031) obj;
        return AbstractC4395.m8907(this.f25313, c9031.f25313) && this.f25312 == c9031.f25312;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25312) + (this.f25313.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1358));
        AbstractC6183.m11579(sb, this.f25313, 1359);
        return AbstractC0053.m156(sb, this.f25312, ')');
    }

    public C9031(String str, int i) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
        str.getClass();
        this.f25313 = str;
        this.f25312 = i;
    }
}
