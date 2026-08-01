package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5388 extends AbstractC5380 {
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof C5387) {
            string = "\"" + ((Object) ((C5387) this).f13652) + '\"';
        } else {
            string = mo9693().toString();
        }
        return AbstractC0900.m708(sb, string, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo9693();
}
