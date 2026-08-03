package p384ze;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import p302ud.C4305a;
import p302ud.C4322r;
import p351xe.C5786g;

/* JADX INFO: renamed from: ze.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6141c implements Iterable {

    /* JADX INFO: renamed from: g */
    public final C4322r f24737g;

    /* JADX INFO: renamed from: h */
    public final BitSet f24738h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6141c(C4322r c4322r) {
        this.f24737g = c4322r;
        this.f24738h = new BitSet(c4322r.f14425z.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10907a(C4305a c4305a) {
        this.f24738h.set(c4305a.f14349j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m10908b(C4305a c4305a) {
        return this.f24738h.get(c4305a.f14349j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m10909c() {
        BitSet bitSet = this.f24738h;
        if (bitSet == null || bitSet == C5786g.f23528g) {
            return Collections.EMPTY_LIST;
        }
        int iCardinality = bitSet.cardinality();
        if (iCardinality == 0) {
            return Collections.EMPTY_LIST;
        }
        List list = this.f24737g.f14425z;
        ArrayList arrayList = new ArrayList(iCardinality);
        int i9 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i9);
            if (iNextSetBit < 0) {
                return arrayList;
            }
            arrayList.add((C4305a) list.get(iNextSetBit));
            i9 = iNextSetBit + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        BitSet bitSet = this.f24738h;
        if (bitSet.isEmpty()) {
            return;
        }
        List list = this.f24737g.f14425z;
        int i9 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i9);
            if (iNextSetBit < 0) {
                return;
            }
            consumer.accept(list.get(iNextSetBit));
            i9 = iNextSetBit + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        BitSet bitSet = this.f24738h;
        return new C6140b(bitSet, bitSet.cardinality(), this.f24737g.f14425z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Spliterator spliterator() {
        BitSet bitSet = this.f24738h;
        int iCardinality = bitSet.cardinality();
        return Spliterators.spliterator(new C6140b(bitSet, iCardinality, this.f24737g.f14425z), iCardinality, 17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m10909c().toString();
    }
}
