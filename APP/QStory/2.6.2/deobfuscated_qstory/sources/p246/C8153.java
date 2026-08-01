package p246;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.AbstractC4358;
import kotlin.jvm.internal.AbstractC4394;
import p075.C6957;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8153 extends AbstractC4358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6957 f22486 = new C6957(19);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f22487;

    public C8153() {
        ArrayList arrayList = new ArrayList();
        super(f22486);
        this.f22487 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8153) && AbstractC4394.m8917(this.f22487, ((C8153) obj).f22487);
    }

    public final int hashCode() {
        return this.f22487.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("PluginsTrace("), AbstractC4343.m8813(this.f22487, null, null, null, null, 63), ')');
    }
}
