package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import java.util.ArrayList;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3776 f9606 = AbstractC3766.m6949();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3728 f9609;

    public AbstractC3755(String str, JSONPath$Feature... jSONPath$FeatureArr) {
        this.f9608 = str;
        long j = 0;
        for (JSONPath$Feature jSONPath$Feature : jSONPath$FeatureArr) {
            j |= jSONPath$Feature.mask;
        }
        this.f9607 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static JSONPathFilter$Operator m6937(AbstractC3732 abstractC3732) {
        switch (abstractC3732.f9538) {
            case '!':
                abstractC3732.mo6733();
                if (abstractC3732.f9538 != '=') {
                    C1123.m1402(abstractC3732.f9538, "not support operator : !");
                } else {
                    abstractC3732.mo6733();
                }
                break;
            case '<':
                abstractC3732.mo6733();
                char c = abstractC3732.f9538;
                if (c == '=') {
                    abstractC3732.mo6733();
                } else if (c == '>') {
                    abstractC3732.mo6733();
                }
                break;
            case '=':
                abstractC3732.mo6733();
                char c2 = abstractC3732.f9538;
                if (c2 == '~') {
                    abstractC3732.mo6710();
                } else if (c2 == '=') {
                    abstractC3732.mo6733();
                }
                break;
            case '>':
                abstractC3732.mo6733();
                if (abstractC3732.f9538 == '=') {
                    abstractC3732.mo6733();
                }
                break;
            case 'B':
            case 'b':
                abstractC3732.mo6688();
                String strMo6664 = abstractC3732.mo6664();
                if (!"between".equalsIgnoreCase(strMo6664)) {
                    C1123.m1410(AbstractC0900.m717("not support operator : ", strMo6664));
                }
                break;
            case 'E':
            case 'e':
                abstractC3732.mo6688();
                String strMo66642 = abstractC3732.mo6664();
                if ("ends".equalsIgnoreCase(strMo66642)) {
                    abstractC3732.mo6688();
                    String strMo66643 = abstractC3732.mo6664();
                    if (!"with".equalsIgnoreCase(strMo66643)) {
                        C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66643));
                    }
                } else if (!"endsWith".equalsIgnoreCase(strMo66642)) {
                    C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66642));
                }
                break;
            case 'I':
            case 'i':
                abstractC3732.mo6688();
                String strMo66644 = abstractC3732.mo6664();
                if (!"in".equalsIgnoreCase(strMo66644)) {
                    if (!"is".equalsIgnoreCase(strMo66644)) {
                        C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66644));
                    }
                }
                break;
            case 'L':
            case 'l':
                abstractC3732.mo6688();
                String strMo66645 = abstractC3732.mo6664();
                if (!"like".equalsIgnoreCase(strMo66645)) {
                    C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66645));
                }
                break;
            case 'N':
            case 'n':
                abstractC3732.mo6688();
                String strMo66646 = abstractC3732.mo6664();
                if (!"nin".equalsIgnoreCase(strMo66646)) {
                    if (!"not".equalsIgnoreCase(strMo66646)) {
                        C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66646));
                    } else {
                        abstractC3732.mo6688();
                        String strMo66647 = abstractC3732.mo6664();
                        if (!"like".equalsIgnoreCase(strMo66647)) {
                            if (!"rlike".equalsIgnoreCase(strMo66647)) {
                                if (!"in".equalsIgnoreCase(strMo66647)) {
                                    if (!"between".equalsIgnoreCase(strMo66647)) {
                                        C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66647));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 'R':
            case 'r':
                abstractC3732.mo6688();
                String strMo66648 = abstractC3732.mo6664();
                if (!"rlike".equalsIgnoreCase(strMo66648)) {
                    C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66648));
                }
                break;
            case 'S':
            case 's':
                abstractC3732.mo6688();
                String strMo66649 = abstractC3732.mo6664();
                if ("starts".equalsIgnoreCase(strMo66649)) {
                    abstractC3732.mo6688();
                    String strMo666410 = abstractC3732.mo6664();
                    if (!"with".equalsIgnoreCase(strMo666410)) {
                        C1123.m1410(AbstractC0900.m717("not support operator : ", strMo666410));
                    }
                } else if (!"startsWith".equalsIgnoreCase(strMo66649)) {
                    C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66649));
                }
                break;
            default:
                abstractC3732.mo6688();
                C1123.m1401(abstractC3732.mo6664(), "not support operator : ");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC3755 m6938(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        AbstractC3785 abstractC3785M6979;
        int i;
        if ("#-1".equals(str)) {
            return C3751.f9603;
        }
        C3787 c3787 = new C3787(str);
        JSONPath$Feature[] jSONPath$FeatureArr = new JSONPath$Feature[0];
        boolean z = c3787.f9699;
        C3705 c3705 = C3705.f9429;
        AbstractC3732 abstractC3732 = c3787.f9695;
        boolean z2 = c3787.f9694;
        if (z2 && abstractC3732.f9538 == 26) {
            return z ? new C3783(c3705, str, new JSONPath$Feature[0]) : C3750.f9602;
        }
        char c5 = abstractC3732.f9538;
        char c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        char c7 = '@';
        if (c5 != 'e') {
            c = '_';
            c2 = 'Z';
            c3 = 'A';
            c4 = 'z';
        } else {
            if (abstractC3732.mo6697('e', 'x', 'i', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL)) {
                if (!abstractC3732.mo6704('(')) {
                    C1123.m1410("syntax error ".concat(str));
                    return null;
                }
                if (abstractC3732.f9538 == '@') {
                    abstractC3732.mo6733();
                    if (!abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                        C1123.m1410("syntax error ".concat(str));
                        return null;
                    }
                }
                char c8 = abstractC3732.f9538;
                if ((c8 < 'a' || c8 > 'z') && !((c8 >= 'A' && c8 <= 'Z') || c8 == '_' || c8 == '@' || Character.isIdeographic(c8))) {
                    C1123.m1410("syntax error ".concat(str));
                    return null;
                }
                AbstractC3785 abstractC3785M6977 = c3787.m6977();
                if (abstractC3732.mo6704(')')) {
                    return new C3779(str, abstractC3785M6977, C3705.f9428, new JSONPath$Feature[0]);
                }
                C1123.m1410("syntax error ".concat(str));
                return null;
            }
            c3 = 'A';
            c4 = 'z';
            c2 = 'Z';
            c = '_';
        }
        while (true) {
            char c9 = abstractC3732.f9538;
            if (c9 == 26) {
                int i2 = 1;
                if (z) {
                    int i3 = c3787.f9693;
                    if (i3 == 1) {
                        c3787.f9691 = c3705;
                    } else if (i3 == 2) {
                        ArrayList arrayList = new ArrayList();
                        c3787.f9698 = arrayList;
                        arrayList.add(c3787.f9692);
                        c3787.f9698.add(c3787.f9691);
                        c3787.f9698.add(c3705);
                    } else {
                        c3787.f9698.add(c3705);
                    }
                    i2 = 1;
                    c3787.f9693++;
                }
                int i4 = c3787.f9693;
                if (i4 != i2) {
                    return i4 == 2 ? new C3779(str, c3787.f9692, c3787.f9691, jSONPath$FeatureArr) : new C3701(str, c3787.f9698, jSONPath$FeatureArr);
                }
                AbstractC3785 abstractC3785 = c3787.f9692;
                if (abstractC3785 instanceof C3780) {
                    return new C3778(str, (C3780) abstractC3785, jSONPath$FeatureArr);
                }
                if (abstractC3785 instanceof C3781) {
                    C3781 c3781 = (C3781) abstractC3785;
                    if (c3781.f9681 >= 0) {
                        return new C3782(str, c3781, jSONPath$FeatureArr);
                    }
                }
                return new C3783(abstractC3785, str, jSONPath$FeatureArr);
            }
            if (c9 == c6) {
                abstractC3732.mo6733();
                abstractC3785M6979 = c3787.m6977();
            } else if (c9 == '[') {
                abstractC3785M6979 = c3787.m6980();
            } else if ((c9 >= 'a' && c9 <= c4) || ((c9 >= c3 && c9 <= c2) || c9 == c || Character.isIdeographic(c9))) {
                abstractC3785M6979 = c3787.m6977();
            } else if (c9 == '?') {
                if (z2 && (i = c3787.f9693) == 0) {
                    c3787.f9692 = C3768.f9653;
                    c3787.f9693 = i + 1;
                }
                abstractC3732.mo6733();
                abstractC3785M6979 = c3787.m6979();
            } else {
                if (c9 != c7) {
                    C1123.m1399(c9, "not support ");
                    return null;
                }
                abstractC3732.mo6733();
                abstractC3785M6979 = C3784.f9687;
            }
            int i5 = c3787.f9693;
            if (i5 == 0) {
                c3787.f9692 = abstractC3785M6979;
            } else if (i5 == 1) {
                c3787.f9691 = abstractC3785M6979;
            } else if (i5 == 2) {
                ArrayList arrayList2 = new ArrayList();
                c3787.f9698 = arrayList2;
                arrayList2.add(c3787.f9692);
                c3787.f9698.add(c3787.f9691);
                c3787.f9698.add(abstractC3785M6979);
            } else {
                c3787.f9698.add(abstractC3785M6979);
            }
            c3787.f9693++;
            c7 = '@';
            c6 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
        }
    }

    public final String toString() {
        return this.f9608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract boolean mo6506();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3728 m6939() {
        if (this.f9609 == null) {
            this.f9609 = new C3728(AbstractC3766.f9639);
        }
        return this.f9609;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo6507(AbstractC3732 abstractC3732);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo6508(Object obj);
}
