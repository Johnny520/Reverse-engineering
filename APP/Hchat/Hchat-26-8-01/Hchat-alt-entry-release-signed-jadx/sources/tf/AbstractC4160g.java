package tf;

import java.util.AbstractList;
import java.util.List;
import p114hg.InterfaceC1713c;

/* JADX INFO: renamed from: tf.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4160g extends AbstractList implements List, InterfaceC1713c {
    /* JADX INFO: renamed from: a */
    public abstract int mo6457a();

    /* JADX INFO: renamed from: c */
    public abstract Object mo6458c(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i9) {
        return mo6458c(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo6457a();
    }
}
