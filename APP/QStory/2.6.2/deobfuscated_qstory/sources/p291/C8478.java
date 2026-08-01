package p291;

import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import p297.AbstractC8599;
import p297.C8595;
import p297.C8597;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f23498 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8595 f23499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f23500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8547 f23503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23505;

    public C8478(C8547 c8547, Class cls, long j, String str, C8595 c8595, int i, boolean z) {
        this.f23503 = c8547;
        this.f23502 = cls;
        this.f23501 = j;
        this.f23500 = str;
        this.f23499 = c8595;
        this.f23505 = z;
        this.f23504 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14036(C8478 c8478, Number number, Number number2) {
        c8478.getClass();
        long jLongValue = number.longValue();
        long jLongValue2 = number2.longValue();
        C8595 c8595 = c8478.f23499;
        if (jLongValue == jLongValue2) {
            c8595.m14184(number);
            return;
        }
        C8597 c8597 = new C8597();
        C8597 c85972 = new C8597();
        c8595.m14165(c8478.m14044("NAME_DIRECT"));
        c8595.m14174(c8597);
        c8595.m14184(number);
        c8595.m14178(c85972);
        c8595.m14139(c8597);
        c8595.m14184(number2);
        c8595.m14139(c85972);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14037(C8478 c8478, int i, Class cls) {
        boolean zStartsWith = cls.getName().startsWith("java");
        C8595 c8595 = c8478.f23499;
        if (zStartsWith) {
            c8595.m14135(cls);
            return;
        }
        c8595.m14163(0);
        c8595.m14180(c8478.f23500, C8477.m14016(i), AbstractC8599.f23992);
        c8595.m14180(AbstractC8599.f24002, "fieldClass", "Ljava/lang/Class;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14038(C8478 c8478, int i, Type type) {
        C8595 c8595 = c8478.f23499;
        if ((type instanceof Class) && type.getTypeName().startsWith("java")) {
            c8595.m14135((Class) type);
            return;
        }
        c8595.m14163(0);
        c8595.m14180(c8478.f23500, C8477.m14016(i), AbstractC8599.f23992);
        c8595.m14180(AbstractC8599.f24002, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14039(long j, C8597 c8597) {
        int iM14045 = m14045("CONTEXT_FEATURES");
        C8595 c8595 = this.f23499;
        c8595.m14147(iM14045);
        c8595.m14134(j);
        c8595.m14150();
        c8595.m14148();
        c8595.m14149();
        if (c8597 != null) {
            c8595.m14174(c8597);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14040(long j, long j2, C8597 c8597) {
        int iM14045 = m14045("CONTEXT_FEATURES");
        C8595 c8595 = this.f23499;
        c8595.m14147(iM14045);
        c8595.m14134(j);
        c8595.m14157();
        c8595.m14134(j2);
        c8595.m14150();
        c8595.m14148();
        c8595.m14149();
        c8595.m14174(c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m14041() {
        return (this.f23501 & 144115188075855872L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14042(boolean z) {
        C8597 c8597 = new C8597();
        C8597 c85972 = new C8597();
        C8595 c8595 = this.f23499;
        c8595.m14163(1);
        String str = AbstractC8599.f24004;
        c8595.m14167(str, "getFeatures", "()J");
        c8595.m14156(m14045("CONTEXT_FEATURES"));
        if (z) {
            C8597 c85973 = new C8597();
            C8597 c85974 = new C8597();
            c8595.m14163(1);
            c8595.m14180(str, "symbolTable", C8477.f23491);
            c8595.m14172(c85973);
            c8595.m14147(m14045("CONTEXT_FEATURES"));
            c8595.m14134(JSONWriter$Feature.WriteNameAsSymbol.mask);
            c8595.m14150();
            c8595.m14148();
            c8595.m14149();
            c8595.m14175(c85973);
            c8595.m14137(4);
            c8595.m14178(c85974);
            c8595.m14139(c85973);
            c8595.m14137(3);
            c8595.m14139(c85974);
            c8595.m14151(m14045("NAME_DIRECT"));
        } else {
            C8597 c85975 = new C8597();
            C8597 c85976 = new C8597();
            c8595.m14163(1);
            c8595.m14180(str, "useSingleQuote", "Z");
            c8595.m14175(c85975);
            c8595.m14147(m14045("CONTEXT_FEATURES"));
            c8595.m14134(JSONWriter$Feature.UnquoteFieldName.mask | JSONWriter$Feature.UseSingleQuotes.mask);
            c8595.m14150();
            c8595.m14148();
            c8595.m14149();
            c8595.m14175(c85975);
            c8595.m14137(4);
            c8595.m14178(c85976);
            c8595.m14139(c85975);
            c8595.m14137(3);
            c8595.m14139(c85976);
            c8595.m14151(m14045("NAME_DIRECT"));
        }
        long j = JSONWriter$Feature.NotWriteDefaultValue.mask;
        int iM14044 = m14044("WRITE_DEFAULT_VALUE");
        c8595.m14147(m14045("CONTEXT_FEATURES"));
        c8595.m14134(j);
        c8595.m14150();
        c8595.m14148();
        c8595.m14149();
        c8595.m14151(iM14044);
        c8595.m14165(m14044("WRITE_DEFAULT_VALUE"));
        c8595.m14174(c8597);
        c8595.m14137(3);
        c8595.m14151(m14044("WRITE_NULLS"));
        c8595.m14178(c85972);
        c8595.m14139(c8597);
        long j2 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
        int iM140442 = m14044("WRITE_NULLS");
        c8595.m14147(m14045("CONTEXT_FEATURES"));
        c8595.m14134(j2);
        c8595.m14150();
        c8595.m14148();
        c8595.m14149();
        c8595.m14151(iM140442);
        c8595.m14139(c85972);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14043(long j, C8597 c8597, C8597 c85972) {
        int iM14045 = m14045("CONTEXT_FEATURES");
        C8595 c8595 = this.f23499;
        c8595.m14147(iM14045);
        c8595.m14134(j);
        c8595.m14150();
        c8595.m14148();
        c8595.m14149();
        c8595.m14174(c85972);
        c8595.m14178(c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m14044(Object obj) {
        LinkedHashMap linkedHashMap = this.f23498;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23504);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f23504 += 2;
            } else {
                this.f23504++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14045(String str) {
        LinkedHashMap linkedHashMap = this.f23498;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23504);
            linkedHashMap.put(str, numValueOf);
            this.f23504 += 2;
        }
        return numValueOf.intValue();
    }
}
