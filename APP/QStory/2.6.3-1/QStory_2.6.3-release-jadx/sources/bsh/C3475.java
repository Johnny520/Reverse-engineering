package bsh;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3475 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8258;

    public /* synthetic */ C3475(int i) {
        this.f8258 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f8258) {
            case 0:
                return BSHClassDeclaration.lambda$generateClass$0((BshMethod) obj);
            case 1:
                return ((AbstractC3458) obj).mo5873();
            case 2:
                return AbstractC3500.m5992((Class) obj);
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
