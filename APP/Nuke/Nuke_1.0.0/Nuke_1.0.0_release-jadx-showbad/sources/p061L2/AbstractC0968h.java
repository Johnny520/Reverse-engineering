package p061L2;

import java.util.AbstractSet;
import java.util.Set;
import p122Y2.InterfaceC1769d;

/* JADX INFO: renamed from: L2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0968h extends AbstractSet implements Set, InterfaceC1769d {
    /* JADX INFO: renamed from: a */
    public abstract int mo1978a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo1978a();
    }
}
