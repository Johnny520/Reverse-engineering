package androidx.collection;

import com.alibaba.fastjson2.AbstractC2904;
import java.util.Iterator;
import kotlin.sequences.C5127;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5127 f883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0237 f884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f885 = -1;

    public C0238(C0237 c0237) {
        this.f884 = c0237;
        this.f883 = AbstractC2904.m6249(new MutableSetWrapper$iterator$1$iterator$1(c0237, this, null));
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
            this.f884.f882.m741(i);
            this.f885 = -1;
        }
    }
}
