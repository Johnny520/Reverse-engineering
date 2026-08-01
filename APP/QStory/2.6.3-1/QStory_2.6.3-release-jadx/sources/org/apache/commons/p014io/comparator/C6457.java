package org.apache.commons.p014io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import org.apache.commons.p014io.monitor.FileAlterationObserver;
import org.apache.commons.p014io.monitor.FileEntry;

/* JADX INFO: renamed from: org.apache.commons.io.comparator.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6457 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15856;

    public /* synthetic */ C6457(Serializable serializable, Serializable serializable2, int i) {
        this.f15856 = i;
        this.f15854 = serializable;
        this.f15855 = serializable2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f15856;
        Serializable serializable = this.f15855;
        Serializable serializable2 = this.f15854;
        switch (i) {
            case 0:
                return CompositeFileComparator.lambda$compare$1((File) serializable2, (File) serializable, (Comparator) obj);
            default:
                return ((FileAlterationObserver) serializable2).lambda$listFileEntries$5((FileEntry) serializable, (File) obj);
        }
    }
}
