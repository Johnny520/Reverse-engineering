package androidx.collection;

import java.util.Iterator;
import kotlin.sequences.C5128;
import p053.AbstractC6561;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5128 f883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0237 f884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f885 = -1;

    public C0238(C0237 c0237) {
        this.f884 = c0237;
        this.f883 = AbstractC6561.m12045(new MutableSetWrapper$iterator$1$iterator$1(c0237, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f883.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f883.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f885;
        if (i != -1) {
            this.f884.f882.m742(i);
            this.f885 = -1;
        }
    }
}
