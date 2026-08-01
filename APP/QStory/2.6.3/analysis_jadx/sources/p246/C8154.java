package p246;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.AbstractC4359;
import kotlin.jvm.internal.AbstractC4395;
import p075.C6958;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8154 extends AbstractC4359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6958 f22484 = new C6958(19);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f22485;

    public C8154() {
        ArrayList arrayList = new ArrayList();
        super(f22484);
        this.f22485 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8154) && AbstractC4395.m8907(this.f22485, ((C8154) obj).f22485);
    }

    public final int hashCode() {
        return this.f22485.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("PluginsTrace("), AbstractC4344.m8810(this.f22485, null, null, null, null, 63), ')');
    }
}
