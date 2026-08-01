package bsh.classpath;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import org.apache.commons.io.comparator.CompositeFileComparator;
import org.apache.commons.io.monitor.FileAlterationObserver;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2601 implements IntFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7792;

    public /* synthetic */ C2601(int i) {
        this.f7792 = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f7792) {
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
