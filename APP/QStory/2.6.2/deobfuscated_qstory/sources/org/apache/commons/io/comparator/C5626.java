package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;

/* JADX INFO: renamed from: org.apache.commons.io.comparator.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5626 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15511;

    public /* synthetic */ C5626(Serializable serializable, Serializable serializable2, int i) {
        this.f15511 = i;
        this.f15509 = serializable;
        this.f15510 = serializable2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f15511;
        Serializable serializable = this.f15510;
        Serializable serializable2 = this.f15509;
        switch (i) {
            case 0:
                return CompositeFileComparator.lambda$compare$1((File) serializable2, (File) serializable, (Comparator) obj);
            default:
                return ((FileAlterationObserver) serializable2).lambda$listFileEntries$5((FileEntry) serializable, (File) obj);
        }
    }
}
