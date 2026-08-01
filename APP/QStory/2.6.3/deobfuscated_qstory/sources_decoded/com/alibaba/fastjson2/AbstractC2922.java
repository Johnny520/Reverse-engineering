package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import java.util.ArrayList;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2943 f9261 = AbstractC2933.m6389();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2895 f9264;

    public AbstractC2922(String str, JSONPath$Feature... jSONPath$FeatureArr) {
        this.f9263 = str;
        long j = 0;
        for (JSONPath$Feature jSONPath$Feature : jSONPath$FeatureArr) {
            j |= jSONPath$Feature.mask;
        }
        this.f9262 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static JSONPathFilter$Operator m6377(AbstractC2899 abstractC2899) {
        switch (abstractC2899.f9193) {
            case '!':
                abstractC2899.mo6173();
                if (abstractC2899.f9193 != '=') {
                    C0276.m842(abstractC2899.f9193, "not support operator : !");
                } else {
                    abstractC2899.mo6173();
                }
                break;
            case '<':
                abstractC2899.mo6173();
                char c = abstractC2899.f9193;
                if (c == '=') {
                    abstractC2899.mo6173();
                } else if (c == '>') {
                    abstractC2899.mo6173();
                }
                break;
            case '=':
                abstractC2899.mo6173();
                char c2 = abstractC2899.f9193;
                if (c2 == '~') {
                    abstractC2899.mo6150();
                } else if (c2 == '=') {
                    abstractC2899.mo6173();
                }
                break;
            case '>':
                abstractC2899.mo6173();
                if (abstractC2899.f9193 == '=') {
                    abstractC2899.mo6173();
                }
                break;
            case 'B':
            case 'b':
                abstractC2899.mo6128();
                String strMo6104 = abstractC2899.mo6104();
                if (!"between".equalsIgnoreCase(strMo6104)) {
                    C0276.m850(AbstractC0053.m157("not support operator : ", strMo6104));
                }
                break;
            case 'E':
            case 'e':
                abstractC2899.mo6128();
                String strMo61042 = abstractC2899.mo6104();
                if ("ends".equalsIgnoreCase(strMo61042)) {
                    abstractC2899.mo6128();
                    String strMo61043 = abstractC2899.mo6104();
                    if (!"with".equalsIgnoreCase(strMo61043)) {
                        C0276.m850(AbstractC0053.m157("not support operator : ", strMo61043));
                    }
                } else if (!"endsWith".equalsIgnoreCase(strMo61042)) {
                    C0276.m850(AbstractC0053.m157("not support operator : ", strMo61042));
                }
                break;
            case 'I':
            case 'i':
                abstractC2899.mo6128();
                String strMo61044 = abstractC2899.mo6104();
                if (!"in".equalsIgnoreCase(strMo61044)) {
                    if (!"is".equalsIgnoreCase(strMo61044)) {
                        C0276.m850(AbstractC0053.m157("not support operator : ", strMo61044));
                    }
                }
                break;
            case 'L':
            case 'l':
                abstractC2899.mo6128();
                String strMo61045 = abstractC2899.mo6104();
                if (!"like".equalsIgnoreCase(strMo61045)) {
                    C0276.m850(AbstractC0053.m157("not support operator : ", strMo61045));
                }
                break;
            case 'N':
            case 'n':
                abstractC2899.mo6128();
                String strMo61046 = abstractC2899.mo6104();
                if (!"nin".equalsIgnoreCase(strMo61046)) {
                    if (!"not".equalsIgnoreCase(strMo61046)) {
                        C0276.m850(AbstractC0053.m157("not support operator : ", strMo61046));
                    } else {
                        abstractC2899.mo6128();
                        String strMo61047 = abstractC2899.mo6104();
                        if (!"like".equalsIgnoreCase(strMo61047)) {
                            if (!"rlike".equalsIgnoreCase(strMo61047)) {
                                if (!"in".equalsIgnoreCase(strMo61047)) {
                                    if (!"between".equalsIgnoreCase(strMo61047)) {
                                        C0276.m850(AbstractC0053.m157("not support operator : ", strMo61047));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 'R':
            case 'r':
                abstractC2899.mo6128();
                String strMo61048 = abstractC2899.mo6104();
                if (!"rlike".equalsIgnoreCase(strMo61048)) {
                    C0276.m850(AbstractC0053.m157("not support operator : ", strMo61048));
                }
                break;
            case 'S':
            case 's':
                abstractC2899.mo6128();
                String strMo61049 = abstractC2899.mo6104();
                if ("starts".equalsIgnoreCase(strMo61049)) {
                    abstractC2899.mo6128();
                    String strMo610410 = abstractC2899.mo6104();
                    if (!"with".equalsIgnoreCase(strMo610410)) {
                        C0276.m850(AbstractC0053.m157("not support operator : ", strMo610410));
                    }
                } else if (!"startsWith".equalsIgnoreCase(strMo61049)) {
                    C0276.m850(AbstractC0053.m157("not support operator : ", strMo61049));
                }
                break;
            default:
                abstractC2899.mo6128();
                C0276.m841(abstractC2899.mo6104(), "not support operator : ");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC2922 m6378(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        AbstractC2952 abstractC2952M6419;
        int i;
        if ("#-1".equals(str)) {
            return C2918.f9258;
        }
        C2954 c2954 = new C2954(str);
        JSONPath$Feature[] jSONPath$FeatureArr = new JSONPath$Feature[0];
        boolean z = c2954.f9354;
        C2872 c2872 = C2872.f9084;
        AbstractC2899 abstractC2899 = c2954.f9350;
        boolean z2 = c2954.f9349;
        if (z2 && abstractC2899.f9193 == 26) {
            return z ? new C2950(c2872, str, new JSONPath$Feature[0]) : C2917.f9257;
        }
        char c5 = abstractC2899.f9193;
        char c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        char c7 = '@';
        if (c5 != 'e') {
            c = '_';
            c2 = 'Z';
            c3 = 'A';
            c4 = 'z';
        } else {
            if (abstractC2899.mo6137('e', 'x', 'i', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL)) {
                if (!abstractC2899.mo6144('(')) {
                    C0276.m850("syntax error ".concat(str));
                    return null;
                }
                if (abstractC2899.f9193 == '@') {
                    abstractC2899.mo6173();
                    if (!abstractC2899.mo6144(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                        C0276.m850("syntax error ".concat(str));
                        return null;
                    }
                }
                char c8 = abstractC2899.f9193;
                if ((c8 < 'a' || c8 > 'z') && !((c8 >= 'A' && c8 <= 'Z') || c8 == '_' || c8 == '@' || Character.isIdeographic(c8))) {
                    C0276.m850("syntax error ".concat(str));
                    return null;
                }
                AbstractC2952 abstractC2952M6417 = c2954.m6417();
                if (abstractC2899.mo6144(')')) {
                    return new C2946(str, abstractC2952M6417, C2872.f9083, new JSONPath$Feature[0]);
                }
                C0276.m850("syntax error ".concat(str));
                return null;
            }
            c3 = 'A';
            c4 = 'z';
            c2 = 'Z';
            c = '_';
        }
        while (true) {
            char c9 = abstractC2899.f9193;
            if (c9 == 26) {
                int i2 = 1;
                if (z) {
                    int i3 = c2954.f9348;
                    if (i3 == 1) {
                        c2954.f9346 = c2872;
                    } else if (i3 == 2) {
                        ArrayList arrayList = new ArrayList();
                        c2954.f9353 = arrayList;
                        arrayList.add(c2954.f9347);
                        c2954.f9353.add(c2954.f9346);
                        c2954.f9353.add(c2872);
                    } else {
                        c2954.f9353.add(c2872);
                    }
                    i2 = 1;
                    c2954.f9348++;
                }
                int i4 = c2954.f9348;
                if (i4 != i2) {
                    return i4 == 2 ? new C2946(str, c2954.f9347, c2954.f9346, jSONPath$FeatureArr) : new C2868(str, c2954.f9353, jSONPath$FeatureArr);
                }
                AbstractC2952 abstractC2952 = c2954.f9347;
                if (abstractC2952 instanceof C2947) {
                    return new C2945(str, (C2947) abstractC2952, jSONPath$FeatureArr);
                }
                if (abstractC2952 instanceof C2948) {
                    C2948 c2948 = (C2948) abstractC2952;
                    if (c2948.f9336 >= 0) {
                        return new C2949(str, c2948, jSONPath$FeatureArr);
                    }
                }
                return new C2950(abstractC2952, str, jSONPath$FeatureArr);
            }
            if (c9 == c6) {
                abstractC2899.mo6173();
                abstractC2952M6419 = c2954.m6417();
            } else if (c9 == '[') {
                abstractC2952M6419 = c2954.m6420();
            } else if ((c9 >= 'a' && c9 <= c4) || ((c9 >= c3 && c9 <= c2) || c9 == c || Character.isIdeographic(c9))) {
                abstractC2952M6419 = c2954.m6417();
            } else if (c9 == '?') {
                if (z2 && (i = c2954.f9348) == 0) {
                    c2954.f9347 = C2935.f9308;
                    c2954.f9348 = i + 1;
                }
                abstractC2899.mo6173();
                abstractC2952M6419 = c2954.m6419();
            } else {
                if (c9 != c7) {
                    C0276.m839(c9, "not support ");
                    return null;
                }
                abstractC2899.mo6173();
                abstractC2952M6419 = C2951.f9342;
            }
            int i5 = c2954.f9348;
            if (i5 == 0) {
                c2954.f9347 = abstractC2952M6419;
            } else if (i5 == 1) {
                c2954.f9346 = abstractC2952M6419;
            } else if (i5 == 2) {
                ArrayList arrayList2 = new ArrayList();
                c2954.f9353 = arrayList2;
                arrayList2.add(c2954.f9347);
                c2954.f9353.add(c2954.f9346);
                c2954.f9353.add(abstractC2952M6419);
            } else {
                c2954.f9353.add(abstractC2952M6419);
            }
            c2954.f9348++;
            c7 = '@';
            c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        }
    }

    public final String toString() {
        return this.f9263;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract boolean mo5946();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2895 m6379() {
        if (this.f9264 == null) {
            this.f9264 = new C2895(AbstractC2933.f9294);
        }
        return this.f9264;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo5947(AbstractC2899 abstractC2899);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo5948(Object obj);
}
