package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C5528;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4179 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f11327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Iterator f11328;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11329 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f11330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11331;

    public /* synthetic */ C4179(AbstractMap abstractMap, int i) {
        this.f11331 = i;
        this.f11327 = abstractMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f11331;
        AbstractMap abstractMap = this.f11327;
        switch (i) {
            case 0:
                C4182 c4182 = (C4182) abstractMap;
                if (this.f11329 + 1 < c4182.f11340 || (!c4182.f11341.isEmpty() && m7960().hasNext())) {
                }
                break;
            default:
                if (this.f11329 + 1 < ((C5528) abstractMap).f14089.size() || m7960().hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f11331;
        AbstractMap abstractMap = this.f11327;
        switch (i) {
            case 0:
                this.f11330 = true;
                int i2 = this.f11329 + 1;
                this.f11329 = i2;
                C4182 c4182 = (C4182) abstractMap;
                if (i2 >= c4182.f11340) {
                }
                break;
            default:
                this.f11330 = true;
                int i3 = this.f11329 + 1;
                this.f11329 = i3;
                C5528 c5528 = (C5528) abstractMap;
                if (i3 >= c5528.f14089.size()) {
                }
                break;
        }
        return (Map.Entry) m7960().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f11331;
        AbstractMap abstractMap = this.f11327;
        switch (i) {
            case 0:
                C4182 c4182 = (C4182) abstractMap;
                if (!this.f11330) {
                    C6755.m11870("remove() was called before next()");
                } else {
                    this.f11330 = false;
                    int i2 = C4182.f11336;
                    c4182.m7967();
                    int i3 = this.f11329;
                    if (i3 >= c4182.f11340) {
                        m7960().remove();
                    } else {
                        this.f11329 = i3 - 1;
                        c4182.m7970(i3);
                    }
                }
                break;
            default:
                C5528 c5528 = (C5528) abstractMap;
                if (!this.f11330) {
                    C6755.m11870("remove() was called before next()");
                } else {
                    this.f11330 = false;
                    int i4 = C5528.f14086;
                    c5528.m9903();
                    if (this.f11329 >= c5528.f14089.size()) {
                        m7960().remove();
                    } else {
                        int i5 = this.f11329;
                        this.f11329 = i5 - 1;
                        c5528.m9899(i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator m7960() {
        int i = this.f11331;
        AbstractMap abstractMap = this.f11327;
        switch (i) {
            case 0:
                if (this.f11328 == null) {
                    this.f11328 = ((C4182) abstractMap).f11341.entrySet().iterator();
                }
                break;
            default:
                if (this.f11328 == null) {
                    this.f11328 = ((C5528) abstractMap).f14090.entrySet().iterator();
                }
                break;
        }
        return this.f11328;
    }
}
