package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9011 {
    public static final C9012 Companion = new C9012();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f25306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25309;

    public /* synthetic */ C9011(int i, String str, String str2, long j, long j2, int i2) {
        this.f25309 = (i & 1) == 0 ? AbstractC3056.m6668(-3937561979095614887L) : str;
        if ((i & 2) == 0) {
            this.f25308 = AbstractC3056.m6668(-3937561979095614887L);
        } else {
            this.f25308 = str2;
        }
        if ((i & 4) == 0) {
            this.f25307 = 0L;
        } else {
            this.f25307 = j;
        }
        if ((i & 8) == 0) {
            this.f25306 = 0L;
        } else {
            this.f25306 = j2;
        }
        if ((i & 16) == 0) {
            this.f25305 = 0;
        } else {
            this.f25305 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9011)) {
            return false;
        }
        C9011 c9011 = (C9011) obj;
        return AbstractC4394.m8917(this.f25309, c9011.f25309) && AbstractC4394.m8917(this.f25308, c9011.f25308) && this.f25307 == c9011.f25307 && this.f25306 == c9011.f25306 && this.f25305 == c9011.f25305;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25305) + AbstractC0053.m141(AbstractC0053.m141(AbstractC6136.m11539(this.f25309.hashCode() * 31, 31, this.f25308), 31, this.f25307), 31, this.f25306);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937695913355773351L));
        AbstractC6136.m11531(sb, this.f25309, -3937695887585969575L);
        AbstractC6136.m11531(sb, this.f25308, -3937695780211787175L);
        AbstractC6136.m11532(sb, this.f25307, -3937695724377212327L);
        AbstractC6136.m11532(sb, this.f25306, -3937685549599688103L);
        return AbstractC0053.m154(sb, this.f25305, ')');
    }

    public C9011(String str, String str2, long j, long j2, int i) {
        AbstractC6136.m11546(-3937702875497760167L, -3937696033614857639L, str);
        str2.getClass();
        this.f25309 = str;
        this.f25308 = str2;
        this.f25307 = j;
        this.f25306 = j2;
        this.f25305 = i;
    }
}
