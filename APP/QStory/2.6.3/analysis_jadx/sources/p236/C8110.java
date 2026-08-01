package p236;

import androidx.appcompat.app.AbstractC0080;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8110 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f22403 = 0;

    static {
        new C8110("file");
        new C8110("mixed");
        new C8110("attachment");
        new C8110("inline");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8110(String str, List list) {
        super(str, list);
        str.getClass();
        list.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8110)) {
            return false;
        }
        C8110 c8110 = (C8110) obj;
        return AbstractC4395.m8907((String) this.f231, (String) c8110.f231) && AbstractC4395.m8907((List) this.f232, (List) c8110.f232);
    }

    public final int hashCode() {
        return ((List) this.f232).hashCode() + (((String) this.f231).hashCode() * 31);
    }

    public C8110(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
