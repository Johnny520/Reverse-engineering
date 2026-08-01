package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9009 {
    public static final C9017 Companion = new C9017();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9006 f25302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25303;

    public /* synthetic */ C9009(int i, String str, C9006 c9006) {
        if (2 != (i & 2)) {
            AbstractC7143.m12393(i, 2, C9018.f25313.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f25303 = "";
        } else {
            this.f25303 = str;
        }
        this.f25302 = c9006;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9009)) {
            return false;
        }
        C9009 c9009 = (C9009) obj;
        return AbstractC4394.m8917(this.f25303, c9009.f25303) && AbstractC4394.m8917(this.f25302, c9009.f25302);
    }

    public final int hashCode() {
        return this.f25302.hashCode() + (this.f25303.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Info(operatorUid=");
        AbstractC6136.m11531(sb, this.f25303, -3937694380052448679L);
        sb.append(this.f25302);
        sb.append(')');
        return sb.toString();
    }

    public C9009(String str, C9006 c9006) {
        AbstractC6136.m11546(-3937702875497760167L, -3937694882563622311L, str);
        this.f25303 = str;
        this.f25302 = c9006;
    }
}
