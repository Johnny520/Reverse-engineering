package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947z2 extends AbstractList implements List, q41 {
    /* JADX INFO: renamed from: a */
    public abstract int mo152a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo153b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo153b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo152a();
    }
}
