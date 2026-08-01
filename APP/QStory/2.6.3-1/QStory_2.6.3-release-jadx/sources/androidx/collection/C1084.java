package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import p070.InterfaceC7391;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1084 extends AbstractC1131 implements InterfaceC7391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1082 f1227;

    public C1084(C1082 c1082) {
        super(c1082);
        this.f1227 = c1082;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f1227.m1301(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C1082 c1082 = this.f1227;
        c1082.getClass();
        int i = c1082.f1343;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1082.m1305(it.next());
        }
        return i != c1082.f1343;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1227.m1300();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1085(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f1227.m1306(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        C1082 c1082 = this.f1227;
        c1082.getClass();
        int i = c1082.f1343;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1082.m1307(it.next());
        }
        return i != c1082.f1343;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        C1082 c1082 = this.f1227;
        c1082.getClass();
        Object[] objArr = c1082.f1345;
        int i = c1082.f1343;
        long[] jArr = c1082.f1346;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC5176.m9365(collection, objArr[i5])) {
                                c1082.m1302(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != c1082.f1343;
    }
}
