package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements r43, Cloneable {
    public static final ah0 j = new ah0();
    public final List h;
    public final List i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ah0() {
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        Class cls = j63Var.a;
        boolean zD = d(cls, true);
        boolean zD2 = d(cls, false);
        if (zD || zD2) {
            return new zg0(this, zD2, zD, ir0Var, j63Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            return (ah0) super.clone();
        } catch (CloneNotSupportedException e) {
            s.i(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            tp0 tp0Var = h72.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.h : this.i).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        c80.g();
        return false;
    }
}
