package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9018 {
    public static final C9019 Companion = new C9019();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f25300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25303;

    public /* synthetic */ C9018(int i, String str, String str2, long j, long j2, int i2) {
        if ((i & 1) == 0) {
            this.f25303 = "";
        } else {
            this.f25303 = str;
        }
        if ((i & 2) == 0) {
            this.f25302 = "";
        } else {
            this.f25302 = str2;
        }
        if ((i & 4) == 0) {
            this.f25301 = 0L;
        } else {
            this.f25301 = j;
        }
        if ((i & 8) == 0) {
            this.f25300 = 0L;
        } else {
            this.f25300 = j2;
        }
        if ((i & 16) == 0) {
            this.f25299 = 0;
        } else {
            this.f25299 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9018)) {
            return false;
        }
        C9018 c9018 = (C9018) obj;
        return AbstractC4395.m8907(this.f25303, c9018.f25303) && AbstractC4395.m8907(this.f25302, c9018.f25302) && this.f25301 == c9018.f25301 && this.f25300 == c9018.f25300 && this.f25299 == c9018.f25299;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25299) + AbstractC0053.m142(AbstractC0053.m142(AbstractC6183.m11572(this.f25303.hashCode() * 31, 31, this.f25302), 31, this.f25301), 31, this.f25300);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1423));
        AbstractC6183.m11579(sb, this.f25303, 1424);
        AbstractC6183.m11579(sb, this.f25302, 1425);
        sb.append(this.f25301);
        sb.append(AbstractC8405.m13972(1426));
        sb.append(this.f25300);
        sb.append(AbstractC8405.m13972(1359));
        return AbstractC0053.m156(sb, this.f25299, ')');
    }

    public C9018(String str, String str2, long j, long j2, int i) {
        AbstractC8405.m13972(1362);
        str.getClass();
        AbstractC8405.m13972(1422);
        str2.getClass();
        this.f25303 = str;
        this.f25302 = str2;
        this.f25301 = j;
        this.f25300 = j2;
        this.f25299 = i;
    }
}
