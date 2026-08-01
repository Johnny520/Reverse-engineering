package p236;

import androidx.appcompat.app.AbstractC0080;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8109 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f22405 = 0;

    static {
        new C8109("file");
        new C8109("mixed");
        new C8109("attachment");
        new C8109("inline");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8109(String str, List list) {
        super(str, list);
        str.getClass();
        list.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8109)) {
            return false;
        }
        C8109 c8109 = (C8109) obj;
        return AbstractC4394.m8917((String) this.f231, (String) c8109.f231) && AbstractC4394.m8917((List) this.f232, (List) c8109.f232);
    }

    public final int hashCode() {
        return ((List) this.f232).hashCode() + (((String) this.f231).hashCode() * 31);
    }

    public C8109(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
