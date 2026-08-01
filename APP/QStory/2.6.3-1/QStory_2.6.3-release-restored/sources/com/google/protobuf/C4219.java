package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4219 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f11389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11390 = 1;

    public C4219(Iterator it) {
        this.f11389 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11390) {
        }
        return this.f11389.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11390) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f11389.next();
                if (!(entry.getValue() instanceof C4215)) {
                    return entry;
                }
                C4220 c4220 = new C4220();
                c4220.f11391 = entry;
                return c4220;
            default:
                return (String) this.f11389.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11390) {
            case 0:
                this.f11389.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ C4219() {
    }
}
