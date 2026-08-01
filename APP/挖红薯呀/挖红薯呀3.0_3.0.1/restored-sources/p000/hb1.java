package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 extends jb1 implements Iterable, p40 {

    /* JADX INFO: renamed from: d */
    public final List f2194d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2195e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hb1(List list, ArrayList arrayList) {
        this.f2194d = list;
        this.f2195e = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hb1)) {
            return false;
        }
        hb1 hb1Var = (hb1) obj;
        return p30.m3002l(this.f2194d, hb1Var.f2194d) && this.f2195e.equals(hb1Var.f2195e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2195e.hashCode() + ((this.f2194d.hashCode() + AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0016af(this);
    }
}
