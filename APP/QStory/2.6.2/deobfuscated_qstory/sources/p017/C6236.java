package p017;

import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4206;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.InterfaceC5092;
import kotlin.sequences.AbstractC5121;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6236 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3055 f17185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f17186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5092 f17187;

    public C6236(InterfaceC5092 interfaceC5092, Object obj, AbstractC3055 abstractC3055) {
        obj.getClass();
        abstractC3055.getClass();
        this.f17187 = interfaceC5092;
        this.f17186 = obj;
        this.f17185 = abstractC3055;
    }

    public final String toString() {
        List listM8798;
        List listM10106 = AbstractC5121.m10106(AbstractC5121.m10112(this, new C4206(25)));
        listM10106.getClass();
        if (listM10106.size() <= 1) {
            listM8798 = AbstractC4343.m8804(listM10106);
        } else {
            listM8798 = AbstractC4343.m8798(listM10106);
            Collections.reverse(listM8798);
        }
        return AbstractC4343.m8813(listM8798, null, "{", "}", new C4206(26), 25);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC3055 mo6649(InterfaceC5092 interfaceC5092, Object obj) {
        InterfaceC5092 interfaceC50922 = this.f17187;
        boolean zEquals = interfaceC5092.equals(interfaceC50922);
        AbstractC3055 abstractC3055 = this.f17185;
        if (!zEquals) {
            AbstractC3055 abstractC3055Mo6649 = abstractC3055.mo6649(interfaceC5092, null);
            if (abstractC3055Mo6649 != abstractC3055) {
                this = new C6236(interfaceC50922, this.f17186, abstractC3055Mo6649);
            }
            abstractC3055 = this;
        }
        return obj != null ? new C6236(interfaceC5092, obj, abstractC3055) : abstractC3055;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo6651(InterfaceC5092 interfaceC5092) {
        return interfaceC5092.equals(this.f17187) ? AbstractC6560.m12029(interfaceC5092).cast(this.f17186) : this.f17185.mo6651(interfaceC5092);
    }
}
