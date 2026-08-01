package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9015 {
    public static final C9026 Companion = new C9026();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9012 f25296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25297;

    public /* synthetic */ C9015(int i, long j, C9012 c9012, int i2) {
        if (2 != (i & 2)) {
            AbstractC7144.m12420(i, 2, C9027.f25307.getDescriptor());
            throw null;
        }
        this.f25297 = (i & 1) == 0 ? 0L : j;
        this.f25296 = c9012;
        if ((i & 4) == 0) {
            this.f25295 = 0;
        } else {
            this.f25295 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9015)) {
            return false;
        }
        C9015 c9015 = (C9015) obj;
        return this.f25297 == c9015.f25297 && AbstractC4395.m8907(this.f25296, c9015.f25296) && this.f25295 == c9015.f25295;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25295) + ((this.f25296.hashCode() + (Long.hashCode(this.f25297) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1435));
        sb.append(this.f25297);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵"));
        sb.append(this.f25296);
        sb.append(AbstractC8405.m13972(1359));
        return AbstractC0053.m156(sb, this.f25295, ')');
    }

    public C9015(long j, C9012 c9012, int i) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f25297 = j;
        this.f25296 = c9012;
        this.f25295 = i;
    }
}
