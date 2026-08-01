package androidx.collection;

import java.util.Iterator;
import kotlin.sequences.C5960;
import p069.AbstractC7390;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1085 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5960 f1228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1084 f1229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1230 = -1;

    public C1085(C1084 c1084) {
        this.f1229 = c1084;
        this.f1228 = AbstractC7390.m12604(new MutableSetWrapper$iterator$1$iterator$1(c1084, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1228.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1228.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1230;
        if (i != -1) {
            this.f1229.f1227.m1302(i);
            this.f1230 = -1;
        }
    }
}
