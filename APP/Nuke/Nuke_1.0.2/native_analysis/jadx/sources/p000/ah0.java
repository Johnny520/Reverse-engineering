package p000;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements r43, Cloneable {

    /* JADX INFO: renamed from: j */
    public static final ah0 f199j = new ah0();

    /* JADX INFO: renamed from: h */
    public final List f200h;

    /* JADX INFO: renamed from: i */
    public final List f201i;

    public ah0() {
        List list = Collections.EMPTY_LIST;
        this.f200h = list;
        this.f201i = list;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        Class cls = j63Var.f4904a;
        boolean zM169d = m169d(cls, true);
        boolean zM169d2 = m169d(cls, false);
        if (zM169d || zM169d2) {
            return new zg0(this, zM169d2, zM169d, ir0Var, j63Var);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (ah0) super.clone();
        } catch (CloneNotSupportedException e) {
            C0676s.m4650i(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m169d(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            tp0 tp0Var = h72.f3884a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f200h : this.f201i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        c80.m664g();
        return false;
    }
}
