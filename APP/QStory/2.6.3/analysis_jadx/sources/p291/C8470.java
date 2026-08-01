package p291;

import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import p297.AbstractC8591;
import p297.C8587;
import p297.C8589;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f23489 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8587 f23490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f23491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8539 f23494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23496;

    public C8470(C8539 c8539, Class cls, long j, String str, C8587 c8587, int i, boolean z) {
        this.f23494 = c8539;
        this.f23493 = cls;
        this.f23492 = j;
        this.f23491 = str;
        this.f23490 = c8587;
        this.f23496 = z;
        this.f23495 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14055(C8470 c8470, Number number, Number number2) {
        c8470.getClass();
        long jLongValue = number.longValue();
        long jLongValue2 = number2.longValue();
        C8587 c8587 = c8470.f23490;
        if (jLongValue == jLongValue2) {
            c8587.m14203(number);
            return;
        }
        C8589 c8589 = new C8589();
        C8589 c85892 = new C8589();
        c8587.m14184(c8470.m14063("NAME_DIRECT"));
        c8587.m14193(c8589);
        c8587.m14203(number);
        c8587.m14197(c85892);
        c8587.m14158(c8589);
        c8587.m14203(number2);
        c8587.m14158(c85892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14056(C8470 c8470, int i, Class cls) {
        boolean zStartsWith = cls.getName().startsWith("java");
        C8587 c8587 = c8470.f23490;
        if (zStartsWith) {
            c8587.m14154(cls);
            return;
        }
        c8587.m14182(0);
        c8587.m14199(c8470.f23491, C8469.m14035(i), AbstractC8591.f23983);
        c8587.m14199(AbstractC8591.f23993, "fieldClass", "Ljava/lang/Class;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14057(C8470 c8470, int i, Type type) {
        C8587 c8587 = c8470.f23490;
        if ((type instanceof Class) && type.getTypeName().startsWith("java")) {
            c8587.m14154((Class) type);
            return;
        }
        c8587.m14182(0);
        c8587.m14199(c8470.f23491, C8469.m14035(i), AbstractC8591.f23983);
        c8587.m14199(AbstractC8591.f23993, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14058(long j, C8589 c8589) {
        int iM14064 = m14064("CONTEXT_FEATURES");
        C8587 c8587 = this.f23490;
        c8587.m14166(iM14064);
        c8587.m14153(j);
        c8587.m14169();
        c8587.m14167();
        c8587.m14168();
        if (c8589 != null) {
            c8587.m14193(c8589);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14059(long j, long j2, C8589 c8589) {
        int iM14064 = m14064("CONTEXT_FEATURES");
        C8587 c8587 = this.f23490;
        c8587.m14166(iM14064);
        c8587.m14153(j);
        c8587.m14176();
        c8587.m14153(j2);
        c8587.m14169();
        c8587.m14167();
        c8587.m14168();
        c8587.m14193(c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m14060() {
        return (this.f23492 & 144115188075855872L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14061(boolean z) {
        C8589 c8589 = new C8589();
        C8589 c85892 = new C8589();
        C8587 c8587 = this.f23490;
        c8587.m14182(1);
        String str = AbstractC8591.f23995;
        c8587.m14186(str, "getFeatures", "()J");
        c8587.m14175(m14064("CONTEXT_FEATURES"));
        if (z) {
            C8589 c85893 = new C8589();
            C8589 c85894 = new C8589();
            c8587.m14182(1);
            c8587.m14199(str, "symbolTable", C8469.f23482);
            c8587.m14191(c85893);
            c8587.m14166(m14064("CONTEXT_FEATURES"));
            c8587.m14153(JSONWriter$Feature.WriteNameAsSymbol.mask);
            c8587.m14169();
            c8587.m14167();
            c8587.m14168();
            c8587.m14194(c85893);
            c8587.m14156(4);
            c8587.m14197(c85894);
            c8587.m14158(c85893);
            c8587.m14156(3);
            c8587.m14158(c85894);
            c8587.m14170(m14064("NAME_DIRECT"));
        } else {
            C8589 c85895 = new C8589();
            C8589 c85896 = new C8589();
            c8587.m14182(1);
            c8587.m14199(str, "useSingleQuote", "Z");
            c8587.m14194(c85895);
            c8587.m14166(m14064("CONTEXT_FEATURES"));
            c8587.m14153(JSONWriter$Feature.UnquoteFieldName.mask | JSONWriter$Feature.UseSingleQuotes.mask);
            c8587.m14169();
            c8587.m14167();
            c8587.m14168();
            c8587.m14194(c85895);
            c8587.m14156(4);
            c8587.m14197(c85896);
            c8587.m14158(c85895);
            c8587.m14156(3);
            c8587.m14158(c85896);
            c8587.m14170(m14064("NAME_DIRECT"));
        }
        long j = JSONWriter$Feature.NotWriteDefaultValue.mask;
        int iM14063 = m14063("WRITE_DEFAULT_VALUE");
        c8587.m14166(m14064("CONTEXT_FEATURES"));
        c8587.m14153(j);
        c8587.m14169();
        c8587.m14167();
        c8587.m14168();
        c8587.m14170(iM14063);
        c8587.m14184(m14063("WRITE_DEFAULT_VALUE"));
        c8587.m14193(c8589);
        c8587.m14156(3);
        c8587.m14170(m14063("WRITE_NULLS"));
        c8587.m14197(c85892);
        c8587.m14158(c8589);
        long j2 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
        int iM140632 = m14063("WRITE_NULLS");
        c8587.m14166(m14064("CONTEXT_FEATURES"));
        c8587.m14153(j2);
        c8587.m14169();
        c8587.m14167();
        c8587.m14168();
        c8587.m14170(iM140632);
        c8587.m14158(c85892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14062(long j, C8589 c8589, C8589 c85892) {
        int iM14064 = m14064("CONTEXT_FEATURES");
        C8587 c8587 = this.f23490;
        c8587.m14166(iM14064);
        c8587.m14153(j);
        c8587.m14169();
        c8587.m14167();
        c8587.m14168();
        c8587.m14193(c85892);
        c8587.m14197(c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m14063(Object obj) {
        LinkedHashMap linkedHashMap = this.f23489;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23495);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f23495 += 2;
            } else {
                this.f23495++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14064(String str) {
        LinkedHashMap linkedHashMap = this.f23489;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23495);
            linkedHashMap.put(str, numValueOf);
            this.f23495 += 2;
        }
        return numValueOf.intValue();
    }
}
