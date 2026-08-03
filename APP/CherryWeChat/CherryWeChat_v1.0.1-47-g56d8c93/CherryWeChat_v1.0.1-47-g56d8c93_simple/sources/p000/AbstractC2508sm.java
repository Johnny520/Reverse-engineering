package p000;

import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.AbstractC2158d;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: sm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2508sm {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f8796a = 0;

    static {
        AbstractC0148Dc.m267a(C2521sz.f8819a, "kotlinx.serialization.json.JsonUnquotedLiteral");
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC2158d m4986a(String r2) {
        if (r2 != null) goto L6;
        return JsonNull.INSTANCE;
    L6:
        return new C0072Bm(r2, true);
    }

    /* JADX INFO: renamed from: b */
    public static final void m4987b(AbstractC2156b r3, String r4) {
        throw new IllegalArgumentException("Element " + AbstractC0425Jv.m881a(r3.getClass()) + " is not a " + r4);
    }

    /* JADX INFO: renamed from: c */
    public static final String m4988c(AbstractC2158d r1) {
        if ((r1 instanceof JsonNull) == false) goto L7;
        return null;
    L7:
        return r1.mo121a();
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2158d m4989d(AbstractC2156b r2) {
        if ((r2 instanceof AbstractC2158d) == false) goto L5;
        AbstractC2158d r0 = (AbstractC2158d) r2;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        m4987b(r2, "JsonPrimitive");
        throw null;
    L5:
        r0 = null;
        goto L6
    }
}
