package p041V;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p049a0.C0367a;

/* JADX INFO: renamed from: V.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0315h implements InterfaceC0275z, Cloneable {

    /* JADX INFO: renamed from: c */
    public static final C0315h f695c;

    /* JADX INFO: renamed from: a */
    public List f696a;

    /* JADX INFO: renamed from: b */
    public List f697b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0315h c0315h = new C0315h();
        List list = Collections.EMPTY_LIST;
        c0315h.f696a = list;
        c0315h.f697b = list;
        f695c = c0315h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m550c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        boolean z2;
        boolean z3;
        boolean zM550c = m550c(c0367a.f860a);
        if (zM550c) {
            z2 = true;
        } else {
            m551b(true);
            z2 = false;
        }
        if (zM550c) {
            z3 = true;
        } else {
            m551b(false);
            z3 = false;
        }
        if (z2 || z3) {
            return new C0314g(this, z3, z2, c0261l, c0367a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m551b(boolean z2) {
        Iterator it = (z2 ? this.f696a : this.f697b).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            return (C0315h) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
