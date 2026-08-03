package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: H4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306H4 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1019a;

    public C0306H4(C0521M4 c0521m4) {
        this.f1019a = c0521m4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0435K4(this.f1019a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1019a.f8818c;
    }
}
