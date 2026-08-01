package p056;

import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6714 implements InterfaceC6795 {
    public static final C6715 Companion = new C6715();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7151 f18147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6720 f18148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6760 f18149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18150;

    public C6714(int i, String str, C6760 c6760, C6720 c6720, C7151 c7151) {
        if (4 != (i & 4)) {
            AbstractC7143.m12393(i, 4, C6712.f18141.getDescriptor());
            throw null;
        }
        this.f18150 = (i & 1) == 0 ? "2024-11-05" : str;
        if ((i & 2) == 0) {
            this.f18149 = new C6760(null, null, null, 63);
        } else {
            this.f18149 = c6760;
        }
        this.f18148 = c6720;
        if ((i & 8) == 0) {
            this.f18147 = AbstractC6601.f17981;
        } else {
            this.f18147 = c7151;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6714)) {
            return false;
        }
        C6714 c6714 = (C6714) obj;
        return AbstractC4394.m8917(this.f18150, c6714.f18150) && AbstractC4394.m8917(this.f18149, c6714.f18149) && AbstractC4394.m8917(this.f18148, c6714.f18148) && AbstractC4394.m8917(this.f18147, c6714.f18147);
    }

    public final int hashCode() {
        return this.f18147.f19121.hashCode() + ((this.f18148.hashCode() + ((this.f18149.hashCode() + (this.f18150.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeResult(protocolVersion=");
        sb.append(this.f18150);
        sb.append(", capabilities=");
        sb.append(this.f18149);
        sb.append(", serverInfo=");
        sb.append(this.f18148);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18147, ')');
    }

    public C6714(String str, C6760 c6760, C6720 c6720) {
        C7151 c7151 = AbstractC6601.f17981;
        str.getClass();
        c6760.getClass();
        c6720.getClass();
        c7151.getClass();
        this.f18150 = str;
        this.f18149 = c6760;
        this.f18148 = c6720;
        this.f18147 = c7151;
    }
}
