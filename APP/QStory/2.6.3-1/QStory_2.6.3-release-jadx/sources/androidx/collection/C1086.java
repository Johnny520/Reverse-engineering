package androidx.collection;

import java.util.Iterator;
import kotlin.sequences.C5960;
import p069.AbstractC7390;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1086 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5960 f1231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1087 f1232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1233 = -1;

    public C1086(C1087 c1087) {
        this.f1232 = c1087;
        this.f1231 = AbstractC7390.m12604(new MutableOrderedSetWrapper$iterator$1$iterator$1(c1087, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1231.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1231.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1233;
        if (i != -1) {
            this.f1232.f1234.m1327(i);
            this.f1233 = -1;
        }
    }
}
