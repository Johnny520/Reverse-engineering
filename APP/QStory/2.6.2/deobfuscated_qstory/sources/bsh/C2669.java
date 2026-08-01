package bsh;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2669 implements IntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f8007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8008;

    public /* synthetic */ C2669(Object obj, int i) {
        this.f8008 = i;
        this.f8007 = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.f8008;
        Object obj = this.f8007;
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
