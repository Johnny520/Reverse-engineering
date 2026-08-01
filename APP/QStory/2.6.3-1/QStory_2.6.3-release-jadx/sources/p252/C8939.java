package p252;

import androidx.appcompat.app.AbstractC0927;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8939 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f22748 = 0;

    static {
        new C8939("file");
        new C8939("mixed");
        new C8939("attachment");
        new C8939("inline");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8939(String str, List list) {
        super(str, list);
        str.getClass();
        list.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8939)) {
            return false;
        }
        C8939 c8939 = (C8939) obj;
        return AbstractC5227.m9466((String) this.f576, (String) c8939.f576) && AbstractC5227.m9466((List) this.f577, (List) c8939.f577);
    }

    public final int hashCode() {
        return ((List) this.f577).hashCode() + (((String) this.f576).hashCode() * 31);
    }

    public C8939(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
