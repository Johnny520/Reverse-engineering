package p207o5;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o5.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3060o extends AbstractSet {
    /* JADX INFO: renamed from: a */
    public abstract Object mo5520a(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3059n(this);
    }
}
