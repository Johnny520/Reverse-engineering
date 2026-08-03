package p363y7;

import java.util.Collection;
import java.util.Comparator;
import p379z7.C6107c;

/* JADX INFO: renamed from: y7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6000b extends C6107c {

    /* JADX INFO: renamed from: p */
    public boolean f24366p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (m10867c(obj) || obj == null) {
            return false;
        }
        this.f24366p = false;
        return super.add(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i9 = this.f24644i;
        add(collection.iterator());
        return i9 != this.f24644i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove = super.remove(obj);
        if (zRemove) {
            this.f24366p = false;
        }
        return zRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.C6107c, java.util.List
    public final void sort(Comparator comparator) {
        boolean z9 = this.f24366p;
        if (!z9) {
            if (this.f24644i < 2) {
                z9 = true;
            }
            this.f24366p = true;
        }
        if (z9) {
            return;
        }
        super.sort(comparator);
    }
}
