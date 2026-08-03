package p379z7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6106b extends C6107c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new IllegalArgumentException("Empty ArrayCollection!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new IllegalArgumentException("Empty ArrayCollection!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Collection) && ((Collection) obj).size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return C6112h.f24664g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List
    public final Object remove(int i9) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List
    public final Object set(int i9, Object obj) {
        throw new IllegalArgumentException("Empty ArrayCollection!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i9, int i10) {
        return subList(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C6107c.f24640n;
    }

    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return false;
    }

    @Override // p379z7.C6107c, java.util.List
    public final void add(int i9, Object obj) {
        throw new IllegalArgumentException("Empty ArrayCollection!");
    }

    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final void clear() {
    }

    @Override // p379z7.C6107c
    /* JADX INFO: renamed from: m */
    public final void mo10863m() {
    }

    @Override // p379z7.C6107c
    /* JADX INFO: renamed from: d */
    public final void mo10861d(int i9) {
    }

    @Override // p379z7.C6107c, java.util.List
    public final void sort(Comparator comparator) {
    }

    @Override // p379z7.C6107c
    /* JADX INFO: renamed from: h */
    public final void mo10862h(int i9, boolean z9) {
    }
}
