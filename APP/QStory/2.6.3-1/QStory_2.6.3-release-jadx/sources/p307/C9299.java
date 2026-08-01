package p307;

import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import p313.AbstractC9420;
import p313.C9416;
import p313.C9418;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f23834 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9416 f23835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f23836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f23837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f23838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9368 f23839;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23841;

    public C9299(C9368 c9368, Class cls, long j, String str, C9416 c9416, int i, boolean z) {
        this.f23839 = c9368;
        this.f23838 = cls;
        this.f23837 = j;
        this.f23836 = str;
        this.f23835 = c9416;
        this.f23841 = z;
        this.f23840 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14614(C9299 c9299, Number number, Number number2) {
        c9299.getClass();
        long jLongValue = number.longValue();
        long jLongValue2 = number2.longValue();
        C9416 c9416 = c9299.f23835;
        if (jLongValue == jLongValue2) {
            c9416.m14762(number);
            return;
        }
        C9418 c9418 = new C9418();
        C9418 c94182 = new C9418();
        c9416.m14743(c9299.m14622("NAME_DIRECT"));
        c9416.m14752(c9418);
        c9416.m14762(number);
        c9416.m14756(c94182);
        c9416.m14717(c9418);
        c9416.m14762(number2);
        c9416.m14717(c94182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14615(C9299 c9299, int i, Class cls) {
        boolean zStartsWith = cls.getName().startsWith("java");
        C9416 c9416 = c9299.f23835;
        if (zStartsWith) {
            c9416.m14713(cls);
            return;
        }
        c9416.m14741(0);
        c9416.m14758(c9299.f23836, C9298.m14594(i), AbstractC9420.f24328);
        c9416.m14758(AbstractC9420.f24338, "fieldClass", "Ljava/lang/Class;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14616(C9299 c9299, int i, Type type) {
        C9416 c9416 = c9299.f23835;
        if ((type instanceof Class) && type.getTypeName().startsWith("java")) {
            c9416.m14713((Class) type);
            return;
        }
        c9416.m14741(0);
        c9416.m14758(c9299.f23836, C9298.m14594(i), AbstractC9420.f24328);
        c9416.m14758(AbstractC9420.f24338, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14617(long j, C9418 c9418) {
        int iM14623 = m14623("CONTEXT_FEATURES");
        C9416 c9416 = this.f23835;
        c9416.m14725(iM14623);
        c9416.m14712(j);
        c9416.m14728();
        c9416.m14726();
        c9416.m14727();
        if (c9418 != null) {
            c9416.m14752(c9418);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14618(long j, long j2, C9418 c9418) {
        int iM14623 = m14623("CONTEXT_FEATURES");
        C9416 c9416 = this.f23835;
        c9416.m14725(iM14623);
        c9416.m14712(j);
        c9416.m14735();
        c9416.m14712(j2);
        c9416.m14728();
        c9416.m14726();
        c9416.m14727();
        c9416.m14752(c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m14619() {
        return (this.f23837 & 144115188075855872L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14620(boolean z) {
        C9418 c9418 = new C9418();
        C9418 c94182 = new C9418();
        C9416 c9416 = this.f23835;
        c9416.m14741(1);
        String str = AbstractC9420.f24340;
        c9416.m14745(str, "getFeatures", "()J");
        c9416.m14734(m14623("CONTEXT_FEATURES"));
        if (z) {
            C9418 c94183 = new C9418();
            C9418 c94184 = new C9418();
            c9416.m14741(1);
            c9416.m14758(str, "symbolTable", C9298.f23827);
            c9416.m14750(c94183);
            c9416.m14725(m14623("CONTEXT_FEATURES"));
            c9416.m14712(JSONWriter$Feature.WriteNameAsSymbol.mask);
            c9416.m14728();
            c9416.m14726();
            c9416.m14727();
            c9416.m14753(c94183);
            c9416.m14715(4);
            c9416.m14756(c94184);
            c9416.m14717(c94183);
            c9416.m14715(3);
            c9416.m14717(c94184);
            c9416.m14729(m14623("NAME_DIRECT"));
        } else {
            C9418 c94185 = new C9418();
            C9418 c94186 = new C9418();
            c9416.m14741(1);
            c9416.m14758(str, "useSingleQuote", "Z");
            c9416.m14753(c94185);
            c9416.m14725(m14623("CONTEXT_FEATURES"));
            c9416.m14712(JSONWriter$Feature.UnquoteFieldName.mask | JSONWriter$Feature.UseSingleQuotes.mask);
            c9416.m14728();
            c9416.m14726();
            c9416.m14727();
            c9416.m14753(c94185);
            c9416.m14715(4);
            c9416.m14756(c94186);
            c9416.m14717(c94185);
            c9416.m14715(3);
            c9416.m14717(c94186);
            c9416.m14729(m14623("NAME_DIRECT"));
        }
        long j = JSONWriter$Feature.NotWriteDefaultValue.mask;
        int iM14622 = m14622("WRITE_DEFAULT_VALUE");
        c9416.m14725(m14623("CONTEXT_FEATURES"));
        c9416.m14712(j);
        c9416.m14728();
        c9416.m14726();
        c9416.m14727();
        c9416.m14729(iM14622);
        c9416.m14743(m14622("WRITE_DEFAULT_VALUE"));
        c9416.m14752(c9418);
        c9416.m14715(3);
        c9416.m14729(m14622("WRITE_NULLS"));
        c9416.m14756(c94182);
        c9416.m14717(c9418);
        long j2 = JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask;
        int iM146222 = m14622("WRITE_NULLS");
        c9416.m14725(m14623("CONTEXT_FEATURES"));
        c9416.m14712(j2);
        c9416.m14728();
        c9416.m14726();
        c9416.m14727();
        c9416.m14729(iM146222);
        c9416.m14717(c94182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14621(long j, C9418 c9418, C9418 c94182) {
        int iM14623 = m14623("CONTEXT_FEATURES");
        C9416 c9416 = this.f23835;
        c9416.m14725(iM14623);
        c9416.m14712(j);
        c9416.m14728();
        c9416.m14726();
        c9416.m14727();
        c9416.m14752(c94182);
        c9416.m14756(c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m14622(Object obj) {
        LinkedHashMap linkedHashMap = this.f23834;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23840);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f23840 += 2;
            } else {
                this.f23840++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14623(String str) {
        LinkedHashMap linkedHashMap = this.f23834;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f23840);
            linkedHashMap.put(str, numValueOf);
            this.f23840 += 2;
        }
        return numValueOf.intValue();
    }
}
