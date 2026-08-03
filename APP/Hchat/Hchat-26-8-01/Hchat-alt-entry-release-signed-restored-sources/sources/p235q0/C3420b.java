package p235q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p069f.C0939i0;
import p114hg.InterfaceC1711a;
import p223p0.C3274b;
import p252r0.C3643b;
import tf.AbstractC4162i;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3420b extends AbstractC4162i implements Set, Collection, InterfaceC1711a {

    /* JADX INFO: renamed from: j */
    public static final C3420b f11046j;

    /* JADX INFO: renamed from: g */
    public final Object f11047g;

    /* JADX INFO: renamed from: h */
    public final Object f11048h;

    /* JADX INFO: renamed from: i */
    public final C3274b f11049i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C3643b c3643b = C3643b.f11822a;
        f11046j = new C3420b(c3643b, c3643b, C3274b.f10423i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3420b(Object obj, Object obj2, C3274b c3274b) {
        this.f11047g = obj;
        this.f11048h = obj2;
        this.f11049i = c3274b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11049i.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f11049i.f10425h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0939i0(this.f11047g, this.f11049i);
    }
}
