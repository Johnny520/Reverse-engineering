package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C4696;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3347 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f10982;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Iterator f10983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10984 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10986;

    public /* synthetic */ C3347(AbstractMap abstractMap, int i) {
        this.f10986 = i;
        this.f10982 = abstractMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f10986;
        AbstractMap abstractMap = this.f10982;
        switch (i) {
            case 0:
                C3350 c3350 = (C3350) abstractMap;
                if (this.f10984 + 1 < c3350.f10995 || (!c3350.f10996.isEmpty() && m7401().hasNext())) {
                }
                break;
            default:
                if (this.f10984 + 1 < ((C4696) abstractMap).f13744.size() || m7401().hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10986;
        AbstractMap abstractMap = this.f10982;
        switch (i) {
            case 0:
                this.f10985 = true;
                int i2 = this.f10984 + 1;
                this.f10984 = i2;
                C3350 c3350 = (C3350) abstractMap;
                if (i2 >= c3350.f10995) {
                }
                break;
            default:
                this.f10985 = true;
                int i3 = this.f10984 + 1;
                this.f10984 = i3;
                C4696 c4696 = (C4696) abstractMap;
                if (i3 >= c4696.f13744.size()) {
                }
                break;
        }
        return (Map.Entry) m7401().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f10986;
        AbstractMap abstractMap = this.f10982;
        switch (i) {
            case 0:
                C3350 c3350 = (C3350) abstractMap;
                if (!this.f10985) {
                    C5925.m11311("remove() was called before next()");
                } else {
                    this.f10985 = false;
                    int i2 = C3350.f10991;
                    c3350.m7408();
                    int i3 = this.f10984;
                    if (i3 >= c3350.f10995) {
                        m7401().remove();
                    } else {
                        this.f10984 = i3 - 1;
                        c3350.m7411(i3);
                    }
                }
                break;
            default:
                C4696 c4696 = (C4696) abstractMap;
                if (!this.f10985) {
                    C5925.m11311("remove() was called before next()");
                } else {
                    this.f10985 = false;
                    int i4 = C4696.f13741;
                    c4696.m9344();
                    if (this.f10984 >= c4696.f13744.size()) {
                        m7401().remove();
                    } else {
                        int i5 = this.f10984;
                        this.f10984 = i5 - 1;
                        c4696.m9340(i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator m7401() {
        int i = this.f10986;
        AbstractMap abstractMap = this.f10982;
        switch (i) {
            case 0:
                if (this.f10983 == null) {
                    this.f10983 = ((C3350) abstractMap).f10996.entrySet().iterator();
                }
                break;
            default:
                if (this.f10983 == null) {
                    this.f10983 = ((C4696) abstractMap).f13745.entrySet().iterator();
                }
                break;
        }
        return this.f10983;
    }
}
