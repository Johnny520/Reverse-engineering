package bsh;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3503 implements IntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8355;

    public /* synthetic */ C3503(Object obj, int i) {
        this.f8355 = i;
        this.f8354 = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.f8355;
        Object obj = this.f8354;
        switch (i2) {
            case 0:
                return (Object[]) Array.newInstance((Class<?>) obj, i);
            case 1:
                return ((Object[]) obj)[i];
            case 2:
                return Array.get(obj, i);
            default:
                return ((Iterator) obj).next();
        }
    }
}
