package p067g0;

import com.p055lu.wxmask.bean.MaskItemBean;
import p037T.AbstractC0264o;
import p037T.C0261l;
import p037T.C0262m;
import p041V.AbstractC0311d;
import p042W.C0336h;
import p049a0.C0367a;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0575a {

    /* JADX INFO: renamed from: a */
    public static final C0261l f1940a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0262m c0262m = new C0262m();
        c0262m.f626g = true;
        f1940a = c0262m.m486a();
        new C0262m().m486a();
        C0262m c0262m2 = new C0262m();
        c0262m2.f630k = true;
        c0262m2.m486a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1143a(AbstractC0264o abstractC0264o) {
        Object objM479b;
        C0261l c0261l = f1940a;
        c0261l.getClass();
        C0367a c0367a = new C0367a(MaskItemBean.TipData.class);
        if (abstractC0264o == null) {
            objM479b = null;
        } else {
            C0336h c0336h = new C0336h(C0336h.f745t);
            c0336h.f747p = new Object[32];
            c0336h.f748q = 0;
            c0336h.f749r = new String[32];
            c0336h.f750s = new int[32];
            c0336h.m570L(abstractC0264o);
            objM479b = c0261l.m479b(c0336h, c0367a);
        }
        return AbstractC0311d.m549k(MaskItemBean.TipData.class).cast(objM479b);
    }
}
