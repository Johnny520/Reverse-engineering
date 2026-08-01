package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3387 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f11044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11045 = 1;

    public C3387(Iterator it) {
        this.f11044 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11045) {
        }
        return this.f11044.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11045) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f11044.next();
                if (!(entry.getValue() instanceof C3383)) {
                    return entry;
                }
                C3388 c3388 = new C3388();
                c3388.f11046 = entry;
                return c3388;
            default:
                return (String) this.f11044.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11045) {
            case 0:
                this.f11044.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ C3387() {
    }
}
