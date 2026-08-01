package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C4695;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3346 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f10977;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Iterator f10978;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10979 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10980;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10981;

    public /* synthetic */ C3346(AbstractMap abstractMap, int i) {
        this.f10981 = i;
        this.f10977 = abstractMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f10981;
        AbstractMap abstractMap = this.f10977;
        switch (i) {
            case 0:
                C3349 c3349 = (C3349) abstractMap;
                if (this.f10979 + 1 < c3349.f10990 || (!c3349.f10991.isEmpty() && m7414().hasNext())) {
                }
                break;
            default:
                if (this.f10979 + 1 < ((C4695) abstractMap).f13740.size() || m7414().hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10981;
        AbstractMap abstractMap = this.f10977;
        switch (i) {
            case 0:
                this.f10980 = true;
                int i2 = this.f10979 + 1;
                this.f10979 = i2;
                C3349 c3349 = (C3349) abstractMap;
                if (i2 >= c3349.f10990) {
                }
                break;
            default:
                this.f10980 = true;
                int i3 = this.f10979 + 1;
                this.f10979 = i3;
                C4695 c4695 = (C4695) abstractMap;
                if (i3 >= c4695.f13740.size()) {
                }
                break;
        }
        return (Map.Entry) m7414().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f10981;
        AbstractMap abstractMap = this.f10977;
        switch (i) {
            case 0:
                C3349 c3349 = (C3349) abstractMap;
                if (!this.f10980) {
                    C5919.m11250("remove() was called before next()");
                } else {
                    this.f10980 = false;
                    int i2 = C3349.f10986;
                    c3349.m7421();
                    int i3 = this.f10979;
                    if (i3 >= c3349.f10990) {
                        m7414().remove();
                    } else {
                        this.f10979 = i3 - 1;
                        c3349.m7424(i3);
                    }
                }
                break;
            default:
                C4695 c4695 = (C4695) abstractMap;
                if (!this.f10980) {
                    C5919.m11250("remove() was called before next()");
                } else {
                    this.f10980 = false;
                    int i4 = C4695.f13737;
                    c4695.m9354();
                    if (this.f10979 >= c4695.f13740.size()) {
                        m7414().remove();
                    } else {
                        int i5 = this.f10979;
                        this.f10979 = i5 - 1;
                        c4695.m9350(i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator m7414() {
        int i = this.f10981;
        AbstractMap abstractMap = this.f10977;
        switch (i) {
            case 0:
                if (this.f10978 == null) {
                    this.f10978 = ((C3349) abstractMap).f10991.entrySet().iterator();
                }
                break;
            default:
                if (this.f10978 == null) {
                    this.f10978 = ((C4695) abstractMap).f13741.entrySet().iterator();
                }
                break;
        }
        return this.f10978;
    }
}
