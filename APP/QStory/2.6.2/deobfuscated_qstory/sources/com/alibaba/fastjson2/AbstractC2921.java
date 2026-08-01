package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import java.util.ArrayList;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2942 f9259 = AbstractC2932.m6331();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2894 f9262;

    public AbstractC2921(String str, JSONPath$Feature... jSONPath$FeatureArr) {
        this.f9261 = str;
        long j = 0;
        for (JSONPath$Feature jSONPath$Feature : jSONPath$FeatureArr) {
            j |= jSONPath$Feature.mask;
        }
        this.f9260 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static JSONPathFilter$Operator m6319(AbstractC2898 abstractC2898) {
        switch (abstractC2898.f9191) {
            case '!':
                abstractC2898.mo6127();
                if (abstractC2898.f9191 != '=') {
                    C0276.m841(abstractC2898.f9191, "not support operator : !");
                } else {
                    abstractC2898.mo6127();
                }
                break;
            case '<':
                abstractC2898.mo6127();
                char c = abstractC2898.f9191;
                if (c == '=') {
                    abstractC2898.mo6127();
                } else if (c == '>') {
                    abstractC2898.mo6127();
                }
                break;
            case '=':
                abstractC2898.mo6127();
                char c2 = abstractC2898.f9191;
                if (c2 == '~') {
                    abstractC2898.mo6104();
                } else if (c2 == '=') {
                    abstractC2898.mo6127();
                }
                break;
            case '>':
                abstractC2898.mo6127();
                if (abstractC2898.f9191 == '=') {
                    abstractC2898.mo6127();
                }
                break;
            case 'B':
            case 'b':
                abstractC2898.mo6082();
                String strMo6058 = abstractC2898.mo6058();
                if (!"between".equalsIgnoreCase(strMo6058)) {
                    C0276.m849(AbstractC0053.m152("not support operator : ", strMo6058));
                }
                break;
            case 'E':
            case 'e':
                abstractC2898.mo6082();
                String strMo60582 = abstractC2898.mo6058();
                if ("ends".equalsIgnoreCase(strMo60582)) {
                    abstractC2898.mo6082();
                    String strMo60583 = abstractC2898.mo6058();
                    if (!"with".equalsIgnoreCase(strMo60583)) {
                        C0276.m849(AbstractC0053.m152("not support operator : ", strMo60583));
                    }
                } else if (!"endsWith".equalsIgnoreCase(strMo60582)) {
                    C0276.m849(AbstractC0053.m152("not support operator : ", strMo60582));
                }
                break;
            case 'I':
            case 'i':
                abstractC2898.mo6082();
                String strMo60584 = abstractC2898.mo6058();
                if (!"in".equalsIgnoreCase(strMo60584)) {
                    if (!"is".equalsIgnoreCase(strMo60584)) {
                        C0276.m849(AbstractC0053.m152("not support operator : ", strMo60584));
                    }
                }
                break;
            case 'L':
            case 'l':
                abstractC2898.mo6082();
                String strMo60585 = abstractC2898.mo6058();
                if (!"like".equalsIgnoreCase(strMo60585)) {
                    C0276.m849(AbstractC0053.m152("not support operator : ", strMo60585));
                }
                break;
            case 'N':
            case 'n':
                abstractC2898.mo6082();
                String strMo60586 = abstractC2898.mo6058();
                if (!"nin".equalsIgnoreCase(strMo60586)) {
                    if (!"not".equalsIgnoreCase(strMo60586)) {
                        C0276.m849(AbstractC0053.m152("not support operator : ", strMo60586));
                    } else {
                        abstractC2898.mo6082();
                        String strMo60587 = abstractC2898.mo6058();
                        if (!"like".equalsIgnoreCase(strMo60587)) {
                            if (!"rlike".equalsIgnoreCase(strMo60587)) {
                                if (!"in".equalsIgnoreCase(strMo60587)) {
                                    if (!"between".equalsIgnoreCase(strMo60587)) {
                                        C0276.m849(AbstractC0053.m152("not support operator : ", strMo60587));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 'R':
            case 'r':
                abstractC2898.mo6082();
                String strMo60588 = abstractC2898.mo6058();
                if (!"rlike".equalsIgnoreCase(strMo60588)) {
                    C0276.m849(AbstractC0053.m152("not support operator : ", strMo60588));
                }
                break;
            case 'S':
            case 's':
                abstractC2898.mo6082();
                String strMo60589 = abstractC2898.mo6058();
                if ("starts".equalsIgnoreCase(strMo60589)) {
                    abstractC2898.mo6082();
                    String strMo605810 = abstractC2898.mo6058();
                    if (!"with".equalsIgnoreCase(strMo605810)) {
                        C0276.m849(AbstractC0053.m152("not support operator : ", strMo605810));
                    }
                } else if (!"startsWith".equalsIgnoreCase(strMo60589)) {
                    C0276.m849(AbstractC0053.m152("not support operator : ", strMo60589));
                }
                break;
            default:
                abstractC2898.mo6082();
                C0276.m840(abstractC2898.mo6058(), "not support operator : ");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC2921 m6320(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        AbstractC2951 abstractC2951M6361;
        int i;
        if ("#-1".equals(str)) {
            return C2917.f9256;
        }
        C2953 c2953 = new C2953(str);
        JSONPath$Feature[] jSONPath$FeatureArr = new JSONPath$Feature[0];
        boolean z = c2953.f9352;
        C2871 c2871 = C2871.f9082;
        AbstractC2898 abstractC2898 = c2953.f9348;
        boolean z2 = c2953.f9347;
        if (z2 && abstractC2898.f9191 == 26) {
            return z ? new C2949(c2871, str, new JSONPath$Feature[0]) : C2916.f9255;
        }
        char c5 = abstractC2898.f9191;
        char c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        char c7 = '@';
        if (c5 != 'e') {
            c = '_';
            c2 = 'Z';
            c3 = 'A';
            c4 = 'z';
        } else {
            if (abstractC2898.mo6091('e', 'x', 'i', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL)) {
                if (!abstractC2898.mo6098('(')) {
                    C0276.m849("syntax error ".concat(str));
                    return null;
                }
                if (abstractC2898.f9191 == '@') {
                    abstractC2898.mo6127();
                    if (!abstractC2898.mo6098(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                        C0276.m849("syntax error ".concat(str));
                        return null;
                    }
                }
                char c8 = abstractC2898.f9191;
                if ((c8 < 'a' || c8 > 'z') && !((c8 >= 'A' && c8 <= 'Z') || c8 == '_' || c8 == '@' || Character.isIdeographic(c8))) {
                    C0276.m849("syntax error ".concat(str));
                    return null;
                }
                AbstractC2951 abstractC2951M6359 = c2953.m6359();
                if (abstractC2898.mo6098(')')) {
                    return new C2945(str, abstractC2951M6359, C2871.f9081, new JSONPath$Feature[0]);
                }
                C0276.m849("syntax error ".concat(str));
                return null;
            }
            c3 = 'A';
            c4 = 'z';
            c2 = 'Z';
            c = '_';
        }
        while (true) {
            char c9 = abstractC2898.f9191;
            if (c9 == 26) {
                int i2 = 1;
                if (z) {
                    int i3 = c2953.f9346;
                    if (i3 == 1) {
                        c2953.f9344 = c2871;
                    } else if (i3 == 2) {
                        ArrayList arrayList = new ArrayList();
                        c2953.f9351 = arrayList;
                        arrayList.add(c2953.f9345);
                        c2953.f9351.add(c2953.f9344);
                        c2953.f9351.add(c2871);
                    } else {
                        c2953.f9351.add(c2871);
                    }
                    i2 = 1;
                    c2953.f9346++;
                }
                int i4 = c2953.f9346;
                if (i4 != i2) {
                    return i4 == 2 ? new C2945(str, c2953.f9345, c2953.f9344, jSONPath$FeatureArr) : new C2867(str, c2953.f9351, jSONPath$FeatureArr);
                }
                AbstractC2951 abstractC2951 = c2953.f9345;
                if (abstractC2951 instanceof C2946) {
                    return new C2944(str, (C2946) abstractC2951, jSONPath$FeatureArr);
                }
                if (abstractC2951 instanceof C2947) {
                    C2947 c2947 = (C2947) abstractC2951;
                    if (c2947.f9334 >= 0) {
                        return new C2948(str, c2947, jSONPath$FeatureArr);
                    }
                }
                return new C2949(abstractC2951, str, jSONPath$FeatureArr);
            }
            if (c9 == c6) {
                abstractC2898.mo6127();
                abstractC2951M6361 = c2953.m6359();
            } else if (c9 == '[') {
                abstractC2951M6361 = c2953.m6362();
            } else if ((c9 >= 'a' && c9 <= c4) || ((c9 >= c3 && c9 <= c2) || c9 == c || Character.isIdeographic(c9))) {
                abstractC2951M6361 = c2953.m6359();
            } else if (c9 == '?') {
                if (z2 && (i = c2953.f9346) == 0) {
                    c2953.f9345 = C2934.f9306;
                    c2953.f9346 = i + 1;
                }
                abstractC2898.mo6127();
                abstractC2951M6361 = c2953.m6361();
            } else {
                if (c9 != c7) {
                    C0276.m838(c9, "not support ");
                    return null;
                }
                abstractC2898.mo6127();
                abstractC2951M6361 = C2950.f9340;
            }
            int i5 = c2953.f9346;
            if (i5 == 0) {
                c2953.f9345 = abstractC2951M6361;
            } else if (i5 == 1) {
                c2953.f9344 = abstractC2951M6361;
            } else if (i5 == 2) {
                ArrayList arrayList2 = new ArrayList();
                c2953.f9351 = arrayList2;
                arrayList2.add(c2953.f9345);
                c2953.f9351.add(c2953.f9344);
                c2953.f9351.add(abstractC2951M6361);
            } else {
                c2953.f9351.add(abstractC2951M6361);
            }
            c2953.f9346++;
            c7 = '@';
            c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        }
    }

    public final String toString() {
        return this.f9261;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract boolean mo5901();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2894 m6321() {
        if (this.f9262 == null) {
            this.f9262 = new C2894(AbstractC2932.f9292);
        }
        return this.f9262;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo5902(AbstractC2898 abstractC2898);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo5903(Object obj);
}
