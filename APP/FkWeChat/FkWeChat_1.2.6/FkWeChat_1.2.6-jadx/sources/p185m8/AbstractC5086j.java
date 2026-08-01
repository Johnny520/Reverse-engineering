package p185m8;

import java.util.AbstractList;
import java.util.List;
import p036c9.InterfaceC1403d;

/* JADX INFO: renamed from: m8.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5086j extends AbstractList implements List, InterfaceC1403d {
    /* JADX INFO: renamed from: a */
    public abstract int mo72a();

    /* JADX INFO: renamed from: c */
    public abstract Object mo73c(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return mo73c(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo72a();
    }
}
