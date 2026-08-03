package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lA */
/* JADX INFO: loaded from: classes.dex */
public final class C2181lA implements Iterable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7611a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final AbstractActivityC1244c3 f7612b;

    public C2181lA(AbstractActivityC1244c3 abstractActivityC1244c3) {
        this.f7612b = abstractActivityC1244c3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f7611a.iterator();
    }
}
