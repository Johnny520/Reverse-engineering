package tf;

import java.util.AbstractSet;
import java.util.Set;
import p114hg.InterfaceC1715e;

/* JADX INFO: renamed from: tf.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4161h extends AbstractSet implements Set, InterfaceC1715e {
    /* JADX INFO: renamed from: a */
    public abstract int mo6942a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo6942a();
    }
}
