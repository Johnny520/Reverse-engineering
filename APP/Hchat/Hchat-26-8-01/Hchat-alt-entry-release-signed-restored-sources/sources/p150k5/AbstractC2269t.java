package p150k5;

import java.util.AbstractList;

/* JADX INFO: renamed from: k5.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2269t extends AbstractList {
    /* JADX INFO: renamed from: a */
    public abstract Object mo5496a(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public Object get(int i9) {
        if (i9 < 0 || i9 >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return mo5496a(i9);
    }
}
