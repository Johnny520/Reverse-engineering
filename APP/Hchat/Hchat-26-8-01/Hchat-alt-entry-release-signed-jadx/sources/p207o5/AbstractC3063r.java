package p207o5;

import androidx.lifecycle.C0119x;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import p005a5.C0016a;
import p150k5.C2261l;

/* JADX INFO: renamed from: o5.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3063r extends AbstractSequentialList {

    /* JADX INFO: renamed from: g */
    public final C0119x f9902g;

    /* JADX INFO: renamed from: h */
    public final int f9903h;

    /* JADX INFO: renamed from: i */
    public final int f9904i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3063r(C0119x c0119x, int i9, int i10) {
        this.f9902g = c0119x;
        this.f9903h = i9;
        this.f9904i = i10;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5499a(C0016a c0016a, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        C2261l c2261l = new C2261l(this, this.f9902g, this.f9903h, this.f9904i, 3);
        for (int i10 = 0; i10 < i9; i10++) {
            c2261l.next();
        }
        return c2261l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9904i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C2261l(this, this.f9902g, this.f9903h, this.f9904i, 3);
    }
}
