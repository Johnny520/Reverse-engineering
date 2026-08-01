package bsh.classpath;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import org.apache.commons.p014io.comparator.CompositeFileComparator;
import org.apache.commons.p014io.monitor.FileAlterationObserver;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3435 implements IntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8139;

    public /* synthetic */ C3435(int i) {
        this.f8139 = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f8139) {
            case 0:
                return new String[i];
            case 1:
                return new String[i];
            case 2:
                return new AtomicInteger(i);
            case 3:
                return CompositeFileComparator.lambda$new$0(i);
            default:
                return FileAlterationObserver.lambda$listFileEntries$6(i);
        }
    }
}
