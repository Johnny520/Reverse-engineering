package androidx.collection;

import com.alibaba.fastjson2.AbstractC2904;
import java.util.Iterator;
import kotlin.sequences.C5127;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0239 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5127 f886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0240 f887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f888 = -1;

    public C0239(C0240 c0240) {
        this.f887 = c0240;
        this.f886 = AbstractC2904.m6249(new MutableOrderedSetWrapper$iterator$1$iterator$1(c0240, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f886.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f886.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f888;
        if (i != -1) {
            this.f887.f889.m766(i);
            this.f888 = -1;
        }
    }
}
