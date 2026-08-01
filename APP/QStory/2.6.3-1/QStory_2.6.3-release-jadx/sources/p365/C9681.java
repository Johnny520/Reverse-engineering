package p365;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9681 {
    public static final C9675 Companion = new C9675();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f25300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f25304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25305;

    public /* synthetic */ C9681(int i, long j, long j2, String str, int i2, int i3, int i4) {
        if (63 != (i & 63)) {
            AbstractC7973.m12979(i, 63, C9676.f25291.getDescriptor());
            throw null;
        }
        this.f25305 = j;
        this.f25304 = j2;
        this.f25303 = str;
        this.f25302 = i2;
        this.f25301 = i3;
        this.f25300 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9681)) {
            return false;
        }
        C9681 c9681 = (C9681) obj;
        return this.f25305 == c9681.f25305 && this.f25304 == c9681.f25304 && AbstractC5227.m9466(this.f25303, c9681.f25303) && this.f25302 == c9681.f25302 && this.f25301 == c9681.f25301 && this.f25300 == c9681.f25300;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25300) + AbstractC0900.m704(this.f25301, AbstractC0900.m704(this.f25302, AbstractC7012.m12131(AbstractC0900.m702(Long.hashCode(this.f25305) * 31, 31, this.f25304), 31, this.f25303), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2829));
        sb.append(this.f25305);
        sb.append(AbstractC9234.m14531(1359));
        sb.append(this.f25304);
        sb.append(AbstractC9234.m14531(2830));
        sb.append(this.f25303);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵呜喵呜呜呜喵喵"));
        sb.append(this.f25302);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜呜喵~喵呜喵呜呜喵喵喵"));
        sb.append(this.f25301);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜呜呜~喵呜喵呜呜喵喵喵"));
        return AbstractC0900.m716(sb, this.f25300, ')');
    }

    public C9681(long j, long j2, String str, int i) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵呜");
        str.getClass();
        this.f25305 = j;
        this.f25304 = j2;
        this.f25303 = str;
        this.f25302 = i;
        this.f25301 = 0;
        this.f25300 = 0;
    }
}
