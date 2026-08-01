package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4555 extends AbstractC4547 {
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof C4554) {
            string = "\"" + ((Object) ((C4554) this).f13303) + '\"';
        } else {
            string = mo9144().toString();
        }
        return AbstractC0053.m155(sb, string, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo9144();
}
