package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3386 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f11039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11040 = 1;

    public C3386(Iterator it) {
        this.f11039 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11040) {
        }
        return this.f11039.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11040) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f11039.next();
                if (!(entry.getValue() instanceof C3382)) {
                    return entry;
                }
                C3387 c3387 = new C3387();
                c3387.f11041 = entry;
                return c3387;
            default:
                return (String) this.f11039.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11040) {
            case 0:
                this.f11039.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ C3386() {
    }
}
