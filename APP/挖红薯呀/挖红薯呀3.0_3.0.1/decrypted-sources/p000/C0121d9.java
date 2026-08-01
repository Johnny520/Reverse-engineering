package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: d9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0121d9 extends n11 implements Map {

    /* JADX INFO: renamed from: g */
    public C0954y8 f1003g;

    /* JADX INFO: renamed from: h */
    public C0010a9 f1004h;

    /* JADX INFO: renamed from: i */
    public C0083c9 f1005i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        C0954y8 c0954y8 = this.f1003g;
        if (c0954y8 != null) {
            return c0954y8;
        }
        C0954y8 c0954y82 = new C0954y8(this);
        this.f1003g = c0954y82;
        return c0954y82;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m663i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m664j(Collection collection) {
        int i = this.f4120f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f4120f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C0010a9 c0010a9 = this.f1004h;
        if (c0010a9 != null) {
            return c0010a9;
        }
        C0010a9 c0010a92 = new C0010a9(this);
        this.f1004h = c0010a92;
        return c0010a92;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f4120f;
        int i = this.f4120f;
        int[] iArr = this.f4118d;
        if (iArr.length < size) {
            this.f4118d = Arrays.copyOf(iArr, size);
            this.f4119e = Arrays.copyOf(this.f4119e, size * 2);
        }
        if (this.f4120f != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        C0083c9 c0083c9 = this.f1005i;
        if (c0083c9 != null) {
            return c0083c9;
        }
        C0083c9 c0083c92 = new C0083c9(this);
        this.f1005i = c0083c92;
        return c0083c92;
    }
}
