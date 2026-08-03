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
    public static final AbstractC2158d m4986a(String str) {
        return str == null ? JsonNull.INSTANCE : new C0072Bm(str, true);
    }

    /* JADX INFO: renamed from: b */
    public static final void m4987b(AbstractC2156b abstractC2156b, String str) {
        throw new IllegalArgumentException("Element " + AbstractC0425Jv.m881a(abstractC2156b.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: c */
    public static final String m4988c(AbstractC2158d abstractC2158d) {
        if (abstractC2158d instanceof JsonNull) {
            return null;
        }
        return abstractC2158d.mo121a();
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2158d m4989d(AbstractC2156b abstractC2156b) {
        AbstractC2158d abstractC2158d = abstractC2156b instanceof AbstractC2158d ? (AbstractC2158d) abstractC2156b : null;
        if (abstractC2158d != null) {
            return abstractC2158d;
        }
        m4987b(abstractC2156b, "JsonPrimitive");
        throw null;
    }
}
