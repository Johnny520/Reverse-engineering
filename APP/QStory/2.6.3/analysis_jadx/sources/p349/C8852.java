package p349;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C8852 {
    public static final C8846 Companion = new C8846();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f24955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f24959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f24960;

    public /* synthetic */ C8852(int i, long j, long j2, String str, int i2, int i3, int i4) {
        if (63 != (i & 63)) {
            AbstractC7144.m12420(i, 63, C8847.f24946.getDescriptor());
            throw null;
        }
        this.f24960 = j;
        this.f24959 = j2;
        this.f24958 = str;
        this.f24957 = i2;
        this.f24956 = i3;
        this.f24955 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8852)) {
            return false;
        }
        C8852 c8852 = (C8852) obj;
        return this.f24960 == c8852.f24960 && this.f24959 == c8852.f24959 && AbstractC4395.m8907(this.f24958, c8852.f24958) && this.f24957 == c8852.f24957 && this.f24956 == c8852.f24956 && this.f24955 == c8852.f24955;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24955) + AbstractC0053.m144(this.f24956, AbstractC0053.m144(this.f24957, AbstractC6183.m11572(AbstractC0053.m142(Long.hashCode(this.f24960) * 31, 31, this.f24959), 31, this.f24958), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2829));
        sb.append(this.f24960);
        sb.append(AbstractC8405.m13972(1359));
        sb.append(this.f24959);
        sb.append(AbstractC8405.m13972(2830));
        sb.append(this.f24958);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵呜喵呜呜呜喵喵"));
        sb.append(this.f24957);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜呜喵~喵呜喵呜呜喵喵喵"));
        sb.append(this.f24956);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜呜呜~喵呜喵呜呜喵喵喵"));
        return AbstractC0053.m156(sb, this.f24955, ')');
    }

    public C8852(long j, long j2, String str, int i) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵呜");
        str.getClass();
        this.f24960 = j;
        this.f24959 = j2;
        this.f24958 = str;
        this.f24957 = i;
        this.f24956 = 0;
        this.f24955 = 0;
    }
}
