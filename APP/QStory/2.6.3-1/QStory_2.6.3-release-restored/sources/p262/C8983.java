package p262;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.AbstractC5191;
import kotlin.jvm.internal.AbstractC5227;
import p091.C7787;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8983 extends AbstractC5191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7787 f22829 = new C7787(19);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f22830;

    public C8983() {
        ArrayList arrayList = new ArrayList();
        super(f22829);
        this.f22830 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8983) && AbstractC5227.m9466(this.f22830, ((C8983) obj).f22830);
    }

    public final int hashCode() {
        return this.f22830.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("PluginsTrace("), AbstractC5176.m9369(this.f22830, null, null, null, null, 63), ')');
    }
}
