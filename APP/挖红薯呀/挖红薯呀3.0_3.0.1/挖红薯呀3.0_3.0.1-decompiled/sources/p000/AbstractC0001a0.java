package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0001a0 extends AbstractList implements List, r40 {
    /* JADX INFO: renamed from: a */
    public abstract int mo0a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo1b(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo1b(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo0a();
    }
}
