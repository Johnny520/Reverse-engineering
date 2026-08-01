package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4556 extends AbstractC4548 {
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof C4555) {
            string = "\"" + ((Object) ((C4555) this).f13307) + '\"';
        } else {
            string = mo9134().toString();
        }
        return AbstractC0053.m148(sb, string, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo9134();
}
