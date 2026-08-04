package yyds;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛵᲇᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1229 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1821 f5643;

    public AbstractC1229(C1821 c1821) {
        this.f5643 = c1821;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract Object mo2501(Object obj);

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        Object objMo2503 = mo2503();
        Map map = this.f5643.f9148;
        try {
            c1942.m3769();
            while (c1942.m3753()) {
                C1782 c1782 = (C1782) map.get(c1942.m3741());
                if (c1782 == null) {
                    c1942.m3754();
                } else {
                    mo2502(objMo2503, c1942, c1782);
                }
            }
            c1942.m3768();
            return mo2501(objMo2503);
        } catch (IllegalAccessException e) {
            AbstractC1741 abstractC1741 = AbstractC1301.f5958;
            C1693.m3442("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new C1600(e2);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        if (obj == null) {
            c1405.m2857();
            return;
        }
        c1405.m2858();
        try {
            Iterator it = this.f5643.f9149.iterator();
            while (it.hasNext()) {
                ((C1782) it.next()).m3540(c1405, obj);
            }
            c1405.m2865();
        } catch (IllegalAccessException e) {
            AbstractC1741 abstractC1741 = AbstractC1301.f5958;
            C1693.m3442("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract void mo2502(Object obj, C1942 c1942, C1782 c1782);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public abstract Object mo2503();
}
