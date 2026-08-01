package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends AbstractC0414l0 implements Set, Collection, p40 {

    /* JADX INFO: renamed from: g */
    public static final oq0 f4605g;

    /* JADX INFO: renamed from: d */
    public final Object f4606d;

    /* JADX INFO: renamed from: e */
    public final Object f4607e;

    /* JADX INFO: renamed from: f */
    public final gq0 f4608f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0496n2 c0496n2 = C0496n2.f4124D;
        f4605g = new oq0(c0496n2, c0496n2, gq0.f2036f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oq0(Object obj, Object obj2, gq0 gq0Var) {
        this.f4606d = obj;
        this.f4607e = obj2;
        this.f4608f = gq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p
    /* JADX INFO: renamed from: a */
    public final int mo6a() {
        return this.f4608f.f2038e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4608f.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0410kx(this.f4606d, this.f4608f);
    }
}
