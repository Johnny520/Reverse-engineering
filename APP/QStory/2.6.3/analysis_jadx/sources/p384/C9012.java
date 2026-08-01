package p384;

import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9012 {
    public static final C9024 Companion = new C9024();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9013 f25289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25290;

    public /* synthetic */ C9012(int i, String str, C9013 c9013) {
        if (2 != (i & 2)) {
            AbstractC7144.m12420(i, 2, C9025.f25306.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f25290 = "";
        } else {
            this.f25290 = str;
        }
        this.f25289 = c9013;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9012)) {
            return false;
        }
        C9012 c9012 = (C9012) obj;
        return AbstractC4395.m8907(this.f25290, c9012.f25290) && AbstractC4395.m8907(this.f25289, c9012.f25289);
    }

    public final int hashCode() {
        return this.f25289.hashCode() + (this.f25290.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1423));
        AbstractC6183.m11579(sb, this.f25290, 1434);
        sb.append(this.f25289);
        sb.append(')');
        return sb.toString();
    }

    public C9012(String str, C9013 c9013) {
        AbstractC8405.m13972(1362);
        str.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜喵");
        this.f25290 = str;
        this.f25289 = c9013;
    }
}
