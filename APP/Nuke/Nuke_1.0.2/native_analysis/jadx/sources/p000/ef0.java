package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements Iterable {

    /* JADX INFO: renamed from: h */
    public final ArrayList f2422h;

    public ef0(ArrayList arrayList) {
        this.f2422h = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2422h.iterator();
    }
}
