package p384ze;

import bsh.C0353j;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p302ud.C4305a;

/* JADX INFO: renamed from: ze.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6140b implements Iterator {

    /* JADX INFO: renamed from: g */
    public final BitSet f24732g;

    /* JADX INFO: renamed from: h */
    public final int f24733h;

    /* JADX INFO: renamed from: i */
    public final List f24734i;

    /* JADX INFO: renamed from: j */
    public int f24735j;

    /* JADX INFO: renamed from: k */
    public int f24736k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6140b(BitSet bitSet, int i9, List list) {
        this.f24732g = bitSet;
        this.f24733h = i9;
        this.f24734i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24735j != this.f24733h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int iNextSetBit = this.f24732g.nextSetBit(this.f24736k);
        if (iNextSetBit == -1) {
            C0353j.m1307e();
            return null;
        }
        this.f24736k = iNextSetBit + 1;
        this.f24735j++;
        return (C4305a) this.f24734i.get(iNextSetBit);
    }
}
