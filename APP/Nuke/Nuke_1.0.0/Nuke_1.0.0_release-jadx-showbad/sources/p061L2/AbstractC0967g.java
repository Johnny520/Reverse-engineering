package p061L2;

import java.util.AbstractList;
import java.util.List;
import p122Y2.InterfaceC1767b;

/* JADX INFO: renamed from: L2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0967g extends AbstractList implements List, InterfaceC1767b {
    /* JADX INFO: renamed from: a */
    public abstract int mo1976a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo1977b(int i5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i5) {
        return mo1977b(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo1976a();
    }
}
