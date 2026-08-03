package p009E0;

import java.util.AbstractList;
import java.util.List;
import p033R0.InterfaceC0320b;

/* JADX INFO: renamed from: E0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176g extends AbstractList implements List, InterfaceC0320b {
    public AbstractC0176g() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo521a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo522b(int r1);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r1) {
        return mo522b(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo521a();
    }
}
