package bsh;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2641 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7911;

    public /* synthetic */ C2641(int i) {
        this.f7911 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7911) {
            case 0:
                return BSHClassDeclaration.lambda$generateClass$0((BshMethod) obj);
            case 1:
                return ((AbstractC2624) obj).mo5268();
            case 2:
                return AbstractC2666.m5387((Class) obj);
            case 3:
                return (((Method) obj).getModifiers() & 1024) > 0;
            case 4:
                return Objects.nonNull((Variable) obj);
            case 5:
                return Objects.nonNull(obj);
            case 6:
                return !((String) obj).matches("_?bsh.*");
            default:
                return !((String) obj).isEmpty();
        }
    }
}
