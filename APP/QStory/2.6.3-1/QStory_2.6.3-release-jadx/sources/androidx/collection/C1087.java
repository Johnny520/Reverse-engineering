package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7391;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1087 extends AbstractC1136 implements InterfaceC7391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1090 f1234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087(C1090 c1090) {
        super(c1090);
        c1090.getClass();
        this.f1234 = c1090;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f1234.m1326(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C1090 c1090 = this.f1234;
        c1090.getClass();
        int i = c1090.f1359;
        for (Object obj : collection) {
            int iM1324 = c1090.m1324(obj);
            c1090.f1357[iM1324] = obj;
            long[] jArr = c1090.f1356;
            int i2 = c1090.f1355;
            jArr[iM1324] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iM1324) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            c1090.f1355 = iM1324;
            if (c1090.f1354 == Integer.MAX_VALUE) {
                c1090.f1354 = iM1324;
            }
        }
        return i != c1090.f1359;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1234.m1325();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1086(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f1234.m1328(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int iNumberOfTrailingZeros;
        collection.getClass();
        C1090 c1090 = this.f1234;
        c1090.getClass();
        int i2 = c1090.f1359;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = iHashCode ^ (iHashCode << 16);
            int i6 = i5 & 127;
            int i7 = c1090.f1353;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = c1090.f1358;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                long j = ((jArr[i9 + i3] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
                long j2 = (((long) i6) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
                    int i11 = i3;
                    if (AbstractC5227.m9466(c1090.f1357[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i3 = i11;
                }
                i4 += 8;
                i8 = (i8 + i4) & i7;
                i3 = i;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c1090.m1327(iNumberOfTrailingZeros);
            }
        }
        return i2 != c1090.f1359;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f1234.m1329(collection);
    }
}
