package p224q2;

import com.bumptech.glide.AbstractC1923e;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p241t2.AbstractC3211c;
import p252v2.C3352a;

/* JADX INFO: renamed from: q2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2913d implements InterfaceC2771C, Cloneable {

    /* JADX INFO: renamed from: f */
    public static final C2913d f9207f = new C2913d();

    /* JADX INFO: renamed from: d */
    public final List f9208d;

    /* JADX INFO: renamed from: e */
    public final List f9209e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2913d() {
        List list = Collections.EMPTY_LIST;
        this.f9208d = list;
        this.f9209e = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class cls = c3352a.f10417a;
        boolean zM5108e = m5108e(cls, true);
        boolean zM5108e2 = m5108e(cls, false);
        if (zM5108e || zM5108e2) {
            return new C2912c(this, zM5108e2, zM5108e, c2785n, c3352a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            return (C2913d) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5108e(Class cls, boolean z5) {
        if (!z5 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z5 ? this.f9208d : this.f9209e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
